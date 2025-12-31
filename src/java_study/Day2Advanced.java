package java_study;

public class Day2Advanced {
    public static void main(String[] args) {
        // PHPとJavaの大きな違い：型による計算精度の制御
        int a = 10;
        int b = 3;

        // 1. 整数同士の割り算（小数点以下が切り捨てられる）
        System.out.println("int / int = " + (a / b));

        // 2. キャストを使って小数計算にする
        System.out.println("doubleキャスト = " + ((double) a / b));

        // 3. 【重要】doubleの限界（誤差）を見てみる
        // 0.1 を 10回足しても、正確に 1.0 にならないことがあります
        double sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += 0.1;
        }
        System.out.println("0.1を10回足した結果: " + sum);
    }
}