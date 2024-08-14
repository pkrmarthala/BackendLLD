package InheritanceAndConstructors;

public class D extends C{
    D() {
        // super()
        // will be called by default if we do not write any separate caller of super().
        super("parameter");
        System.out.println("D Constructor is executed.");
    }
}