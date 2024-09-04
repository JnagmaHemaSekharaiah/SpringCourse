package SpringXmlDependencyInjection.GetBeanByType;

import SpringXmlDependencyInjection.Interface_AutoWire.Computer;

public class Laptop implements Computer
{

    public Laptop()
    {
        System.out.println("Laptop obj is created....");
    }

    @Override
    public void compile()
    {
        System.out.println("Compiling with Laptop");
    }


}
