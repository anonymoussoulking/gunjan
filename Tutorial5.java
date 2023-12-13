public class Tutorial5 {

    public static void main(String[] args) {


      // TERNALLLY OPERATOR //
      int app = 4;
      int result = 0;

      result = app%2==0 ? 10 : 20 ;

      System.out.println(result);

      // SWITCH CASE STATEMENT

        int age = 1;

        switch (age)
        {
            case 1:
                System.out.println("your age is " + age);
                break;
            case 2:
                System.out.println(age);
                break;
            case 3:
                System.out.println(age);
                break;
            case 4:
                System.out.println(age);
                break;
            case 5:
                System.out.println(age);
                break;
            case 6:
                System.out.println(age);
                break;
            case 7:
                System.out.println(age);
                break;
            case 8:
                System.out.println(age);
                break;
        }


      // LOOPS IN JAVA //

      int num = 0;

        while (num <=5)
        {
            System.out.println("Hello ");
            num++;
        }

        for (int i = 0 ; i < 5; i++)
        {
            System.out.println("World");
        }

        do {

            System.out.println("Walchand");
           num++;
        }while(num <=10);


    }
}
