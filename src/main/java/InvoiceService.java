public class InvoiceService {
    public void payInvoice(MemberAccount account, Invoice invoice) throws InsufficientBalanceException {
        if (account.getBalance() >= invoice.getAmount()) {
            double newBalance = account.getBalance() - invoice.getAmount();
            account.setBalance(newBalance);
            System.out.println("Invoice paid successfully.");
        } else {
            throw new InsufficientBalanceException("Insufficient balance to pay the invoice.");
        }
    }

    // Other methods for querying and canceling invoices...
}
