package java_study;

public class Practice_question3_11 {
    
    public static void main(String[] args) {
        int num = (int)(Math.random()*100) + 1;
        System.out.println("num = " + num);
        if(num < 10 || num > 90) {
            System.out.println("10以下または90以上です");
        } else {
            System.out.println("10を超え90未満です");
        }
    }
}
