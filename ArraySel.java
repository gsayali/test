package SelectionSort;

public class ArraySel {
	
	private long[] array;
	private int nElems;
	
	ArraySel(int max){
		array = new long[max];
		nElems = 0;
	}
	
	//insert
	
	public void insert(long value) {
		array[nElems] = value;
		nElems++;
	}
	
	//display
	
	public void display() {
		/*
		 * for(long a : array) { System.out.print(a+" "); }
		 */
		
		for(int i =0;i<nElems;i++) {
			System.out.print(array[i]+" ");
		}
		
		System.out.println();
	}
	
	//Selection Sort
	
	public void selectionSort() {
		
		int in, out, min;
		
		for(out=0; out < nElems;out++) {
			
			min= out;
			
			for(in=out+1; in < nElems;in++) {
				if(array[in] < array[min]) {
					min = in;
					swap(out,min);
				}
			}
		}
	}
	
	public void swap(int one, int two) {
		
		long temp = array[one];
		array[one] = array[two];
		array[two] = temp;
		
	}

}
