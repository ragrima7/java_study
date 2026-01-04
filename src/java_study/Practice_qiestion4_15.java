package java_study;

public class Practice_qiestion4_15 {

//ループを用いて、１から100までの数字を表示しなさい。
// ただし、このとき、数は10ごとに改行すること。
    public static void main(String[] args) {
        int i = 1;
        while (i <= 100) {
            System.out.print(i + " ");
            if (i % 10 == 0) {
                System.out.println();
            }
            i++;
        }
    }
}
