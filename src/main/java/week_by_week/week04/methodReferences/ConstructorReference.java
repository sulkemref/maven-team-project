package week_by_week.week04.methodReferences;

public class ConstructorReference {
    public static void main(String[] args) {
        PrintObject printObject1 = MessageObject::new;
        printObject1.printObjectMessage("Hello");

        PrintObject printObject2 = new PrintObject() {
            @Override
            public void printObjectMessage(String message) {
                new MessageObject(message);
            }
        };

        printObject2.printObjectMessage("Kemal");

        PrintObject printObject3= x-> new MessageObject(x);
        printObject3.printObjectMessage("Hasan");
    }

}
@FunctionalInterface
interface PrintObject{
    void printObjectMessage(String message);
}

class  MessageObject{
    public MessageObject(String message) {
        System.out.println(message);
    }
}