
public class Shift {
    public static void main(String[] args) {
        int number = 1; 
        System.out.printf( "2 的 0 次方: %d%n", number); 
        System.out.printf( "2 的 1 次方: %d%n", number << 1); // 2 的 1 次方，<< 1 代表左移一位，相當於乘以 2
        System.out.printf( "2 的 2 次方: %d%n", number << 2); // 2 的 2 次方，<< 2 代表左移兩位，相當於乘以 4
        System.out.printf( "2 的 3 次方: %d%n", number << 3); // 2 的 3 次方，<< 3 代表左移三位，相當於乘以 8
    }
}
//2 -> 00000010
//4 -> 00000100 左移一位
//8 -> 00001000 左移兩位
//16 -> 00010000 左移三位
