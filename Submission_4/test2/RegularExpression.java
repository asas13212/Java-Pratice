package test2;

public class RegularExpression
{

    public RegularExpression()
    {
        String qq = "123123";

        boolean res =  qq.matches("[1-9]\\d{5,19}");  //括号里面是正则表达式
        System.out.println(res);

        p();
        System.out.println("a".matches("[abc]"));     // true
        System.out.println("b".matches("[^abc]"));   // false
        System.out.println("ab".matches("[abc]"));   // false 从左到右一个个表示 这里是因为只能有一个字符
        p();
        System.out.println("a".matches("[a-zA-z]")); // true
        System.out.println("Z".matches("[a-zA-Z]")); // true
        System.out.println("0".matches("[a-zA-Z0-9]")); // true
        p();
        System.out.println("e".matches("[a-d[m-p]]"));  // false
        System.out.println("h".matches("[a-d[m-p[x-z]]]")); //false
        p();
        System.out.println("n".matches("[g-l&&[m-o]]"));    //false
        System.out.println("&".matches("[a-z&]"));          //true
        p();
        System.out.println("预定义字符的使用");
        System.out.println("反斜线的打印: \\");
        System.out.println("双引号的打印: \"");
        p();
        System.out.println("a".matches("."));  // true
        System.out.println("a".matches("..")); // false 因为要有两个字符
        System.out.println("2".matches("\\d")); // true
        System.out.println("不".matches("\\w")); // false
        System.out.println("不".matches("\\W")); // true 与上面的相同
        System.out.println("323你".matches("\\d{3}\\w"));


    }

    private static void p()
    {
        System.out.println("----------------------------");
    }

    /**
     *   [abc] 只能是 abc
     *   [^abc] 除了abc之外所有的字符
     *
     *   [a-zA-Z] 是指所有的字母 (大小写)
     *   [a-d[m-p]] 是指a-d 或者m-p
     *
     *   [a-z&&[def]] a-z与def 的交集，应该是true
     *   [a-z&[def]]  这里就是且这个符号了
     *
     *   [a-z&&[^bc]] 这个等价于 [ad-z] 也就是说 只用看-两边的东西
     *   [a-z&&[^m-p]] 等价于[a-lq-z]
     *   [abc][abc]  两个字符，且两个都要是abc其中一个
     */


    /**
     *   预定义字符
     *   . 代表任何一个字符
     *   \d 一个数字
     *   \D 一个非数字
     *   \s 一个空白字符
     *   \S 一个非空白字符
     *   \w 只能是一位单词字符 所有的字母加上所有的数字与下划线
     *
     */

    public static boolean isTrue(String qqNum)
    {

        int qqLenth = qqNum.length();

        if (qqLenth < 6 || qqLenth > 20)
            return false;

        if (qqNum.startsWith("0"))
            return false;

        for (int i = 0; i < qqLenth; i++)
        {
            char c = qqNum.charAt(i);
            if (c < '0' || c > '9')
                return false;
        }

        return true;
    }
}
