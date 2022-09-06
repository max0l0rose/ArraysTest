public class Main {

    static void f(int[] arr) {
        arr[2] = 99;
        arr = null;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3};
        int[] b = a;
        a[0] = 10;

        f(a);

        int q = 1;

    }
}
