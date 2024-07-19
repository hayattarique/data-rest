package boot;

import boot.entities.Passenger;
import boot.repositories.PassengerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BootApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootApplication.class);

    }

    @Bean
    CommandLineRunner runner(PassengerRepository repository) {

        return args -> {
            repository.save(Passenger.of().passengerName("Sharique")
                    .destination("Delhi").arrivalTime("11:00PM").pickupTime("10:00AM").fare(1800).source("Gaya").build());
            repository.save(Passenger.of().passengerName("Shahan")
                    .destination("Delhi").arrivalTime("11:00PM").pickupTime("10:00AM").fare(1800).source("Gaya").build());
        };
    }

}
