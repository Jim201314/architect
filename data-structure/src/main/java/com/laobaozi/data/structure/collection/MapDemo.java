package com.laobaozi.data.structure.collection;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 *
 * @author jim
 * @date 2018/7/11
 */
public class MapDemo {

    /**
     * 最常用的Map,它根据键的HashCode 值存储数据,根据键可以直接获取它的值，具有很快的访问速度。
     * HashMap最多只允许一条记录的键为Null(多条会覆盖);允许多条记录的值为 Null。非同步的
     */
    Map hashMap = new HashMap<>();

    /**
     * 与 HashMap类似,不同的是:key和value的值均不允许为null;它支持线程的同步，
     * 即任一时刻只有一个线程能写Hashtable,因此也导致了Hashtale在写入时会比较慢。
     */
    Map hashTable = new Hashtable();

    /**
     * 能够把它保存的记录根据键(key)排序,默认是按升序排序，也可以指定排序的比较器，
     * 当用Iterator 遍历TreeMap时，得到的记录是排过序的。TreeMap不允许key的值为null。非同步的
     */
    Map treeMap = new TreeMap();

    /**
     * 保存了记录的插入顺序，在用Iterator遍历LinkedHashMap时，先得到的记录肯定是先插入的.在遍历的时候会比HashMap慢。
     * key和value均允许为空，非同步的。
     */
    Map linkedHashMap = new LinkedHashMap();

    /**
     * 锁分段技术
     * ConcurrentHashMap是由Segment数组结构和HashEntry数组结构组成。Segment是一种可重入锁ReentrantLock，
     * 在ConcurrentHashMap里扮演锁的角色，HashEntry则用于存储键值对数据。一个ConcurrentHashMap里包含一个Segment数组，
     * Segment的结构和HashMap类似，是一种数组和链表结构， 一个Segment里包含一个HashEntry数组，
     * 每个HashEntry是一个链表结构的元素， 每个Segment守护者一个HashEntry数组里的元素,当对HashEntry数组的数据进行修改时，
     * 必须首先获得它对应的Segment锁。
     */
    Map concurrentHashMap = new ConcurrentHashMap();


    public static void main(String[] args) {
        MapDemo mapDemo = new MapDemo();
        mapDemo.hashMap.put("test", "1111");
        mapDemo.hashMap.put("test2", "2222");

        String str = (String) mapDemo.hashMap.get("test");
    }
}
