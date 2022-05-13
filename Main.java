/****************************************
Bubble Sort 
It will check the adjacent / next element to see if they are in order if not the element will switch. 
It will continue to do this process until the dataset is in order 
Bubble sort is not the very efficient 

Time Complexity 
O(n^2) - The larger the data set the more ineffecient the algorithm will be 
*/

class Main {
  public static void main(String[] args) {

		int[] array = {6, 5, 3, 2, 0, 8, 7, 4, 1 };

		bubbleSort(array);

		for(int i : array){
			System.out.print(i);
		}

  }

	public static void bubbleSort(int[] array){
		for(int i = 0; i < array.length -1; i++){
			for(int j = 0; j < array.length -i -1; j++){
				if(array[j] > array[j + 1]){
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp; 
				}
			}
		}
	}
}


/* Working 

{6, 5, 3, 2, 0};

public static void bubbleSort(int[] array){
	for(int i = 0; i < array.length -1; i++){
		for(int j = 0; j < array.length -i -1; j++){
			if(array[j] > array[j + 1]){
				int temp = array[j];
				array[j] = array[j+1];
				array[j+1] = temp; 

{6, 5, 3, 2, 0};
for(int i = 0; i < array.length -1; i++)

for(i = 0; i < 4; i++){
	for(j = 0; j < 4 -i (0) - 1; j++){
	for(j = 0; j < 4 - 0 - 1; j++){
	for(j = 0; j < 3; j++){

		if(array[j] > array[j + 1]){
		if(array[0] > array[1])
		if(6 > 5) 

		int temp = array[j];
		int temp = 6 
		
		array[j] = array[j+1];
		array[0] = array[1]
		array[0] = 5 

	  array[j+1] = temp; 
		array[1] = 6; 

{5, 6, 3, 2, 0};
for(j = 1; j < 3; j++){

		if(array[j] > array[j + 1]){
		if(array[1] > array[1 + 1]){
		if(array[1] > array[2]){
		if(6 > 3)

		int temp = array[j];
		int temp = 6 

		array[j] = array[j+1];
		array[1] = array[1+1];
		array[1] = array[2];
		array[1] = 3 

	  array[j+1] = temp; 
	  array[2] = 6; 

{5, 3, 6, 2, 0};
for(j = 2; j < 3; j++){

		if(array[j] > array[j + 1]){
		if(array[2] > array[2 + 1]){
		if(array[2] > array[3]){

















	



*/
