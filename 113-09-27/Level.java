
import java.util.Scanner;

public class Level {
    public static void main(String[] args) {
        int score ;
        char level = '\0'; // '\0' 是 null 字元

        Scanner input = new Scanner(System.in); // 建立 Scanner 物件，並指定輸入來源是標準輸入
        System.out.print("請輸入分數: ");
        score = input.nextInt(); // 讀取使用者輸入的整數
        
        if(score >= 90) {
            level = 'A';
        } 
        else if(score >= 80 ) {
            level = 'B';
        }
        else if(score >= 70 ) {
            level = 'C';
        }
        else if(score >= 60 ) {
            level = 'D';
        }        
        else {
            level = 'F';
        }
        System.out.printf("得分等級: %c%n", level);
    }
}

