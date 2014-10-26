package sumoftwolist;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SumOfTwoList {


    /*--------------------------------------------------------------------------------------------*/
    public Map<Integer, Integer> findSum(List<Integer> list, int val) {

        Map<Integer, Integer> map = new HashMap();
        
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 1; j < list.size(); j++) {
                
                if (list.get(i) + list.get(j) == val) {
                    System.out.printf("%2d + %2d = %2d\n", list.get(i),list.get(j),val);
                    map.put(list.get(i), list.get(j));
                }
            }
        }
        return map;
    }
    /*--------------------------------------------------------------------------------------------*/

    public static void main(String[] args) {

        int val = 18;
        
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<20; i++) list.add(i);

        SumOfTwoList sum = new SumOfTwoList();
        Map<Integer, Integer> map = sum.findSum(list, val);
        
        System.out.println("map = " + map);
    }
    /*--------------------------------------------------------------------------------------------*/
}
