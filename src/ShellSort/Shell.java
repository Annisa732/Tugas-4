package ShellSort;

public class Shell {
    public static void ShellSort_4(int[] Hsl) {
        int n = Hsl.length;
        int C,M;
        int jarak, i, j;
        boolean Sudah = true;
        int temp;
        C = 0;
        M = 0;
        jarak = n;
        
        while (jarak >= 1) {
            jarak = jarak / 2;
            Sudah = true;
            while (Sudah) { 
                Sudah = false;
                for (j = 0; j < n - jarak; j++) {
                    i = j + jarak;
                    C++;
                    if (Hsl[j] > Hsl[i]) {
                        temp = Hsl[j];
                        Hsl[j] = Hsl[i];
                        Hsl[i] = temp;
                        Sudah = true;
                    
                    }
                }
            }
        }
    }

    public static void hasil(int data[]) {
        for(int i = 0; i < data.length; i++)
            System.out.print(data[i] + " ");
        System.out.println();
    }
    
    
    public static void main(String[] args) {
        int R[] = {25, 7, 9, 13, 3};
        Shell.hasil(R);
        Shell.ShellSort_4(R);
        Shell.hasil(R);
        
        System.out.println("Annisa Nadia Nur Afifah");
    }
}

