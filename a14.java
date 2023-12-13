public class a14 {

    int age ;
    String name ;

    a14() // default Constructor
    {
        System.out.println("Contrustor Called");
    }
    a14(int age, String name) // parameterized contructor
    {
        this.age = age;
        this.name = name;
        System.out.println("Parameterized Constructor called");
        System.out.println(this.age);
        System.out.println(this.name);
    }
}
