package com.ngu.join;

import com.ngu.join.demo1.MyThread1;
import com.ngu.join.demo1.MyThread2;

/**
 * @Author: 李良超
 * @Date: 2019/4/25 13:11
 * @Description: 测试主类
 */
public class Main {

    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t2.thread = t1;
        // 启动一个线程
        t1.start();
        t2.start();
        // 该打印语句输出后，上面开启的子线程仍然在运行，即主进程进入终结状态后，并不意味这整个程序退出；
        System.out.println("Hello World!");
    }
}
