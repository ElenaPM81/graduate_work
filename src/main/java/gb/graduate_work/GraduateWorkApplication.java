package gb.graduate_work;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan
public class GraduateWorkApplication {

	public static void main(String[] args) {
		SpringApplication.run(GraduateWorkApplication.class, args);
	}

}
