package apc.entjava.finals;

import javax.ejb.Local;
import java.util.List;

@Local
public interface CustomerLocal {

    public List<CustomerData> getCustomer = null;

    List<CustomerData> Customer();

    public void addCustomer(CustomerData customer);
}
