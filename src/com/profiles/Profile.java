/*
 *  File: Profile.java
 *  Author: Ashish Chopra
 *  Date Modified: 20 June 2013
 *  -----------------------------------------------
 *  Profile is an abstraction of Profiling API used by
 *  different data structures under consideration to collect
 *  their profiling data.
 */
package com.profiles;

/**
 * Profile is an abstract class that provides a set of APIs 
 * to collect profiling data from any data structure 
 * inherited from it.
 * @author Ashish Chopra
 * @version 1.0
 */
public abstract class Profile {

	/**
	 * logs the information to the internal storage.
	 * @param x input information
	 * @param y output corresponding to input info.
	 */
	public void record(String x, String y) {
		
	}
	
	/**
	 * detects whether profiling is enabled.
	 * @return <code>true</code> if profiling is on,
	 *         <code>false</code> otherwise.
	 */
	public boolean isProfileEnabled() {
		return false;
	}
	
	/**
	 * turns on or off the profiling process for the object.
	 * @param flag <code>true</code> if set to on, <code>false</code>
	 * 			   otherwise.
	 */
	public void setProfiling(boolean flag) {
		
	}
	
	/**
	 * exports the profiling records collected until 
	 * the last export call.
	 * @return recorded profile data as <code>String</code>
	 */
	public String export() {
		return null;
	}
	
}
