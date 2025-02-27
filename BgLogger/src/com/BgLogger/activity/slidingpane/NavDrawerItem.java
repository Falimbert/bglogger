package com.BgLogger.activity.slidingpane;

public class NavDrawerItem {

	private String title;
	private int icon;

	// boolean to set visiblity of the counter
	private boolean isCounterVisible = false;

	public NavDrawerItem(String title, int icon) {
		this.title = title;
		this.icon = icon;
	}

	public String getTitle() {
		return this.title;
	}

	public int getIcon() {
		return this.icon;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setIcon(int icon) {
		this.icon = icon;
	}

}