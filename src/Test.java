import java.util.Random;

public class Test {

    public static void main(String[] args) {
        Random rand = new Random();
        for (int i = 0; i < 20; i++) {
            int a = rand.nextInt(20) + 1;
            int b = rand.nextInt(20) + 1;
            int c = rand.nextInt(20) + 1;
            Triangle triangle = new Triangle(a, b, c);
            System.out.println(triangle);
        }
    }
}