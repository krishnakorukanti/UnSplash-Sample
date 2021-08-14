package com.masai.imagesplash.Data;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class UnSplashResponse{

	@SerializedName("total")
	private int total;

	@SerializedName("total_pages")
	private int totalPages;

	@SerializedName("results")
	private List<ResultsItem> results;

	public int getTotal(){
		return total;
	}

	public int getTotalPages(){
		return totalPages;
	}

	public List<ResultsItem> getResults(){
		return results;
	}

	@Override
 	public String toString(){
		return 
			"UnSplashResponse{" + 
			"total = '" + total + '\'' + 
			",total_pages = '" + totalPages + '\'' + 
			",results = '" + results + '\'' + 
			"}";
		}
}