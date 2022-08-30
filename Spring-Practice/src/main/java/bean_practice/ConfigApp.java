package bean_practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

@Configuration

public class ConfigApp {

    @Bean
    public FullTimeEmployee fullTimeEmployee() {
       return new FullTimeEmployee();
    }

    @Bean
    public PartTimeEmployee partTimeEmployee() {
        return new PartTimeEmployee();
    }
}