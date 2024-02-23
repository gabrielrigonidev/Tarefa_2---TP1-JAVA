package br.edu.fatecpg.tecprog.tarefa2;
import java.util.Arrays;
import java.util.Scanner;

public class Ex1 {
   public static void main(String[] args) {
      Scanner ler = new Scanner(System.in);
      int [][] matriz1 = new int [3][3];
      int [][] matriz2 = new int [3][3];
      int [][] result =  new int [3][3];;

      for (int l = 0; l <= 2; l++){
         for (int c = 0; c <= 2; c++){
            System.out.println("Digite valores p/ Matriz 1:");
            matriz1[l][c] = ler.nextInt();
         }
      }
      for (int l = 0; l <= 2; l++){
         for (int c = 0; c <= 2; c++){
            System.out.println("Digite valores p/ Matriz 2:");
            matriz2[l][c] = ler.nextInt();
         }
      }
      ler.close();

      for (int l = 0; l <= 2; l++){
         for (int c = 0; c <= 2; c++){
            result[l][c] = matriz1[l][c] + matriz2 [l][c];
         }
      }
      System.out.print(Arrays.deepToString(result));

//      int soma = 0;
//      for (int[] dadoMatriz1 : matriz1) {
//            for (int dado1 : dadoMatriz1) {
//               for (int[] dadoMatriz2 : matriz2) {
//                  for (int dado2 : dadoMatriz2) {
//                     soma = dado1 + dado2;
//            }
//                  System.out.print(soma + " - ");
//         }
//               System.out.print("\n");
//         }
//      }
   }
}

//Multiplicação de Matriz por Escalar:
//Crie um programa que verifique se um login e senha confere com os dados de uma matriz 6x2.

//Transposição de Matriz:
//Desenvolva um código que realiza a transposição de uma matriz (as colunas viram linhas e as linhas viram colunas).
//Peça aos usuários para inserirem os elementos da matriz, exibindo a matriz transposta no console.