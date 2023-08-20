public class Client {
    public void payInvoice(MemberAccount account, Invoice invoice) {
        InvoiceService invoiceService = new InvoiceService();
        try {
            invoiceService.payInvoice(account, invoice);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }

    // Overloaded payment methods based on bill type...
    public void payInvoice(MemberAccount account, Invoice invoice, BillType billType) {
        // Implementation for different bill types...
    }
}
