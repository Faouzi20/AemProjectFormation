package com.aemprojectone.aemprojectone.core;
import java.util.ArrayList;
import java.util.List;

import org.apache.sling.api.resource.Resource;
import com.adobe.cq.sightly.WCMUsePojo;
import com.day.cq.wcm.api.Page;
import com.day.durbo.DurboInput.Node;

public class MyComponent extends WCMUsePojo {
	private String myTitle;
	private String text;
	private String textfield;
	private String pathTitle;
	private String typeText;
	private String pathbrowser;
	private String titleComp;
	private String color;
	private String pageParent;

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
	public String getPageParent() {
		return pageParent;
	}
	
}