package HomeWork5.Task3;

public class ElementsClass<T> {
    private T[] arr;

    public T getArrIndex(int i) {
        return arr[i];
    }

    public void setArray(T[] arr) {
        this.arr = arr;
    }

    public static <T> T getElements(T[] arr, int index) {
        T[] array = arr;
        ElementsClass<T> elements = new ElementsClass<>();
        elements.setArray(array);
        return elements.getArrIndex(index);
    }
}
