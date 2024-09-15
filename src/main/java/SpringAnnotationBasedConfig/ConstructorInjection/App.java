package SpringAnnotationBasedConfig.ConstructorInjection;

import SpringAnnotationBasedConfig.ConstructorInjection.config.Config;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App
{
    public static void main(String[] args)
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        Student std = (Student) context.getBean("std");
        System.out.println(std.getAge());
        std.callDesk();


    }
}
