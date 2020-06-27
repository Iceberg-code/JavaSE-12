package cn.itcast.day12.demo04;

import java.util.List;
import java.util.Map;
import java.util.Set;

/*
* JDK 9的新特性：
*       List接口，Set接口，Map接口：里面增加了一个静态方法of，可以给集合一次性添加多个元素
*       static <E> List<E> of (E...elements)
*       使用前提：
*           当集合中存储的元素的个数已经确定了，不再改变时使用
* 注意：
*       1、of方法只适用于List接口，Set接口，Map接口，不适用于接口的实现类
*       2、of方法的返回值是一个不能改变的集合，集合不能再使用add/put方法来添加元素，会抛出异常
*       3、Set接口和Map接口在调用of方法的时候，不能有重复的元素，否则会抛出异常
* */
public class Demo01JDK9 {
    public static void main(String[] args) {
        List<String> list = List.of("a", "b", "a", "c", "d");
        System.out.println(list);   //[a, b, a, c, d]
//        list.add("e");  //UnsupportedOperationException - 不支持操作异常
        System.out.println("==================");

//        Set<String> set = Set.of("a", "b", "a", "c", "d");  //IllegalArgumentException - 非法参数异常，有重复的元素
        Set<String> set = Set.of("a", "b","c", "d");
        System.out.println(set);    //[a, c, b, d]
//        set.add("e");   //UnsupportedOperationException - 不支持操作异常
        System.out.println("==================");

        Map<String, Integer> map = Map.of("源氏", 18, "半藏", 19, "麦克雷", 20);
//        Map<String, Integer> map = Map.of("源氏", 18, "半藏", 19, "源氏", 20);    //IllegalArgumentException - 非法参数异常
        System.out.println(map);    //{麦克雷=20, 源氏=18, 半藏=19}
//        map.put("奥丽莎", 1);  //UnsupportedOperationException - 不支持操作异常
    }
}
