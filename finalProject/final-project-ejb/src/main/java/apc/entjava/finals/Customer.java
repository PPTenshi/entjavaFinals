package apc.entjava.finals;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import java.util.ArrayList;
import java.util.List;



@Stateless
@LocalBean
public class Customer implements CustomerLocal{

    private List<CustomerData> customer = new ArrayList<>();

    @Override
    public List<CustomerData> Customer() {
            return this.customer;
        }

    @Override
    public void addCustomer(CustomerData customer) {
        this.customer.add(customer);
    }
}
