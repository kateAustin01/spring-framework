package bean_practice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class NewConfigApp {

    @Bean(name = "message1")
    public String getString(){
        return "String1";
    }

    @Bean(name = "message2")
    public String getString2(){
        return "String2";
    }
}
