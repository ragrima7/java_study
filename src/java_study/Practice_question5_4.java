package java_study;

// 整数型の配列変数dataを作成し、以下の条件のとおりの初期値を入れるものとする。

//大きさは、100
//は、１から10の乱数
//このとき、実行例のように、値をすべて表示し、その中の50以上の数と、50未満の数を表示するようにしなさい。

//実行結果の例
//41 99 82 73 54 45 43 1 39 16

//50以上の数 ： 99 82 73 5450未満の数 ： 41 45 43 1 16
//50未満の数 ： 41 45 43 1 16

public class Practice_question5_4 {
    public static void main(String[] args) {
        int data[] = new int[100];

        // 配列に乱数を代入
        for(int i = 0; i < data.length; i++){
            data[i] = (int)(Math.random() * 100) + 1;
        }

// 3. 50以上の数を抽出表示
        System.out.println("--- 50以上の数 ---");
        for(int i = 0; i < data.length; i++){
            if(data[i] >= 50){
                System.out.print(data[i] + " ");
            }
        }
        System.out.println("\n");

        // 4. 50未満の数を抽出表示
        System.out.println("--- 50未満の数 ---");
        for(int i = 0; i < data.length; i++){
            if(data[i] < 50){
                System.out.print(data[i] + " ");
            }
        }
        System.out.println();
    }
}