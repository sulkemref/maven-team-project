package almi.JavaCodingTasks.week14;

import java.util.*;

public class Bruteforce {

    public static void main(String[] args) {

        int[] array = {10, 4, 6, 3, 5};
        System.out.println(brute(array));;


    }


    public static List<Integer> brute(int[] array){

        List<Integer> list = new ArrayList<>();

        boolean notCorrect = false;

         for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {

                if (array[i] <= array[j]){
                    notCorrect = true ;
                }

            }
            if (!notCorrect) list.add(array[i]);

            notCorrect=false;
        }


        return list;

    }





}
