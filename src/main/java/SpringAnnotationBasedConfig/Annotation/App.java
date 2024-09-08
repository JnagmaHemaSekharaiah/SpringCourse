package SpringAnnotationBasedConfig.Annotation;



import SpringAnnotationBasedConfig.Annoconfig.AnnotationConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App
{
    public static void main(String[] args)
    {

        ApplicationContext context = new AnnotationConfigApplicationContext(AnnotationConfig.class);

        Student std  = (Student) context.getBean("student");
        System.out.println(std.getAge());
        std.compile();

    }

}
