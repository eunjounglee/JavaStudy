package ch05;

public class ArrayExam6 {
	public static void main(String[] args) {
		 int[][] arr = {
		 {1, 2},
		 {4, 5, 6},
		 {7, 8, 9, 19},
		 {10, 11, 12}
		 };

//		 System.out.println(arr[1][1]);
//		 System.out.println(arr[2][2] + "\t");
//		
//		 int len1 = arr.length;
//		 int len2 = arr[1].length;
		
		 for(int i = 0; i < arr.length; i ++) {
			 for(int j = 0; j < arr[i].length; j ++) {
				 System.out.println(arr[i][j]);
			 }
			 
//		 }
//		 }
//		 for(int[] tempArr : arr) {
//		 for(int temp : tempArr) {
//		 System.out.print(temp + " ");
//		 }
//		 System.out.println();
//		 }
		 }
	}
}
