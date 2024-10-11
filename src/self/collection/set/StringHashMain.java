package self.collection.set;

public class StringHashMain {

    static final int CAPACITY = 10;

    public static void main(String[] args) {
        // char
        char charA = 'A';
        char charB = 'B';
        System.out.println("charA = " + (int)charA);    // charA = 65
        System.out.println("charB = " + (int)charB);    // charB = 66

        int hashCode = hashCode("A");   // hashCode = 65
        System.out.println("hashCode = " + hashCode);

        System.out.println(hashCode("Hello"));      // 500
        System.out.println(hashCode("Good Bye"));   // 713

        // hashIndex
        // String -> char[] -> int(hashCode) -> hashIndex
        System.out.println("hashIndex(hashCode(\"A\")) = " + hashIndex(hashCode("A")));     // hashIndex(hashCode("A")) = 5
        System.out.println("hashIndex(hashCode(\"B\")) = " + hashIndex(hashCode("B")));     // hashIndex(hashCode("B")) = 6
        System.out.println("hashIndex(hashCode(\"AB\")) = " + hashIndex(hashCode("AB")));   // hashIndex(hashCode("AB")) = 1

    }

    static int hashCode(String str) {
        char[] charArray = str.toCharArray();
        int sum = 0;
        for(char c : charArray) {
            sum += (int)c;
        }
        return sum;
    }

    static int hashIndex(int value) {
        return value % CAPACITY;
    }
}
