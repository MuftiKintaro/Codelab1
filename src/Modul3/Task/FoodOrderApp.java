package Modul3.Task;
import java.util.ArrayList;
import java.util.Scanner;

// Class untuk item makanan
public class FoodOrderApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n=====================================");
            System.out.println("   SELAMAT DATANG DI RESTORAN KITA   ");
            System.out.println("=====================================");
            System.out.println("1. Lihat Menu & Pesan Makanan");
            System.out.println("2. Kritik dan Saran");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu (1 - 3): ");
            int mainChoice = scanner.nextInt();
            scanner.nextLine(); // membersihkan newline

            switch (mainChoice) {
                case 1:
                    // Daftar menu makanan
                    ArrayList<MenuItem> menu = new ArrayList<>();
                    menu.add(new MenuItem("Nasi Goreng", 20000));
                    menu.add(new MenuItem("Mie Ayam", 15000));
                    menu.add(new MenuItem("Ayam Geprek", 18000));
                    menu.add(new MenuItem("Es Teh", 5000));
                    menu.add(new MenuItem("Kopi Hitam", 7000));
                    menu.add(new MenuItem("Kopi Susu", 10000));
                    menu.add(new MenuItem("Macha Maciato", 20000));
                    menu.add(new MenuItem("Indomie Goreng", 8000));
                    menu.add(new MenuItem("Indomie Goreng + Telur", 12000));
                    menu.add(new MenuItem("Air Mineral", 5000));
                    menu.add(new MenuItem("Ice Coffee Milk (Vanila, Caramel)", 18000));

                    System.out.println("\n=== MENU RESTORAN ===");
                    for (int i = 0; i < menu.size(); i++) {
                        System.out.println((i + 1) + ". " + menu.get(i));
                    }

                    Order order = new Order();

                    while (true) {
                        System.out.print("Pilih nomor menu (0 untuk selesai): ");
                        int choice = scanner.nextInt();
                        if (choice == 0) break;
                        if (choice > 0 && choice <= menu.size()) {
                            order.addItem(menu.get(choice - 1));
                            System.out.println(menu.get(choice - 1).getName() + " ditambahkan ke pesanan.");
                        } else {
                            System.out.println("Pilihan tidak valid!");
                        }
                    }

                    order.printReceipt();
                    System.out.println("Terima kasih telah memesan di restoran kami!");
                    break;

                case 2:
                    // Fitur kritik dan saran
                    System.out.println("\n=== FORMULIR KRITIK & SARAN ===");
                    System.out.print("Masukkan kritik atau saran Anda: ");
                    String feedback = scanner.nextLine();

                    System.out.println("\nTerima kasih atas masukan Anda!");
                    System.out.println("Kami akan berusaha meningkatkan pelayanan kami.");
                    break;

                case 3:
                    // Keluar dari program
                    System.out.println("Terima kasih telah berkunjung. Sampai jumpa lagi!");
                    running = false;
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }

        scanner.close();
    }
}