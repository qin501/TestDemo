package cn.wsq;

import java.util.*;

class Person{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class HashMapTest {
    public static void main(String[] args) {
        HashMap<Integer,Person> map=new HashMap<>();
        map.put(1,new Person("张三",10));
        map.put(2,new Person("张三",80));
        map.put(3,new Person("张三",14));
        map.put(4,new Person("张三",1));
        HashMap m=sortMap(map);
        System.out.println(m);
    }

    private static HashMap sortMap(HashMap<Integer, Person> map) {
        Set<Map.Entry<Integer, Person>> entries = map.entrySet();
        ArrayList<Map.Entry<Integer, Person>> arrayList = new ArrayList<>(entries);
        Collections.sort(arrayList, new Comparator<Map.Entry<Integer, Person>>() {
            @Override
            public int compare(Map.Entry<Integer, Person> o1, Map.Entry<Integer, Person> o2) {
                if(o1.getValue().getAge()<o2.getValue().getAge()){
                    return -1;
                }
                return 0;
            }
        });
        LinkedHashMap<Integer, Person> linkedHashMap = new LinkedHashMap<>();
        for (Map.Entry<Integer,Person> entry:arrayList){
            linkedHashMap.put(entry.getKey(),entry.getValue());
        }

        return linkedHashMap;
    }
}
