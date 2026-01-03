package java_study;

// forの二重ループ、もしくは、forのネスト処理を紹介します。こ
// の処理は、forループの中に更にforループを記述する二重の処理で、
// これもよく用いられるテクニックです。

public class Sample402 {
    
    public static void main(String[] args) {

        for(int i = 1;i <= 2;i++) {
            for(int j = 1;j <= 3;j++) {
                int k = i + j;
                System.out.print(i + "+" + j + "=" + k + " ");
            }
            System.out.println();
        }
    }
}

