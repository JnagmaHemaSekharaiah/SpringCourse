package SpringBootBasicStrcture.Repo;

import SpringBootBasicStrcture.model.Laptop;
import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepository
{

   public  void save(Laptop lap)
   {
    System.out.println("Laptop is saved...");
   }

}
