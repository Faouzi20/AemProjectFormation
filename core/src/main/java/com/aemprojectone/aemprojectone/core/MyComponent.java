package com.aemprojectone.aemprojectone.core;

import com.adobe.cq.sightly.WCMUsePojo;


public class MyComponent extends WCMUsePojo {
	private String myTitle;
	private String text;
	private String pathTitle;
	private String typeText;
	
	

	@Override
	public void activate() {
		myTitle = "My Project " + getCurrentPage().getTitle();
		text =  (String) getProperties().get("text", "toto");
		pathTitle = getProperties().get("pathbrowser", "test");
		typeText = getProperties().get("type", "size");
	}
	
	public String getMyTitle() {
		return myTitle;
	}
	
	public String getText() {
		return text;
	}

	public String getPathTitle() {
		return pathTitle;
	}
	
	public String getTypeText() {
		return typeText;
	}
	
}