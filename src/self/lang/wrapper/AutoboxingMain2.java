package self.lang.wrapper;

public class AutoboxingMain2 {

    public static void main(String[] args) {
        // Primitive -> Wrapper
        int value = 7;
        Integer boxedValue = value;

        // Wrapper -> Primitive
        int unboxedValue = boxedValue;

        System.out.println("boxedValue = " + boxedValue);           // boxedValue = 7
        System.out.println("unboxedValue = " + unboxedValue);       // unboxedValue = 7
    }
}
