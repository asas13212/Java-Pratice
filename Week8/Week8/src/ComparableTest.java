import java.util.Arrays;
import java.util.Comparator;

public class ComparableTest
{

    public ComparableTest()
    {
        int[] arr = {2,3,1,0};

        System.out.println("排序之前");
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println("排序之后");
        System.out.println(Arrays.toString(arr));

//        Arrays.sort(arr,new Comparator<Integer>());

    }


}
