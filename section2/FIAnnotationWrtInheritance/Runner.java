package section2.FIAnnotationWrtInheritance;

@FunctionalInterface
interface P{
    public void m1();
}

@FunctionalInterface
interface C extends P {

}

//Above. If an interface extends Functional Interface and child interface does not contain any abstract methods, then child interface is always Functional Interface

@FunctionalInterface
interface B{
    public void m2();
}

@FunctionalInterface
interface D extends B {
    public void m2();
}

//Above. In the child interface, we can define exactly same parent interface abstract method.This is overriding a method.

// @FunctionalInterface
// interface Z{
//     public void m2();
// }

// @FunctionalInterface
// interface X extends Z {
//     public void m1();
// }

//Above. In the child interface we cant define any new abstract methods otherwise we will get Compile error.

@FunctionalInterface
interface R{
    public void m2();
}


interface T extends R {
    public void m1();
}

//Above. The above code is valid because the child interface in not declared as functional interface.

public class Runner {

    
}
