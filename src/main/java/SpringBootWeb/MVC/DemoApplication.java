package SpringBootWeb.MVC;


import org.apache.catalina.LifecycleException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) throws LifecycleException
	{
		SpringApplication.run(DemoApplication.class, args);

	}

}