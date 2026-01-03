package java_study;

public class Practice_question4_11 {
//forループを用いて、１から100までの乱数を５回発生させ、
// 表示し、終了後その中の最大値を表示しなさい。
    public static void main(String[] args) {
            int max = 0;
        for (int i = 0; i < 5; i++) {
            int num = (int)(Math.random() * 100 + 1);
            System.out.println(num);
            max = Math.max(max, num);
        }
        System.out.println("最大値:" + max);
    }
}
