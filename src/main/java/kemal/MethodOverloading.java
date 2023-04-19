package kemal;

public class MethodOverloading{

    private int h;

    public MethodOverloading() {
        super();
    }


    public MethodOverloading(int h) {
        this();
        this.h = h;
    }

    public static void main(String[] args) {

       newMethod1(10,5);
       newMethod1(4.6,5);

    }

    private void newMethod1(int a, double b){
        this.h=10;
        System.out.println("1");
        new MethodOverloading();
    }

    private static void newMethod1(double a, int b){
        System.out.println("2");
    }

    private static void newMethod1(int a, int b){
        System.out.println("3");
    }
}
