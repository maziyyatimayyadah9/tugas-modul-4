package Algoritma_Pengurutan;
public class nomor1_insertionsort {
    
    public static void insertionSort(int[] A){
        for (int i = 1; i < A.length; i++){
            int key  = A[i];
            int j = i - 1;
            while ((j >= 0) && (A[j] > key)) {
            
            
                A[j + 1] = A[j];
                j--;
        }
            A[j + 1] = key ;
        }
    }
    public static void tampil(int[] dataA){
        for (int i = 0; i <dataA.length; i++){
            System.out.print(dataA[i] + " ");
        }
    System.out.println();
    }

    public static void main(String[] args){
        int A[] = {25, 7, 9, 13, 3};
        nomor1_insertionsort.tampil(A);
        nomor1_insertionsort.insertionSort(A);
        nomor1_insertionsort.tampil(A);
        
        System.out.println("Maziyyati Mayyadah - 20090095");
        System.out.println("2D DIV TEKNIK INFORMATIKA");
    }
}