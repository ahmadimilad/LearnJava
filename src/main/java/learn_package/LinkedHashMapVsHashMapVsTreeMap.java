package main.java.learn_package;



import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class LinkedHashMapVsHashMapVsTreeMap {



    /*
        Main difference between HashMap and LinkedHashMap is that LinkedHashMap maintains insertion order of keys,
        order in which keys are inserted in to LinkedHashMap.
     */

    public LinkedHashMapVsHashMapVsTreeMap() {



        LinkedHashMap<String , Integer> map = new LinkedHashMap<>();
        map.put("ahmad", 3);
        map.put("zahra", 1);
        map.put("kavin", 16);
        map.put("navid", 2);
        map.put("milad", 0);
        map.forEach(new BiConsumer<String, Integer>() {
            @Override
            public void accept(String s, Integer integer) {
                System.out.println(s+":"+integer);
            }
        });

        System.out.println("**** LinkedHashMap ****");
        System.out.println(map);
        System.out.println("\n\n");


//        JSONObject jsonObject;
//
//        JSONArray jsonArray = new JSONArray();
//        jsonArray.put("ahmad_000");






        Map<String , String> hashMap = new HashMap<>();
//        hashMap.put(null,1111);
        hashMap.put("ahmad_000", "3");
        hashMap.put("zahra","1");
        hashMap.put("kavin", "16");
        hashMap.put("navid", "2");
        hashMap.put("milad", "0");

//        jsonObject = new JSONObject(hashMap);

//        hashMap.forEach(new BiConsumer<String, Integer>() {
//            @Override
//            public void accept(String s, Integer integer) {
//                System.out.println(s+":"+integer);
//            }
//        });

        System.out.println("**** HashMap ****");
//        System.out.println(hashMap.containsKey(jsonArray.get(0)));
//        System.out.println(hashMap);
//
//        System.out.println("\n\n");
//        Map<String , String> newHashMap = new HashMap<>();
//        System.out.println(jsonArray.toString());
//        jsonObject.keys().forEachRemaining(new Consumer() {
//            @Override
//            public void accept(Object o) {
//                System.out.println(o);
//                newHashMap.put((String) o, jsonObject.getString((String) o));
//            }
//        });


//        System.out.println(newHashMap.containsKey(jsonArray.get(0)));

        System.out.println();
        System.out.println("\n\n");
        System.out.println("\n\n");






    /*
    HashMap allows a single null key and multiple null values.
    TreeMap does not allow null keys but can have multiple null values.

    HashMap allows heterogeneous elements because it does not perform sorting on keys.
    TreeMap allows homogeneous values as a key because of sorting.
     */

        TreeMap<String , Integer> treeMap = new TreeMap<>();
//        treeMap.put(null,1111);
        treeMap.put("treeMap",20);
        treeMap.put("ahmad", 3);
        treeMap.put("zahra", 1);
        treeMap.put("kavin", 16);
        treeMap.put("navid", 2);
        treeMap.put("milad", 0);
        treeMap.put("milad", 1);
        treeMap.put("kkk",null);
        treeMap.forEach(new BiConsumer<String, Integer>() {
            @Override
            public void accept(String s, Integer integer) {
                System.out.println(s+":"+integer);
            }
        });
        System.out.println("**** TreeMap ****");
        System.out.println(treeMap);
        System.out.println("\n\n");
    }





}
