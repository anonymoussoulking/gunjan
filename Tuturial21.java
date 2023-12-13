
interface  A21{

//    void show();
    int solve(int a, int b);
}

public class Tuturial21 {

    public static void main(String[] args) {

//        A21 obj = new A21() {
//
//            public void show() {
//                System.out.println("Lamda expression");
//
//            }
//        };

//        ABOVE EXPRESSION CAN BE DONE USING LAMDA EXPRESSION


        A21 obj = (a,b)->{

            return  a+b;
        };





        int ans = obj.solve(5,6);

        System.out.println(ans);

    }



}
