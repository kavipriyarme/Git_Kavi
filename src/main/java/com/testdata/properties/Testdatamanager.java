package com.testdata.properties;

public class Testdatamanager {
	
	private Testdatamanager() {

}
public static Testdatamanager get_InstanceTDM() {
	//get instance for the current class
	Testdatamanager manager = new Testdatamanager();
	return manager;
}

public Test_Data_Reader get_InstanceTDR() {
	//get instance for the other Test_data_reader class
	Test_Data_Reader reader = new Test_Data_Reader();
	return reader;
			}
}