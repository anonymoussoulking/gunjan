public class Tutorial7 {

    public static void main(String[] args) {

        /// WE WILL SEE WHAT IS METHOD OVERLOADING ///

        /// In class aCalculator we have declared three objects
        /// of same name, in this class we have called those methos/ function
        /// instead of showing ambiguity, it indentify the function on basis of GIVEN INPUT
        /// THIS IS CALLED METHOD OVERLOADING

        aCalculator calc = new aCalculator();

        int res1 = calc.add(1,2,3) ;
        int res2 = calc.add(1,5);
        double res3 = calc.add(2.5, 6);

        System.out.println(res1);
        System.out.println(res3);
        System.out.println(res2);
        System.out.println(calc); 


    }
}
