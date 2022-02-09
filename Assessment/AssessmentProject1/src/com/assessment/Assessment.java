package com.assessment;
import java.util.Scanner;
import java.io.File;
import java.io.FileFilter;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;

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
	        	
	        	while(true) {
	        		
	        	System.out.println("\nEnter 1 to add,\n Enter 2 to delete ,\n enter 3 to search file, \n Enter 4 to navigate back to main context");
	        	int response = sc.nextInt();

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
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
									                   
                     break;
                     
                 case 3:
                     Scanner search = new Scanner(System.in);
                     System.out.println("Enter the file to be searched" );
                     String name = search.next();
                     System.out.println("Enter the directory where to search ");
                     String directory = search.next();
                     searchFile(name,new File(directory));
                     
                     break;
                 case 4:
                	 optionsSelection();	        	     	
	        	}
	          }	        	
	        }
        
	        else if(options==3) {
	        	closeApplication();
	        	break;
	        }
	        else {
         System.out.println("You have made an invalid choice!");
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
				System.out.println("File is added successfully");
			}
			else
			{
				System.out.println("File already Exist");
			}
			//Write data to a file
			FileWriter writer=new FileWriter(file);
			writer.write("Welcome to File Handling");
			writer.close();
			
		}
	 
	 
	 
	 //Method to delete a file
	 private static void deleteFile(String path1) throws IOException
		{
		try {
			Files.deleteIfExists(Paths.get(path1));
			
		} catch (NoSuchFileException e) {
			System.out.println(e);
		}
		catch (DirectoryNotEmptyException e) {
			System.out.println("Directory is not Empty");
		}
		catch (IOException e) {
			System.out.println("IOException "+e);
		}
		System.out.println("File Deletion successfully");
		}



//Method to search a file	 
	 private static void searchFile(String name,File file)
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
	            else
	            {
	            	System.out.println(name+" -> Not Found in directory ");
	            }
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

        for (File file : files) {
           if (!file.isHidden()) {
              if (file.isDirectory()) {
                 System.out.println("DIRECTORY \t" + file.getName());
              } else {
                 System.out.println("FILE\t" + file.getName());
              }
           }
        }
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
