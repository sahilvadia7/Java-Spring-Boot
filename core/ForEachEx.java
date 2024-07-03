package core;
import java.util.Scanner;
public class ForEachEx {

	static int[] nums;
	static int size,numsLength;
	
	public ForEachEx(int size,int numsLength) {
		nums = new int[numsLength];
		this.size = size;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array : ");
		numsLength = sc.nextInt();
		
		System.out.print("Enter use of array : ");
		
		try {
			size = sc.nextInt();
		}
		catch(ArithmeticException e	) {
			System.out.println("Excecption : "+e);
		}
		ForEachEx fex = new ForEachEx(size,numsLength);
		
		for(int i=0; i<size; i++) {
			System.out.print("Enter array element:  ");
			nums[i] = sc.nextInt();
		}
		
		for(int x:nums) {
			System.out.println(x+" ");
		}
		
		
	}

}
