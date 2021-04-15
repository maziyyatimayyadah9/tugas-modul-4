package Algoritma_Pengurutan;
public class nomor3_selectionsort {
    public static void selectionsort(int[] A) {
        int smallindex;
        int pass, j, n = A.length;
        int temp;
        
        for (pass = 0; pass < n - 1; pass++){
            smallindex = pass;
            for (j = pass + 1; j < n; j++){
                if (A[j] < A[smallindex]){
                    smallindex = j;
                }
            }
            
            temp = A[pass];
            A[pass] = A[smallindex];
            A[smallindex] = temp;
        }
    }
    
    public static void tampil(int data[]) {
        for (int i = 0; i < data.length; i++){
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args){
        int A[] = {25, 7, 9, 13, 3};
        nomor3_selectionsort.tampil(A);
        nomor3_selectionsort.selectionsort(A);
        nomor3_selectionsort.tampil(A);
        
        System.out.println("Maziyyati Mayyadah - 20090095");
        System.out.println("2D DIV TEKNIK INFORMATIKA");
}
}
