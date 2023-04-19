package kemal.mentor_tasks.week14;

import java.util.*;

public class Find_All_Elements_Greater_Than_Their_Right {


    public List<Integer> find(int[] arr){ // time O(n) space O(n)
        if (arr.length==0){
            return new ArrayList<>();
        }
        Deque<Integer> stack = new ArrayDeque<>();


        for(int i = arr.length-1; i>=0;i--){
            if(stack.isEmpty()){
                stack.push(arr[i]);
            }else{
                if(stack.peek()<arr[i])
                    stack.push(arr[i]);
            }
        }
        return new ArrayList<>(stack);
    }

    public List<Integer> find2(int[] arr){ // time O(n) space O(n)
        if (arr.length==0){
            return new ArrayList<>();
        }
        Deque<Integer> stack = new ArrayDeque<>();


        for(int i = 0; i<arr.length;i++){
            if(stack.isEmpty()){
                stack.push(arr[i]);
            }else{
                if(stack.peek()<=arr[i])
                    while (!stack.isEmpty()&&stack.peek()<=arr[i])
                        stack.pop();
                stack.push(arr[i]);
            }
        }

        List<Integer> result = new ArrayList<>(stack);
        Collections.reverse(result);
        return result;
    }
}
