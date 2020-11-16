package apc.entjava.finals;

public class CustomerData {
    private String cust_name;
    private String cust_email;
    private int cust_ID;


    public CustomerData(String cust_name, String cust_email, int cust_ID){
        super();
        this.cust_name = cust_name;
        this.cust_email = cust_email;
        this.cust_ID = cust_ID;
    }

    public CustomerData() {

    }

    public String getCust_name() {
        return cust_name;
    }

    public void setCust_name(String cust_name) {
        this.cust_name = cust_name;
    }

    public String getCust_email() {
        return cust_email;
    }

    public void setCust_email(String cust_email) {
        this.cust_email = cust_email;
    }

    public int getCust_ID() {
        return cust_ID;
    }

    public void setCust_ID(int cust_ID) {
        this.cust_ID = cust_ID;
    }
}
