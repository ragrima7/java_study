package java_study;

//1から10までの乱数を発生させ、
// 偶数なら、★を、奇数なら☆を、
// それぞれ発生した数の文だけ表示するプログラムを作りなさい。

public class Practice_question4_14 {

    public static void main(String[] args) {
        int num = (int)(Math.random() * 10 + 1);
        System.out.println("乱数結果:" + num);
        for (int i = 1; i <= num && num % 2 == 0; i++) {
            System.out.print("★ ");
        }
        for (int i = 1; i <= num && num % 2 != 0; i++) {
            System.out.print("☆ ");
        }
        System.out.println();
    }
}
