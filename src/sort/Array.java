package sort;

import java.util.Random;

public class Array {
	
	public int[] arrayEmOrdemDezMilPosicoes() {
		
		int[] arrayDezMilPosicoes = new int[10000];
		
		for (int i = 1; i < 10000; i++) {
			arrayDezMilPosicoes[i] = i;
		} 
		
		return arrayDezMilPosicoes;
	}
	
	public int[] arrayEmOrdemCemMilPosicoes() {
		
		int[] arrayCemMilPosicoes = new int[100000];
		
		for (int i = 1; i < 100000; i++) {
			arrayCemMilPosicoes[i] = i;
		} 
		
		return arrayCemMilPosicoes;
	}
	
	public int[] arrayInvertidoDezMilPosicoes() {
		
		int[] arrayDezMilPosicoes = new int[10000];
		int[] arrayDezMilPosicoesInvertido = new int[10000];
		
		for (int i = 1; i < 10000; i++) {
			arrayDezMilPosicoes[i] = i;
		}
		
		for(int i=arrayDezMilPosicoes.length-1;i>=0;i--) {
        	arrayDezMilPosicoesInvertido[i] = i;
        }
		
		return arrayDezMilPosicoes;
	}
	
	public int[] arrayInvertidoCemMilPosicoes() {
		
		int[] arrayCemMilPosicoes = new int[100000];
		int[] arrayCemMilPosicoesInvertido = new int[100000];
		
		for (int i = 1; i < 100000; i++) {
			arrayCemMilPosicoes[i] = i;
		} 
		
        for(int i=arrayCemMilPosicoes.length-1;i>=0;i--) {
        	arrayCemMilPosicoesInvertido[i] = i;
        }
        
        return arrayCemMilPosicoesInvertido;
   }
	
	public int[] arrayAleatorioDezMilPosicoes() {
		
		int[] arrayDezMilPosicoes = new int[10000];
		Random rd = new Random();
		
		for (int i = 1; i < 10000; i++) {
			arrayDezMilPosicoes[i] = rd.nextInt();
		} 
		
		return arrayDezMilPosicoes;
	}
	
	public int[] arrayAleatorioCemMilPosicoes() {
		
		int[] arrayCemMilPosicoes = new int[100000];
		Random rd = new Random();
		
		for (int i = 1; i < 10000; i++) {
			arrayCemMilPosicoes[i] = rd.nextInt();
		} 
		
		return arrayCemMilPosicoes;
	}

}
