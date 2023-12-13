
class A {
    public  void  show(){
        System.out.println("SHOW IN CLASS A");
    }

    public  void config()
    {
        System.out.println("SHOW IN A IN CONFIG");
    }

}

class   B extends  A{
//    public  void show(){
//
//        System.out.println("SHOW IN CLASS B");
//    }
}

public class Tutorial16 {

    public static void main(String[] args) {

        B obj = new B();
        obj.show();

    }
}

////// METHOD OVERIDING IT IS CALLED BECAUSE IT'S OVERWRITE THE FUNCTION IN IT'S SUPER CLASS /////////
///// IN ABOVE EXAMPLE WHAT HAPPENS IS THAT B INHERITATED A /////////
/////IN A THERE IS A FUNCTION SHOW AND IN B ALSO THERE IS A FUNTION SHOW ////////
//// WE HAVE CREATED OBJECT ///// WE CAN'T ACCESS THE SHOW METHOD OF A BECAUSE ///
/// CLASS B WILL OVERWRTIE THE FUNTION OF CLASS A /////////
/// THIS IS CALLED METHOD OVERWRITING ////////


