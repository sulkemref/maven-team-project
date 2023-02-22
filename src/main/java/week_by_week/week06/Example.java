package week_by_week.week06;

public class Example {
    public static void main(String[] args) {
        String str = "WASHINGTONnnaanll-+ + **";
        str = str.toLowerCase().replaceAll("[^a-z0-9]", "");
        System.out.println(str);
    }
}
