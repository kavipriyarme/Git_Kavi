package com.log;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class P_Logger {
	public static Logger log = Logger.getLogger(P_Logger.class);
	public static void main(String[] args) {
		PropertyConfigurator.configure("log4j.properties");
		log.debug("Debug");
		log.info("information");
		log.warn("Warning");
		log.error("error");
		log.fatal("fatal");
	}

}
