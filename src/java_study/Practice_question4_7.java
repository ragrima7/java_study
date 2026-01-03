package java_study;

//for文を用いて、整数型変数 a を、
// 以下のように変更し、表示するプログラムを作りなさい。
//a = 3
//a = 2
//a = 1
//a = 0

public class Practice_question4_7 {
    
    public static void main(String[] args) {
        int a = 3;
        for (; a >= 0; a--) {
            System.out.println("a = " + a);
    }

    }
}

