package java_study;
//整数型の配列変数、aを、以下の条件で作り、その結果を、実行結果にならい、表示しなさい。

//配列の大きさは、7
//値は、1から10までの乱数を発生させて値を代入する。
//実行結果の例（aの値は、乱数なので、毎回異なる）
//a[0]=9 a[1]=5 a[2]=8 a[3]=4 a[4]=7 a[5]=10 a[6]=6

public class Practice_question5_1 {
    public static void main(String[] args) {
        int a[] = new int[7];
        //  配列に乱数を代入
        for(int i = 0; i < a.length; i++){
            a[i] = (int)(Math.random() * 10) + 1;
        }
        //  成分の表示
        for(int i = 0; i < a.length; i++){
            System.out.print("a[" + i + "]=" + a[i] + " ");
        }
        System.out.println();
    }
    
}
