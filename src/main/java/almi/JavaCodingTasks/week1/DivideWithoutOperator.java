package almi.JavaCodingTasks.week1;

public class DivideWithoutOperator {

    public static int divide(int n1, int n2) {

        int n3 = 0;
        int n4 = 0;
        int finishedDivision = 0;

        for (int i = 1; i < n1; i++) {

            if (i % 2 == 0) {
                n3++;
            }else {
                n4++;
            }

            if (n3 > n4) {
                finishedDivision = n3;
            }else {
                finishedDivision = n4;
            }

        }

        return finishedDivision;

    }

    public static void main(String[] args) {
       // DivideWithoutOperator equation1 = new DivideWithoutOperator(6, 2);

        System.out.println(divide(9,3));
    }


}