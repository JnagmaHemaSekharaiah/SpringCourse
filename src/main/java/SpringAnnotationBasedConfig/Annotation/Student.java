package SpringAnnotationBasedConfig.Annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student
{
    @Value("20")
    private int age;

    @Autowired
    private Computer cmp;

    public Student()
    {
     System.out.println("Student Obj is created...");
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public Computer getCmp() {
        return cmp;
    }

    public void setCmp(Computer cmp) {
        this.cmp = cmp;
    }

    public void compile()
    {
      cmp.compile();
    }

}
