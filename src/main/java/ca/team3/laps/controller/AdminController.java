package ca.team3.laps.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ca.team3.laps.model.CalendarificAPI.Holiday;
import ca.team3.laps.service.AdminService;

@RestController
@RequestMapping("/api")
public class AdminController {

    @Autowired
    AdminService adminService;

    @GetMapping("/getholidays")
    public ResponseEntity< List<Holiday> > getHolidays(@RequestParam String year) {
        List<Holiday> holidays = adminService.getHolidays(year);
        return new ResponseEntity<>(holidays, HttpStatus.OK);
    }


}