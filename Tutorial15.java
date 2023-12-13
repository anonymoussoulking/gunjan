public class Tutorial15 {

    //// SINGLE AND MUTIPLE INHERITANCE

    public static void main(String[] args) {

//        cCalc obj = new cCalc();
//        cCalcAdv obj = new cCalcAdv();
        cCalcSci obj = new cCalcSci();

        int n1 = obj.add(2,5);
        int n2 = obj.sub(2,5);
        int n3 = obj.div(2,5);
        int n4 = obj.multi(2,5);
        double n5 = obj.power(2,5);

        System.out.println(n1 + " "+ n2 + " "+ n3+ " "+ n4+ " "+ n5);


    }
}
