package com.filehandling;

import java.io.File;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.*;


public class ReadWriteAppend {
	

	public static void main(String[] args) {
		
			
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Type 1 for  Writing in a file, Type 2 for append, Type 3 for read"); 
		
		int response = scanner.nextInt();
		
		
//create new file
		 
	 /*   try
	    {
	    	File file = new File("D:\\create.txt");
			file.createNewFile();
	    }
	    catch(Exception e) {
			System.out.println("Not created");
		}
	    */
		
		if(response==1)
//writing a file
	try
	{
		FileWriter fileWriter = new FileWriter("D:\\create.txt");
		 
		fileWriter.write( "This is first file write");
		
		fileWriter.close();

	}
	catch(IOException e) {
		System.out.println("No write");
		e.printStackTrace();
	}
	
	else if(response==2)
	//append(add)
	try
	{
		FileWriter fileWriter = new FileWriter("D:\\create.txt",true);
		 
		fileWriter.write( " This is first file write yes");
		
		fileWriter.close();

	}
	catch(IOException e) {
		System.out.println("No write");
		e.printStackTrace();
	}
	
	
	  else if(response==3)
	// to read file
    	 try(FileReader fileReader = new FileReader("D:\\\\create.txt")) {
    		// Declaring loop variable
    	        int i;
    	        // Holds true till there is nothing to read
    	        while ((i = fileReader.read()) != -1)
    	 
    	            // Print all the content of a file
    	            System.out.print((char)i);
    		        fileReader.close();
    		    }
    		 
    		   catch (IOException e) {
    			   System.out.println("Error");
    		}
	}
	
	//to delete file
/*	File myFile = new File("D:\\create.txt");
	
	if(myFile.delete())
	{
	   System.out.println("Deleted"+myFile.getName());
	   
	}
	else
	{
		System.out.println("error");
	}*/
	}


