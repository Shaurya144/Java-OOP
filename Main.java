public class Main {
    // Java Script Constructors
    int z;

    // A constructor in Java is a special method that is
    // used to initialize objects. The constructor is called when an object of a
    // class is created.
    public Main(int y) {
        z = y;
    }

    // Java Class Methods
    static void myMethod() { // static method can be called without object
        System.out.println("this is a method");
    }

    public void NewMethod() {
        System.out.println("This requires you to put the object name then the method");
    }

    int variable = 5; // attribute

    // if you don't want the ability to override values use the final keyword before
    public static void main(String[] args) {
        // To run static method
        myMethod();
        // To run public class method
        // Object.NewMethod();

        // OOP stands for Object-Oriented Programming.
        // OOP is about creating objects that contain both data and methods
        // What are Classes and Objects?

        // Classes and Objects are examples of OOP

        // Classes are a template
        // Objects are an instance / example of that template
        // In other words, templates are broad or general

        // ----------------- Classes -----------------------
        // Main myObject = new Main(); // Creates a myObject Object
        // System.out.println(myObject.variable);
        // myObject.x = 15; // x is now 15

        // Java Constructor
        Main newObject = new Main(215);
        System.out.println(newObject.z);
    }
}