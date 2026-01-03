package java_study;

//forループを用いて、１から１００までの乱数を５回発生させ、
// 表示し、終了後その中の最小値を表示しなさい。

public class Practice_question4_12 {
    
    public static void main(String[] args) {
        int min = 0;
        for (int i = 0; i < 5; i++) {
            int num = (int)(Math.random() * 100 + 1);
            System.out.println(num);
            min = Math.min(min, num);
        }
        System.out.println("最小値:" + min);
    }
}
