package core.Arrays;

import java.util.Scanner;

 class QueDemo{
	int que[];
	int putloc,getloc,size,count;
	boolean flag;
	
	QueDemo(int size){
			que = new int [size];
			putloc = getloc = count = 0 ;
			this.flag = flag;
	}
	
	void put(int i) {
		if(putloc==que.length) {
			flag=false;
			check(flag);
			
			return;
		}
		que[putloc++] = i;
	}
	
	

	int get() {
		if(getloc == putloc) {
			flag= true;
			check(flag);
			
			return 0;
		}
		return que[getloc++];
	}
	
	private void check(boolean flag2) {
		// TODO Auto-generated method stub
		count++;
		
		if(flag == true) {
			System.out.println("Queue is empty " + count);
		}
		else {
			System.out.println("Queue is full " + count);
		}
	
		
	}
		
}


 public class Queue{
	
	static int size,element,data,userin;
	static boolean flag;

	Queue(int size,int element,int data,int userin){
		this.size = size;
		this.element = element;
		this.data = data;
		this.flag = flag;
		this.userin = userin;
	}
	
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Enter size of Queue: ");
			size = sc.nextInt();
			
			QueDemo bigQ = new QueDemo(size);
			
			System.out.print("How many element want to enter in Queue: ");
			userin = sc.nextInt();
			
			
			for(int i=0; i<userin; i++) {
				System.out.print("Enter Element in Queue: ");
				element =sc.nextInt();
				bigQ.put(element);
			}
			
			
			for(int i=0; i<size; i++) {
				data = bigQ.get();
				if(data != 0) {
					System.out.println(data);
				}
				
			}


			
		}
}
