package SpringXmlDependencyInjection.Refrence;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.awt.font.LayoutPath;


public class App
{

    public static void main(String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringRef.xml");
        Student std1 = (Student) context.getBean("stu");

        std1.code();



    }
}
