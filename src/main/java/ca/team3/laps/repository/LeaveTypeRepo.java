package ca.team3.laps.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import ca.team3.laps.model.LeaveTypes.AnnualLeave;
import ca.team3.laps.model.LeaveTypes.Leave;

public interface LeaveTypeRepo extends JpaRepository<Leave, String> {

    @Query("SELECT a "
    + "FROM AnnualLeave a " 
    + "WHERE jobTitle = :jobTitle")
    public AnnualLeave findAnnualLeaveByJobTitle(@Param("jobTitle") String jobTitle);
}
