
public class RandomStop {
    public static void main(String[] args) {
        while(true) {//無窮迴圈，直到亂數為5
            var number = (int) (Math.random() * 10);//亂數範圍0~9
            System.out.println(number);
            
            if(number == 5) {
                System.out.println("I hit 5....Orz");
                break;
            }
        }
    }
}
