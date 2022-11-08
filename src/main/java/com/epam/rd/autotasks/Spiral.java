package com.epam.rd.autotasks;

class Spiral {
    static int[][] spiral(int rows, int columns) {
        int [][] res = new int[rows][columns];
        int num = 1;
        int max = rows * columns;

        int rmin = 0, rmax = rows - 1;
        int cmin = 0, cmax = columns - 1;

        while (num <= max) {

            for (int i = cmin; num <= max && i <= cmax; i++) {
                res[rmin][i] = num++;
            }
            rmin++;

            for (int i = rmin; num <= max && i <= rmax; i++) {
                res[i][cmax] = num++;
            }
            cmax--;

            for (int i = cmax; num <= max && i >= cmin; i--) {
                res[rmax][i] = num++;
            }
            rmax--;

            for (int i = rmax; num <= max && i >= rmin; i--) {
                res[i][cmin] = num++;
            }
            cmin++;
        }
        return res;
    }
}
