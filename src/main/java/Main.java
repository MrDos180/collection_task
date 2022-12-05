import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;


public class Main {

    static TestList tl = new TestList();
    static TestArray ta = new TestArray();
    static TestHashMap hm = new TestHashMap();
    static TestHashSet hs = new TestHashSet();

    public static void main(String[] args) {
        //ArraList
        ArrayList<String> list = new ArrayList<>();
        tl.arrayListAddString(list, "Москва");
        tl.arrayListAddString(list, "Стамбул");
        tl.arrayListAddString(list, "Нью-Йорк");
        tl.arrayListFindElement(list, "Стамбул");
        tl.arrayListDelete(list, "Нью-Йорк");
        tl.printArrayListAllElements(list);

        //Array
        int[] array = new int[]{2, 4, 10, 101};
        ta.printArrayElementsAsc(array);
        ta.printArrayElementsDesc(array);


        //HashMap
        HashMap<Integer, String> map = new HashMap<>();
        hm.addKeyValueMap(map, 1, "Ivanov");
        hm.addKeyValueMap(map, 2, "Petrov");
        hm.addKeyValueMap(map, 3, "Sidorov");
        hm.getHashMapElement(map, 2);
        hm.removeHashMapElement(map, 3);
        hm.printAllHashMap(map);


        //HashSet
        HashSet<String> set = new HashSet<>();
        hs.addHashSetElement(set, "Земля");
        hs.addHashSetElement(set, "Плутон");
        hs.addHashSetElement(set, "Венера");
        hs.addHashSetElement(set, "Луна");
        hs.findHashSetElement(set, "Земля");
        hs.removeHashSetElement(set, "Луна");
        hs.printHashSet(set);

    }
}
