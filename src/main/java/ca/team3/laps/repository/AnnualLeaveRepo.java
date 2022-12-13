package ca.team3.laps.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ca.team3.laps.model.LeaveTypes.AnnualLeave;


public interface AnnualLeaveRepo extends JpaRepository<AnnualLeave, Long> {
    
    public boolean existsByJobTitle(String jobTitle);
    
    public AnnualLeave findByJobTitle(String jobTitle);
}
