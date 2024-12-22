import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class demo3 {
    public static void main(String[] args) {
        //Map集合的第二种遍历方式
        //1.创建Map集合的对象
        Map<String,String> map = new HashMap<>();

        //2.添加元素
        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", "value3");
        map.put("key4", "value4");

        //遍历方式2：通过键值对对象进行遍历
        //通过一个方法获取所有键值对对象，返回一个set集合
        Set<Map.Entry<String,String>> entries = map.entrySet();
        for (Map.Entry<String,String> entry : entries) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "=" + value);
        }
    }
}
