
abstract class  car {

    public abstract void drive();

    public  abstract void speed();
    public  void music()
    {
        System.out.println("Music plaring.....");
    }
}

 abstract class Gwagon  extends  car {

    public void drive() {
        System.out.println("Driving.......");
    }
    
}

class  UpdatedGwagon extends  Gwagon{    // CONCRETE CLASS

    public  void  speed()
    {
        System.out.println("ISHOWSPEED");
    }
}
public class Tutorial19 {

    public static void main(String[] args) {

        car obj = new UpdatedGwagon();

        obj.drive();
        obj.music();
        obj.speed();

    }
}
