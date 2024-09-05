package SpringJavaConfig.Autowire;

public class Laptop implements Computer
{

    public Laptop()
    {
        System.out.println("Laptop Obj is created.....");
    }


    @Override
    public void compile()
    {
        System.out.println("Compiling using the Laptop...");
    }
}
