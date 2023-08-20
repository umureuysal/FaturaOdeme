public class MemberAccount {
    private String id;
    private String name;
    private String code;
    private double balance;

    public MemberAccount(String id, String name, String code, double balance) {
        this.id = id;
        this.name = name;
        this.code = code;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
