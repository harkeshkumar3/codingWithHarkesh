package org.example.Problems;

public class LongestCommonSubstringProblem {
    static int mano[][];
    static char x[];
    static char y[];
    static int result;

    public static void main(String[] args) {

        String name = "javaaid";
        String name1 = "javaid";
        x = convertStringToCharArray(name);
        y = convertStringToCharArray(name1);
        int i = LCStr(x, y, name.length(), name1.length());
        System.out.println(i);

    }

    private static int LCStr(char[] x, char[] y, int m, int n) {

        int mano[][] = new int[m + 1][n + 1];
        result = 0;
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0) {
                    mano[i][j] = 0;
                } else if (x[i - 1] == y[j - 1]) {
                    mano[i][j] = mano[i - 1][j - 1] + 1;
                    result = Math.max(result, mano[i][j]);
                } else {
                    mano[i][j] = 0;
                }
            }
        }


        return result;
    }

    static char[] convertStringToCharArray(String n) {
        return n.toCharArray();
    }
}
