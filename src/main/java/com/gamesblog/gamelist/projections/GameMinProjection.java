package com.gamesblog.gamelist.projections;

public interface GameMinProjection {

	Long getId();
	String getTitle();
	String getImgURL();
	String getShortDescription();
	Integer getYear();
	Integer getPosition();
}
