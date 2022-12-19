package ca.team3.laps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import ca.team3.laps.model.Staff;
import ca.team3.laps.model.LeaveTypes.AnnualLeave;
import ca.team3.laps.model.LeaveTypes.CompensationLeave;
import ca.team3.laps.model.LeaveTypes.LeaveType;
import ca.team3.laps.model.LeaveTypes.MedicalLeave;
import ca.team3.laps.repository.LeaveTypeRepo;
import ca.team3.laps.repository.StaffRepo;

@SpringBootApplication
public class LapsApplication {

	public static void main(String[] args) {
		SpringApplication.run(LapsApplication.class, args);
	}

	@Autowired
	StaffRepo staffRepository;

	@Autowired
	LeaveTypeRepo leaveTypeRepo;

	@Bean
	public CommandLineRunner run(StaffRepo staffRepository) {
		return args -> {
			staffRepository.save(new Staff(1, null, "Javis", "password", 3, "alrigh", "javis", "john",
					true, "Javis@gmail.com", 5, 10, 1));
			staffRepository.save(new Staff(2, null, "Goh", "password", 3, "alrigh", "goh", "john",
					true, "goh@gmail.com", 5, 10, 1));
			leaveTypeRepo.save(new AnnualLeave(1, 14, "admin"));
			leaveTypeRepo.save(new AnnualLeave(1, 18, "professional"));
			leaveTypeRepo.save(new MedicalLeave(1, 60));
			leaveTypeRepo.save(new CompensationLeave(1, 18, 4));
		};
	}
}
