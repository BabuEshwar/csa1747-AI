import java.util.ArrayList; 
import java.util.List; 
import java.util.Scanner; 
import java.text.SimpleDateFormat; 
import java.util.Date; 
import java.util.Calendar; 

class Product { 
    private String id; 
    private String pname; 
    private int qty; 
    private double price; 
    private double totalPrice; 

    Product(String id, String pname, int qty, double price, double totalPrice) { 
        this.id = id; 
        this.pname = pname; 
        this.qty = qty; 
        this.price = price; 
        this.totalPrice = totalPrice; 
    } 

    public String getId() { 
        return id; 
    } 

    public String getPname() { 
        return pname; 
    } 

    public int getQty() { 
        return qty; 
    } 

    public double getPrice() { 
        return price; 
    } 

    public double getTotalPrice() { 
        return totalPrice; 
    } 

    public static void displayFormat() { 
        System.out.format("--------------------------------------------------------------------------\n"); 
        System.out.print("Product ID \t\tName\t\tQuantity\tRate\t\tTotal Price\n"); 
        System.out.format("--------------------------------------------------------------------------\n"); 
    } 

    public void display() { 
        System.out.format(" %-9s %-9s %5d %9.2f %14.2f\n", id, pname, qty, price, totalPrice); 
    } 
} 

public class ShoppingBill { 
    private static final double SGST_RATE = 0.12; 
    private static final double CGST_RATE = 0.12; 
    private static final double DISCOUNT_RATE = 0.02; 

    public static void main(String args[]) { 
        String id; 
        String productName; 
        int quantity; 
        double price; 
        double totalPrice; 
        double overallPrice = 0.0; 
        double cgst, sgst, subtotal, discount; 
        char choice; 
        Scanner scan = new Scanner(System.in); 

        System.out.println("\t\t\t\t--------------------Invoice-----------------"); 
        System.out.println("\t\t\t\t\t City Mart Grocery Shop"); 
        System.out.println("\t\t\t\t\t3/98 Chettipedu Thandalam Chennai"); 
        System.out.println("\t\t\t\t\tBeside Saveetha Medical College"); 
        System.out.println("GSTIN: 03AWBPP8756K592\t\t\t\tContact: (+91) 8015964358"); 

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); 
        Date date = new Date(); 
        Calendar calendar = Calendar.getInstance(); 
        String[] days = new String[] { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" }; 
        System.out.println("Date: " + formatter.format(date) + " " + days[calendar.get(Calendar.DAY_OF_WEEK) - 1] + "\t\t\t\t\t (+91) 9948922228"); 

        System.out.print("Enter Customer Name: "); 
        String customerName = scan.nextLine(); 

        List<Product> productList = new ArrayList<>(); 
        do { 
            addProduct(scan, productList, new double[]{overallPrice}); 
            System.out.print("Want to add more items? (y or n): "); 
            choice = scan.next().charAt(0); 
            scan.nextLine(); // Clear the buffer
        } while (choice == 'y' || choice == 'Y'); 

        Product.displayFormat(); 
        for (Product p : productList) { 
            p.display(); 
        } 

        System.out.println("\n\t\t\t\t\t\t\t\t\tTotal Amount (Rs.) " + overallPrice); 

        discount = overallPrice * DISCOUNT_RATE; 
        System.out.println("\n\t\t\t\t\t\t\t\t\tDiscount (Rs.) " + discount); 

        subtotal = overallPrice - discount; 
        System.out.println("\n\t\t\t\t\t\t\t\t\tSubtotal (Rs.) " + subtotal); 

        sgst = subtotal * SGST_RATE; 
        System.out.println("\n\t\t\t\t\t\t\t\t\tSGST (Rs.) " + sgst); 
        cgst = subtotal * CGST_RATE; 
        System.out.println("\n\t\t\t\t\t\t\t\t\tCGST (Rs.) " + cgst); 

        System.out.println("\n\t\t\t\t\t\t\t\t\tInvoice Total (Rs.) " + (subtotal + cgst + sgst)); 
        System.out.println("\t\t\t\t----------------Thank You for Shopping!!-----------------"); 
        System.out.println("\t\t\t\tVisit Again"); 

        scan.close(); 
    } 

    private static void addProduct(Scanner scan, List<Product> productList, double[] overallPrice) { 
        System.out.println("Enter the product details: "); 
        System.out.print("Product ID: "); 
        String id = scan.nextLine(); 
        System.out.print("Product Name: "); 
        String productName = scan.nextLine(); 

        System.out.print("Quantity: "); 
        int quantity = scan.nextInt(); 
        while (quantity <= 0) {
            System.out.print("Quantity must be a positive number. Enter Quantity: ");
            quantity = scan.nextInt();
        }

        System.out.print("Price (per unit): "); 
        double price = scan.nextDouble(); 
        while (price < 0) {
            System.out.print("Price must be a non-negative number. Enter Price: ");
            price = scan.nextDouble();
        }

        double totalPrice = price * quantity; 
        overallPrice[0] += totalPrice; 

        productList.add(new Product(id, productName, quantity, price, totalPrice)); 
        scan.nextLine(); // Clear the buffer
    } 
}
