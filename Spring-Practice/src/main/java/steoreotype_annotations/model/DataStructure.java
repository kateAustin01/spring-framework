package steoreotype_annotations.model;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class DataStructure {

   ExtraHours extraHours;


    public void getTotalHours(){
      System.out.println("Total hours DataStructure: "+ 20+extraHours.getHours());
  }
}

