package test1;

public class Object_API
{

    public Object_API()
    {
        System.out.println("toString的用法超级重要");
        Object obj = new Object();
        String s = obj.toString();
        System.out.println(s);

        System.out.println("equals的用法");
        System.out.println("默认比较地址，所以重写后是比较内部的属性值");
        System.out.println("clone的用法");

        System.out.println("clone的用法则是直接");
        Object o = new Object();
//        obj = o.clone();
        System.out.println("浅拷贝与深拷贝" );

        User u= new User("wan");
//        User u2 = (User) u.clone();

        System.out.println("Objects与Object");
        //  boolean result = Objects.equals(s1,s2);  一般都是用来这样使用的, 感觉没什么用
        //  boolean
    }
}


class User implements Cloneable
{
    public String name;

//    @Override
//    protected Object clone() throws CloneNotSupportedException
//    {
//        return super.clone();
//    } //浅拷贝的底层实现
// 深拷贝与浅拷贝
    public User(String name)
    {
        this.name = name;
    }
}