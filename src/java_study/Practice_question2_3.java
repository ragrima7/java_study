package java_study;
//代入演算子に書き換え 例）a = a + 2; → a += 2;

public class Practice_question2_3 {

    public static void main(String[] args) {
        int a = 1,b = 2,c = 3,d = 4,e = 5;
        a += 2;
        b -= 1;
        c *= 3;
        d /= 2;
        e %= 2;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);
    }
    
}
