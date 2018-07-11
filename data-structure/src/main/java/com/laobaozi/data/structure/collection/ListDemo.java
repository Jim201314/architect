package com.laobaozi.data.structure.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

/**
 *  List是一个有序的集合，和set不同的是，List允许存储项的值为空，也允许存储相等值的存储项，还举了e1.equal(e2)的例子。
    List是继承于Collection接口，除了Collection通用的方法以外，扩展了部分只属于List的方法
 *
 * @author jim
 * @date 2018/7/10
 */
public class ListDemo {


    /**
     * ArrayList是一个数组实现的列表，由于数据是存入数组中的，所以它的特点也和数组一样，查询很快，但是中间部分的插入和删除很慢
     */
    List arrayList = new ArrayList();

    /**
     *   Vector就是ArrayList的线程安全版，它的方法前都加了synchronized锁，其他实现逻辑都相同。
     *   如果对线程安全要求不高的话，可以选择ArrayList，毕竟synchronized也很耗性能
     */
    List vector = new Vector();

    /**
     *
     * 故名思意就是链表，LinkedList还是一个双向链表。
     *
     */
    List linkedList = new LinkedList();


    /**
     *

     总结

     通过上面对ArrayList和LinkedList的分析，可以理解List的3个特性

     1.是按顺序查找
     2.允许存储项为空
     3.允许多个存储项的值相等

     可以知其然知其所以然
     然后对比LinkedList和ArrayList的实现方式不同，可以在不同的场景下使用不同的List

     ArrayList是由数组实现的，方便查找，返回数组下标对应的值即可，适用于多查找的场景

     LinkedList由链表实现，插入和删除方便，适用于多次数据替换的场景

     * @param args
     */
    public static void main(String[] args) {
        ListDemo listDemo = new ListDemo();
        listDemo.linkedList.add("1111");
        listDemo.linkedList.add("2222");
        listDemo.linkedList.add("3333");
        listDemo.linkedList.get(1);

    }


}