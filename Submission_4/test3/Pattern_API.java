package test3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pattern_API
{

    public Pattern_API()
    {
        String s = "你好，我的电话号码是18720438626，我的邮箱是804860914@qq.com,嘿嘿嘿,我的身份证是36112820070208751X" +
                "我爱学习java11,不爱学习java8，最讨厌java9";
        String s2 = "abbbbbbaaa";

        String s3 = "王八蛋sjgkjksj蔡徐坤";

        String regex1 = "(?:(?:\\+|00)86)?1[3-9]\\d{9}";
        String regex2 = "java(?=8|11)";
        String regex3 = "ab+";
        String regex4 = "[\\w&&[^_]]+";
        String res = s3.replaceAll(regex4, "VS");
        System.out.println(res);

        Pattern p = Pattern.compile(regex3);
        Matcher m = p.matcher(s2);

        while (m.find())
        {
            System.out.println("电话号码:" + m.group());
        }

    }
}
