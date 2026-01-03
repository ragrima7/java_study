package java_study;

//whileの無限ループを作り、その中で、１から１０までの乱数を発生させて、表示しなさい。その際、値が１０になったら、ループを抜け、
// ”終了します”と表示してプログラムを終えるようにしなさい。

public class Practice_question4_8 {

    public static void main(String[] args) {

        int num = 0;
        while (num != 10) {
            num = (int) (Math.random() * 10) + 1;
            System.out.println(num);
            }
        System.out.println("終了します");
    }
}
