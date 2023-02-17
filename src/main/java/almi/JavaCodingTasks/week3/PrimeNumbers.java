package almi.JavaCodingTasks.week3;

public class PrimeNumbers {

//int number = 0;

    public void chkPrime(int number) {
        if (number <= 1) {
            System.out.println("NOT A PRIME NUMBER");

        }
        if ( number % 2 != 0 && number % 3 != 0 || number == 2 || number == 3 ) {
            System.out.println( "PRIME NUMBER" );

//           ^^^  if (number) can not EVENLY divide into 2 & 3 : or if the number is 2 or 3

        } else {
            System.out.println( "NOT A PRIME NUMBER" );
        }


    }



    public static void main(String[] args) {

        PrimeNumbers primeNumbers = new PrimeNumbers();
        primeNumbers.chkPrime(1);


    }
    /*   public void chkPrime(int number) {
        if (number % 2 == 0 || number != 2) {
            System.out.println("NOT A PRIME NUMBER");
        } else if (number % 2 != 0 && number % 3 != 0 && number == 2) {
            System.out.println("PRIME NUMBER");
        }
    }
*/

}

