package Programpractice;

import java.util.HashMap;
import java.util.Map;

public class DuplicateArray {
     public static void main(String[] args) {
        int[] dupliateConatiner = {1,2,1,3,1,4,4,3,2,4};

        HashMap<Integer, Integer> duplicateConatinerMap = new HashMap<>();

        for(int dcValue : dupliateConatiner){
            if(duplicateConatinerMap.containsKey(dcValue)){
                duplicateConatinerMap.put(dcValue , duplicateConatinerMap.get(dcValue) + 1);
            }
            else{
                duplicateConatinerMap.put(dcValue , 1);
            }

        }

        System.out.println(duplicateConatinerMap);

        for (Map.Entry<Integer , Integer> mapObj : duplicateConatinerMap.entrySet()){
            System.out.println("key is : " +  mapObj.getKey() + ", Value is : " + mapObj.getValue());
        }
}
}
