package SpringXmlDependencyInjection.Constrcutor;

import java.beans.ConstructorProperties;

public class Student
{
    private int Age;
    private Laptop lap;


    public Student(int age ,Laptop lap)
    {
      this.Age=age;
      this.lap=lap;
    }

    public Laptop getLap() {
        return lap;
    }

    public void setLap(Laptop lap) {
        this.lap = lap;
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
