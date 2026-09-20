public class Operations {
    
    public static int addition(int a, int b) {
        return a + b;
    }

    public static int multiplication(int a, int b) {
        return a * b;
    }

    public static double moyenne(int... valeurs) {
        int total = 0;
        for (int v : valeurs) {
            total += v;
        }
        return (double) total / valeurs.length;
    }

    public static int maximum(int... valeurs) {
        int max = valeurs[0];
        for (int v : valeurs) {
            if (v > max) {
                max = v;
            }
        }
        return max;
    }
}
