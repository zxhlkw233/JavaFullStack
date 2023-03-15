package JavaEE.Collection.List;

import java.util.ArrayList;
import java.util.List;
/*
add(obj);添加一个对象
remove(index):将索引对应的元素删除
size()
clear()
addAll();加入一个集合
contains();是否包含某个对象
containsAll();是否包含某个集合
isEmpty();判断集合是否为空
indexOf();返回元素的第一个索引
lastIndexOf():返回元素最后出现的索引
*/
public class Main {
    public static void main(String[] args) {
        //关于list数组和嵌套数组的学习
        int[][] arrays ={{1,2,3},{2,3,4},{3,4,5}};
        List<Integer>[] adj = new List[5];
        for (int i = 0; i < 5; i++) {
            adj[i] = new ArrayList<>();
        }
        adj[0].add(1);
        adj[0].add(1);
        adj[0].add(1);
        System.out.println(adj[0]);

        /*
         * 一般都是list<List<>>,这样的list也能使用数组形式add吗
         *
         * */
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        List<Integer> list1 = new ArrayList<>();
        list.add(list1);

    }
}
