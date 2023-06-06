package almi.JavaCodingTasks.week21;

public class SumOfDigits_258 {



    /**
        Given n, take the sum of the digits of n, if that value has more than one digit,
        continue reducing in this way until a single-digit number is produced.
     **/





    private static int singleDigitFrmSum(int n){


        String nStr = Integer.toString(n);
        if (nStr.length() == 1){return n;}
        int z = 0;


        for (int i = 0; i < nStr.length(); i++) {
            z += Character.getNumericValue(nStr.charAt(i));

        }


        return singleDigitFrmSum(z);

    }




    public static void main(String[] args) {

        int n = 942;
        int n2 = 493193;

        System.out.println(singleDigitFrmSum(n2));


    }



}
