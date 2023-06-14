package AlgorithmBrushQuestion.NiuKe;

import java.util.Scanner;

public class 汽水瓶 {
    public  static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int n = in.nextInt();
            System.out.println(maxNumber(n));
        }
    }
    public static int maxNumber(int n){
        int count = 0;
        if(n == 0 || n == -1){
            count += 0;
        }
        if(n == 2){
            count += 1;
        }
        if(n >= 3){
            count += n / 3 + maxNumber(n / 3 + n % 3);
        }
        return count;
    }
}
