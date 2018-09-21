
/**
 * Auto Generated Java Class.
 */
public class Lab4 {
  
  
  
	
  public static void main(String[] args) { 
	
	int[] anArray = {2, 4, 7, 3, 9};
    System.out.println(Arrays.toString(sorted(anArray)));
  }
  
  public static int[] sorted(int[] array)
  {
	  //int temp;
     
	 for (int i = 0; i < array.length; i++)
	 {
		 for (int j = 0; j < array.length; j++)
		 {
			 int temp = 0;
			 if(array[i] < array[j])
			 {
				 temp = array[j];
				 array[j] = array[i];
				 array[i] = temp;
			 }
		 }
	 }
	 return array;
  }
  
  
  
}
