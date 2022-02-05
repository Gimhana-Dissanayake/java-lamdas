package section2;


public class Runner {

    //What is lamda expression

    //A lamda does not have a name, does not have modifiers, and does not have a return type;

    //If the body of the lambda expression contains only one statement the curly braces are optional;

    //Based on the context sometimes the compiler can guess types automatically this feature is called type Type Inference

    //return keyword can also be omitted

    //If only one parameter is there we can remove the paranthesis

    //Once we write a lamda expression to invoke that lamda expression we need to functional interface

    //What is a functional interface? If an interface contains only one abstract method that interface is called functional interface;

    //Examples for functional interfaces are Runnable, Callable, ActionListner etc.

    //Runnable has run() method, Callable has call method, ActionListner has actionPerformed() method, Comparable has compareTo() method;

    //Functional interface can have any number of static and default methods but there should only be on abstract method;

    //@FunctionalInterface annotation will prevent you from making normal interfaces. You will only be able to create functional interface with this annotation

    //

    public Runner() {
    }


    public static void main(String[] args){
     
    }
}