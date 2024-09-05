package SpringJavaConfig.Autowire;


import SpringJavaConfig.cnfig.AutoWire;
import SpringJavaConfig.cnfig.ScopeConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App
{
    public static void main(String[] args)
    {

          ApplicationContext context = new AnnotationConfigApplicationContext(AutoWire.class);
          Student std= context.getBean("std",Student.class);

          System.out.println(std.getAge());
          System.out.println(std.getCmp());
          std.compile();


    }




}
