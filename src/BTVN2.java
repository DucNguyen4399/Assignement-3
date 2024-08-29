import java.util.Arrays;
import java.util.Scanner;
public class BTVN2 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Nhap so phan tu: ");
            int n = scanner.nextInt();
            //Khai bao mảng//
            int[] array = new int[n];
            System.out.print("Nhap cac phan tu cua mang: ");
            for(int i = 0; i < n; i++){
                array[i] = scanner.nextInt();
            }   //Khai báo max|min//
            int max = array[0];
            int min = array[0];
            //Tim giá trị max|min//
            for(int i = 1; i < n; i++){
                if(array[i] > max){
                    max = array[i];}
                if(array[i] < min){
                    min = array[i];
                }
            }   //Tính tổng các phần tử trong mảng//
            int sum = 0;
            for(int i=0; i<n; i++){
                sum += array[i];
            }   //Tính giá trị trung bình của các phần tử trong mảng//
            int tb = sum/n;
            //Sắp xếp mảng theo thứ tự tăng dần//
            for(int i=0; i < n-1; i++)
            {
                for(int j=0; j < n-i-1; j++)
                {
                    if(array[j] > array[j+1])
                    {
                        //Hoan doi gia tri
                        int tmp = array[j];
                        array[j] = array[j+1];
                        array[j+1] = tmp;
                    }
                }
            }   //In ra màn hình//
            System.out.println("Gia tri lon nhat = " + max);
            System.out.println("Gia tri nho nhat = " + min);
            System.out.println("Tong cua cac phan tu trong mang = " + sum);
            System.out.println("Gia tri TB cua cac phan tu trong mang = " + tb);
            System.out.println("Mang sau khi da sap xep tang dan la: " + Arrays.toString(array));
            //close the scanner
        }
    }
}

