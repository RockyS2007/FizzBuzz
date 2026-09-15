package lab1;

public class Multiples {
    static void main() {
        System.out.println(multiples(1000, 3, 5));
    }

    static int multiples(int n, int a, int b) {
        int ans = 0;
        for (int i = 1; i < n; i++) {
            if (i % a == 0 || i % b == 0) ans++;
        }
        return ans;
    }

    static int multiples() {
        return multiples(1000, 3, 5);
    }
}
