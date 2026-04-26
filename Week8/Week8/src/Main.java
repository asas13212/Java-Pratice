import java.util.*;

public class Main
{
    static void main()
    {
//        new ComparableTest();
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("王刘",18,99));
        list.add(new Student("圣诞",17,100));
        list.add(new Student("的角",19,98));
        list.add(new Student("整数",22,92));
        list.add(new Student("是多",22,95));
//        String s = "sdds";



        System.out.println("排序前");
        for (Student s : list)
        {
            System.out.println(s.toString());
        }

        System.out.println("用comparator");

        list.sort( new Comparator<Student>()
        {
            @Override
            public int compare(Student o1, Student o2)
            {
                return o1.score - o2.score;
            }
        });

        for (Student s : list)
        {
            System.out.println(s.toString());
        }

        System.out.println("类中比较（默认分数）");
        Collections.sort(list);
        for (Student s : list)
        {
            System.out.println(s.toString());
        }
        
    }

}
