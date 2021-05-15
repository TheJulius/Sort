package sort;

public class BubbleSort {
	
	public int[] bubbleSort(int[] arr) {  
        
		int n = arr.length;  
        int temp = 0;
        int count = 0;
        int count2 = 0;
        
        for(int i=0; i < n; i++){
        	for(int j=1; j < (n-i); j++){
        		count++;
        		if(arr[j-1] > arr[j]){
	            temp = arr[j-1];  
	            arr[j-1] = arr[j];  
	            arr[j] = temp;
	            count2++;
	            }
	        }  
        }
        
        int qtdComparacoes = count;
        int qtdTrocas = count2;
        
        int[] retorno = new int[2];
        retorno[0] = qtdComparacoes;
        retorno[1] = qtdTrocas;
        
		return retorno;
	}
}

