package java_study;

public class Sample401 {
    public static void main(String[] args) {

        for(int i = 1;i <= 5;i++) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
}

//結果的に前置・後置は構文全体でみると同じ意味になる。
//主流に従って後置を使う。

//ただし、ループ変数を使った計算式の中で
//前置・後置を使う場合は意味が変わる場合もある。
//例えば、以下のような場合。
//int i = 1;
//System.out.println(i++); //1が出力される。
//System.out.println(++i); //2が出力される。
//基本的には後置を使うと認識しておけばよい。