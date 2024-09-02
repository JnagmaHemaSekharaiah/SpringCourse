package SpringXmlDependencyInjection.Scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App
{

    public static void main(String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringXMLConf.xml");
//        Student std1 = (Student) context.getBean("stu");
//
//        std1.setAge(10);
//
//        System.out.println("St1+Age->"+std1.getAge() );
//
//        Laptop lap = (Laptop) context.getBean("lap");

      //  System.out.println("St2+Age->"+std2.getAge());



    }
}
