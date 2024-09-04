package SpringXmlDependencyInjection.GetBeanByType;

import SpringXmlDependencyInjection.Interface_AutoWire.Computer;

public class Student
{
    private int Age;
    private Computer cmp;


    public Student()
    {
        System.out.println("Student obj is created...");
    }


    public Computer getCmp() {
        return cmp;
    }
    public void compile()
    {
        cmp.compile();
    }


    public void setCmp(Computer cmp)
    {
        this.cmp = cmp;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }



    public  void Hi()
    {
        System.out.println("Hello");
    }


}
