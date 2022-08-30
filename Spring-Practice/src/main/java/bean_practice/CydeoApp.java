package bean_practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CydeoApp {
    public static void main(String[] args) {
        ApplicationContext container = new AnnotationConfigApplicationContext(NewConfigApp.class);
        //container.getBean(FullTimeEmployee.class).createAccount();
        String str = container.getBean("message2",String.class);
        System.out.println(str);
    }


}
