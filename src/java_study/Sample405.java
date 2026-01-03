package java_study;

//405 do-while文の基本的な使い方を紹介します。
// while文と似ていますが、少し違う点があります。
// do-while文は、必ず一度はループ内の処理が実行される点です。
// 以下のサンプルを見てください。
// numの値が1の場合、whileループでは一度もループ内の処理が
// 実行されません。
// しかし、do-whileループでは一度はループ内の処理が実行されます。
// この違いを理解してください。
// また、do-while文の最後にはセミコロンが必要です。
// これも注意してください。
// do-while文は、ループ内の処理を少なくとも一度は実行したい場合に
// 使います。
// 例えば、ユーザーからの入力を少なくとも一度は受け取りたい場合などに
// 便利です。

public class Sample405 {

    public static void main(String[] args) {
        int i,num;
        num = 1;
        //  whileループで実行
        System.out.print("whileで実行:");
        i = 1;
        while(i < num){
            System.out.print("*");
            i++;
        }
        System.out.println();
        //  do～whileループで実行
        System.out.print("do～whileで実行:");
        i = 1;
        do{
            System.out.print("*");
            i++;
        }while(i < num);
        System.out.println();
    }
}