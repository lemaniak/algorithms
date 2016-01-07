package com.vicente.algorithms.basics.algoritms;

import java.util.Arrays;

/**
 * Created by vicente on 19/03/15.
 */
public class MatrixMultiplication {

    private static int[][] matrixa={{1,2,3},{1,2,3},{1,2,3}};
    private static int[][] matrixb={{1,2,3},{1,2,3},{1,2,3}};

    public static void main(String[]args){
        System.out.println(Arrays.deepToString(mulitply2(matrixa,matrixb)));
    }

    public static int[][] mulitply(int[][] matrixa,int[][]matrixb){
        int size =matrixa.length;
        int[][] response = new int[size][size];
        for(int a=0; a<size;a++){//iterate rows
            for(int i=0; i<size; i++){
                response[a][i]=matrixa[a][i]*matrixb[a][i];
            }
        }
        return response;
    }

    public static int[][] mulitply2(int[][] a,int[][]b) {
        int N = a.length;
        int[][] c = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) { // Compute dot product of row i and column j.
                for (int k = 0; k < N; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }

            }
        }
        return c;
    }
}
