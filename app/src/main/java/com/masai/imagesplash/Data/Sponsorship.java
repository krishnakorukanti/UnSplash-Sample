package com.masai.imagesplash.Data;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Sponsorship{

	@SerializedName("sponsor")
	private Sponsor sponsor;

	@SerializedName("tagline_url")
	private String taglineUrl;

	@SerializedName("tagline")
	private String tagline;

	@SerializedName("impression_urls")
	private List<Object> impressionUrls;

	public Sponsor getSponsor(){
		return sponsor;
	}

	public String getTaglineUrl(){
		return taglineUrl;
	}

	public String getTagline(){
		return tagline;
	}

	public List<Object> getImpressionUrls(){
		return impressionUrls;
	}

	@Override
 	public String toString(){
		return 
			"Sponsorship{" + 
			"sponsor = '" + sponsor + '\'' + 
			",tagline_url = '" + taglineUrl + '\'' + 
			",tagline = '" + tagline + '\'' + 
			",impression_urls = '" + impressionUrls + '\'' + 
			"}";
		}
}