
public class TimerTest {

	public static void printInt(int input) {
		System.out.println(input);
	}
	
	public static int[][] array = new int[][] {
		{0,1},
		{2,3},
		{4,5},
		{6,7},
		{8,9},
		{0,1},
		{2,3},
		{4,5},
		{6,7},
		{8,9},
		{0,1},
		{2,3},
		{4,5},
		{6,7},
		{8,9},
		{0,1},
		{2,3},
		{4,5},
		{6,7},
		{8,9},
		{0,1},
		{2,3},
		{4,5},
		{6,7},
		{8,9}
	};
	
	public static void main(String[] args) {
		
		for(int i = 0; i < array.length; i++) {
			printInt(array[i][1]);
			try        
			{
			    Thread.sleep(100);
			} 
			catch(InterruptedException ex) 
			{
			    Thread.currentThread().interrupt();
			}
		}

	}

}
