package self.collection.set;

import java.util.Arrays;

public class HashStart4 {

    static final int CAPACITY = 10;

    public static void main(String[] args) {
        // {1, 2, 5, 8, 14, 99}
        System.out.println("hashIndex(1) = " + hashIndex(1));       // hashIndex(1) = 1
        System.out.println("hashIndex(2) = " + hashIndex(2));       // hashIndex(2) = 2
        System.out.println("hashIndex(5) = " + hashIndex(5));       // hashIndex(5) = 5
        System.out.println("hashIndex(8) = " + hashIndex(8));       // hashIndex(8) = 8
        System.out.println("hashIndex(14) = " + hashIndex(14));     // hashIndex(14) = 4
        System.out.println("hashIndex(99) = " + hashIndex(99));     // hashIndex(99) = 9

        Integer[] inputArray = new Integer[CAPACITY];
        add(inputArray, 1);
        add(inputArray, 2);
        add(inputArray, 5);
        add(inputArray, 8);
        add(inputArray, 14);
        add(inputArray, 99);

        // Arrays.toString(inputArray) = [null, 1, 2, null, 14, 5, null, null, 8, 99]
        System.out.println("Arrays.toString(inputArray) = " + Arrays.toString(inputArray));
        
        // 검색
        int searchValue = 14;
        int hashIndex = hashIndex(searchValue);
        System.out.println("searchValue hashIndex = " + hashIndex);     // searchValue hashIndex = 4
        Integer result = inputArray[hashIndex]; // O(1)
        System.out.println(result);             // 14
    }

    private static void add(Integer[] inputArray, int value) {
        int hashIndex = hashIndex(value);
        inputArray[hashIndex] = value;
    }

    static int hashIndex(int value) {
        return value % CAPACITY;
    }
}
