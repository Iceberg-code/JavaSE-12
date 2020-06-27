package cn.itcast.day12.demo02;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
* HashMap存储自定义类型的键值
* Map集合保证key是唯一的
*       作为key的元素，必须重写hashCode方法和equals方法，以保证key唯一
*
* 注意：
*       如果用自定义的类型作为key，保证key唯一的方法就是重写自定义类型的hashCode方法和equals方法
* */
public class Demo01HashMapSavePerson {
    public static void main(String[] args) {
        show01();
        System.out.println("===============");
        show02();
    }

    /*
    * HashMap存储自定义类型键值
    *   key:String类型 （String类重写了hashCode方法和equals方法，可以保证key唯一）
    *   value:Person类型 （value可以重复。  Person类的重复：同名同年龄的人视为同一个）
    * */
    private static void show01(){
        //创建HashMap集合
        HashMap<String, Person> map = new HashMap<>();

        //往集合中添加元素
        map.put("北京", new Person("源氏", 18));
        map.put("上海", new Person("麦克雷", 19));
        map.put("杭州", new Person("安娜", 20));
        map.put("北京", new Person("半藏", 18));

        //使用keySet加增强for遍历Map集合
        Set<String> set = map.keySet();
        for (String key : set) {
            Person value = map.get(key);
            System.out.println(key + "-->" + value);
        }
    }

    /*
    * HashMap存储自定义类型键值
    *   key:Person类型  (Person类就必须重写hashCode方法和equals方法，以保证key唯一)
    *   value:String类型  （可以重复）
    * */
    private static void show02(){
        //创建HashMap集合
        HashMap<Person, String> map = new HashMap<>();

        //往集合中添加元素
        map.put(new Person("女王", 18), "英国");
        map.put(new Person("川普", 18), "美国");
        map.put(new Person("普京", 60), "俄罗斯");
        map.put(new Person("女王", 18), "葡萄牙");

        //使用entrySet和增强for遍历Map集合
        Set<Map.Entry<Person, String>> set = map.entrySet();
        for (Map.Entry<Person, String> entry : set) {
            Person key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "-->" + value);
        }
    }
}
