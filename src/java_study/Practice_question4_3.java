package java_study;

//問4_3
//同じ処理を、do～while文を用いたループで行いなさい。
//do-whileは、直感に反する『後出し』の構文であることを意識する。


public class Practice_question4_3 {
        public static void main(String[] args) {
        int num = (int)(Math.random()*10 + 1);
        System.out.println("数：" + num);
        int i = 1;
        do {
            System.out.print("■ ");
            i++;
        } while (i <= num);
        System.out.println();
        }
    }

