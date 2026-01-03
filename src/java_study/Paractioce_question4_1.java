package java_study;

//問4_1
//１から10までの乱数を発生させ、その数を表示した後、
// forループを用いて、その数だけ■マークを表示するプログラムを
// 作りなさい。

public class Paractioce_question4_1 {

    public static void main(String[] args) {
        int num = (int)(Math.random()*10 + 1);
        System.out.println("数：" + num);
        for (int i = 1; i <= num; i++) {
            System.out.print("■ ");
        }
        System.out.println();
    }

}

//for文の条件にランダムに出力された数値に到達するまで
//1つずつ足すのを繰り返すように設定し、
//繰り返すたびに■マークを表示する。