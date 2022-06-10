package com.citiustech.Loader;

import java.beans.Customizer;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.citiustech.Complaint.ComplaintObj;

public class ComplaintLoader {

	public static  void ReadData() throws FileNotFoundException {

		
		List<ComplaintObj> custList=getCustDetails("C:\\Users\\BharatiV\\Documents\\ComplaintProject\\complaints.csv");
				for(ComplaintObj complaint:custList){
					System.out.println(complaint);
				}

}

	private static List<ComplaintObj> getCustDetails(String file) {
		List<ComplaintObj> custList =null;
		Path pathToFile=Paths.get(file);
		try{
			BufferedReader br=Files.newBufferedReader(pathToFile);
			String row=br.readLine();
			while(row!=null){
				String[] attributes=row.split(",");
				ComplaintObj complaint=getAllDetails(attributes);
				custList.add(complaint);
				row=br.readLine();
			}
		}catch(IOException e)
		{
			e.printStackTrace();
		}
		return custList;
		
	}

	private static ComplaintObj getAllDetails(String[] attributes) {
		String dateRecieved=attributes[1];
		String Product=attributes[2];
		String Subproduct=attributes[3];
		String Issue=attributes[4];
		String Subissue=attributes[5];
		String Company=attributes[6];
		String State=attributes[7];
		int ZIPcode=Integer.parseInt(attributes[8]);
		String Submittedvia=attributes[9];
		String Dateclosed=attributes[10];
		String CompanyResponseToConsumer=attributes[11];
		String TimelyResponse=attributes[12];
		String ConsumerDisputed =attributes[13];
		int ComplaintID=Integer.parseInt(attributes[14]);
		ComplaintObj complaint=new ComplaintObj(dateRecieved,  Product,  Subproduct,  Issue,  Subissue,
				 Company,  State,  ZIPcode,  Submittedvia,  Dateclosed,
				 CompanyResponseToConsumer,  TimelyResponse,  ConsumerDisputed,  ComplaintID);
		return complaint;
		
	}
	
}
