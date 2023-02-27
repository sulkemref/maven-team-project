package kemal.mentor_tasks.week03;

public class Animal_Feast {

    public static void main(String[] args) {

        System.out.println(animalFeast("chickadee","chocolate cake"));
        System.out.println(animalFeast("lion","spinach"));
    }

    /**All the animals are having a feast! Each animal is bringing one dish.There is just one rule: the dish must start and end with the same letters as the animal's name. For example, the great blue heron is bringing garlic naan and the chickadee is bringing chocolate cake.
    Write a method that takes the animal's name and dish as arguments and returns true or false to indicate whether the beast is allowed to bring the dish to the feast.
    Assume that beast and dish are always lowercase strings, and that each has at least two letters. Beast and dish may contain hyphens and spaces, but these will not appear at the beginning or end of the string. They will not contain numerals.
    */

    public static boolean animalFeast(String beast, String dish){
        return beast.toLowerCase().charAt(0)==dish.toLowerCase().charAt(0)
                &&beast.toLowerCase().charAt(beast.length()-1)==dish.toLowerCase().charAt(dish.length()-1);
    }
}
