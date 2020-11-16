package apc.entjava.finals;

import javax.ejb.Local;
import java.util.List;

@Local
public interface item_local {
    List<item_data> getItems();

    void addItems(item_data items);
}
