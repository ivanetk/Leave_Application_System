package ca.team3.laps.service;

import java.util.List;

import ca.team3.laps.exception.DuplicateException;
import ca.team3.laps.model.Staff;
import ca.team3.laps.model.CalendarificAPI.Holiday;
import ca.team3.laps.model.LeaveTypes.AnnualLeave;

public interface AdminService {
    /**
     * Retrieve all public holidays of a calendar year.
     * If it does not exist in the database, calls Calendarific API and persist in
     * database.
     */
    List<Holiday> getHolidays(String year);

    Staff createStaff(Staff staff) throws DuplicateException;

    AnnualLeave createAnnualLeave(AnnualLeave annualLeave) throws DuplicateException;

}
