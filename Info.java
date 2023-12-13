public class Info {
    String name ;
    int price;
    static String counntry;

    public  Info() {
        name= "gunjan";
        price = 2500;
        System.out.println("CONTRUCTOR");

    }

    static {
        counntry = "INDia";
        System.out.println("STATIC");
    }


    void  call ()
    {
        System.out.println(name);
        System.out.println(price);
        System.out.println(counntry);

    }

}

// CLASS called only once and contructor for other Obj called multiple time

