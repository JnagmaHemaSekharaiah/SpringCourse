package SpringAnnotationBasedConfig.ConstructorInjection.config;

import SpringAnnotationBasedConfig.ConstructorInjection.Laptop;
import SpringAnnotationBasedConfig.ConstructorInjection.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config
{

    @Bean(name="std")
    public Student student()
    {
        Student std = new Student(20);

        return std;
    }


    @Bean(name = "lap")
    public Laptop laptop()
    {
      return  new Laptop();
    }



}
