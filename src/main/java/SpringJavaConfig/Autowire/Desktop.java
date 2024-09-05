package SpringJavaConfig.Autowire;

public class Desktop implements Computer
{
    public Desktop()
    {
        System.out.println("Desktop obj is created...");
    }

    public void compile()
    {
        System.out.println("compiling usig Desktop......");
    }


}
