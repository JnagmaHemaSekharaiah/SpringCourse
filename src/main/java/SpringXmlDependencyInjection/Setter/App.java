package SpringXmlDependencyInjection.Setter;

import SpringXmlDependencyInjection.CourseApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App
{

    public static void main(String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringXMLConf.xml");
        Student std = (Student) context.getBean("stu");

        System.out.println("Age="+std.getAge());

    }
}
