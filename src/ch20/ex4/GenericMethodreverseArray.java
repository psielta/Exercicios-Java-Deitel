package ch20.ex4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericMethodreverseArray {
    public static <T> void reverseArray(T[] inputArray) {
        List<T> list = new ArrayList<>(List.of(inputArray));
        for (int i = inputArray.length - 1, y = 0; i >= 0; i--, y++) {
            inputArray[y] = list.get(i);
        }
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5, 6};
        Character[] charArray = {'a', 'b', 'c', 'd', 'e', 'f'};
        Double[] doubleArray = {1.1, 1.2, 1.3, 1.4, 1.5, 1.6};

        outputArray(intArray, charArray, doubleArray);

        reverseArray(intArray);
        reverseArray(doubleArray);
        reverseArray(charArray);

        outputArray(intArray, charArray, doubleArray);
    }

    public static <X, Y, Z> void outputArray(X[] xArray, Y[] yArray, Z[] zArray) {
        System.out.println(Arrays.toString(xArray));
        System.out.println(Arrays.toString(yArray));
        System.out.println(Arrays.toString(zArray) + "\n------------");
    }
}
