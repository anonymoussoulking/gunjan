
class A20{

    public  void show (){
        System.out.println("InSide A20");
    }


    class  B20{


        public  void show()
        {
            System.out.println("InSide Inner Class");
        }
    }
}

class C20{

    public void show()
    {
        System.out.println("Inside C20");
    }


}

abstract class D20{

    public abstract   void  drive();
}

 abstract class  E20 extends D20{

    public  void  show(){System.out.println("INIDE E20");}

 }


public class Tutorial20 {

    public static void main(String[] args) {

        A20 obj = new A20();

        A20.B20 obj1 = obj.new B20();
        obj1.show();

        C20 obj2 = new C20(){

            public void show() {

                System.out.println("Using Anonymous inner class");
            }
        };

        obj2.show();

        D20 obj3 = new E20(){

            public void  drive(){
                System.out.println("Speed is Driving");
            }

        };

        obj3.drive();


    }
}
