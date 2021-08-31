package application;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        //Dados do cliente
        System.out.println("Enter client data:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.next();
        System.out.print("Birth date (DD/MM/YYYY): ");
        Date birthDate = sdf.parse(sc.next());

        Client client = new Client(name, email, birthDate);

        //Dados da ordem
        System.out.println("\nEnter order data:");
        System.out.print("Status: ");
        sc.nextLine();
        OrderStatus orderStatus = OrderStatus.valueOf(sc.nextLine());
        System.out.print("How many items to this order: ");
        int numberItems = sc.nextInt();

        //Cria a ordem
        Order order = new Order(new Date(), orderStatus, client);

        //Define os produtos e cria os items da ordem
        for (int i = 1; i <= numberItems; i++) {
            System.out.print("Enter #" + i + " item data:\n");

            System.out.print("Product name: ");
            sc.nextLine();
            String productName = sc.nextLine();

            System.out.print("Product price: ");
            Double productPrice = sc.nextDouble();

            System.out.print("Quantity: ");
            Integer quantity = sc.nextInt();

            //Cria o produto
            Product product = new Product(productName, productPrice);

            //Cria o item da ordem
            OrderItem orderItem = new OrderItem(quantity,product.getPrice(), product);

            //Adiciona o item na ordem
            order.addItem(orderItem);
        }

        System.out.println(order);

        sc.close();
    }
}
