package com.masai.imagesplash.Data;

import com.google.gson.annotations.SerializedName;

public class Ancestry{

	@SerializedName("type")
	private Type type;

	@SerializedName("category")
	private Category category;

	public Type getType(){
		return type;
	}

	public Category getCategory(){
		return category;
	}

	@Override
 	public String toString(){
		return 
			"Ancestry{" + 
			"type = '" + type + '\'' + 
			",category = '" + category + '\'' + 
			"}";
		}
}