public class TestOperator {
    public static void main(String[] args) {
        // 比较运算符
        String s1 = "hello";
        String s2 = new String("hello");
        Boolean isEqual = s1 == s2;
        System.out.println(isEqual);  // false，因为这里判断的是引用地址，而不是值
        System.out.println(s1.equals(s2));  // true
        System.out.println("======   分  割  线   =========");  // true


        // 赋值运算符
        byte b = 10;
        // b = b + 1;  // 这样是不行的，类型不匹配，需要把 b 变成 int
        b = (byte) (b + 1);  // 这里做了一个强转
        b += 1; // 默认会做强转
        System.out.println(b);

        // 自增自减
        int x = 15;
        int y = x++;
        System.out.println("x = " + x + ", y = " + y);

        x = 15;
        y = ++x;
        System.out.println("x = " + x + ", y = " + y);

        x = 23;
        x = x++;
        System.out.println("x = " + x);
        /* 还是23，因为JAVA里面有一个临时变量temp，temp = x++，
           然后再把 x 赋值给 temp
           然后 x = temp
           逻辑很混乱，建议不要这么用
         */
    }
}
