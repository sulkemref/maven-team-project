package week_by_week.week04.methodReferences;

public class InstanceMethodReference {

    public static void main(String[] args) {
        Message msg = new Message();
        Printable printable1 = new Printable() {
            @Override
            public void printMessage() {
                msg.getMessage();
            }
        };
        printable1.printMessage();

        Printable printable2 = msg::getMessage;
        printable2.printMessage();

        Printable printable3 = new Message()::getMessage;
        printable3.printMessage();

        Printable printable4 = ()->msg.getMessage();
        printable4.printMessage();

        Printable printable5 = Message::getMessage2;
        printable5.printMessage();

        Printable printable6 =  new Printable() {
            @Override
            public void printMessage() {
                Message.getMessage2();
            }
        };
        printable6.printMessage();

        Printable printable7 = ()-> Message.getMessage2();


    }

}
@FunctionalInterface
interface Printable {
    void printMessage();
}

class Message {
    public void getMessage() {
        System.out.println("Hello");
    }

    public static void getMessage2(){
        System.out.println("Static hello");
    }
}
