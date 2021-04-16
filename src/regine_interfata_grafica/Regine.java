package regine_interfata_grafica;

public class Regine {

    public static int ok;
    private static int dim;
    public static int nrSol = -1;
    public static int[][] matrice = new int[100000][13];

    public Regine(int NrButoane, int x[]) {
        dim = (int) Math.sqrt(NrButoane);
    }

    public static boolean ataca(int k, int x[]) {
        int i;
        for (i = 0; i < k; i++) {
            if ((x[i] == x[k]) || (Math.abs(x[i] - x[k]) == k - i)) {
                return false;
            }
        }
        return true;
    }

    public static void genereazaMatrice(int x[], int nrSol) {
        int l, c;
        for (l = 0; l < dim; l++) {
            matrice[nrSol][l] = dim * l + x[l] - 1;
        }
    }

    public static void afiseaza(int x[]) {
        nrSol++;
        for (int i = 0; i < x.length; i++) {
            genereazaMatrice(x, nrSol);
        }
    }

    public static void BT(int dim) {
        int[] x = new int[dim];
        int k = 0;
        x[0] = 0;
        while (k > -1) {
            if (x[k] < dim) {
                x[k]++;
                if (ataca(k, x)) {
                    if (k == dim - 1) {
                        afiseaza(x);
                        k--;
                    } else {
                        x[++k] = 0;
                    }
                }
            } else {
                k--;
            }
        }
        x = null;
    }
}
