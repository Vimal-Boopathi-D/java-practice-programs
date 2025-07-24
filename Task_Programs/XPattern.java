package Task_Programs;

public class XPattern {
    public static void main(String[] args) {
        int n = 7;

        for (int i=0;i<n;i++) { 
            for (int j=0;j<n;j++) { 
                if (j==i||i+j==n-1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
