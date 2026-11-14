import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<DienThoai> danhSach = new ArrayList<>();

        while (true) {
            System.out.println("\n-- CHUONG TRINH QUAN LY DIEN THOAI --");
            System.out.println("1. Them moi");
            System.out.println("2. Xoa");
            System.out.println("3. Xem danh sach dien thoai");
            System.out.println("4. Tim kiem");
            System.out.println("5. Thoat");
            System.out.print("Chon chuc nang: ");

            String chon = scanner.nextLine();
            switch (chon) {
                case "1":
                    System.out.print("Nhap ten dien thoai: ");
                    String ten = scanner.nextLine();
                    System.out.print("Nhap gia ban: ");
                    double gia = Double.parseDouble(scanner.nextLine());
                    // Gán cứng các thông số còn lại cho nhanh
                    DienThoai dt = new DienThoaiChinhHang(danhSach.size() + 1, ten, gia, 1, "Samsung", 365, "Toan Quoc");
                    danhSach.add(dt);
                    System.out.println("Da them!");
                    break;
                case "2":
                    System.out.println("Chuc nang dang phat trien...");
                    break;
                case "3":
                    for (DienThoai item : danhSach) {
                        item.hienThiThongTin();
                    }
                    break;
                case "4":
                    System.out.println("Chuc nang dang phat trien...");
                    break;
                case "5":
                    System.exit(0);
                default:
                    System.out.println("Chon sai!");
            }
        }
    }
}