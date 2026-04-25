package CoreJava;

public class FirstClass {

    static int a = 9;
    int b = 10;

    // VOID has no return type.
    public int getData(){
        System.out.println("Am inside the method");
        return 2;
    }

    public String returnData(){
        System.out.println("I am returning data and inside the method");
        return "Return data inside the method.";
    }

    public static void main(String[] args) {
        // Object are instances/references of the class. To create an object, we need to use the new keyword followed by the class name and parentheses.
        FirstClass fc = new FirstClass();  //Object created to access the methods and variables from the class.
        SecondClass sc = new SecondClass();
        sc.getData();
        fc.getData();
        fc.returnData();
        System.out.println("Hello World");
        System.out.println("Welcome to core Java");
        System.out.println(a);  //To print the variable from outside the main method, it needs to have static declaration.
        System.out.println(fc.b); //Calling the variable b using the object hw because it is not static.

    }
}
