package lab1;

public class Reduce {
    static void main() {
        int n = 100;

        int steps = 0;
        while (n != 0) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n--;
            }
            steps++;
        }
        System.out.println(steps);
    }
}
