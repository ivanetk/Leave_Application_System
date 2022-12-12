package ca.team3.laps.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import ca.team3.laps.model.CalendarificAPI.Holiday;


@Repository
public interface CalendarRepo extends JpaRepository<Holiday, Long> {
    @Query("SELECT h "
    + "FROM Holiday h "
    + "WHERE year(h.date) = :year")
    public List<Holiday> findByYear(@Param("year") int year);

}
