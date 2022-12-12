package ca.team3.laps.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import ca.team3.laps.model.CalendarificAPI.CalendarificAPIResponse;
import ca.team3.laps.model.CalendarificAPI.Holiday;
import ca.team3.laps.repository.CalendarRepo;
import reactor.core.publisher.Mono;

import org.springframework.core.env.Environment;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    Environment env;

    @Autowired
    CalendarRepo calendarRepo;

    @Autowired
    WebClient webClient;

    @Override
    public List<Holiday> getHolidays(String year) {
        int yearInt = Integer.parseInt(year);
        List<Holiday> holidays = calendarRepo.findByYear(yearInt);
        if (holidays.isEmpty()) {
            holidays = getHolidaysFromCalendarificAPI(year);
        }
        return holidays;
    }

       // Using Calendarific API
       private List<Holiday> getHolidaysFromCalendarificAPI(String year) {
        String key = env.getProperty("calenderific.key");
        String country = env.getProperty("calenderific.country");
        Mono<CalendarificAPIResponse> response = webClient.get()
        .uri(UriBuilder -> UriBuilder
                .queryParam("api_key", key)
                .queryParam("country", country)
                .queryParam("year", year)
                .queryParam("type", "national")
                .build())
        .retrieve()
        .bodyToMono(CalendarificAPIResponse.class);
        List<Holiday> holidays = response.block().getHolidays();
        holidays.forEach( holiday -> calendarRepo.save(holiday) );
        return holidays;
    }
    
}
