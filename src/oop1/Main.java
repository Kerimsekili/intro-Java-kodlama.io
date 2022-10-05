package oop1;

public class Main {
    public static void main(String[] args) {
        String massege = "Vade Oranı";

        Product product1 = new Product();
        product1.setName("Delonghi Kahve Makinesi ");
        product1.setDiscount(7);
        product1.setUnitPrice(7500);
        product1.setUnitPrice(3);
        product1.setImageUrl("image1.jpg");

        Product product2 = new Product();
        product2.setName("Smeg Kahve Makinesi ");
        product2.setDiscount(7);
        product2.setUnitPrice(7500);
        product2.setUnitPrice(3);
        product2.setImageUrl("image1.jpg");

        Product product3 = new Product();
        product3.setName("Xiaomi Kahve Makinesi ");
        product3.setDiscount(7);
        product3.setUnitPrice(7500);
        product3.setUnitPrice(3);
        product3.setImageUrl("image1.jpg");

        Product[] products = {product1,product2,product3};

        System.out.println("<ul>");
        for (Product product :products) {
            System.out.println("<li>"+product.getName()+"</li>");
        }
        System.out.println("</ul>");

        IndividualCustomer individualCustomer = new IndividualCustomer();
        individualCustomer.setId(1);
        individualCustomer.setCustomerNumber("1558764568");
        individualCustomer.setPhoneNumber("+90 514 578 5412");
        individualCustomer.setFirstName("Kerim");
        individualCustomer.setLastName("Sekili");

        CorporateCustomer corporateCustomer = new CorporateCustomer();
        corporateCustomer.setId(2);
        corporateCustomer.setCompanyName("KSoftware.dev");
        corporateCustomer.setPhoneNumber("+90 542 135 9856");
        corporateCustomer.setTaxNumber("1542396552");
        corporateCustomer.setCustomerNumber("54321 ");

        Customer[] customers = {individualCustomer,corporateCustomer};
    }
}
