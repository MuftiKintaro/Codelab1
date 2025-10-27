package Modul3.Task;
import java.util.ArrayList;


class Order {
    private ArrayList<MenuItem> items = new ArrayList<>();

    public void addItem(MenuItem item) {
        items.add(item);
    }

    public double calculateTotal() {
        double total = 0;
        for (MenuItem item : items) {
            total += item.getPrice();
        }
        return total;
    }

    public void printReceipt() {
        System.out.println("\n======= STRUK PEMBELIAN =======");
        for (MenuItem item : items) {
            System.out.println(item.getName() + "\tRp" + item.getPrice());
        }
        double total = calculateTotal();
        double tax = total * 0.1; // 10% pajak
        double grandTotal = total + tax;
        System.out.println("-------------------------------");
        System.out.println("Subtotal\tRp" + total);
        System.out.println("Pajak (10%)\tRp" + tax);
        System.out.println("Total Bayar\tRp" + grandTotal);
        System.out.println("===============================");
    }
}
