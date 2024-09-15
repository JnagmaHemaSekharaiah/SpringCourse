package SpringAnnotationBasedConfig.ConstructorInjection;


public class Laptop implements Desktop
{


    public Laptop()
    {
        System.out.println("Desktop obj is created...");
    }

    @Override
    public void compile()
    {
        System.out.println("Compiling using Laptop...");
    }


}
