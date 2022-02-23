package CS390Assignment2.Problem1;

public class Main {

    public static void main(String[] args) {

        Address shipC1 = new Address();
        Address billC1 = new Address();
        //setting the shipping address using setter
        shipC1.setStreet("1234 100th st");
        shipC1.setCity("Seatte");
        shipC1.setState("WA");
        shipC1.setZipCode(98188);
        //setting the billing address using setter
        billC1.setStreet("1234 100th st");
        billC1.setCity("Seatte");
        billC1.setState("WA");
        billC1.setZipCode(98188);

        Address shipC2 = new Address();
        Address billC2 = new Address();
        //setting the shipping address using setter
        shipC2.setStreet("6958 200th st");
        shipC2.setCity("SeaTac");
        shipC2.setState("WA");
        shipC2.setZipCode(98188);
        //setting the billing address using setter
        billC2.setStreet("6958 200th st");
        billC2.setCity("SeaTac");
        billC2.setState("WA");
        billC2.setZipCode(98188);
        Address shipC3 = new Address();
        Address billC3 = new Address();
        //setting the shipping address using setter
        shipC3.setStreet("2525 123th st");
        shipC3.setCity("Chicago");
        shipC3.setState("Ch");
        shipC3.setZipCode(58188);
        //setting the billing address using setter
        billC3.setStreet("2525 123th st");
        billC3.setCity("Chicago");
        billC3.setState("CH");
        billC3.setZipCode(58188);

        Customer c1 = new Customer("Robeil","Aregawi","333-444-5555",shipC1,billC1);
        Customer c2 = new Customer("Meron","Tekle","111-222-7777",shipC2,billC2);
        Customer c3 = new Customer("Awet","Kebede","888-000-9999",shipC3,billC3);

       Customer[] customers = {c1,c2,c3};

        for(int i = 0; i < customers.length; i++){
            if(customers[i].getBillingAddress().getCity().equals("Chicago")){
               System.out.println(customers[i].toString());
            }
        }



    }
}
