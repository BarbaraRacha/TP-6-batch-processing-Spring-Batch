package enset.ma.tp6batchprocessingspringbatch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class Tp6BatchProcessingSpringBatchApplication {

    public static void main(String[] args) {
        SpringApplication.run(Tp6BatchProcessingSpringBatchApplication.class, args);
    }

}
