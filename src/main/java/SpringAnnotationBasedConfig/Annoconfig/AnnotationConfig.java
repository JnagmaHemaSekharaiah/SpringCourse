package SpringAnnotationBasedConfig.Annoconfig;


import SpringAnnotationBasedConfig.Annotation.Desktop;
import SpringAnnotationBasedConfig.Annotation.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;


public class AnnotationConfig
{

    @Bean(name = "s1")
    public Student student()
    {
        Student std = new Student();
        std.setAge(20);
        return std;
    }

    @Bean(name="desk")

    public Desktop desktop()
    {
        return  new Desktop();
    }


}
