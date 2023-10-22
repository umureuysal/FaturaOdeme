import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        MemberAccount memberAccount = new MemberAccount("123", "John Doe", "JD", 1000);
        Invoice invoice = new Invoice(150, LocalDate.now(), BillType.TELEPHONE);

        Client client = new Client();
        client.payInvoice(memberAccount, invoice);
    }
}
