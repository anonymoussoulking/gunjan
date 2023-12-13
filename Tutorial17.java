

//DYNAMIC METHOD DISPATCH

//FINAL KEYWORD - VARIABLE, METHOD , CLASS
//FINAL KEYWORDS TO CLASSES MAKES IT CANNOT BE INHERITED BY ANY CLASS

class Aka {
    public  void show()
    {
        System.out.println("In  A");
    }
}

class  Bka extends Aka{
    public void  show()
    {
        System.out.println("In  B");
    }
}

public class Tutorial17 {

    public static void main(String[] args) {
        Aka obj = new Bka();

        obj.show();

        obj = new Aka();
        obj.show();
    }
}
