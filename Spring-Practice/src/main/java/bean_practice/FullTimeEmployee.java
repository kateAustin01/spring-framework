package bean_practice;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Getter
@Setter
@ToString
public class FullTimeEmployee {
    public void createAccount(){
        System.out.println("Account created");
    }

}
