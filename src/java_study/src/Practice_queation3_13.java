package java_study.src;

public class Practice_queation3_13 {
    
    public static void main(String[] args) {
        int num = (int)(Math.random()*3 + 1);
        System.out.println("num = " + num);
        if (num == 1) 
            System.out.println("グー");
        else if (num == 2) 
            System.out.println("チョキ");
        else if(num == 3) {
            System.out.println("パー");
        }
}
}
