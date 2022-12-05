
public class TestArray {

    public void printArrayElementsAsc(int[] array) {
        int i = 0;
        while (i < array.length) {
            System.out.print(array[i] + " ");
            i++;
        }
        System.out.println();
    }

    public void printArrayElementsDesc(int[] array) {
        int i = array.length - 1;
        do {
            System.out.print(array[i] + " ");
            i--;
        }
        while (i >= 0);
        System.out.println();
    }

}
