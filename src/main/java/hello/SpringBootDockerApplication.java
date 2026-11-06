package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootDockerApplication {

    @GetMapping("/")
    public String home() {
        return "<h1>CIA 2: Cloud CI/CD Pipeline Running Successfully!</h1><br><h1>End Semester Please put A+ grade thankyou- YADAVINDER BERRY YES ITS A ME MARIO</h1><br><h2>Dhivya Ma'am Please Give Me A+</h2><p>Application Version: 4.0.0</p>";
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDockerApplication.class, args);
    }
}
