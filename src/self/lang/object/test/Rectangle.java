package self.lang.object.test;

import java.util.Objects;

public class Rectangle {

    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height= height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Rectangle rect2 = (Rectangle) o;
        return Objects.equals(width, rect2.width)               // 너비 비교
                    && Objects.equals(height, rect2.height);    // ( &&연산자 ) 높이 비교
    }
}
