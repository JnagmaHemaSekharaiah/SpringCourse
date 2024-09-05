package SpringJavaConfig.cnfig;

import SpringJavaConfig.BeanName.Desktop;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class BeanNameConfig
{
    @Bean(name = {"dsk1","desk2"})
    public Desktop desktop()
    {
        return new Desktop();
    }
}
