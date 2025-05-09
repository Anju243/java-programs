import java.util.*;


interface Billable {
    double calculate(); // returns total price for the product
}


class Product implements Billable {
    int productId;
    String name;
    int quantity;
    double unitPrice;

    Product(int productId, String name, int quantity, double unitPrice) {
        this.productId = productId;
        this.name = name;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

  
    public double calculate() {
        return quantity * unitPrice;
    }

  
    void display() {
        System.out.printf("%-10d %-10s %-10d %-12.2f %-10.2f\n", productId, name, quantity, unitPrice, calculate());
    }
}


public class BillGeneration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Product[] products = {
            new Product(101, "A", 2, 25),
            new Product(102, "B", 1, 100)
        };

        System.out.print("Enter Order No: ");
        String orderNo = sc.nextLine();
        System.out.print("Enter Date (dd/mm/yyyy): ");
        String date = sc.nextLine();

        System.out.println("\nOrder No.: " + orderNo);
        System.out.println("Date     : " + date);
        System.out.println("---------------------------------------------------");
        System.out.printf("%-10s %-10s %-10s %-12s %-10s\n", "Prod ID", "Name", "Quantity", "Unit Price", "Total");
        System.out.println("---------------------------------------------------");

        double netAmount = 0;
        for (Product p : products) {
            p.display();
            netAmount += p.calculate();
        }

        System.out.println("---------------------------------------------------");
        System.out.printf("Net Amount: %.2f\n", netAmount);
        sc.close();
    }
}

