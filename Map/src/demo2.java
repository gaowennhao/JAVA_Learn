import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

public class demo2 {
    public static void main(String[] args) {
        //Map集合的第一种遍历方式
        Map<String,String> map = new HashMap<>();

        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", "value3");

        //遍历方式1：通过键找值
        //获取所有的键，把这些键放到一个单列集合当中
        Set<String> keySet = map.keySet();
        //遍历单列集合，得到每一个键
        for (String key : keySet) {
            //利用map集合中的键获取对应的值  get
            System.out.println(key + ":" + map.get(key));
        }
        //练习一：  利用键找值的方式遍历map集合，要求：装着键的单列集合使用增强for的形式进行遍历
        //上面就是了

        //练习二：  利用键找值的方式遍历map集合，要求：装着键的单列集合使用迭代器的形式进行遍历
        System.out.println("\n练习二：迭代器遍历");
        Iterator<String> iterator = keySet.iterator();
        while(iterator.hasNext()) {
            String key = iterator.next();
            System.out.println(key + "=" + map.get(key));
        }
        //练习三：  利用键找值的方式遍历map集合，要求：装着键的单列集合使用lambda表达式的形式进行遍历
        System.out.println("\n练习三：lambda表达式遍历");
        keySet.forEach(key -> System.out.println(key + "=" + map.get(key)));
    }
}
