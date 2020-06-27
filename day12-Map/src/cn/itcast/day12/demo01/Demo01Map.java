package cn.itcast.day12.demo01;

import java.util.HashMap;
import java.util.Map;

/*
* java.util.Map<k,v>集合     Map集合是双列集合，Collection集合是单列集合
* Map集合的特点：
*       1、Map集合是一个双列集合，一个元素包含两个值（一个key，一个value）
*       2、Map集合中的元素，key和value的数据类型可以相同，也可以不同
*       3、Map集合中的元素，key是不允许重复的，value是可以重复的
*       4、Map集合中的元素，key和value是一一对应的
*
* java.util.HashMap<k,v>集合 实现了(implements) Map<k,v>接口
* HashMap集合的特点：
*       1、HashMap集合底层是哈希表：查询的速度很快
*           JDK 1.8之前：数组+单向链表
*           JDK 1.8之后：数组+单向链表/红黑树(链表的长度超过8)：提高查询的速度
*       2、HashMap集合是一个无序的集合，存储元素和取出元素的顺序有可能不一致
*
* java.util.LinkedHashMap<k,v>集合 继承了(extends) HashMap<k,v>集合
* LinkedHashMap的特点：
*       1、LinkedHashMap集合底层是哈希表+链表(保证迭代的顺序)
*       2、LinkedHashMap集合是一个有序的集合，存储元素和取出元素的顺序是一致的
* */
public class Demo01Map {
    public static void main(String[] args) {
        show01();
        System.out.println("================");
        show02();
        System.out.println("================");
        show03();
        System.out.println("================");
        show04();
    }

    /*
    * public V put(K key, V value)：把指定的键与指定的值添加到Map集合中
    *       返回值：V
    *           存储键值对的时候，key不重复，返回值V是null
    *           存储键值对的时候，key重复，会使用新的value替换Map中重复的value，返回被替换的value值
    *
    * key与value一一对应，key不允许重复，value允许重复
    * */
    private static void show01(){
        //创建Map集合对象，多态
        Map<String, String> map = new HashMap<>();

        String v1 = map.put("路霸", "狂鼠");
        System.out.println("v1:" + v1); //v1:null

        //虽然写了两次“路霸”，但是集合中key只有一个“路霸”。如果key重复，就会用新的value把以前的value替换掉
        String v2 = map.put("路霸", "源氏");
        System.out.println("v2:" + v2); //v2:狂鼠

        System.out.println(map);    //{路霸=源氏} - 重写了toString方法

        map.put("麦克雷", "回声");
        map.put("安娜", "法老之鹰");
        map.put("猎空", "回声");
        System.out.println(map);    //{猎空=回声, 路霸=源氏, 安娜=法老之鹰, 麦克雷=回声} - 注意是无序集合
    }

    /*
    * public V remove(Object key)：把指定的键所对应的键值对元素在Map集合中删除，返回被删除元素的值
    *       返回值：V
    *           key存在，V返回被删除的值
    *           key不存在，V返回null
    * */
    private static void show02(){
        //创建Map集合对象，多态
        Map<String, Integer> map = new HashMap<>();
        map.put("黑影", 61);
        map.put("狂鼠", 52);
        map.put("回声", 17);
        System.out.println(map);    //{狂鼠=52, 黑影=61, 回声=17} - 注意是无序集合

        Integer v1 = map.remove("狂鼠");
        System.out.println("v1:" + v1);
        System.out.println(map);    //{黑影=61, 回声=17}

//        int v2 = map.remove("末日铁拳");  //自动拆箱，出现NullPointerException，因为null不能赋值给int类型，但是可以赋值给Integer类型
        Integer v2 = map.remove("末日铁拳");    //map中没有末日铁拳
        System.out.println("v2:" + v2); //v2:null
        System.out.println(map);    //{黑影=61, 回声=17}
    }

    /*
    * public V get(Object key)：根据指定的键，在Map集合中获取对应的值
    *       返回值：V
    *           key存在，返回对应的value值
    *           key不存在，返回null
    * */
    private static void show03(){
        Map<String, Integer> map = new HashMap<>();
        map.put("黑影", 61);
        map.put("狂鼠", 52);
        map.put("回声", 17);
        System.out.println(map);    //{狂鼠=52, 黑影=61, 回声=17} - 注意是无序

        Integer v1 = map.get("回声");
        System.out.println("v1:" + v1); //17

        Integer v2 = map.get("布里吉塔");   //map中没有布里吉塔
        System.out.println("v2:" + v2); //v2:null
    }

    /*
    * boolean containsKey(Object key)：判断集合中是否包含指定的键
    * 包含返回true，不包含返回false
    * */
    private static void show04(){
        Map<String, Integer> map = new HashMap<>();
        map.put("黑影", 61);
        map.put("狂鼠", 52);
        map.put("回声", 17);
        System.out.println(map);    //{狂鼠=52, 黑影=61, 回声=17} - 注意是无序

        boolean b1 = map.containsKey("回声");
        System.out.println("b1:" + b1); //v1:true

        boolean b2 = map.containsKey("布里吉塔");   //map中没有布里吉塔
        System.out.println("b2:" + b2); //v2:false

    }
}
