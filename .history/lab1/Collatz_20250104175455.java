/** Class that prints the Collatz sequence starting from a given number.
 *  @author YuanaHao
 *  @source CS61B
 */
public class Collatz {

    /** Buggy implementation of nextNumber! */
    public static int nextNumber(int n) {
        /** If odd, it will return 3n +1 */
        if (n % 2 != 0) {
            return 3*n + 1;
        }
        /** If even, it will return n / 2 */
        else {
            return n / 2;
        }
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.print(n + " ");
        while (n != 1) {
            n = nextNumber(n);
            System.out.print(n + " ");
        }
        System.out.println();
    }
}

