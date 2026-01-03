package java_study;

public class Practice_question3_14 {
    public static void main(String[] args) {

        int num = (int)(Math.random()*10 + 1);
        System.out.println("num = " + num);
        int a = num;
        int b = num;
        if (a > b) {
            System.out.println("aはbより大きい");
        } else if (a < b) {
            System.out.println("aはbより小さい");
        } else if(a == b) {
            System.out.println("aとbは等しい");}
        }
    }