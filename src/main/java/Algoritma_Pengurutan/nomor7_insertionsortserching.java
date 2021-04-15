package Algoritma_Pengurutan;
import java.util.Scanner;

public class nomor7_insertionsortserching {
    public static void insertionsort(int[] A) {
        for (int i =1 ; i < A.length; i++){
            int key = A[i];
            int j = i - 1;
            while ((j >= 0) && (A[j] > key)){
                
                A[j + 1] = A[j];
                j--;
            }
            A[j + 1] = key;
        }
        
    }
    
    public static void tampil(int data[]){
        for (int i = 0; i < data.length; i++){
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
    
    private static String[] pencarian;
    public static void sequential(String[] pencarian) {
        int B[] = {25, 7, 9, 13, 3};
        System.out.println("Masukkan data yang dicari ");
        Scanner input = new Scanner(System.in);
        int search = input.nextInt();
        int ketemu = 0;
        
        System.out.println("Isi data adalah : ");
            for (int i = 0; i<B.length; i++){
                System.out.print(B[i] + " ");
            }
        System.out.println("");
        System.out.println("");
        for (int i = 0; i<B.length; i++){
            if (B[i] == search){
                ketemu = 1;
                System.out.print("Data yang dicari adalah " + search);
            }
        }
        System.out.println("");
        System.out.println("");
        
        if (ketemu == 1)
            System.out.println("Data Ditemukan");
        else
            System.out.println("Data Tidak Ditemukan");
    }
    
    public static void main(String[] args){
        int A[] = {25, 7, 9, 13, 3};
        nomor7_insertionsortserching.tampil(A);
        nomor7_insertionsortserching.insertionsort(A);
        nomor7_insertionsortserching.tampil(A);
        nomor7_insertionsortserching.sequential(pencarian);
        
        System.out.println("Maziyyati Mayyadah - 20090095");
        System.out.println("2D DIV TEKNIK INFORMATIKA");
    }
}