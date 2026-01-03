package java_study;

//問3_18
//乱数で、－10から35までの乱数を発生させ、”摂氏○○度”（○○が、発生した乱数）と表示させ、その値により、以下のように表示しなさい。

// ・30度以上の場合は、”真夏日です。”と表示。
// ・25度以上、30度未満の場合”夏日です。”と表示。
// ・0度未満の場合、”真冬日です。”と表示。

public class Practice_queation3_18 {

    public static void main(String[] args) {
        int num = (int)(Math.random()*46 - 10);
        System.out.println("摂氏 " + num + "度。");
        if (num > 30) {
            System.out.println("真夏日です。");
        } else if (num > 25 && num <= 30) {
            System.out.println("夏日です。");
        } else if (num < 0) {
            System.out.println("真冬日です。");
        }
    }
}
