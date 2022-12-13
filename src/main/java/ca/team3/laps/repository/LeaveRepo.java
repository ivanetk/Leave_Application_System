package ca.team3.laps.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import ca.team3.laps.model.LeaveTypes.AnnualLeave;
import ca.team3.laps.model.LeaveTypes.CompensationLeave;
import ca.team3.laps.model.LeaveTypes.Leave;
import ca.team3.laps.model.LeaveTypes.MedicalLeave;


public interface LeaveRepo extends JpaRepository<Leave, Long> {
    
    @Query("SELECT a "
    + "FROM AnnualLeave a "
    + "WHERE a.jobTitle = :jobTitle")
    public AnnualLeave findByJobTitle(@Param("jobTitle") String jobTitle);

    @Query("SELECT a "
    + "FROM AnnualLeave a")
    public List<AnnualLeave> findAnnualLeavesEntitlement(); 

    @Query("SELECT m "
    + "FROM MedicalLeave m")
    public MedicalLeave findMedicalLeaveEntitlement(); 

    @Query("SELECT c "
    + "FROM CompensationLeave c")
    public CompensationLeave findCompLeaveEntitlement(); 
}
