package java_study;

public class Sample304 {
    
    public static void main(String[] args) {
        int daice = (int)(Math.random()*7) + 1;
        System.out.println("サイコロの目は" + daice);
        if(1 <= daice && daice <= 6) {
            if(daice ==2 || daice ==4 || daice ==6) {
                System.out.println("丁（チョウ）です。");
            } else {
                System.out.println("半（ハン）です。");
            }
        } else {
            System.out.println("この数字はサイコロの目の範囲外です。");
        }
    }
}
