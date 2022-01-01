package io.Covidtracker.CovidCasesTracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class CovidCasesTrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CovidCasesTrackerApplication.class, args);
	}

}
