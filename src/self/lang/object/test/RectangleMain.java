package self.lang.object.test;

import self.lang.object.test.Rectangle;

public class RectangleMain {
    public static void main(String[] args){
        Rectangle rect1 = new Rectangle(100, 20);
        Rectangle rect2 = new Rectangle(100, 20);

        System.out.println(rect1);                      // Rectanle{width=100, height=20}
        System.out.println(rect2);                      // Rectanle{width=100, height=20}
        System.out.println(rect1 == rect2);             // false
        System.out.println(rect1.equals(rect2));        // true
    }
}
