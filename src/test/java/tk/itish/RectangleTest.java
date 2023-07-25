package tk.itish;

import org.junit.jupiter.api.Test;
import org.w3c.dom.css.Rect;

import static org.junit.jupiter.api.Assertions.*;
// define a class to test rectangle
class RectangleTest {
    // test if instance
    @Test
    void newRectangle_isInstanceOfRectangle_true(){
        Rectangle rectangle = new Rectangle(2, 4);
        assertEquals(true, rectangle instanceof Rectangle);
    }

    // test length
    @Test
    void newRectangle_hasLength2_2(){
        Rectangle rectangle = new Rectangle(2, 4);
        assertEquals(2, rectangle.getLength());
    }
}