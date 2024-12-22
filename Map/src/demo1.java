import java.util.HashMap;
import java.util.Map;

public class demo1 {
    public static void main(String[] args) {
        /*
            V put(K key,V value)                    添加元素
            V remove(Object key)                    根据键删除键值对元素
            void clear()                            移除所有的键值对元素
            boolean containsKey(Object key)         判断集合是否包含指定的键
            boolean containsValue(Object value)     判断集合是否包含指定的值
            boolean isEmpty()                       判断集合是否为空
            int size()                              集合的长度，也就是集合中键值对的个数
        */
        //1.创建map集合对象
        Map<String,String> map = new HashMap<>();

        //2.添加元素
        //put方法的细节：
        //添加/覆盖
        //在添加数据的时候，如果键不存在，那么直接把键值对对象添加到map集合当中,方法返回null
        //在添加数据的时候，如果键是存在的，那么会把原有的键值对对象覆盖，会把被覆盖的值进行返回。

        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", "value3");

        String v1 = map.get("key1");
        System.out.println(v1);

        String v2 = map.put("key1", "value4");
        System.out.println(v2);

        //删除
        String result = map.remove("key3");
        System.out.println(result);

        boolean keyResult = map.containsKey("key1");
        System.out.println(keyResult);

        boolean valueResult = map.containsValue("value2");
        System.out.println(valueResult);

        int size = map.size();
        System.out.println(size);
        System.out.println(map);

        map.clear();
        System.out.println(map.isEmpty());


    }
}

