package ch12;

public class IndexOf {
	public static void main(String[] args) {

		String str = " Java 개발자 양성을 통한 취업연계과정!!";
//		int idx = str.indexOf(" ");
//		System.out.println(idx);

		int idx = -1;
		
		while (true) {
			idx = str.indexOf(" ", idx + 1);
			if (idx == -1) {
				break;
			}
			System.out.println(idx);
		}

//	 idx = str.indexOf(" ", idx + 1);
//	 System.out.println(idx);
//	 
//	 idx = str.indexOf(" ", idx + 1);
//	 System.out.println(idx);
//	 
//	 idx = str.indexOf(" ", idx + 1);
//	 System.out.println(idx);
//
//	 idx = str.indexOf(" ", idx + 1);
//	 System.out.println(idx);

//		int idx2 = str.lastIndexOf(" ");
//		System.out.println(idx2);
//
//		idx2 = str.lastIndexOf(" ", idx2 - 1);
//		System.out.println(idx2);

	}
}
