public class Tutorial22 {

    ////Exception Handling

    public static void main(String[] args) {

        int i = 0;
        int j = 1;

        int[] A = new int[5];


        try {
            System.out.println(j/i);
            System.out.println(A[1]);
            System.out.println(A[5]);
        }
        catch (ArithmeticException e)
        {
            System.out.println("It will only handle the exception of Arithematic ");
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("IT will only handle the exception of Arrayoutofbound");
            System.out.println(e);
        }
        catch (Exception e)
        {
            System.out.println("It will handle Every Exception which are not declared except Arrayoutofbound and arithemetic");
        }

        System.out.println("JAVA CLASS");


    }
}
