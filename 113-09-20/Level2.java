
public class Level2 {
    public static void main(String[] args) {
        int score = 88;
        int quotient = score / 10;
        char level = '\0';
        
        switch(quotient) { // 這裡使用商數來判斷等級，例如 88 / 10 = 8，所以等級是 B，利用 switch 來判斷
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
    }
}
