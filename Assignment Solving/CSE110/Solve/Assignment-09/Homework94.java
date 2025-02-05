import java.util.Scanner;

class Homework94 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        int N = sc.nextInt();
        sun(1, N);
    }

    public static void sun(int i, int N) {
        if (i > N) {
            return;
        }
        System.out.print(i + " ");
        sun(i + 1, N);
    }
}
