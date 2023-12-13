public class Tutorial8 {

    public static void main(String[] args) {


        // math.random will give us in double datatype
        // 1-D array

        int arr[] = {1,2,3,4,5};
        int brr[] = new int[5];

        // 2-D array

        int crr[][] = new int[5][5];

        for (int i=0; i < 5; i++)
        {
            for (int j=0; j < 5 ;  j++)
            {
                crr[i][j] = (int)(Math.random()*100);
            }

        }

        for (int n[] : crr)
        {
            for (int m : n)
            {
                System.out.print(m+" ");
            }
            System.out.println();
        }

        System.out.println("JAGGED ARRAY");

        // JAGGED ARRAY

        int nums[][] = new int[3][]; //jagged array

        nums[0] = new int[3];
        nums[1] = new int[4];
        nums[2] = new int[2];


        for (int i = 0; i < nums.length ; i++)
        {
            for (int j = 0 ; j < nums[i].length; j++)
            {
                nums[i][j] = (int) (Math.random()*100);
            }
        }

        for (int n[] : nums)
        {
            for (int m : n)
            {
                System.out.print(m+" ");
            }
            System.out.println();
        }

    }
}
