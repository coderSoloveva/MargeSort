public class Main {
    public static void main(String[] args) {
        Integer[] A = new Integer[]{0, 4, 3, 5, 2, 8, 9, 1, 7, 6};
        print(A);
        Sort(A, 0, A.length - 1);
        print(A);
    }

    private static void print(Integer[] A) {
        System.out.print("[ ");
        for (int i = 0; i < A.length; i++){
            System.out.printf("%2d ", A[i]);
        }
        System.out.println(" ]");
    }

    public static void Sort(Integer[] A, int p, int r) {
        if (p < r) {
            int q = (p + r ) / 2;
            Sort(A, p, q);
            Sort(A,q + 1, r);
            Merge(A, p, q, r);
        }
    }

    private static void Merge(Integer[] A, int p, int q, int r) {
        Integer[] B = new Integer[A.length];
        int Q = ++q;
        int index = p;
        System.arraycopy(A, 0, B, 0, B.length);
        while (p < Q && q <= r) {
            if (B[p] <= B[q]) {
                A[index++] = B[p++];
            } else {
                A[index++] = B[q++];
            }
        }
        while (p < Q) {
            A[index++] = B[p++];
        }
        while (q <= r) {
            A[index++] = B[q++];
        }
    }
}
