package edu.shu.hung;

public class CashCard {
    private String number;
    private int balance;
    private int bonus;
    private final int BOUNSCASH = 10;//final 代表常數，不可更改
    //private string number = "A000";

    public CashCard() {
        setNumber("unknown");
    }

    public CashCard(String number) {
        setNumber(number);
    }

    public CashCard(String number, int balance) {
        setNumber(number);
        setBalance(balance);
    }

    public CashCard(String number, int balance, int bonus) {
        this.number = number;
        this.balance = balance;
        this.bonus = bonus;
    }

    public String getNumber() {
        return this.number;
    }

    public int getBalance() {
        return this.balance;
    }

    public int getBonus() {
        return this.bonus;
    }

    void setNumber(String number) {
        this.number = number;
    }

    public void setBalance(int balance) {
        if(balance >= 0) {
            this.balance = balance;
        }
        else {
            System.out.println("格式不符，保持原值");
        }
    }

    public void setBonus(int bonus) {
        if(balance >= 0) {
            this.balance = bonus;
        }
        else {
            System.out.println("格式不符，保持原值");
        }
    }

    //儲值
    public void store(int money) {
        topUp(money);
    }

    public void store(String number, int money) {
        if (this.number.equals(number)) {
            topUp(money);
            }
            else {
                System.out.println("卡號不符");
            }
        }

    private void topUp (int money){
        if(money > 0) {
            this.balance += money;
            if(money >= 1000) {
                this.bonus+= money/1000;
            }
        }
        else {
            System.out.println("儲值金額不能為負的");
        }
    }

    //扣款
    public void charge(String number,int money) {
        if(this.number.equals(number)) {
            deduction(money);
        }
        else {
            System.out.println("卡號不符");
        }
    }

    public void charge(String number, int money, int bonus) {
        if(this.number.equals(number)) {
            exchange(bonus);
            deduction(money);
        }
        else {
            System.out.println("卡號不符");
        }
    }

    private void deduction(int money) {
        if(money > 0) {
            if(money <= this.balance) {
                this.balance -= money;
            }
            else {
                System.out.println("餘額不足，去工作");
            }
        }
        else {
            System.out.println("扣除金額不能為負數");
        }
    }

    public int exchange(int bonus) {
        if(bonus > 0 && this.bonus >= bonus) {
            this.bonus -= bonus;
            setBalance(this.balance + bonus * BOUNSCASH);
        }
        else {
            System.out.println("兌換點數不足");
        }
        return this.bonus;
    }
}
