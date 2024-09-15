package SpringAnnotationBasedConfig.Annotation;


import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


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
