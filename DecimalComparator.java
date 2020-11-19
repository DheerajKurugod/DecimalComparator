public class DecimalComparator {
    public static void main(String[] args) {

         //boolean x = areEqualByThreeDecimalPlaces(-3.1756,-3.175); //true
        //boolean x = areEqualByThreeDecimalPlaces(3.175,3.176); //false
        //boolean x = areEqualByThreeDecimalPlaces(3.0,3.0); //true
        boolean x = areEqualByThreeDecimalPlaces(-3.123,3.123); //false
        System.out.println(x);
    }

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2){

    if ((int)(num1 * 1000) == (int)(num2 * 1000)){
        return true;
    }
else
    return false;
    }
}
