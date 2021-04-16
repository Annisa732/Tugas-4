package SelectionSort;

public class Selection {
    
    public static void SelectionSort_3 (int[] N) { 
        int Index;
        int z, j, n = N.length;
        int temp;
        
        
        for (z = 0; z < n - 1; z++) {
            Index = z;
            for (j = z + 1; j < n; j++) {
                if (N[j] < N[Index]) {
            }
        }
        
        temp = N[z];
        N[z] = N[Index];
        N[Index] = temp;
    
        }
    }
    
    public static void hasil(int data[]) {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String [] args) {
        int L[] = {25, 7, 9, 13, 3};
        Selection.hasil(L);
        Selection.SelectionSort_3(L);
        Selection.hasil(L);
        
        System.out.println("Annisa Nadia Nur Afifah");
    }
}


