package java_study;

//4_1と同じ処理を、while文で作ったループで行いなさいと

public class Practice_question4_2 {

    public static void main(String[] args) {
        int num = (int)(Math.random()*10 + 1);
        System.out.println("数：" + num);
        int i = 1;
        while (i <= num) {
            System.out.print("■ ");
            i++;
        }
        System.out.println();
    }

}

