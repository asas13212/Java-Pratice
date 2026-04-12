package test1;

public class Math_API
{

    public Math_API()
    {
        showMath();

    }

    private static void showMath()
    {
        int a = -1;
        float b = .4f;
        double c = 0.32;
        System.out.println("a的绝对值是" + Math.abs(a));
        System.out.println("b的绝对值是" + Math.abs(b));
        System.out.println("---------");
        System.out.println("round是四舍五入，ceil与floor是取double的向上取整与向下取整");
        System.out.println("---------");
        System.out.println("c 的向上取整是" + Math.ceil(c));
        System.out.println("c 的向下取整是" + Math.floor(c));  // 打印出来是0.0

        System.out.println("---------");
        System.out.println("absExact是溢出会报错");
        System.out.println("---------");
        System.out.println();
//        System.out.println(Math.absExact(-2147483648));
        System.out.println("---------");
        System.out.println("pow的使用");
        System.out.println("---------");
        System.out.println("2的-2是:" + Math.pow(2,-2));
        System.out.println();
        System.out.println("立方根是cbrt");
        System.out.println("3的立方根是 : " + Math.cbrt(3));


    }
}
