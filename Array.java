import java.util.*;
class Array{
	public static void main(String args[]){
	
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Enter size:");
		int size = sc.nextInt();
		int a[] = new int[size];
		
		//int a[] = {88,22,11};
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		for(int i=0;i<size;i++){
		   //System.out.println(a[i]);
		   a[i]=sc.nextInt();
		}
		
		for(int i=0;i<size;i++){
		   System.out.println(a[i]);
		   //a[i]=sc.nextInt();
		}
		*/
		
		
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		int[][] arr = new int[row][col];
		
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				arr[i][j]=sc.nextInt();
			}
		}
		
		int n = sc.nextInt();
		
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				if(arr[i][j] == n){
					System.out.println(i+" " +j);
				}
			}
		}
	}
}