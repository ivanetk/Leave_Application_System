package ca.team3.laps.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import ca.team3.laps.model.Staff;

@Repository
public interface StaffRepo extends JpaRepository<Staff, Integer> {
    
    @Query("SELECT s "
    + "FROM Staff s "
    + "WHERE username = :username")
    public List<Staff> findByUsername(@Param("username") String username);
}