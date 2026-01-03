package java_study;

//403 while文の基本的な使い方を紹介します。
//ループ処理を行うのは、for文だけではありません。
// while（ホワイル）文を用いることによっても実現可能です。
// まずは、以下のサンプルを見てください。


public class Sample403 {
    public static void main(String[] args) {
        
        int i = 1;
        while(i <= 5) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
    }
}