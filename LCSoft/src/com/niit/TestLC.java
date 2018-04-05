package com.niit;

public class TestLC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1 mP
		
		MessageProvider mp=new ErrorMessageProvider();
		
		//2 mr
		MessageRenderer mr=new ConsoleMessageRenderer();
		
		
		mr.setMessageProvider(mp);
		
		
		mr.render();
		
	}

}
