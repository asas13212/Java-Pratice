import java.util.Scanner;

public class Test3
{

    public Test3()
    {
        Scanner sc = new Scanner(System.in);
        String mail;
        System.out.println("请输入正确邮箱号码(QQ)");

        String regex = "\\d{5,11}@qq\\.com";
        mail = sc.nextLine();

        if (mail.matches(regex))
            System.out.println("你输入的正确");

    }
}
