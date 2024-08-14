package InheritanceAndConstructors;

public class C extends B {
    C() {
        super(10);
        System.out.println("C Constructor is executed.");
    }

    C(String x) {
        // super() will be called if we do not specifically mention any other constructor.
        // super(0 can only be in the first line of any constructor.
        // Error: Call to super must be first statement in constructor
        // super(10);
        this(); // C();
        System.out.println("Parameterized Constructor of C is executed.");
    }
}
/* Since the parameterized constructor exist for B class, Java will not provide the  default one. Hence, the error below.

D:\FSD\BackendLLD\src\InheritanceAndConstructors\C.java:4:9
java: constructor B in class InheritanceAndConstructors.B cannot be applied to given types;
required: int
found:    no arguments
reason: actual and formal argument lists differ in length

*/