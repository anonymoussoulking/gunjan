public class Tutorial4 {

    public static void main(String[] args) {


        ///ARITHEMATIC OPERATORs

        System.out.println("ARITHEMATIC OPERATORS IN JAVA");
        byte a = 5;
        byte b = 2;

        boolean h = a == b;
        boolean k =  a < b;
        boolean p = a > b;
        boolean m = a >= b;
        boolean t = a <= b;
        boolean q = a != b;


        System.out.println(h+" "+ k + " "+p+" "+m+" "+t+" "+q);

        ///LOGICAL OPERRATORS


        System.out.println("LOGICAL OPERATORS IN JAVA");

        byte c = 5;
        byte d = 6;

        h = a < b || c <d;
        k = a > b || c > d;
        p = a < b || c >d;
        m = a > b || c < d;

        t = a < b && c <d;
        q = a > b && c > d;
        boolean j = a < b && c >d;
        boolean z = a > b && c < d;

        System.out.print(h+" "+ k + " "+p+" "+m+" "+t+" "+q+" "+j+" "+ z);


        //CONDITIONAL STATEMENTS

        System.out.println("CONDITIONAL STATEMENTS");

        int num = 1;
        int bum = 0;
        int cum = 1;

        if (num  < bum) System.out.println("HELLOW");
        else if(num == cum) System.out.println("JELLOW");
        else System.out.println("MELLOW");

//










    }
}
