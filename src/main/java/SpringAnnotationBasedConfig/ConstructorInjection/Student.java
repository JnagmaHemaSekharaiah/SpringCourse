package SpringAnnotationBasedConfig.ConstructorInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class Student
{

   private int age;

   @Autowired
   private Desktop desk;

   public Student(int age)
   {
      this.age=age;
   }


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
