package SpringAnnotationBasedConfig.Setterinjection.config;

import SpringAnnotationBasedConfig.Setterinjection.Laptop;
import SpringAnnotationBasedConfig.Setterinjection.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Config
{

    @Bean(name="std")
    public Student student()
    {
       return new Student();
    }


    @Bean(name = "lap")
    public Laptop laptop()
    {
      return  new Laptop();
    }



}
