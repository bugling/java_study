package self.collection.set;

import java.util.Arrays;

public class HashStart2 {
    public static void main(String[] args) {
        Integer[] inputArray = new Integer[10];
        
        // 배열의 인덱스를 값으로 활용  -> 검색 시 O(1) 성능을 낼 수 있음
        inputArray[1] = 1;
        inputArray[2] = 2;
        inputArray[5] = 5;
        inputArray[8] = 8;
        // Arrays.toString(inputArray) = [null, 1, 2, null, null, 5, null, null, 8, null]
        System.out.println("Arrays.toString(inputArray) = " + Arrays.toString(inputArray));

        int searchValue = 8;
        Integer result = inputArray[searchValue];   // O(1)
        System.out.println("result = " + result);   // result = 8

    }
}
