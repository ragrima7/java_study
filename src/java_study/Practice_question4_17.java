package java_study;

public class Practice_question4_17 {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("■ ");
            }
            for (int k = 1; k <= 10 - i; k++) {
                System.out.print("□ ");
            }
            System.out.println();
        }
    }
}