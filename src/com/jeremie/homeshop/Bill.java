package com.jeremie.homeshop;
import java.util.Map;

    public class Bill {
        private Customer customer;
        private Map<Product, Integer> products;

        public Bill(Customer customer){ //constructeur
            this.customer = customer;
        }

        /**
         * Add a product with a quantity in the bill
         * @param product product to add
         * @param quantity quantity of the product
         */
        public void addProduct(Product product, Integer quantity) {
            this.products.put(product, quantity);
        }

        public Customer getCustomer() { //getter, permet de lire customer mais pas de le modif
            return customer;
        }

        public Map<Product, Integer> getProducts() { //getter
            return products;
        }
    }

