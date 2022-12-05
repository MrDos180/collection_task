import java.util.Set;

public class TestHashSet {

    public void findHashSetElement(Set<String> set, String value) {
        if (set.contains(value)) {
            System.out.println("Значение " + value + " найдено");
        } else {
            System.out.println("Значение не найдено");
        }
    }

    public void printHashSet(Set<String> set) {
        for (String a : set) {
            System.out.print(a + " ");
        }
        System.out.println();
    }

    public void addHashSetElement(Set<String> set, String value) {
        set.add(value);
        System.out.println("Значение " + value + " добавлено");
    }

    public void removeHashSetElement(Set<String> set, String value) {
        set.remove(value);
        System.out.println("Значение " + value + " удалено");

    }


}
