package ca.team3.laps.model.CalendarificAPI;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonCreator;

import lombok.Data;

@Data
public class CalendarificAPIResponse {
    private Response response;
    private List<Holiday> holidays;

    @JsonCreator
    public CalendarificAPIResponse(Response response) {
        this.response = response;
        this.holidays = response.getHolidays();
    }

    @Data
    static class Response {
        private List<Holiday> holidays;

        @JsonCreator
        public Response(List<Holiday> holidays) {
            this.holidays = holidays;
        }
    }
}
