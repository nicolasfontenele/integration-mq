package com.bnb.util;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Util {
	
	public static final Logger logger = Logger.getLogger("com.bnb");

	
	public static void info(String info)
	{
		logger.log(Level.INFO, info);
	}
	
	public static void warn(String warning)
	{
		logger.log(Level.WARNING, warning);
	}
	
	public static void severe(String severe)
	{
		logger.log(Level.WARNING, severe);
	}
	
	
	

}
