package SpringBootBasicStrcture.Service;


import SpringBootBasicStrcture.Repo.LaptopRepository;
import SpringBootBasicStrcture.model.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService
{

  @Autowired
  LaptopRepository repo;

  public void addLaptop(Laptop lap)
  {
    repo.save(lap);
  }

  public boolean isGoodForProg()
  {
    return true;
  }

}
