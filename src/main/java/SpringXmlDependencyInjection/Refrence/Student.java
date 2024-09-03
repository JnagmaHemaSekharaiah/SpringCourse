package SpringXmlDependencyInjection.Refrence;

public class Student
{
    private int Age;
    private Laptop lap;

    public Laptop getLap() {
        return lap;
    }

    public void setLap(Laptop lap) {
        this.lap = lap;
    }

    public Student()
    {
        System.out.println("Student Obj is created.... ");
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age)
    {
        Age = age;
    }

    public void code()
    {
        System.out.println("Code..");
        lap.compile();

    }

}
