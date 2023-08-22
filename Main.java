import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Passport passport1 = new Passport(25, "Мирбек", "Male");
        Passport passport2=new Passport(21, "Анжелика", "Female");



        Bank bank = new Bank("Мирбек", 1234, 1000,5000);
        Bank bank1=new Bank("Анжелика", 2345, 1000,5000);

        Product product1 = new Product("milk","деревеское молоко",50,25,2023,"No");
        Product product2 = new Product("banana","Чисто африканские бананы ",300,25,2023,"No");
        Product product3 = new Product("rice","Узгенский рис",200,30,2023,"No");


        Product product4 = new Product("meat ","самое свежое мясо",500,10,2023,"No");
        Product product5 = new Product("bread","Свежое испеченный хлеб",25,50,2023,"No");
        Product product6 = new Product("wine","испанское с выдержка более 15лет  ",500,5,2017,"Yes");
        Product [] products1 = {product1,product2,product3};
        Product [] products2={ product4,product5,product6};

        Customer customer=new Customer("Мирбек", products1, bank, passport1);
        Customer customer1=new Customer("Анжелика", products2, bank1, passport2);

        System.out.println("add product wine ");
        System.out.println(Arrays.toString( customer1.addProduct(product6)));



        customer.getCustomerOfMyProducts("Анжелика");
        System.out.println("-----------------------------");

        System.out.println("Я удаляю rice , остается banana and milk ");
        customer.deleteProductByName("rice", "rice");
        System.out.println("------------------------------------------");






        System.out.println("Я удаляю bread , остается banana and meat and wine ");
        customer1.deleteProductByName("bread", "bread");
        System.out.println("--------------------------------------------");
        product1.checkPoint(products1);
        product1.checkPoint(products2);
        System.out.println("--------------------------------------");

        System.out.println(product1.checkPoint2(products1));
        System.out.println(product1.checkPoint2(products2));
        System.out.println("--------------------------------------");



        System.out.println(customer1.getAge2("Анжелика"));
        System.out.println("-------------------------------");
        System.out.println("Возраст моих клиентов, покупающих такие продукты, как рис , банан и молоко , составляет");
        System.out.println(customer1.getAge(products2));
        System.out.println("Возраст покупателей, покупающих такие продукты, как вино , мясо  и хлеб ,  составляет");

        System.out.println(customer.getAge(products1));

        System.out.println("------------------------------");
        System.out.println("оплата за продукты Мирбека ");
        System.out.println(bank.makePayment("Мирбек",1234,550));
        System.out.println("оплата за продукты Анжелики с кредитом  ");
        System.out.println(bank1.makePaymentWithCredit("Анжелика",2345,1050));









    }
}