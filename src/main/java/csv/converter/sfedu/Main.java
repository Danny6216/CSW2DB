package csv.converter.sfedu;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String CustomerName = "Customer_1";
        String line = "";
        String cvsSplitBy = ",";

        try (BufferedReader reader = new BufferedReader(new FileReader("/home/dann/" + CustomerName +".csv"))) {

            while ((line = reader.readLine()) != null) {
                String[] customer = line.split(cvsSplitBy);
                Customer_1 cust = new Customer_1();
                cust.setName(customer[0]);
                cust.setTraffic(Integer.parseInt(customer[1]));
                cust.setDate(customer[2]);
                cust.setAdress(customer[3] + customer[4] + customer[5]);
                SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
                Session session = sessionFactory.openSession();
                session.beginTransaction();
                    ProviderEntity provider = new ProviderEntity();
                    provider.setAccountName(cust.getName());
                    provider.setTraffic(cust.getTraffic());
                    provider.setAdress(cust.getAdress());
                    provider.setCustomerName(CustomerName);
                session.save(provider);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
