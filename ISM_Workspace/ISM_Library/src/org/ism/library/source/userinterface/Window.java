package org.ism.library.source.userinterface;

import java.awt.Color;

import javax.swing.JFrame;

public class Window {
	
	private static int Width; // the width of the window
	private static int Height; // the height of the window
	
	private static String Title;
	
	private static boolean Visible;
	private static boolean Resizable;
	
	/*
	 * Set the width equal to the width
	 * Note: needs an int for the width
	 * 
	 * For Example:
	 * setWidth(1920); set the width of the window to 1920 pixels
	 */
	public void setWidth(int width){
		this.Width = width;
	}
	
	/*
	 * Set the height equal to the height
	 * Note: needs an int for the height
	 * 
	 * For Example
	 * setHeight(1080); set the height of the window to 1080 pixels
	 */
	public void setHeight(int height){
		this.Height = height;
	}
}
