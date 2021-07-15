public class TestRecursion {
    public static void main(String[] args) {
        // 计算阶乘
        System.out.println(factorical(5));
        System.out.println(factorical2(5));
    }

    // 1. 循环实现
    public static int factorical(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // 2. 递归实现
    public static int factorical2(int n) {
        // 基准情形
        if (n == 0) return 1;
        return factorical2(n - 1) * n;  // n-1 的阶乘 乘以 n
    }
}
