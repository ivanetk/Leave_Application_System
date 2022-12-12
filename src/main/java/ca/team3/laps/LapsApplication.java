package ca.team3.laps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LapsApplication {

	public static void main(String[] args) {
		SpringApplication.run(LapsApplication.class, args);
	}

	// @Bean
	// public WebClient webClient(WebClient.Builder webClientBuilder) {
	// 	return webClientBuilder
	// 			.baseUrl("https://holidayapi.com/v1/holidays")
	// 			.build();
	// }

	// @Bean
	// public CommandLineRunner run(WebClient webClient, CalendarRepo calendarRepo) {
	// 	String key = "e7d34671-7d69-495c-bd74-f4027f7d1127";
	// 	String country = "SG";
	// 	String year = "2021";
	// 	return args -> {
	// 		Mono<HolidayAPIResponse> response = webClient.get()
	// 				.uri(UriBuilder -> UriBuilder
	// 						.queryParam("pretty")
	// 						.queryParam("public")
	// 						.queryParam("key", key)
	// 						.queryParam("country", country)
	// 						.queryParam("year", year)
	// 						.build())
	// 				.retrieve()
	// 				.bodyToMono(HolidayAPIResponse.class);
	// 		List<Holiday> holidays = response.block().getHolidays();
	// 		holidays.forEach( holiday -> calendarRepo.save(holiday) );
	// 	};
	// }

}
