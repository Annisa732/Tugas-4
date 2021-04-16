package BubbleSort;

public class Bubble {
    
    public static void BubbleSort_2(int[] B) {
        int i=1, j, n = B.length;
        int temp;
        while (i<n) {
            j = n-1;
            while(j>=1) {
                if (B[j-1]>B[j]) {
                    temp = B[j];
                    B[j] = B[j-1];
                    B[j-1] = temp;
                }
                j = j - 1;
            }
            i = i + 1;
        }
    }

    public static void hasil(int data[]) {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
    

    public static void main(String[] args) {
        int E[] = {25, 7, 9, 13, 3};
        Bubble.hasil(E);
        Bubble.BubbleSort_2(E);
        Bubble.hasil(E);
        
        System.out.println("Annisa Nadia Nur Afifah");
    }
}
