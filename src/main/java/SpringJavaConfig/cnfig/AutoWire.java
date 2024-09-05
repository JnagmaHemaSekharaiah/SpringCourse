package SpringJavaConfig.cnfig;

import SpringJavaConfig.Autowire.Computer;
import SpringJavaConfig.Autowire.Laptop;
import SpringJavaConfig.Autowire.Student;
import SpringJavaConfig.Autowire.Desktop;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

import java.sql.Struct;

public class AutoWire
{
    @Bean(name = "std")
    public Student student(Computer cmp)
    {
        Student std = new Student();
        std.setAge(20);
        std.setCmp(cmp);
        return std;
    }

    @Bean(name = "desk1")
    @Primary
    public Desktop desktop()
    {
        return new Desktop();
    }

    @Bean(name = "lap")

    public Laptop laptop()
    {
        return new Laptop();
    }


}
