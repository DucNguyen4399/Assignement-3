
package assigment.pkg3;
import java.util.Random;
import java.util.Scanner;
public class Assigment3 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
// Tạo một số ngẫu nhiên trong khoảng từ 1 đến 100//
    int n = random.nextInt(100) + 1;
        String check;
    do {
// Nhập giá trị check từ bàn phím//
        System.out.print("Nhap vao kiem tra (String) : ");
        check = scanner.nextLine();
        if (check.equalsIgnoreCase("yes")) {
 // Kiểm tra n là số chẵn|lẻ lẻ và in kết quả ra màn hình//
        if (n % 2 == 0) {
            System.out.println(n + " la so chan ");
        } else {
            System.out.println(n + " la so le ");
        }
        } else {
// Nếu check khác "yes", kiểm tra n là chẵn |lẻ và thoát vòng lặp//
        if (n % 2 == 0) {
            System.out.println(n + " la so chan ");
        } else {
            System.out.println(n + " la so le ");
        }
        break;}
        }
    while (true);
        scanner.close();
    }
}
    
        
        
 
    

