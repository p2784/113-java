import java.util.Scanner;

public class Level2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // 建立 Scanner 物件，並指定輸入來源是標準輸入
        System.out.print("請輸入分數: ");
        char level = '\0';

            while(input.hasNext()) {// 當還有輸入時繼續執行
                int score = input.nextInt(); // 讀取使用者輸入的整數
                switch(score / 10) { // 這裡使用商數來判斷等級，例如 88 / 10 = 8，所以等級是 B，利用 switch 來判斷
                case 10: 
                case 9: 
                    level = 'A';
                    break; 
                case 8: 
                    level = 'B';
                    break; 
                case 7: 
                    level = 'C';
                    break; 
                case 6: 
                    level = 'D';
                    break; 
                default: 
                    level = 'F';
            }
            System.out.printf("得分等級%c%n", level);
            System.out.print("請輸入分數: ");
        }

    }
}
