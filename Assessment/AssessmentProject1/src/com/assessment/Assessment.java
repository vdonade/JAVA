package com.assessment;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class Assessment {

	public static void main(String[] args) {
		
        System.out.println("\n**************************************\n");
        System.out.println("\tProject Name: LockedMe.com \n");
        System.out.println("\tDeveloper Details:\n \t Name: Gargi Gaikwad \n \t Graduation:BE \n \t Branch: Electronics and Telecommunications  \n \t Technical Skill:Core Java");
        System.out.println("**************************************");
        optionsSelection();     
 
	}
   
        
	
	 private static void optionsSelection() {
	        String[] arr = {"1.Get the list of files and folders.",
	                "2.Business Operations",	               
	                "3.Close the application"	            
	        };
	        int[] arr1 = {1,2,3};
	        int  slen = arr1.length;
	        for(int i=0; i<slen;i++){
	            System.out.println(arr[i]);
	            // display the all the Strings mentioned in the String array
	        }
	        
	        System.out.println("\nEnter your choice:\t");
	        Scanner sc = new Scanner(System.in);
	        int  options =  sc.nextInt();
	        
	 
            while(true)
	        if(options==1) {
	        	
	        	try {
	        		 Scanner scan = new Scanner(System.in);
	        	       System.out.println("Enter the Location");
	        	     	String path = scan.next();
				     	getFile(path);
				} catch (IOException e) {
					e.printStackTrace();
				}	        	         			         	
	        	optionsSelection();
		        break;
	        }
             	        
	        else if(options==2) {
	        	
	        	System.out.println("\nEnter 1 to add,\n Enter 2 to delete ,\n enter 3 to search file, \n Enter 4 to navigate back to main context");
	        	int response = sc.nextInt();
	        	
	        	while(true) {
	        	switch(response)
	        	{
	        	
                 case 1:
                	 Scanner scan = new Scanner(System.in);
	        	       System.out.println("Enter the Location");
	        	     	String path = scan.next();
                	 
					try {
						addFile( path );
						
					} catch (IOException e) {
						
						e.printStackTrace();
					}                     
                     break;
                     
                     
                     
                 case 2:
                	 Scanner scan1 = new Scanner(System.in);
	        	       System.out.println("Enter the Location");
	        	     	String path1 = scan1.next();           	 					
					try {
						deleteFile( path1 );
					} catch (IOException e) {
						
						e.printStackTrace();
					}
									                   
                     break;
                     
                 case 3:
                     Scanner search = new Scanner(System.in);
                     System.out.println("Enter the file to be searched" );
                     String name = search.next();
                     System.out.println("Enter the directory where to search ");
                     try {
                     String directory = search.next();
                     searchFile(name,new File(directory));
                     } catch (Exception e) {
                    	 e.printStackTrace();
 					
                     }
                     
                     break;
                 default:
                	 optionsSelection();	
                	
	        	}
	        	break;
	          }	        	
	        }
	 
	    
	        else if(options==3) {
	        	try {
	        	closeApplication();
	        	}
	        	catch(Exception e) {
	        		
	        	}
	        	
	        	break;
	        }
	        else if(options!=1&& options!=2&& options!=3)
	        {
	        	
	        		System.out.println("Please select valid option\n");
	        		 optionsSelection();	
	        		break;
	        
	       }
	 }
	 
	 
	 
	 //Method to close application
	 private static void closeApplication() {
	        System.out.println("Closing your application... \nThank you!");
	            }
	 
    //Method to add files in existing directory
	 private static void addFile( String path) throws IOException
		{
		 File file=new File(path);
			
			//create the file
			if(file.createNewFile())
			{
				System.out.println("File is added successfully\n");
			}
			else
			{
				System.out.println("File already Exist\n");
			}
			//Write data to a file
			FileWriter writer=new FileWriter(file);
			writer.write("Welcome to File Handling");
			writer.close();
		}
	 
	 
	 
	 //Method to delete a file
	 private static void deleteFile(String path1) throws IOException
		{
		  try
		 {
			if(Files.deleteIfExists(Paths.get(path1)))
			{
			System.out.println("File Deletion successfully\n");
			}
			else
			{
				System.out.println("File not found\n");
			}
		 } 
		  catch (Exception e) 
		 {
			System.out.println("File not found\n");
		 }		
		 }



//Method to search a file	 
	 private static void searchFile(String name,File file)
	    {
		 try
		 {
	        File[] list = file.listFiles();
	        if(list!=null)
	        for (File fil : list)
	        {
	            if (fil.isDirectory())
	            {
	            	searchFile(name,fil);
	            }
	            else if (name.equals(fil.getName()))
	            {	                
	                System.out.println(name+" ->Found Successfully in directory "+fil.getParentFile());
	            }
	           
	        }
		 }
		 catch (Exception e)
		 {
			 System.out.println(name+" ->Not found in directory");
		 }
	    }
	 
	 
	  
	 //Method to get files and folder names
	 private static void getFile(String path) throws IOException
	 {    
  	
  		try {
  	
  	 File dir = new File(path);
      if(dir.isDirectory())
      {
        // Fetching the list from the directory
        File[] files = dir.listFiles();
        System.out.println("All the files including folders");
        
        // Sort files and folders by name
        Arrays.sort(files, (f1, f2) -> f1.compareTo(f2));

      
        //Prints the files in file name ascending order
        for(File file:files)
        {
          System.out.println(file.getName());
        }      

       }
  	    } catch (Exception e) {
  	       e.getStackTrace();

  	    }
	 }	 
} 
