package Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
//using brute  force approach to find the union of two arrays
public class Union {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5};
        int[] arr2={2,3,4,5,6};

        Set<Integer> unionSet=new HashSet<>();

        for(int num:arr1){
            unionSet.add(num);

        }

        for(int num:arr2){
            unionSet.add(num);
        }

        List<Integer> result=new ArrayList<>(unionSet);
        Collections.sort(result);

        System.out.println("Union of the two arrays: " + result);
        

    }
    
}
