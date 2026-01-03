package java_study;

//１から10までの乱数を発生させ、もしも5以上だったら、
// その数だけ★マークを表示し、
// 5未満だったら、その数を表示するプログラムを作りなさい。
public class Practice_question4_13 {
    public static void main(String[] args) {
        int num = (int)(Math.random() * 10 + 1);
        for (int i = 1; i <= num && num >= 5; i++) {
            System.out.print("★ ");
        }
        for (int i = 1; i == num && num < 5; i++) {
            System.out.print(num);
        }
        System.out.println();
    }
}