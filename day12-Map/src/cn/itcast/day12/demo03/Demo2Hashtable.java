package cn.itcast.day12.demo03;

import java.util.HashMap;
import java.util.Hashtable;

/*
* java.util.Hashtable<K,V>集合 实现了(implements) Map<K,V>接口
*
* Hashtable：底层也是一个哈希表，是一个线程安全集合，是单线程集合，速度慢
* HashMap：底层是一个哈希表，是一个线程不安全集合，是多线程集合，速度快
*
* HashMap集合（以及之前所学的所有集合）：可以存储null值，null键
* Hashtable集合，不能存储null值，null键
*
* Hashtable和Vector集合一样，在JDK 1.2+版本之后被更先进的集合取代了。（HashMap替代Hashtable,ArrayList替代Vector）
* Hashtable的子类Properties依然活跃
* Properties集合是一个唯一和IO流相结合的集合
* */
public class Demo2Hashtable {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put(null, "a");
        map.put("b", null);
        map.put(null, null);
        System.out.println(map);    //{null=null, b=null}
        System.out.println("===============");

        Hashtable<String, String> table = new Hashtable<>();
//        table.put(null, "a");   //NullPointerException - 空指针异常
//        table.put("b", null);   //NullPointerException - 空指针异常
        table.put(null, null);  //NullPointerException - 空指针异常
    }
}
