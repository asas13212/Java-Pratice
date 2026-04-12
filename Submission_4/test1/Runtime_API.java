package test1;

//import java.io.IOException;

import java.io.IOException;

public class Runtime_API
{

    public Runtime_API()  // 与计算机底层原理息息相关

    {
        System.out.println("Runtime的使用方法");
        Runtime r = Runtime.getRuntime();

        System.out.println("当前线程数是 :" + r.availableProcessors());
        System.out.println("总内存大小" + r.maxMemory()/1024/1024);
        /**
         * 也可以使用Runtime.getRuntime().maxMemory();
         */
        System.out.println("剩余内存大小" + r.freeMemory()/1024/1024);  // 字节转兆

//        Runtime.getRuntime().exec("shutdown -a");
//        r.exec("shutdown -s -t 10");
        /**
         *  shutdown 关机
         *  -s 默认1分钟后关机
         *  -s -t 指定时间
         *  -a 取消关机操作
         *  -r 关机并重启
         */
    }


}
