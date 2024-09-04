package SpringXmlDependencyInjection.InnerBean;

import SpringXmlDependencyInjection.GetBeanByType.Laptop;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App
{

    public static void main(String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("InnerBean.xml");
        Student std = (Student) context.getBean("stu");

        Desktop lap = (Desktop) context.getBean("cmp1");

    }
}
