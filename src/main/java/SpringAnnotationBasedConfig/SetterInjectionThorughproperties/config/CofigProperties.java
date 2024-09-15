package SpringAnnotationBasedConfig.SetterInjectionThorughproperties.config;

import SpringAnnotationBasedConfig.SetterInjectionThorughproperties.Laptop;
import SpringAnnotationBasedConfig.SetterInjectionThorughproperties.Student;
import org.springframework.context.annotation.Bean;

public class CofigProperties
{

    @Bean(name="std")
    public Student std()
    {
       return new Student();
    }


    @Bean
    public Laptop laptop()
    {
        return new Laptop();
    }


}
