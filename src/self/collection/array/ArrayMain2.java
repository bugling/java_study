package self.collection.array;

import java.util.Arrays;

public class ArrayMain2 {

    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        System.out.println(Arrays.toString(arr));       // [1, 2, 0, 0, 0]

        // 배열의 첫변째 위치에 추가
        // 기본 배열의 데이터를 한 칸씩 뒤로 밀고 배열의 첫번쨰 위치에 추가
        System.out.println("배열의 첫번째 위치에 3 추가 O(n)");
        int newValue = 3;
        addFirst(arr, newValue);
        System.out.println(Arrays.toString(arr));       // [3, 1, 2, 0, 0]

        // index 위치에 추가
        // 기본 배열의 데이터를 한 칸씩 뒤로 밀고 배열의 index 위치에 추가
        System.out.println("배열의 index(2) 위치에 4추가 O(n)");            // 평균 O(n/2)이지만 O(n)으로 표기함!
        int index = 2;
        int value = 4;
        addAttIndex(arr, index, value);
        System.out.println(Arrays.toString(arr));       // [3, 1, 4, 2, 0]

        System.out.println("배열의 마지막 위치에 5 추가 O(1)");
        addLast(arr, 5);
        System.out.println(Arrays.toString(arr));       // [3, 1, 4, 2, 5]
    }

    private static void addLast(int[] arr, int newValue) {
        arr[arr.length-1] = newValue;
    }

    private static void addAttIndex(int[] arr, int index, int value) {
        for(int i=arr.length-1; i>index; i--){
            arr[i] = arr[i-1];
        }
        arr[index] = value;
    }

    private static void addFirst(int[] arr, int newValue) {
        for(int i=arr.length-1; i>0; i--){
            arr[i] = arr[i-1];
        }
        arr[0] = newValue;
    }

    //배열에 데이터를 추가할 때 위치에 따른 성능 변화
        //배열의 첫번째 위치에 추가
        //배열의 첫번째 위치를 찾는데는 인덱스를 사용하므로 O(1)이 걸린다.
        //모든 데이터를 배열의 크기만큼 한 칸씩 이동해야 한다. 따라서 O(n) 만큼의 연산이 걸린다.
        //O(1 + n) O(n)이 된다.
    //배열의 중간 위치에 추가
        //배열의 위치를 찾는데는 O(1)이 걸린다.
        //index의 오른쪽에 있는 데이터를 모두 한 칸씩 이동해야 한다. 따라서 평균 연산은 O(n/2)이 된다.
        //O(1 + n/2) O(n)이 된다.
    //배열의 마지막 위치에 추가
        //이 경우 배열이 이동하지 않고 배열의 길이를 사용하면 마지막 인덱스에 바로 접근할 수 있으므로 한번의 계산으로 위치를 찾을 수 있고, 기존 배열을 이동하지 않으므로 O(1)이 된다

    // 배열의 한계
    //배열은 가장 기본적인 자료 구조이고, 특히 인덱스를 사용할 때 최고의 효율이 나온다. 하지만 이런 배열에는 큰 단점이
    //있다. 바로 배열의 크기를 배열을 생성하는 시점에 미리 정해야 한다는 점이다.
    //예를 들어서 이벤트를 하는데, 누구나 이벤트에 참여할 수 있고, 이벤트가 끝나면 추첨을 통해서 당첨자를 정한다고 가
    //정해보자. 이때 이벤트에 참여하는 사용자를 배열에 보관한다고 가정하자. 사용자들은 실시간으로 계속 추가된다. 이때
    //넉넉하게 길이가 1000인 배열을 사용했는데, 예상보다 이벤트 참여자가 많아서 1000명을 넘게 된다면 더 많은 사용자
    //가 이벤트에 참여하지 못하는 문제가 발생한다. 그렇다고 처음부터 너무 많은 배열을 확보하면 메모리가 많이 낭비된다.
    //배열처럼 처음부터 정적으로 길이가 정해져있는 것이 아니라, 동적으로 언제든지 길이를 늘리고 줄일 수 있는 자료 구조
    //가 있다면 편리할 것이다
}
