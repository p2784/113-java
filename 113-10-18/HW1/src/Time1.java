public class Time1 {
    private int hour;   // 時
    private int minute; // 分
    private int second; // 秒

    //方法:建構子(設定時 分 秒的初始值，需檢查資料是否格式正確)
    public Time1(int hour, int minute, int second) {
        if (hour < 0 || hour >= 24) {
            throw new IllegalArgumentException("Hour must be 0-23");
        }
        if (minute < 0 || minute >= 60) {
            throw new IllegalArgumentException("Minute must be 0-59");
        }
        if (second < 0 || second >= 60) {
            throw new IllegalArgumentException("Second must be 0-59");
        }
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // get/set 方法
    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour < 0 || hour >= 24) {
            throw new IllegalArgumentException("Hour must be 0-23");
        }
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if (minute < 0 || minute >= 60) {
            throw new IllegalArgumentException("Minute must be 0-59");
        }
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if (second < 0 || second >= 60) {
            throw new IllegalArgumentException("Second must be 0-59");
        }
        this.second = second;
    }

    // tick 方法 (時間增加一秒)
    public void tick() {
        if (++second == 60) {
            second = 0;
            if (++minute == 60) {
                minute = 0;
                if (++hour == 24) {
                    hour = 0;
                }
            }
        }
    }

    // printUniversal 方法 (以24小時制輸出完整的時間 14:05:32)
    public String printUniversal() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    // printStandard 方法 (以12小時制輸出完整的時間 2:05:32 PM)
    public String printStandard() {
        return String.format("%d:%02d:%02d %s",
                ((hour == 0 || hour == 12) ? 12 : hour % 12),
                minute, second, (hour < 12 ? "AM" : "PM"));
    }
}