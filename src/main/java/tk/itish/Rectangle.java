package tk.itish;

public class Rectangle {
    // define member vars
    private int length;
    private int width;

    // define constructors

    public Rectangle() {
    }

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return this.length;
    }

    public int getWidth() {
        return this.width;
    }
}
