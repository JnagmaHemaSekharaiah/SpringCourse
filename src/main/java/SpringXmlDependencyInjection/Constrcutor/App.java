package SpringXmlDependencyInjection.Constrcutor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App
{

    public static void main(String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringConstrctor.xml");
        Student std = (Student) context.getBean("stu");


        System.out.println(std.getAge());
        System.out.println(std.getLap());


    }
}
