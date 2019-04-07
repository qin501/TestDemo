package cn.wsq;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ArrayTest {
    public static void main(String[] args) {
        int [] arr={1,4,1,4,2,5,4,8};
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
           if(map.get(arr[i])==null){
               map.put(arr[i],1);
           }else{
               int a=map.get(arr[i]);
               map.put(arr[i],a+1);
           }
        }
        Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
        for(Map.Entry<Integer,Integer> entry :entries){
            System.out.println(entry.getKey()+"-->"+entry.getValue());
        }
    }
}
