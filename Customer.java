import java.util.Arrays;

public class Customer {
    private String name;
    private Product[] product;
    private Bank bank;
    private Passport passport;

    public Customer(String name, Product[] product, Bank bank, Passport passport) {
        this.name = name;
        this.product = product;
        this.bank = bank;
        this.passport = passport;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Product[] getCustomerOfMyProducts(String name) {
        for (int i = 0; i < product.length; i++) {
            if (product[i].getName().equals(name)) {
                System.out.println(product[i].getName());
                return product;
            }
        }
        return null;
    }


    public Product[] deleteProductByName(String name, String productName) {
        int indexToRemove = -1;
        for (int i = 0; i < product.length; i++) {

            if (product[i].getName().equals(productName) && product[i].getName().equals(name)) {
                indexToRemove = i;
                break;
            }
        }
        if (indexToRemove != -1) {
            Product[] arr = new Product[product.length - 1];
            int j = 0;
            for (int i = 0; i < product.length; i++) {
                if (i != indexToRemove) {
                    arr[j] = product[i];
                    j++;
                    System.out.println(product[i]);
                }
            }
            product = arr;
            product = Arrays.copyOf(arr, arr.length - 1);
        }
        return product;
    }

    public  Product[] addProduct(Product productName) {
        for (Product pp : product) {
            if (!pp.equals(productName) ) {
                Product[] ppp = new Product[product.length + 1];
                for (int i = 0; i < product.length; i++) {
                    ppp[i] = product[i];


                }
                ppp[product.length] = productName;
                product = Arrays.copyOf(ppp, ppp.length);


                return product;

            }
        }

        return null;


    }
    public Passport getAge2(String name) {
        for (int i = 0; i < product.length; i++) {
            if (product[i].getName().equals(name)) {
                return passport;
            }
        }
        return passport;
    }

    public int getAge(Product [] product) {
        for (int i = 0; i < product.length; i++) {
            if (product[i].getName().equals(name)) {

            }
        }
        return passport.getDateOfBirth();}


    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", product=" + Arrays.toString(product) +
                ", bank=" + bank +
                ", passport=" + passport +
                '}';
    }


}