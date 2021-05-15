package sort;

public class Main {

	public static void main(String[] args) {

		Array a = new Array();

		BubbleSort bubble = new BubbleSort();

		int[] a1 = a.arrayEmOrdemDezMilPosicoes();
		int[] a2 = a.arrayEmOrdemCemMilPosicoes();

		int[] a3 = a.arrayAleatorioDezMilPosicoes();
		int[] a4 = a.arrayAleatorioCemMilPosicoes();

		int[] a5 = a.arrayInvertidoDezMilPosicoes();
		int[] a6 = a.arrayInvertidoCemMilPosicoes();

		System.out.println("Bubble Sort\n");

		System.out.println("Array em ordem com dez mil posicoes");
		long start1 = System.nanoTime();
		System.out.println("Quantidade de Comparacoes: " + bubble.bubbleSort(a1)[0]);
		long end1 = System.nanoTime();
		System.out.println("Quantidade de Trocas: " + bubble.bubbleSort(a1)[1]);
		System.out.println("Tempo de execucao: " + (end1 - start1) + " nanosegundos\n");

		System.out.println("Array em ordem com cem mil posicoes");
		long start2 = System.nanoTime();
		System.out.println("Quantidade de Comparacoes: " + bubble.bubbleSort(a2)[0]);
		long end2 = System.nanoTime();
		System.out.println("Quantidade de Trocas: " + bubble.bubbleSort(a2)[1]);
		System.out.println("Tempo de execucao: " + (end2 - start2) + " nanosegundos\n");

		System.out.println("Array aleatorio com dez mil posicoes");
		long start3 = System.nanoTime();
		System.out.println("Quantidade de Comparacoes: " + bubble.bubbleSort(a3)[0]);
		long end3 = System.nanoTime();
		System.out.println("Quantidade de Trocas: " + bubble.bubbleSort(a3)[1]);
		System.out.println("Tempo de execucao: " + (end3 - start3) + " nanosegundos\n");

		System.out.println("Array aleatorio com cem mil posicoes");
		long start4 = System.nanoTime();
		System.out.println("Quantidade de Comparacoes: " + bubble.bubbleSort(a4)[0]);
		long end4 = System.nanoTime();
		System.out.println("Quantidade de Trocas: " + bubble.bubbleSort(a4)[1]);
		System.out.println("Tempo de execucao: " + (end4 - start4) + " nanosegundos\n");

		System.out.println("Array invertido com dez mil posicoes");
		long start5 = System.nanoTime();
		System.out.println("Quantidade de Comparacoes: " + bubble.bubbleSort(a5)[0]);
		long end5 = System.nanoTime();
		System.out.println("Quantidade de Trocas: " + bubble.bubbleSort(a5)[1]);
		System.out.println("Tempo de execucao: " + (end5 - start5) + " nanosegundos\n");

		System.out.println("Array invertido com cem mil posicoes");
		long start6 = System.nanoTime();
		System.out.println("Quantidade de Comparacoes: " + bubble.bubbleSort(a6)[0]);
		long end6 = System.nanoTime();
		System.out.println("Quantidade de Trocas: " + bubble.bubbleSort(a6)[1]);
		System.out.println("Tempo de execucao: " + (end6 - start6) + " nanosegundos\n");

		SelectionSort ss = new SelectionSort();

		int[] e1 = a.arrayEmOrdemDezMilPosicoes();
		int[] e2 = a.arrayEmOrdemCemMilPosicoes();

		int[] e3 = a.arrayAleatorioDezMilPosicoes();
		int[] e4 = a.arrayAleatorioCemMilPosicoes();

		int[] e5 = a.arrayInvertidoDezMilPosicoes();
		int[] e6 = a.arrayInvertidoCemMilPosicoes();

		System.out.println("Selection Sort\n");

		System.out.println("Array em ordem com dez mil posicoes");
		long start25 = System.nanoTime();
		System.out.println("Quantidade de Comparacoes: " + ss.selectionSort(e1)[0]);
		long end25 = System.nanoTime();
		System.out.println("Quantidade de Trocas: " + ss.selectionSort(e1)[1]);
		System.out.println("Tempo de execucao: " + (end25 - start25) + " nanosegundos\n");

		System.out.println("Array em ordem com cem mil posicoes");
		long start26 = System.nanoTime();
		System.out.println("Quantidade de Comparacoes: " + ss.selectionSort(e2)[0]);
		long end26 = System.nanoTime();
		System.out.println("Quantidade de Trocas: " + ss.selectionSort(e2)[1]);
		System.out.println("Tempo de execucao: " + (end26 - start26) + " nanosegundos\n");

		System.out.println("Array aleatorio com dez mil posicoes");
		long start27 = System.nanoTime();
		System.out.println("Quantidade de Comparacoes: " + ss.selectionSort(e3)[0]);
		long end27 = System.nanoTime();
		System.out.println("Quantidade de Trocas: " + ss.selectionSort(e3)[1]);
		System.out.println("Tempo de execucao: " + (end27 - start27) + " nanosegundos\n");

		System.out.println("Array aleatorio com cem mil posicoes");
		long start28 = System.nanoTime();
		System.out.println("Quantidade de Comparacoes: " + ss.selectionSort(e4)[0]);
		long end28 = System.nanoTime();
		System.out.println("Quantidade de Trocas: " + ss.selectionSort(e4)[1]);
		System.out.println("Tempo de execucao: " + (end28 - start28) + " nanosegundos\n");

		System.out.println("Array invertido com dez mil posicoes");
		long start29 = System.nanoTime();
		System.out.println("Quantidade de Comparacoes: " + ss.selectionSort(e5)[0]);
		long end29 = System.nanoTime();
		System.out.println("Quantidade de Trocas: " + ss.selectionSort(e5)[1]);
		System.out.println("Tempo de execucao: " + (end29 - start29) + " nanosegundos\n");

		System.out.println("Array invertido com cem mil posicoes");
		long start30 = System.nanoTime();
		System.out.println("Quantidade de Comparacoes: " + ss.selectionSort(e6)[0]);
		long end30 = System.nanoTime();
		System.out.println("Quantidade de Trocas: " + ss.selectionSort(e6)[1]);
		System.out.println("Tempo de execucao: " + (end30 - start30) + " nanosegundos\n");

		InsertionSort is = new InsertionSort();

		int[] b1 = a.arrayEmOrdemDezMilPosicoes();
		int[] b2 = a.arrayEmOrdemCemMilPosicoes();

		int[] b3 = a.arrayAleatorioDezMilPosicoes();
		int[] b4 = a.arrayAleatorioCemMilPosicoes();

		int[] b5 = a.arrayInvertidoDezMilPosicoes();
		int[] b6 = a.arrayInvertidoCemMilPosicoes();

		System.out.println("Insertion Sort\n");

		System.out.println("Array em ordem com dez mil posicoes");
		long start7 = System.nanoTime();
		System.out.println("Quantidade de Comparacoes: " + is.insertionSort(b1)[0]);
		long end7 = System.nanoTime();
		System.out.println("Quantidade de Trocas: " + is.insertionSort(b1)[1]);
		System.out.println("Tempo de execucao: " + (end7 - start7) + " nanosegundos\n");

		System.out.println("Array em ordem com cem mil posicoes");
		long start8 = System.nanoTime();
		System.out.println("Quantidade de Comparacoes: " + is.insertionSort(b2)[0]);
		long end8 = System.nanoTime();
		System.out.println("Quantidade de Trocas: " + is.insertionSort(b2)[1]);
		System.out.println("Tempo de execucao: " + (end8 - start8) + " nanosegundos\n");

		System.out.println("Array aleatorio com dez mil posicoes");
		long start9 = System.nanoTime();
		System.out.println("Quantidade de Comparacoes: " + is.insertionSort(b3)[0]);
		long end9 = System.nanoTime();
		System.out.println("Quantidade de Trocas: " + is.insertionSort(b3)[1]);
		System.out.println("Tempo de execucao: " + (end9 - start9) + " nanosegundos\n");

		System.out.println("Array aleatorio com cem mil posicoes");
		long start10 = System.nanoTime();
		System.out.println("Quantidade de Comparacoes: " + is.insertionSort(b4)[0]);
		long end10 = System.nanoTime();
		System.out.println("Quantidade de Trocas: " + is.insertionSort(b4)[1]);
		System.out.println("Tempo de execucao: " + (end10 - start10) + " nanosegundos\n");

		System.out.println("Array invertido com dez mil posicoes");
		long start11 = System.nanoTime();
		System.out.println("Quantidade de Comparacoes: " + is.insertionSort(b5)[0]);
		long end11 = System.nanoTime();
		System.out.println("Quantidade de Trocas: " + is.insertionSort(b5)[1]);
		System.out.println("Tempo de execucao: " + (end11 - start11) + " nanosegundos\n");

		System.out.println("Array invertido com cem mil posicoes");
		long start12 = System.nanoTime();
		System.out.println("Quantidade de Comparacoes: " + is.insertionSort(b6)[0]);
		long end12 = System.nanoTime();
		System.out.println("Quantidade de Trocas: " + is.insertionSort(b6)[1]);
		System.out.println("Tempo de execucao: " + (end12 - start12) + " nanosegundos\n");

		MergeSort ms = new MergeSort();

		int[] c1 = a.arrayEmOrdemDezMilPosicoes();
		int[] c2 = a.arrayEmOrdemCemMilPosicoes();

		int[] c3 = a.arrayAleatorioDezMilPosicoes();
		int[] c4 = a.arrayAleatorioCemMilPosicoes();

		int[] c5 = a.arrayInvertidoDezMilPosicoes();
		int[] c6 = a.arrayInvertidoCemMilPosicoes();

		System.out.println("Merge Sort\n");

		System.out.println("Array em ordem com dez mil posicoes");
		long start13 = System.nanoTime();
		ms.sort(c1, 0, c1.length - 1);
		long end13 = System.nanoTime();
		System.out.println("Quantidade de Comparacoes: " + MergeSort.count);
		System.out.println("Quantidade de Trocas: ");
		System.out.println("Tempo de execucao: " + (end13 - start13) + " nanosegundos\n");

		System.out.println("Array em ordem com cem mil posicoes");
		long start14 = System.nanoTime();
		ms.sort(c2, 0, c2.length - 1);
		long end14 = System.nanoTime();
		System.out.println("Quantidade de Comparacoes: " + MergeSort.count);
		System.out.println("Quantidade de Trocas: ");
		System.out.println("Tempo de execucao: " + (end14 - start14) + " nanosegundos\n");

		System.out.println("Array aleatorio com dez mil posicoes");
		long start15 = System.nanoTime();
		ms.sort(c3, 0, c3.length - 1);
		long end15 = System.nanoTime();
		System.out.println("Quantidade de Comparacoes: " + MergeSort.count);
		System.out.println("Quantidade de Trocas: ");
		System.out.println("Tempo de execucao: " + (end15 - start15) + " nanosegundos\n");

		System.out.println("Array aleatorio com cem mil posicoes");
		long start16 = System.nanoTime();
		ms.sort(c4, 0, c4.length - 1);
		long end16 = System.nanoTime();
		System.out.println("Quantidade de Comparacoes: " + MergeSort.count);
		System.out.println("Quantidade de Trocas: ");
		System.out.println("Tempo de execucao: " + (end16 - start16) + " nanosegundos\n");

		System.out.println("Array invertido com dez mil posicoes");
		long start17 = System.nanoTime();
		ms.sort(c5, 0, c5.length - 1);
		long end17 = System.nanoTime();
		System.out.println("Quantidade de Comparacoes: " + MergeSort.count);
		System.out.println("Quantidade de Trocas: ");
		System.out.println("Tempo de execucao: " + (end17 - start17) + " nanosegundos\n");

		System.out.println("Array invertido com cem mil posicoes");
		long start18 = System.nanoTime();
		ms.sort(c6, 0, c6.length - 1);
		long end18 = System.nanoTime();
		System.out.println("Quantidade de Comparacoes: " + MergeSort.count);
		System.out.println("Quantidade de Trocas: ");
		System.out.println("Tempo de execucao: " + (end18 - start18) + " nanosegundos\n");

		QuickSort qs = new QuickSort();

		int[] d1 = a.arrayEmOrdemDezMilPosicoes();

		int[] d3 = a.arrayAleatorioDezMilPosicoes();

		int[] d5 = a.arrayInvertidoDezMilPosicoes();

		System.out.println("Quick Sort\n");

		System.out.println("Array em ordem com dez mil posicoes");
		long start19 = System.nanoTime();
		qs.quickSort(d1, 0, 9999);
		long end19 = System.nanoTime();
		System.out.println("Quantidade de Comparacoes: " + QuickSort.count);
		System.out.println("Quantidade de Trocas: ");
		System.out.println("Tempo de execucao: " + (end19 - start19) + " nanosegundos\n");

		System.out.println("Array aleatorio com dez mil posicoes");
		long start21 = System.nanoTime();
		qs.quickSort(d3, 0, 9999);
		long end21 = System.nanoTime();
		System.out.println("Quantidade de Comparacoes: " + QuickSort.count);
		System.out.println("Quantidade de Trocas: ");
		System.out.println("Tempo de execucao: " + (end21 - start21) + " nanosegundos\n");

		System.out.println("Array invertido com dez mil posicoes");
		long start23 = System.nanoTime();
		qs.quickSort(d5, 0, 9999);
		long end23 = System.nanoTime();
		System.out.println("Quantidade de Comparacoes: " + QuickSort.count);
		System.out.println("Quantidade de Trocas: ");
		System.out.println("Tempo de execucao: " + (end23 - start23) + " nanosegundos\n");

	}

}
