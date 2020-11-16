package apc.entjava.finals;

import javax.ejb.LocalBean;
import javax.ejb.Singleton;
import java.util.ArrayList;
import java.util.List;

    @LocalBean
    @Singleton
    public class Cart_Catalog implements Cart_CatalogLocal{

        private List<cart_data> cart = new ArrayList<>();

        public Cart_Catalog() {
        }

        public List<cart_data> getCart() {
            return this.cart;
        }

        public void addCart(cart_data cart) {
            this.cart.add(cart);
        }
    }
