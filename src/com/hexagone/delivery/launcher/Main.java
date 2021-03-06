package com.hexagone.delivery.launcher;

import com.hexagone.delivery.control.Controller;

/**
 * This class manages the launch of the application. Starting point of the
 * executable.
 */
public class Main {

	/**
	 * Launching of the application. No parameters.
	 * @param args no parameters needed
	 */
	public static void main(String[] args) {
		Controller c = new Controller();
		c.launch();
	}
}