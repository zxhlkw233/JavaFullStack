package JavaEE.Collection.Queue;


import java.util.LinkedList;
import java.util.Queue;

public class LinkedListToQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        //插入
        queue.offer(0);
        queue.offer(0);
        queue.offer(0);
        System.out.println(queue);//[0, 0, 0]
        //查看此队列顶部的对象，而不从队列中删除它。
        System.out.println(queue.peek());//0
        //检索并删除此队列的头，如果此队列为空，则返回 null 。
        queue.poll();
        System.out.println(queue);//[0, 0]
/*
add()、element()、remove()方法与offer()、peek()、poll()目的相同，但是仍有区别。
offer()，add() 区别：
一些队列有大小限制，因此如果想在一个满的队列中加入一个新项，多出的项就会被拒绝。
这时新的 offer 方法就可以起作用了。它不是对调用 add() 方法抛出一个 unchecked 异常，而只是得到由 offer() 返回的 false。

poll()，remove() 区别：
remove() 和 poll() 方法都是从队列中删除第一个元素。remove() 的行为与 Collection 接口的版本相似，
但是新的 poll() 方法在用空集合调用时不是抛出异常，只是返回 null。因此新的方法更适合容易出现异常条件的情况。

peek()，element()区别：
element() 和 peek() 用于在队列的头部查询元素。与 remove() 方法类似，在队列为空时， element() 抛出一个异常，而 peek() 返回 null。
* */
    }
}
