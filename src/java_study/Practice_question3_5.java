package java_study;

public class Practice_question3_5 {
    
    public static void main(String[] args) {
        int num = (int)(Math.random()*100) + 1;
        System.out.println("num = " + num);
        if(num > 20 && num <= 80) {
            System.out.println("20以上80未満の値です");
        }
    }
}
