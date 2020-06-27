package cn.itcast.day12.demo03;

import java.util.HashMap;
import java.util.LinkedHashMap;

/*
* java.util.LinkedHashMap<K,V> 继承了(extends) HashMap<K,V>
* LinkedHashMap是Map集合的哈希表和链接列表（链表）实现，具有可预知的迭代顺序。是一个有序的集合
* 底层原理：
*       哈希表+链表（记录元素的顺序）
* */
public class Demo01LinkedHashMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("a", "a");
        map.put("c", "c");
        map.put("b", "b");
        map.put("d", "d");
        System.out.println(map);    //{a=a, b=b, c=c, d=d} - key不允许重复，是无序的集合
        System.out.println("=================");

        LinkedHashMap<String, String> linked = new LinkedHashMap<>();
        linked.put("a", "a");
        linked.put("c", "c");
        linked.put("b", "b");
        linked.put("d", "d");
        System.out.println(linked); //{a=a, c=c, b=b, d=d} - key不允许重复，是有序的集合
    }

}
