package java_study;

//whileの無限ループを作り、その中で、
// １から１００までの乱数を発生させ、表示しなさい。
// その際、値が１０の倍数であれば、
// ループを抜け、”10の倍数が発生したので終了します”と表示して、
// プログラムを終了しなさい。

public class Practice_question4_10 {
    
    public static void main(String[] args) {
        int num = 1;
        while (num % 10 != 0) {
            num = (int) (Math.random() * 100) + 1;
            System.out.println(num);
            }
        System.out.println("10の倍数が発生したので、終了します");
    }
}
