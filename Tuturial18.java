

//TYPECASTING , UPCASTING AND DOWNCASTING


class A18 {
    public  void show1()
    {
        System.out.println("In A");
    }
}

class B18 extends  A18{

    public  void show2()
    {
        System.out.println("In B");
    }
}
public class Tuturial18 {

    public static void main(String[] args) {

        A18 obj = new B18();

        obj.show1();

//        THIS IS UPCASTING  AS A18 DON'T KNOW B18 SO IT WILL JUST TYPECAST THE OBJ OF B18

        B18 obj1 = (B18)  obj;
         obj1.show2();

//         AS IT IS TAKING IT FROM IT'S SUPERCLASS IT IS CALLED AS DOWNCASTING


    }

}
