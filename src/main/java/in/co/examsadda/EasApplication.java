package in.co.examsadda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("in.co.examsadda.*")
@EntityScan("in.co.examsadda.entity")
public class EasApplication {

	public static void main(String[] args) {
		SpringApplication.run(EasApplication.class, args);
	}
}
