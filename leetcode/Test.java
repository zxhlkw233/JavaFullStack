package leetcode;

import java.util.UUID;

public class Test {
    public static void main(String[] args) {
        String id = UUID.randomUUID().toString().replaceAll("-", "");
        System.out.println(UUID.randomUUID().toString());
        System.out.println(id);
    }
}
