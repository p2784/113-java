import java.util.Scanner;

public class TimeTtest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 輸入時、分、秒
        System.out.print("請輸入小時 (0-23): ");
        int hour = scanner.nextInt();
        System.out.print("請輸入分鐘 (0-59): ");
        int minute = scanner.nextInt();
        System.out.print("請輸入秒 (0-59): ");
        int second = scanner.nextInt();

        // 建立 Time1 物件
        Time1 time = new Time1(hour, minute, second);

        // 呼叫 printUniversal()
        System.out.println("24小時制時間: " + time.printUniversal());

        // 呼叫 printStandard()
        System.out.println("12小時制時間: " + time.printStandard());

        // 使用者輸入時間過了幾秒，用迴圈呼叫 tick()
        System.out.print("請輸入要增加的秒數: ");
        int secondsToAdd = scanner.nextInt();
        for (int i = 0; i < secondsToAdd; i++) {
            time.tick();
        }

        // 呼叫 printUniversal()
        System.out.println("增加秒數後的24小時制時間: " + time.printUniversal());

        // 呼叫 printStandard()
        System.out.println("增加秒數後的12小時制時間: " + time.printStandard());

        scanner.close();
    }
}

/*Time1 time = new Time1(23, 59, 59);
        System.out.println(time.printUniversal());
        System.out.println(time.printStandard());
        time.tick();
        System.out.println(time.printUniversal());
        System.out.println(time.printStandard());*/