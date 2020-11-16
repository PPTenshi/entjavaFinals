package apc.entjava.finals;

import javax.persistence.*;

@Entity
@Table(name="Item")
public class item_data {
    @Id
    @Column(name="item_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long item_id;

    @Column(name="item_name")
    private String item_name;

    @Column(name="item_price")
    private double item_price;

    @Column(name="item_rating")
    private double item_rating;

    public item_data(){

    }

    public item_data(long item_id, String item_name, double item_price, double item_rating){
        this.item_id = item_id;
        this.item_name = item_name;
        this.item_price = item_price;
        this.item_rating = item_rating;
    }

    public long getItem_id() {
        return item_id;
    }

    public void setItem_id(long item_id) {
        this.item_id = item_id;
    }

    public String getItem_name() {
        return item_name;
    }

    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    public double getItem_price() {
        return item_price;
    }

    public void setItem_price(double item_price) {
        this.item_price = item_price;
    }

    public double getItem_rating() {
        return item_rating;
    }

    public void setItem_rating(double item_rating) {
        this.item_rating = item_rating;
    }
}
