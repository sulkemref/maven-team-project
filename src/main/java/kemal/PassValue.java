package kemal;

public class PassValue {

    public static void main(String[] args) {

        int a = 10;

        addInteger(a);

        System.out.println(a);

    }
    public static int addInteger(int a){
        a=a+a;
        return a;
    }
}
