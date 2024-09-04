package SpringXmlDependencyInjection.GetBeanByType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{

    public static void main(String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringGetBean.xml");
        Student std =  context.getBean("stu",Student.class);



        Computer com  = context.getBean(Computer.class);

     //   Desktop desk = context.getBean(Desktop.class);


    }
}
