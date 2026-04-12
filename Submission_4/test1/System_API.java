package test1;

public class System_API
{

    public System_API()
    {
        System.out.println("System的有关API");
        System.out.println("currentTimeMills是用来得到当前时间的");
        System.out.println("现在经过了" + System.currentTimeMillis());
        System.out.println();
        System.out.println("exit的使用，0正常退出，");
//        System.exit();
        System.out.println();
        System.out.println("arraycopy的用法,靠也是引用，因为是object类型");
        int[] arr = {1,2,3};
        int[] arr2 = {2,32,4};
//        System.out.println(arr2);
        for (int i = 0; i < arr2.length; i++)
        {
            System.out.print(arr2[i] + " ");
        }
        System.arraycopy(arr,0,arr2,0,2);  // 打印出来应该是1 2 4
        for (int i = 0; i < arr2.length; i++)
        {
            System.out.print(arr2[i] + " ");
        }
        System.out.println("数组如果越界则也会报错");

    }
}
