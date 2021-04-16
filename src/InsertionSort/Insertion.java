package InsertionSort;

public class Insertion {

    public static void Insertion_1 (int[] T) {
        for (int i = 1; i < T.length; i++) {
            int key = T[i];
            int j = i - 1;
            while ((j >= 0) && (T[j] > key)) {
             
                
                T[j + 1] = T[j];
                j--;
            }
            T[j + 1] = key;
        }
        
    }
    public static void hasil(int data[]) {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
    }
    System.out.println();
}

    public static void main(String[] args) {
        int C[] = {25, 7, 9, 13, 3};
        Insertion.hasil(C);
        Insertion.Insertion_1(C);
        Insertion.hasil(C);
        
        System.out.println("Annisa Nadia Nur Afifah");
    }
}
