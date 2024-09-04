package SpringXmlDependencyInjection.GetBeanByType;

import SpringXmlDependencyInjection.Interface_AutoWire.Computer;

public class Desktop implements Computer
{

   public Desktop()
    {
        System.out.println("Desktop obj is created....");
    }

    @Override
    public void compile()
    {
        System.out.println("Compiling with Desktop.....");

    }
}
