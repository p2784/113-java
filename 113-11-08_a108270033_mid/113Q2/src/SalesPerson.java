public class SalesPerson {
    private String id;
    private String name;
    private double grossSales;
    private double commissionRate;

    public SalesPerson(String id, String name) {
        this.id = id;
        this.name = name;
        this.grossSales = 0.0;
        this.commissionRate = 0.0;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    public double salary() {
        return grossSales * commissionRate;
    }

    public String toString() {
        return String.format("業務員編號：%s%n業務員姓名：%s%n銷售金額：%.1f%n獎金比例：%.1f%n薪資：%.1f%n",
                this.id, this.name, this.grossSales, this.commissionRate, salary());
    }
}