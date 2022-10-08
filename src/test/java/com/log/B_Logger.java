package com.log;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class B_Logger {
public static Logger log = Logger.getLogger(B_Logger.class);
	
	public static void main(String[] args) {
	BasicConfigurator.configure();
	
		log.debug("debug");
		log.info("informaton");
		log.warn("warning");
		log.error("error");
		log.fatal("fatal");

}
