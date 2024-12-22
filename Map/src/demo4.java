import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class demo4 {
    public static void main(String[] args) {
        //Map集合的第三种遍历方式

        //1.创建Map集合的对象
        Map<String,String> map = new HashMap<>();
        //2.添加元素
        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", "value3");
        map.put("key4", "value4");

        //3.利用lambda表达式进行遍历
        //底层：
        //forEach其实就是利用第二种方式进行遍历，依次得到每一个键和值
        //再调用accept方法
        map.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String key, String value) {
                System.out.println(key + "=" + value);
            }
        });

        //化简写法
        System.out.println("-----------------------------------");

        map.forEach((String key, String value) -> {
                System.out.println(key + "=" + value);
            }
        );

        //继续简化
        System.out.println("-----------------------------------");

        map.forEach(( key,  value) -> System.out.println(key + "=" + value));
    }
}
