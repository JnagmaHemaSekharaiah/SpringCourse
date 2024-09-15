package SpringAnnotationBasedConfig.SetterInjectionThorughproperties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class Student
{
   @Value("${student.age}")
   private int age;

   @Autowired
   private Desktop desk;

   public int getAge()
   {
      return age;
   }

   public void setAge(int age)
   {
      this.age = age;
   }

   public Desktop getDesk() {
      return desk;
   }

   public void setDesk(Desktop desk)
   {
      this.desk = desk;
   }

   public void callDesk()
   {
      desk.compile();
   }
}
