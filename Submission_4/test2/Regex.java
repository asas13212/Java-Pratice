package test2;

import java.util.Scanner;

public class Regex
{

    public Regex()
    {
        String s = new String();
        String regex1 = "1[3-9]\\d{9}";
        String regex2 = "0\\d{2,3}-{？}\\d{7}";
        String regex3 = "\\d{3,10}@qq.com";
        String regex_plugin = "/^[A-Z]+$/";  //  所有的大写英文字母
//        String regex4 = "/^(?:[\u4e00-\u9fa5·]{2,16})$/"   //  记得把前后的/ 删去，以及^与$，还有\一定要有两个
        String st = "Java 又温和的人，像清晨穿过枝叶的光，不张扬，却自有温度他话不多，做事却极稳，遇事不慌，待人宽厚。像他名字那般，看似普通，却能在纷繁世事里稳稳运行，守着自己的节奏，不急不躁，认真生活。平日里安静内敛，关键时可靠坚定，温和";

        Scanner sc = new Scanner(System.in);


        while (true){

            s = sc.nextLine();
            if(s.matches(regex3))
            {
                System.out.println("你输对了");

            }else{
                System.out.println("你输错了");
            }

        }
    }
}
