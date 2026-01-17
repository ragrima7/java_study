package java_study;
//FinancialCalculation　割れないお金の処理例
public class Extra101 {
    public static void main(String[] args) {
        long totalAmount = 100; // 合計100円
        int numberOfPeople = 3; // 3人で分ける

        // 1. 一人あたりの基本額（切り捨て）
        long amountPerPerson = totalAmount / numberOfPeople; 

        // 2. あまり（端数）を計算
        long remainder = totalAmount % numberOfPeople;

        System.out.println("--- 分配結果 ---");
        for (int i = 1; i <= numberOfPeople; i++) {
            long finalAmount = amountPerPerson;

            // 3. 最後の人（または最初の人）に端数を加算して調整
            if (i == numberOfPeople) {
                finalAmount += remainder;
            }

            System.out.println(i + "人目: " + finalAmount + "円");
        }
        
        // 検証：合計が元の金額と一致するか
        // (amountPerPerson * 2) + (amountPerPerson + remainder) = 33+33+34 = 100
    }

    
}
