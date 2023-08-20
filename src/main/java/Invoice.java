import java.time.LocalDate;

public class Invoice {
    private double amount;
    private LocalDate processDate;
    private BillType billType;

    public Invoice(double amount, LocalDate processDate, BillType billType) {
        this.amount = amount;
        this.processDate = processDate;
        this.billType = billType;
    }

    public double getAmount() {
        return amount;
    }

    public LocalDate getProcessDate() {
        return processDate;
    }

    public BillType getBillType() {
        return billType;
    }
}
