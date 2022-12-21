package JavaEE.Collection.List;

import java.util.LinkedList;

public class List_removeLast {
    public static void main(String[] args) {
        LinkedList<Character> stack = new LinkedList<Character>(){{add('?');}};
        Character character = stack.removeLast();
        System.out.println(stack.removeLast());
        System.out.println(stack);
    }
}
