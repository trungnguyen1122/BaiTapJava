import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner ac = new Scanner(System.in);
        System.out.println("Nhập ItemID:");
        int ID = sc.nextInt();
        System.out.print("Nhập name:");
        String name = ac.nextLine();
        System.out.print("Nhập producer:");
        String product = ac.nextLine();
        System.out.print("Nhập price");
        double price = sc.nextDouble();
        Item item = new Item(ID,name,product,price);
        System.out.println("---In ra thông tin---");
        System.out.println(item.toString());
    }
}
