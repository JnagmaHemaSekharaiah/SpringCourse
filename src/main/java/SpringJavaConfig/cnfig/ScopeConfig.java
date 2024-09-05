package SpringJavaConfig.cnfig;

import SpringJavaConfig.Scope.Desktop;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ScopeConfig
{
    @Bean(name = "desk1")
    @Scope("prototype")
    public  Desktop desktop()
    {
      return  new Desktop();
    }



}
