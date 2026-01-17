package java_study;

//整数型の配列変数dataを作成し、以下の条件のとおりの初期値を入れるものとする。

//大きさは、10//
//値は、１から100の乱数
//このとき、実行例のように、値をすべて表示し、その中の偶数の数と、奇数の数を表示するようにしなさい。

//実行結果の例
//21 58 89 27 5 45 34 21 19 69

//奇数 : 21 89 27 5 45 21 19 69
//偶数 : 58 34

public class Practice_question5_3 {

    public static void main(String[] args) {
        int data[] = new int[10];
        int evenCount = 0;
        int oddCount = 0;

        // 配列に乱数を代入
        for(int i = 0; i < data.length; i++){
            data[i] = (int)(Math.random() * 100) + 1;
        }

        // 成分の表示と偶数・奇数のカウント
        System.out.println("配列の要素:");
        for(int i = 0; i < data.length; i++){
            System.out.print(data[i] + " ");
            if(data[i] % 2 == 0){
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println();

        // 偶数と奇数の数を表示
        System.out.println("偶数の数: " + evenCount);
        System.out.println("奇数の数: " + oddCount);
    }
}
