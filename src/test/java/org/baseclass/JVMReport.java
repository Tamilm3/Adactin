package org.baseclass;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport {
	public static void JVMReportGeneration(String jsonpath) {

		File f=new File(System.getProperty("user.dir")+"\\target\\JVMreport");
		
		Configuration con=new Configuration(f, "Facebook");
		con.addClassifications("platform name", "Windows 10");
		con.addClassifications("Browser used", "Chrome");
		con.addClassifications("Browser Version", "100.0.4896.127");
		con.addClassifications("Current Sprint no", "4");
		
		List<String> li=new ArrayList<String>();
		li.add(jsonpath);
		
		ReportBuilder r=new ReportBuilder(li, con);
		r.generateReports();
	}
}
