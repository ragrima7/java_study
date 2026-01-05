package java_study;

public class Sample502 {
    
    public static void main(String[] args) {
        
        double[] d = new double[3];
        double sum,avg;
        d[0] = 1.2;
        d[1] = 3.7;
        d[2] = 4.1;
        sum = 0;
        for(int i = 0; i < d.length; i++) {
        System.out.println(d[i] + " ");
        sum += d[i];
        }
        System.out.println();
        avg = sum / 3.0;
        System.out.println("合計: " + sum);
        System.out.println("平均: " + avg);
    }
}


