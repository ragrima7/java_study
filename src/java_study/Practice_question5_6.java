package java_study;

//整数型の配列変数dataを作成し、以下の条件のとおりの初期値を入れるものとする。

//大きさは、10
//値は、１から10の乱数
//このとき、実行例のように、値をすべて表示し、その中の最大値と最小値と平均値を表示するようにしなさい。

//実行結果の例
//10 6 2 4 3 5 9 9 1 3

//最大値 ： 10
//最小値 ： 1
//平均値 ： 5

public class Practice_question5_6 {

    public static void main(String[] args) {
        int data[] = new int[10];
        int max = Integer.MIN_VALUE; // 初期値を最小の整数に設定
        int min = Integer.MAX_VALUE; // 初期値を最大の整数に設定
        int sum = 0;

        // 配列に乱数を代入
        for(int i = 0; i < data.length; i++){
            data[i] = (int)(Math.random() * 10) + 1;
        }

        // 配列の要素を表示し、最大値、最小値、合計を計算
        System.out.println("配列の要素:");
        for(int i = 0; i < data.length; i++){
            System.out.print(data[i] + " ");
            if(data[i] > max){
                max = data[i];
            }
            if(data[i] < min){
                min = data[i];
            }
            sum += data[i];
        }
        System.out.println("\n");

        // 平均値を計算
        double average = (double)sum / data.length;

        // 最大値、最小値、平均値を表示
        System.out.println("最大値 ： " + max);
        System.out.println("最小値 ： " + min);
        System.out.printf("平均値 ： %.2f\n", average);
    }
    
}
