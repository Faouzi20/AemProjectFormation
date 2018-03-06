package com.aemprojectone.aemprojectone.core;

import javax.jcr.Node;
import javax.jcr.PathNotFoundException;
import javax.jcr.RepositoryException;
import javax.jcr.ValueFormatException;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;
import org.slf4j.Logger;

import com.adobe.cq.sightly.WCMUsePojo;
import com.adobe.cq.social.calendar.client.api.Page;


public class MyComponent extends WCMUsePojo {
	private String myTitle;
	private String text;
	private String textfield;
	private String pathTitle;
	private String typeText;
	private String pathbrowser;
	private String titleComp;
	private String color;

	@Override
	public void activate() {
		myTitle = "My Project " + getCurrentPage().getTitle();
		text =  (String) getProperties().get("text", "toto");
		pathTitle = getProperties().get("pathbrowser", "test");
		typeText = getProperties().get("type", "size");
		pathbrowser = getProperties().get("pathbrowser", "size");
		textfield =  (String) getProperties().get("textcolor", "default text");
		color =  (String) getProperties().get("color", "black");
		
		Resource pageResource = getResourceResolver().getResource(pathbrowser);
		titleComp = pageResource.getValueMap().get("jcr:title", String.class);		

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

	public String getPathbrowser() {
		return pathbrowser;
	}

	public String getTitleComp() {
		return titleComp;
	}

	public String getTextfield() {
		return textfield;
	}

	public String getColor() {
		return color;
	}
	
	
}