/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividades;
import java.util.Scanner;
/**
 *
 * @author Aluno
 */
public class Atividades {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //exercicio01();
        //exercicio02();
        // exercicio03(); 
        //exercicio04();
        //exercicio05();
        //exercicio06();
        //exercicio07();
        //exercicio08();
        //exercicio09();
        //exercicio10();
        //exercicio11();
        //exercicio12();
        //exercicio13();
        //exercicio14();
        //exercicio15();
    }
  public static void exercicio01(){
        Scanner s = new Scanner(System.in);
        int c = 1, soma = 0;
        double media;
        int[] num = new int [5];
         
        
        for (int cont = 0; cont <5; cont++){
            System.out.println("Informe um valor");
            num[cont] = s.nextInt();
            soma = num[cont]+soma;
            c++;     
        }
        
      for (int cont = 0; cont <5; cont++){
          System.out.println("O numero na posicao "+cont+" é: "+num[cont]);
      }   
      media = soma/c;  
      
    System.out.println("A soma dos numeros é "+soma+" e a media é "+media);
    }
  public static void exercicio02(){
       Scanner s = new Scanner (System.in);
       int[] idade = new int[10];
       String[] nomes = new String[10];
       
       for (int cont = 0; cont<10; cont++){
           System.out.println("Insira o nome aqui");
           nomes[cont]=s.next();
           System.out.println("Insira a idade aqui");
           idade[cont]=s.nextInt();
       }
       for (int cont = 0; cont<10; cont++){
           System.out.println("Esse é o(a) "+nomes[cont]+" que tem "+idade[cont]);
           if (idade[cont]>=18){
               System.out.println("E pode comprar bebidas alcoolicas");
           }else {
               System.out.println("E não pode comprar bebidas alcoolicas");
           }
       }
       
       
   } 
  public static void exercicio03(){
       Scanner s = new Scanner (System.in);
       int[] num = new int[10];
       for (int cont = 0; cont <10; cont++){
           System.out.println("Insira um valor");
           num[cont]=s.nextInt();
           }
       
       System.out.println("Numeros pares");
       
       for(int cont = 0;cont<10;cont++){
           if (num[cont]%2==0){
               System.out.println(num[cont]);
           }
       }
       
       System.out.println("Numeros Impares");
       
       for (int cont = 0; cont<10;cont++){
           if (num[cont]%2==0){
               
           }else if (num[cont]%1==0){
               System.out.println(num[cont]);
           }
       }
   } 
  public static void exercicio04(){
      Scanner s = new Scanner (System.in);
      int maior,menor;
      
      int[] num = new int[10];
      for (int cont = 0; cont<10; cont++){
          System.out.println("Insira um valor");
          num[cont]=s.nextInt();
          
      }
      maior=num[0];
      menor=num[0];
      for (int cont = 0; cont<10; cont++){
          if (num[cont]>maior){
              maior = num[cont];
          } else if (num[cont]<menor){
               menor = num[cont];
       }
      }
      System.out.println("O menor numero apresentado foi "+menor+" e o maior foi "+maior);
}
  public static void exercicio05(){
      Scanner s = new Scanner(System.in);
      int  igual=0;
      int[] num1=new int[10];
      int[] num2=new int[10];
      
      for (int cont = 0; cont<10; cont++){
          System.out.println("Informe um valor para a primeira tabela");
          num1[cont]=s.nextInt();
          
      }
      
      for (int cont = 0; cont<10; cont++){
          System.out.println("Informe um valor para a  2 tabela ");
          num2[cont]=s.nextInt();
      }
      for (int cont = 0; cont<10; cont++){
          if (num1[cont]==num2[cont]){
              igual++;
          }
      }
      if (igual==10){
          System.out.println("Os vetores são iguais");
      }else {
          System.out.println("Os vetores não são iguais");
      }
  }
  public static void exercicio06(){
  Scanner s = new Scanner (System.in);
  String[] alunos = new String[5];
  float [] notas = new float[5];
      for (int cont = 0; cont<10; cont++){
          System.out.println("Insira o nome do aluno");
          alunos[cont]=s.nextLine();
          System.out.println("Insira a nota do aluno");
          notas[cont]=s.nextInt();
          }
      for (int cont = 0; cont<10;cont++){
          if (notas[cont]>7){
              System.out.println("O aluno "+alunos[cont]+" esta APROVADO");
          }else if (notas[cont]<7 && notas[cont]>4){
              System.out.println("O aluno "+alunos[cont]+" esta em EXAME");
          }else {
              System.out.println("O aluno "+alunos[cont]+" esta REPROVADO");
          }
      }

  }
  public static void exercicio07(){
      Scanner s = new Scanner (System.in);
      int[] a = new int[5];
      int[] b = new int[5];
      
      for(int cont = 0; cont<5; cont++){
          System.out.println("Informe um valor");
          a[cont]=s.nextInt();
          }
      for (int cont = 0;cont<5;cont++){
          b[cont]=a[cont];
          System.out.println("Valor "+cont+" é "+b[cont]);
      }
  }
  public static void exercicio08(){
      Scanner s = new Scanner (System.in);
      int[] num = new int[15];
      float soma = 0, media;
      for (int cont = 0 ; cont<15; cont++){
          System.out.println("Insira um valor");
          num[cont]=s.nextInt();
          soma = soma+num[cont];
      } 
      media = soma/15;
      System.out.println("A média dos números digitados é de "+media);
      for(int cont = 0; cont<15; cont++){
          if (num[cont]>media){
              System.out.println("O número "+num[cont]+" é maior que a média");
          }else if (num[cont]==media){
              System.out.println("O número "+num[cont]+" é igual a média");
          }
      }
  }
  public static void exercicio09(){
      Scanner s = new Scanner (System.in);
      int[] a = new int[8];
      int[] b = new int[8];
      
      for(int cont = 0; cont<8; cont++){
          System.out.println("Informe um valor para a tabela A");
          a[cont] = s.nextInt();
      }
      for (int cont = 0; cont<8; cont++){
         b[cont]=a[cont]*2;
          System.out.println("O valor de posição "+cont+" para a tabela B foi "+b[cont]);
      }
      
  }
  public static void exercicio10(){
      Scanner s = new Scanner (System.in);
      int[] a = new int[15];
      int[] b = new int[15];
      
      for(int cont = 0; cont<15; cont++){
          System.out.println("Informe um valor para a tabela A");
          a[cont] = s.nextInt();
      }
      for (int cont = 0; cont<15; cont++){
         b[cont]=a[cont]*a[cont];
          System.out.println("O valor de posição "+cont+" para a tabela B foi "+b[cont]);
      }
  }
  public static void exercicio11(){
       Scanner s = new Scanner (System.in);
      int[] a = new int[10];
      int[] b = new int[10];
      
      for(int cont = 0; cont<10; cont++){
          System.out.println("Informe um valor para a tabela A");
          a[cont] = s.nextInt();
      }
      for (int cont = 0; cont<10; cont++){
         b[cont]=a[cont]*cont;
          System.out.println("O valor de posição "+cont+" para a tabela B foi "+b[cont]);
  }
}
  public static void exercicio12(){
      Scanner s = new Scanner (System.in);
      int[] a = new int[10];
      int[] b = new int[10];
      int[] c = new int[10];
      
      for(int cont=0;cont<10;cont++){
          System.out.println("Insira um valor para a tabela A");
          a[cont] =s.nextInt();
          }
      for(int cont=0;cont<10;cont++){
          System.out.println("Insira um valor para a tabela B");
          b[cont]= s.nextInt();
      }
      for(int cont=0;cont<10;cont++){
          c[cont] = a[cont]+ b[cont];
          System.out.println("O valor de posição "+cont+" da tabela C é "+c[cont]);
      }      
  }
  public static void exercicio13(){
      Scanner s = new Scanner (System.in);
      int[] a = new int[10];
      int[] b = new int[10];
      int[] c = new int[10];
      
      for(int cont=0;cont<10;cont++){
          System.out.println("Insira um valor para a tabela A");
          a[cont] =s.nextInt();
          }
      for(int cont=0;cont<10;cont++){
          System.out.println("Insira um valor para a tabela B");
          b[cont]= s.nextInt();
      }
      for(int cont=0;cont<10;cont++){
          c[cont] = a[cont]*b[cont];
          System.out.println("O valor de posição "+cont+" da tabela C é "+c[cont]);
      }      
  }
  public static void exercicio14(){
      Scanner s = new Scanner (System.in);
      int[] a = new int[10];
      int[] b = new int[10];
      
      for(int cont = 0; cont<10;cont++){
          System.out.println("Informe um valor para a tabela A");
          a[cont]=s.nextInt();
          }
      for(int cont = 0; cont<10;cont++){
          b[cont]=a[cont] % 2;
          System.out.println("O valor de posição "+cont+" da tabela B é "+b[cont]);
      }
      }
  public static void exercicio15(){
      Scanner s = new Scanner (System.in);
      int[] a = new int[10];
      int pares = 0;
      for( int cont=0;cont<10;cont++){
          System.out.println("Informe um valor para a tabela A");
          a[cont]=s.nextInt();
          }
      for (int cont=0; cont<10; cont++){
          if(a[cont]%2==0){
              System.out.println("O valor da posição "+cont+" é "+a[cont]+" assim sendo PAR");
              pares++;
      }
      }
      System.out.println("Ouve um total de "+pares+" números pares");  
   }

}
