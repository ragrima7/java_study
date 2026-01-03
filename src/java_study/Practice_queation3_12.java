package java_study;

public class Practice_queation3_12 {
    
    public static void main(String[] args) {
        int num = (int)(Math.random()*20) -10;
        System.out.println("num = " + num);
        if(num < 0) {
            System.out.println("負の数です");
        } else if(num > 0) {
            System.out.println("正の数です");
        } else {
            System.out.println("ゼロです");
        }
    }
}