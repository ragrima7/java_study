package java_study;

//整数型の配列変数dataを作成し、以下の条件のとおりの初期値を入れるものとする。

//大きさは、10
//値は、１から10の乱数
//このとき、実行例のように、値をすべて表示し、その中の3の倍数と、3の倍数以外の数を表示するようにしなさい。

//実行結果の例
//1 9 8 7 5 5 4 1 9 6

//3の倍数 ： 9 9 6
//3の倍数以外の数 ： 1 8 7 5 5 4 1


public class Practice_question5_5 {
    public static void main(String[] args) {
        int data[] = new int[10];

        // 配列に乱数を代入
        for(int i = 0; i < data.length; i++){
            data[i] = (int)(Math.random() * 10) + 1;
        }

        // 配列の要素を表示
        System.out.println("配列の要素:");
        for(int i = 0; i < data.length; i++){
            System.out.print(data[i] + " ");
        }
        System.out.println("\n");

// 3. 3の倍数を抽出表示
        System.out.println("--- 3の倍数 ---");
        for(int i = 0; i < data.length; i++){
            if(data[i] % 3 == 0){
                System.out.print(data[i] + " ");
            }
        }
        System.out.println("\n");

// 4. 3の倍数以外を抽出表示
        System.out.println("--- 3の倍数以外 ---");
        for(int i = 0; i < data.length; i++){
            if(data[i] % 3 != 0){
                System.out.print(data[i] + " ");
            }
        }
        System.out.println();
    }
}
