package SpringXmlDependencyInjection.Interface_AutoWire;

public class Student
{
    private int Age;
    private Computer cmp;

//    @ConstructorProperties({"age","lap"})
//    public Student(int age , Computer  cmp)
//    {
//      this.Age=age;
//      this.cmp=cmp;
//    }

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
