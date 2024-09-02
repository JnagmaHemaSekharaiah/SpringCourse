package SpringXmlDependencyInjection.Setter;

public class Student
{
    private int Age;
    public Student()
    {
        System.out.println("Student Obj is created.... ");
    }
    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }
}
