package SpringXmlDependencyInjection.Lazy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App
{

    public static void main(String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringLazy.xml");
//        Student std = (Student) context.getBean("stu");
//
//
//
//        System.out.println(std.getAge());
//        std.compile();

        Desktop dek = (Desktop) context.getBean("cmp2");


    }
}