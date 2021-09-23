public class Triangle {

    private final int a, b, c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public String getType() {
        if (2 * a >= a + b + c || 2 * b >= a + b + c || 2 * c >= a + b + c) {
            return "invalid"; //the sum of the shortest sides is not greater than the longest
        } else if (a == b && b == c) {
            return "equilateral"; //all 3 sides are equal
        } else if (a == b || b == c || c == a) {
            return "isosceles"; //exactly 2 sides are equal
        } else {
            return "scalene"; //no sides are equal
        }
    }

    @Override
    public String toString() {
        return "Triangle [" + a + ", " + b + ", " + c + "] is type " + getType();
    }
}