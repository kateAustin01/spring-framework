package steoreotype_annotations;

import bean_practice.ConfigApp;
import bean_practice.FullTimeEmployee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import steoreotype_annotations.config.configApp;
import steoreotype_annotations.model.DataStructure;
import steoreotype_annotations.model.Devops;
import steoreotype_annotations.model.Microservice;

public class CydeoApp {
    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(configApp.class, ConfigApp.class);
        container.getBean(DataStructure.class).getTotalHours();




    }
}
