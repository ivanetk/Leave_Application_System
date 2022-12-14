package ca.team3.laps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import ca.team3.laps.model.Staff;
import ca.team3.laps.repository.StaffRepo;

@SpringBootApplication
public class LapsApplication {

	public static void main(String[] args) {
		SpringApplication.run(LapsApplication.class, args);
	}

	// @Bean
	// public WebClient webClient(WebClient.Builder webClientBuilder) {
	// return webClientBuilder
	// .baseUrl("https://holidayapi.com/v1/holidays")
	// .build();
	// }
	@Autowired
	StaffRepo staffRepository;

	@Bean
	public CommandLineRunner run(StaffRepo staffRepository) {
		return args -> {
			staffRepository.save(new Staff(1, null, "Javis", "password", 3, "alrigh", "javis", "john",
					true, "Javis@gmail.com", 5, 10, 1));
		};
	}
}
