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
	private String pathTitle;
	private String typeText;
	private String pathbrowser;
	private String titleComp;
	private ResourceResolver resourceResolver;

	@Override
	public void activate() {
		myTitle = "My Project " + getCurrentPage().getTitle();
		text =  (String) getProperties().get("text", "toto");
		pathTitle = getProperties().get("pathbrowser", "test");
		typeText = getProperties().get("type", "size");
		pathbrowser = getProperties().get("pathbrowser", "size");
		
		Resource pageResource = getResourceResolver().getResource(pathbrowser);
		//titleComp = pageResource.getName();
		titleComp = pageResource.getValueMap().get("jcr:title", String.class);		
		/*ResourceResolver resourceResolver = getResourceResolver();
	    Resource res = resourceResolver.getResource(pathbrowser);
		Node node = resourceResolver.adaptTo(Node.class);*/
		//Node node = pageResource.adaptTo(Node.class);
		//Node node = pageResource.adaptTo(Node.class);
		//titleComp = node.getPath();
		//titleComp = resourceResolver.getResource(pathbrowser).getName();
		//Node node = resourceResolver.getResource(pathbrowser).adaptTo(Node.class);
		//titleComp = node.hasProperty("title") ? node.getProperty("title").getString() : "default title";
		//titleComp = "Default";
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
	
}