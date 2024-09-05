package SpringJavaConfig.Scope;


import SpringJavaConfig.cnfig.BeanNameConfig;
import SpringJavaConfig.cnfig.ScopeConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App
{
    public static void main(String[] args)
    {

          ApplicationContext context = new AnnotationConfigApplicationContext(ScopeConfig.class);
          Desktop desk= context.getBean("desk1", Desktop.class);
          desk.compile();

          Desktop desk1 = context.getBean("desk1", Desktop.class);
          desk1.compile();

    }




}
