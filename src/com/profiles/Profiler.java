/*
 *  File: Profiler.java
 *  Author: Ashish Chopra
 *  Date Modified: 20 June 2013
 *  -----------------------------------------------
 *  Profiler is an abstraction of Profiling API used by
 *  different data structures under consideration to collect
 *  their method profiles.
 *  
 *  
 */
package com.profiles;

/**
 * Profiler is used to accumulate method profiles for a 
 * registered class. Also, it provides an option to enable or
 * disable profiler any time during the execution.
 * 
 * @author Ashish Chopra
 * @version 1.0
 */
public class Profiler {

	private static boolean isEnabled = true;
	
	public Profiler getProfiler(String className) {
		return null;
	}
	
	public static boolean enable() {
		isEnabled = true;
		return isEnabled;
	}
	
	public boolean disable() {
		isEnabled = false;
		return isEnabled;
	}
	
	private static boolean isEnabled() {
		return isEnabled;
	}
	public void log(String sourceClass, String sourceMethod, String level, String data) {
		if (!isEnabled()) return;
	}
	
	public String export(String sourceClass) {
		if (!isEnabled()) return null;
		return null;
	}
}
