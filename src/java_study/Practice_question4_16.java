package java_study;

//九九の数式表を表示しなさい。


public class Practice_question4_16 {
    
    public static void main(String[] args) {
        int i = 1;
        for (i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.print(i + "*" + j + "=" + (i * j) + " ");
            }
            System.out.println();
        }

}
}
