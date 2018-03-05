package com.aemprojectone.aemprojectone.core;

import com.adobe.cq.sightly.WCMUsePojo;


public class MyComponent extends WCMUsePojo {
	private String myTitle;
	private String text;
	
	@Override
	public void activate() {
		myTitle = "My Project " + getCurrentPage().getTitle();
		text =  (String) getProperties().get("text", "toto");
		}
	public String getMyTitle() {
		return myTitle;
		}
	public String getText() {
		return text;
	}
	
	}