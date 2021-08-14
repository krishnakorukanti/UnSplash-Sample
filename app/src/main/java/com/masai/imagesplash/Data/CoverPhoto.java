package com.masai.imagesplash.Data;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class CoverPhoto{

	@SerializedName("current_user_collections")
	private List<Object> currentUserCollections;

	@SerializedName("color")
	private String color;

	@SerializedName("sponsorship")
	private Object sponsorship;

	@SerializedName("created_at")
	private String createdAt;

	@SerializedName("description")
	private String description;

	@SerializedName("liked_by_user")
	private boolean likedByUser;

	@SerializedName("urls")
	private Urls urls;

	@SerializedName("alt_description")
	private String altDescription;

	@SerializedName("updated_at")
	private String updatedAt;

	@SerializedName("width")
	private int width;

	@SerializedName("blur_hash")
	private String blurHash;

	@SerializedName("links")
	private Links links;

	@SerializedName("id")
	private String id;

	@SerializedName("categories")
	private List<Object> categories;

	@SerializedName("promoted_at")
	private String promotedAt;

	@SerializedName("user")
	private User user;

	@SerializedName("height")
	private int height;

	@SerializedName("likes")
	private int likes;

	public List<Object> getCurrentUserCollections(){
		return currentUserCollections;
	}

	public String getColor(){
		return color;
	}

	public Object getSponsorship(){
		return sponsorship;
	}

	public String getCreatedAt(){
		return createdAt;
	}

	public String getDescription(){
		return description;
	}

	public boolean isLikedByUser(){
		return likedByUser;
	}

	public Urls getUrls(){
		return urls;
	}

	public String getAltDescription(){
		return altDescription;
	}

	public String getUpdatedAt(){
		return updatedAt;
	}

	public int getWidth(){
		return width;
	}

	public String getBlurHash(){
		return blurHash;
	}

	public Links getLinks(){
		return links;
	}

	public String getId(){
		return id;
	}

	public List<Object> getCategories(){
		return categories;
	}

	public String getPromotedAt(){
		return promotedAt;
	}

	public User getUser(){
		return user;
	}

	public int getHeight(){
		return height;
	}

	public int getLikes(){
		return likes;
	}

	@Override
 	public String toString(){
		return 
			"CoverPhoto{" + 
			"current_user_collections = '" + currentUserCollections + '\'' + 
			",color = '" + color + '\'' + 
			",sponsorship = '" + sponsorship + '\'' + 
			",created_at = '" + createdAt + '\'' + 
			",description = '" + description + '\'' + 
			",liked_by_user = '" + likedByUser + '\'' + 
			",urls = '" + urls + '\'' + 
			",alt_description = '" + altDescription + '\'' + 
			",updated_at = '" + updatedAt + '\'' + 
			",width = '" + width + '\'' + 
			",blur_hash = '" + blurHash + '\'' + 
			",links = '" + links + '\'' + 
			",id = '" + id + '\'' + 
			",categories = '" + categories + '\'' + 
			",promoted_at = '" + promotedAt + '\'' + 
			",user = '" + user + '\'' + 
			",height = '" + height + '\'' + 
			",likes = '" + likes + '\'' + 
			"}";
		}
}