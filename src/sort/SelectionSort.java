package sort;

public class SelectionSort {
	
	 public int[] selectionSort(int[] arr){
		 
        int count = 0;
        int count2 = 0;
        for (int i = 0; i < arr.length - 1; i++)  
        {  
            int index = i;  
            for (int j = i + 1; j < arr.length; j++){  
                if (arr[j] < arr[index]){
                	count++;
                    index = j;
                }  
            }  
            int smallerNumber = arr[index];   
            arr[index] = arr[i];  
            arr[i] = smallerNumber;  
        }
        int qtdComparacoes = count;
        int qtdTrocas = count2;
        
        int[] retorno = new int[2];
        retorno[0] = qtdComparacoes;
        retorno[1] = qtdTrocas;
        
		return retorno;  
    }  
}
