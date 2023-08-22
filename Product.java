import java.util.Arrays;
import java.util.Scanner;

public class Product {

    private String name;
    private String description;
    private int price;
    private int count;
    private int madeInDate;
    private String isAlcoholic;
    private Product[] products;



    public Product(String name, String description, int price, int count, int madeInDate, String isAlcoholic) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.count = count;
        this.madeInDate = madeInDate;
        this.isAlcoholic = isAlcoholic;
    }

    public int getMadeInDate() {
        return madeInDate;
    }


    public String getIsAlcoholic() {
        return isAlcoholic;
    }

    public String getName() {
        return name;
    }


    public Product() {

    }

    public void checkPoint(Product[] products) {


        Scanner scan = new Scanner(System.in);
        String num = "Yes";
        for (int i = 0; i < products.length; i++) {
            if (products[i].getIsAlcoholic().equals(num)) {
                System.out.println(products[i] + " " + "is alcoholic");
            } else {
                System.out.println(products[i] + " " + "No it is not");
            }
        }
    }

    public String checkPoint2(Product[] products) {

        for (int i = 0; i < products.length; i++) {
            if (products[i].getMadeInDate() > 2022) {
                System.out.println(products[i] + " " + "It is good");
            } else {
                System.out.println(products[i] + " " + "it is not good");
            }
        }
        return "All product under 2023 year it is not good";
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", count=" + count +
                ", madeInDate=" + madeInDate +
                ", isAlcoholic='" + isAlcoholic + '\'' +
                '}'+"\n ";
    }
}

