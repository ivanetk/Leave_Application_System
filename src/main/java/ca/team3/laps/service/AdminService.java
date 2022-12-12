package ca.team3.laps.service;

import java.util.List;

import ca.team3.laps.exception.DuplicateUsernameException;
import ca.team3.laps.model.Staff;
import ca.team3.laps.model.CalendarificAPI.Holiday;


public interface AdminService {
    List<Holiday> getHolidays(String year);

    Staff createStaff(Staff staff) throws DuplicateUsernameException;
    
}
