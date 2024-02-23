package br.edu.fatecpg.tecprog.tarefa2;
import java.util.Objects;
import java.util.Scanner;
public class Ex2 {
   public static void main(String[] args) {
      Scanner ler = new Scanner(System.in);
      String [][] usuarios = new String [6][2];
      String [][] usuarioLogado = new String [1][2];

      for(int l=0; l<=5 ; l++) {
         for (int c = 0; c <= 1; c++) {
            if(c == 0) {
               System.out.println("CRIE um Login: ");
               usuarios[l][c] = ler.nextLine();
            } else if (c == 1){
               System.out.println("CRIE uma Senha: ");
               usuarios[l][c] = ler.nextLine();
            }

         }
      }

      System.out.println("ENTRE com um Login e Senha válidos: ");
      usuarioLogado[0][0] = ler.nextLine();
      usuarioLogado[0][1] = ler.nextLine();

      for(int l=0; l<=5 ; l++) {
         for (int c = 0; c <= 1; c++) {
            if(usuarios[l][c].equals(usuarioLogado[0][0])) {
                  System.out.println("VALIDADO");
               } else {
               System.out.println("INVALIDADO");
            }
         }
      }
      ler.close();
      }
}
