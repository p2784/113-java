import com.sun.nio.sctp.AbstractNotificationHandler;

import java.util.ArrayList;

public class SalesPerson {
    private String id;
    private String name;
    private double grossSales;
    private double commissionRate;

    private Order[] orderArray = new Order[3];
    private int orderCount = 0;

    public SalesPerson(String id, String name) {
        this.id = id;
        this.name = name;
        this.commissionRate = 0.01;
    }

    public SalesPerson(String id, String name, double commissionRate) {
        this.id = id;
        this.name = name;
        this.commissionRate = commissionRate;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    public void setOrderArray(String itemName, double itemPrice, int amount) {
        if (orderCount >= orderArray.length) {
            Order[] newOrderArray = new Order[orderArray.length * 2];
            System.arraycopy(orderArray, 0, newOrderArray, 0, orderArray.length);
            orderArray = newOrderArray;
        }
        orderArray[orderCount++] = new Order(itemName, itemPrice, amount);
    }

    public double getGrossSales() {
        double total = 0;
        for (Order order : orderArray) {
            if (order != null) {
                total += order.totalSale();
            }
        }
        return total;
    }

    public String getOrders() {
    String orders = "";
    for (Order order : orderArray) {
        if (order != null) {
            orders += order.toString();
        }
    }
    return orders;
}

    public double salary() {
        return getGrossSales() * commissionRate;
    }

    public String toString() {
        return String.format("業務員編號：%s%n業務員姓名：%s%n銷售金額：%.1f%n獎金比例：%.2f%n薪資：%.1f%n",
                this.id, this.name, this.grossSales, this.commissionRate, salary() );
    }
}
