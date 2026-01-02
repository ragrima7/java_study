package java_study;

public class practice_question3_4 {

    public static void main(String[] args) {
        int num = (int)(Math.random()*100) + 1;
        System.out.println("num = " + num);
        if(num < 10 || num > 90) {
            System.out.println("10以下もしくは90以上の値です");
        }
    }
}

            
        