public class Tutorial3 {


    /////////CASTING AND CONVERSION///////

    public static void main(String[] args) {

        //conversion of float into int;
        float f = 5.6f;
        int x = (int) f;

        System.out.println("conversion of float to int "+ f + " to " + x);

        //conversion of int into byte
        // IT Will take the modulo of  int%256

        int num = 266;
        byte ans = (byte) num;

        System.out.println("Conversion of int to byte " + num + " to "+ ans);

        // int to string

        byte b1 = 127;
        byte b2 = 127;

        int result = b1 * b2;


        System.out.println(result);






    }
}
