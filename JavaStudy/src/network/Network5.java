package network;

import com.ggoreb.kakao_api.TranslateUtil;

public class Network5 {
	public static void main(String[] args) {
		
		TranslateUtil tu = new TranslateUtil("3e2a3f957517ab9615f511fd550d781d");
		String r = tu.sendText("kr", "jp", "안녕하세요 저는 개발자입니다");
		System.out.println(r);
		
	
//		VisionUtil vu = new VisionUtil("3e2a3f957517ab9615f511fd550d781d");
//		String result = vu.sendFile("c:/dev/B.jpg");
//		System.out.println(result);
		
	}
}
