package self.collection.array;

import java.util.Arrays;

public class ArrayMain1 {

    public static void main(String[] args) {
        int[] arr = new int[5];

        System.out.println("===index 입력: O(1)===");
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        System.out.println(Arrays.toString(arr));       // [1, 2, 3, 0, 0]

        System.out.println("===index 변경 O(1)===");
        arr[2] = 10;
        System.out.println(Arrays.toString(arr));       // [1, 2, 10, 0, 0]

        System.out.println("===index 조회 O(n)===");
        System.out.println("arr[2] = " + arr[2]);       // arr[2] = 10
        int value = 10;
        for(int i=0; i<arr.length; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
            //arr[2] = 10
            //arr[0] = 1
            //arr[1] = 2
            //arr[2] = 10
            if(arr[i] == value) {
                System.out.println(value + " 찾음");      // 10 찾음
                break;
            }
        }

        // 인덱스로 데이터를 찾을 때 O(1)인 이유!
        // arr[2]에 위치한 자료를 찾는다고 가정해보자.  **arr[0]은 x100에 위치하고 있다.
        // 배열은 메모리상에 순서대로 붙어서 존재한다.
        // int는 4byte를 차지한다.
        // 따라서 배열의 싲가 위치인 x100부터 시작해서 자료의 크기(4byte)와 인덱스 번호를 곱하면 원하는 메모리 위치를 찾을 수 있다.
        // 배열의 시작 참조(x100) + (자료의 크기(4byte)*인덱스 위치(2)) = x108이 나온다. 여기에는 숫자 10이 들어있다.

    }
}
