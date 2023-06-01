package denis.week20;

public class CalculateDistance {

    public static void main(String[] args) {

        System.out.println(distance(25,4,1,-6));
        System.out.println(distance(47,43,-25,-11));


    }

    static double distance(int x1, int y1, int x2, int y2)
    {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}
