
package java17jan;

import java.util.Arrays;
import java.util.Scanner;


public class JAVA17Jan {

    
    public static void main(String[] args) {

        //1)Receba 10 números inteiros, apresente-os no ecrã e calcule o valor médio dos elementos do array;
        
        System.out.println("1) Insira 10 numeros inteiros para calcular a média:");        
        Scanner in= new Scanner(System.in); //uma Classe que precisa de biblioteca       
        int[] arrayNumInt10= new int[10];  //criando array vazio para inserção dos inputs
        int somaInt10=0;
                
        //FOR para inserção de 10 inputs 
        for(int i =0; i<10; i++){  //índice do array começa em O, irá passar pelas 10 posições, de 0 a 9.
            System.out.printf("Insira o valor %d: ", i+1);  //Adiciona 1 ao índice para melhorar a a impressão
            int numInt10= in.nextInt(); 
            arrayNumInt10[i]= numInt10;  // Armazena o número no array
            somaInt10 =+ numInt10;  //Atualiza a soma a cada Loop
        }        
        System.out.println("Valores inseridos:");
        
        //FOR para impressão dos inputs armazenados no Array
        for(int i=0; i<10; i++){  //começa em 0 pois se trata de um Array
            System.out.printf("Valor %d: %d\n", i+1, arrayNumInt10[i]);
        }

        double mediaInt10= (double)somaInt10/arrayNumInt10.length;
        System.out.printf("A média dos valores inseridos é: %.2f%n",mediaInt10);
        System.out.println("____________________________________________");

       
        //Versao Formador------------------------------------------------------
        
        //array numero
       int[] numero = {10, 20, 30, 40, 50, 60, 70, 80, 90,100};
       int soma = 0;
       double media;
       
       //FOR para somar os valores até o tamanho do Array
       for(int i=0; i < numero.length ; i++)
            soma = soma + numero[i];

       //FOR para impressão dos inputs armazenados no Array
        for(int i=0; i<10; i++){  //começa em 0 pois se trata de um Array
            System.out.printf("Valor %d: %d\n", i+1, numero[i]);
        }
        
        media= (double)soma / numero.length;
        
        System.out.printf("Média (formador): %.2f\n", media); 
        System.out.println("____________________________________________");
       
       //Versao formador------------------------------------------------------

       
       //2) Encontre o índice de um elemento de array. Deve inserir um 
       //elemento e o programa deverá mostrar o seu índice, se não existir, 
       //deverá mostrar a mensagem “Elemento não encontrado”
       
        System.out.print("2) Insira um numero para buscar seu índice: ");
        int nBuscar= in.nextInt();
        
        int[] arrayNumABuscar = {1,2,3,4,5,6,7,8,9};        
        int tamanho= arrayNumABuscar.length;
        boolean encontrado=false;
        
        for(int i=0; i < tamanho; i++){
            if(nBuscar==arrayNumABuscar[i]){
                System.out.printf("O valor %d foi encontrado no [índice] %d do Array%n", nBuscar, i);
                encontrado=true;
                break;
            }
        }
        
        if(!encontrado){
            System.out.print("Elemento nao encontrado");
        }      

        System.out.println("_____________________________________________");
        
        
        //Versao formador------------------------------------------------------

        boolean encontrou = false;
        int n = 45; // número a encontrar -> int n = in.nextInt()
        
        if(numero != null){
            int i = 0; 
            while (i < numero.length) { // Percorrer todo o vetor
                if (numero[i] == n){
                    System.out.println("Elemento encontrado no índice: " + i);
                    encontrou = true;
                }
                i = i + 1;
            }
	}
        
	if(encontrou == false)
            System.out.println("O elemento inserido não foi encontrado");
        
        System.out.println("____________________________________________");

        
        //Versao formador----------------------------------------------------
        
        //3) Escreva um programa para criar uma cópia de um array;        
        int[] arr1 = {20, 30, 40, 50, 60, 70, 80, 90, 100, 99};
	int[] arr2 = new int[10];     
        int[] arr3 = new int[10]; 
        
	// Método para ordenar o array
   	Arrays.sort(arr1);   
        
        // Maneira de mostrar o array todo como se fosse uma string, evita fazer um ciclo (FOR/WHILE) (só para mostrar o array)        
        System.out.println("Array ordenado: " + Arrays.toString(arr1));
	
        //FOR para atribuir os valores de arr1 para arr2.
        for(int i=0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
	}
                
        System.arraycopy(arr2, 2, arr3, 5, 3);
	System.out.println("Array com metodo arraycopy(): " + Arrays.toString(arr3));
        System.out.println("____________________________________________");

        
        //4)       
        int maior = arr1[0];
        
        for(int i = 1; i < arr1.length; i++){
            if(arr1[i] > maior)
            maior = arr1[i];
        }
        System.out.println("____________________________________________");

        
        //5)        
        int conta = 0;
        
        if(arr1.length == arr2.length){
            for(int i = 0; i < arr1.length; i++){
                if(arr1[i] == arr2[i])
                conta++;
            }
        }            
        else{
            System.out.println("Os arrays têm tamanhos diferentes");
        }
        
        
        if(conta == arr1.length)
            System.out.println("Os arrays são iguais");
        else
            System.out.println("Os arrays não são iguais");

        
    }
    
}
