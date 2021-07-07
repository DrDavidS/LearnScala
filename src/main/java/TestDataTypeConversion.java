public class TestDataTypeConversion {
    public static void main(String[] args) {
        byte b = 10;
        test(b);
        char c = 'a';
        test(c);
    }

    // 函数的重载
    public static void test(byte b){
        System.out.println("bbbb");
    }
    public static void test(short s){
        System.out.println("ssss");
    }
    public static void test(char c){
        System.out.println("cccc");
    }
    public static void test(int i){
        System.out.println("iiii");
    }
}
