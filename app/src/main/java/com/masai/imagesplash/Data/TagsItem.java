package com.masai.imagesplash.Data;

import com.google.gson.annotations.SerializedName;

public class TagsItem{

	@SerializedName("type")
	private String type;

	@SerializedName("title")
	private String title;

	@SerializedName("source")
	private Source source;

	public String getType(){
		return type;
	}

	public String getTitle(){
		return title;
	}

	public Source getSource(){
		return source;
	}

	@Override
 	public String toString(){
		return 
			"TagsItem{" + 
			"type = '" + type + '\'' + 
			",title = '" + title + '\'' + 
			",source = '" + source + '\'' + 
			"}";
		}
}