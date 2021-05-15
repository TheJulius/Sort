package sort;

public class InsertionSort {
	
	public int[] insertionSort(int array[]) {  
        int n = array.length;  
        int count = 0;
        int count2 = 0;
        for (int j = 1; j < n; j++) {  
            int key = array[j];  
            int i = j-1;  
            while ( (i > -1) && ( array [i] > key ) ) {  
                array [i+1] = array [i];  
                i--;
                count++;
            }  
            array[i+1] = key;
            count2++;
        }
        int qtdComparacoes = count;
        int qtdTrocas = count2;
        
        int[] retorno = new int[2];
        retorno[0] = qtdComparacoes;
        retorno[1] = qtdTrocas;
        
        return retorno;

	}
}

