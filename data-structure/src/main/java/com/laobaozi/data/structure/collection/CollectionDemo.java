package com.laobaozi.data.structure.collection;

import java.util.*;

/**
 * Set:注重独一无二的性质,该体系集合可以知道某物是否已近存在于集合中,不会存储重复的元素
 *
 * @author jim
 * @date 2018/7/10
 */
public class CollectionDemo {

    /**
     *
     */
    Set hs = new HashSet();

    Set ts = new TreeSet();

    Set linkedHashSet = new LinkedHashSet();



    public static void main(String[] args) {
        //Set 集合存和取的顺序不一致。
        Set hs = new HashSet();
        hs.add("aaa");
        hs.add("兵器知识");
        hs.add("舰船知识");
        hs.add("汉和防务");
        System.out.println(hs);
        // [舰船知识, 世界军事, 兵器知识, 汉和防务]
        Iterator it = hs.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

}
