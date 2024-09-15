package SpringBootBasicStrcture.model;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student
{

    @Value("25")
    private int age;
    @Autowired
   // @Qualifier("laptop")
    Computer cmp;

    public int getAge() {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public Computer getLap()
    {
        return cmp;
    }

    public void setLap(Computer cmp)
    {
        this.cmp = cmp;
    }

    public void fun()
    {
       cmp.compile();
    }


}
