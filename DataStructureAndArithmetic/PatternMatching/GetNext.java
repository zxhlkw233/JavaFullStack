package DataStructureAndArithmetic.PatternMatching;

public class GetNext {
    public static void main(String[] args) {
        int[] aabbaacs = getNext("aabbaac");
        for (int i = 0; i < aabbaacs.length; i++) {
            System.out.print(aabbaacs[i] + " ");
        }
    }
    private static int[] getNext(String sub){
        int[] next=new int[sub.length()+1];
        int i=0;
        int j=-1;
        next[0]=-1;
        while (i<sub.length()){
            if (j==-1 || sub.charAt(i) == sub.charAt(j)){
                next[++i]=++j;
            }else {
                j=next[j];
            }
        }
        return next;

    }
}
