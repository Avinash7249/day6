package Question3;

public class Main{
public int[] findAndReturnPrimeNumbers(int[] inputArray){

	int[] arr1= new int[inputArray.length];
	
	for(int i=0;i<inputArray.length;i++) {
		int c=0;
		int a=inputArray[i];
		for(int j=1;j<=a;j++){
		if(a%j==0) {
			c++;}};
			if(c<=2) {
				arr1[i]=inputArray[i];
			}else {
				arr1[i]=0;
			}
	}
	return arr1;
			
}
		public static void main(String[] args){
		
			Main ma=new Main();
		int[] arr = {10,12,5,50,11,14,15};
		int[] array=ma.findAndReturnPrimeNumbers(arr);
		//System.out.println(array);
		for(int i=0;i<array.length;i++) {
			if(array[i]==0) {
				System.out.println("Prime number not found in the supplied Array");
			}else {
				System.out.println(array[i]);
			}
		}

}
}
