package java_study;

//forループを用いて、１から100までの乱数を５回発生させ、表示させなさい.

public class Practice_question4_10 {
    
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            int num = (int) (Math.random() * 100) + 1;
            System.out.println(num);
            }
}
}