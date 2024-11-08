public class SalesPerson {
    private String id;
    private String name;
    private double grossSales;
    private double commissionRate;

    public SalesPerson() {
        this("N/A", "N/A", 0, 0.01);
    }

    public SalesPerson(String id, String name) {
        this(id, name, 0, 0.01);
    }

    public SalesPerson(String id, String name, double grossSales, double commissionRate) {
        this.id = id;
        this.name = name;
        setGrossSales(grossSales);
        setCommissionRate(commissionRate);
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setGrossSales(double grossSales) {
        if (grossSales < 0) {
            System.out.println("Gross sales must be positive.");
            return;
        }
        this.grossSales = grossSales;
    }

    public void setCommissionRate(double commissionRate) {
        if (commissionRate < 0 || commissionRate > 1) {
            System.out.println("Commission rate must be between 0 and 1.");
            return;
        }
        this.commissionRate = commissionRate;
    }

    public double salary() {
        return grossSales * commissionRate;
    }

    public String toString() {
        return String.format("業務員編號：%s%n業務員姓名：%s%n銷售金額：%.1f%n獎金比例：%.2f%n薪資：%.1f%n",
                this.id, this.name, this.grossSales, this.commissionRate, salary());
    }
}