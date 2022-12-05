import java.util.ArrayList;


public class TestList {

    public void arrayListAddString(ArrayList<String> list, String element) {
        list.add(element);
        System.out.println("Элемент " + element + " добавлен в список");
    }

    public void arrayListFindElement(ArrayList<String> list, String element) {
        for (String s : list) {
            if (s.equals(element)) {
                System.out.println("Элемент " + element + " найден в списке");
            }
        }
    }

    public void arrayListDelete(ArrayList<String> list, String element) {
        list.remove(element);
        System.out.println("Элемент " + element + " удален из списка");
    }

    public void printArrayListAllElements(ArrayList<String> list) {
        for (String s : list) {
            System.out.println(s);
        }
    }


}
