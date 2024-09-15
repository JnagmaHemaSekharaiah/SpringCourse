package SpringBootBasicStrcture;

import SpringBootBasicStrcture.Service.LaptopService;
import SpringBootBasicStrcture.model.Laptop;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class Application
{
	public static void main(String[] args)
	{
	ApplicationContext context = SpringApplication.run(Application.class, args);


	Laptop lap =context.getBean(Laptop.class);
	//lap.compile();

	LaptopService service =  context.getBean(LaptopService.class);
	service.addLaptop(lap);

	}

}
