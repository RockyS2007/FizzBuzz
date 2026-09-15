package lab1;

public class Reduce {
    static void main() {
        int n = 100;

        int steps = reduce(n);
        System.out.println(steps);
    }

    static int reduce(int n) {
        int steps = 0;
        while (n != 0) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n--;
            }
            steps++;
        }
        return steps;
    }
}
