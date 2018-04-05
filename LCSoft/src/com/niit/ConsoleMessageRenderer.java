package com.niit;

public class ConsoleMessageRenderer implements MessageRenderer {

	MessageProvider messageProvider;
	@Override
	public void setMessageProvider(MessageProvider messageProvider) {
		// TODO Auto-generated method stub
		this.messageProvider=messageProvider;
	}

	@Override
	public void render() {
		// TODO Auto-generated method stub
		
		System.out.println(messageProvider.getMessage());
		
	}

}
