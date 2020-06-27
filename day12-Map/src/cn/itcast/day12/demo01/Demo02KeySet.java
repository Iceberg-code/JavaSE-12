package cn.itcast.day12.demo01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
* Map集合的第一种遍历方式：通过键找值的方式
* Map集合中的方法：
*       Set<K> keySet()：返回此映射中包含的键的Set视图
* 实现步骤：
*       1、使用Map集合中的方法keySet()，把Map集合所有的key取出来，存储到一个Set集合中
*       2、遍历Set集合，获取Map集合中的每一个key
*       3、通过Map集合中的方法get(key)，通过key找到value
* */
public class Demo02KeySet {
    public static void main(String[] args) {
        //创建Map集合对象，多态
        Map<String, Integer> map = new HashMap<>();
        map.put("黑影", 61);
        map.put("狂鼠", 52);
        map.put("回声", 17);

        //使用Map集合中的方法keySet()，把Map集合所有的key取出来，存储到一个Set集合中
        Set<String> set = map.keySet();

        //2、遍历Set集合，获取Map集合中的每一个key
        //使用迭代器遍历Set集合
        Iterator<String> it = set.iterator();
        while (it.hasNext()){
            String key = it.next();

            //3、通过Map集合中的方法get(key)，通过key找到value
            Integer value = map.get(key);
            System.out.println(key + "=" + value);
        }
        System.out.println("=====================");

        //使用增强for遍历Set集合
        for (String key : set) {
            //3、通过Map集合中的方法get(key)，通过key找到value
            Integer value = map.get(key);
            System.out.println(key + "=" + value);
        }
        System.out.println("=====================");

        //简化增强for循环遍历Set集合
        for (String key : map.keySet()) {
            //3、通过Map集合中的方法get(key)，通过key找到value
            System.out.println(key + "=" + map.get(key));
        }
    }
}
