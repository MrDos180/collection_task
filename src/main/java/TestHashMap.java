import java.util.Map;

public class TestHashMap {

    public void addKeyValueMap(Map<Integer, String> map, Integer key, String value) {
        map.put(key, value);
    }

    public void getHashMapElement(Map<Integer, String> map, Integer key) {
        System.out.println("Элемент " + map.get(key) + " найден");
    }

    public void removeHashMapElement(Map<Integer, String> map, Integer key) {
        System.out.println("Элемент " + map.remove(key) + " удалён");
    }

    public void printAllHashMap(Map<Integer, String> map) {
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Ключ = " + entry.getKey() + ", Значение = " + entry.getValue());
        }
    }
}
