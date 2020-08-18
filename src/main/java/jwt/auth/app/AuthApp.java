package jwt.auth.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AuthApp {

    private static final Logger log = LoggerFactory.getLogger(AuthApp.class);

    public static void main(String[] args) {
        log.info("Starting the application... ");
        SpringApplication.run(AuthApp.class, args);
    }

}
