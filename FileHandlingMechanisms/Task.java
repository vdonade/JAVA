package com.filehandling;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
public class Task {
 
	Scanner scanner = new Scanner(null);
	 
	if(scanner==1)
	{
		public class ReadFile {

			public static List<String> readFile(String fileName)
			{
				List<String> list= Collections.emptyList();
				try {
					list=Files.readAllLines(Paths.get(fileName),StandardCharsets.UTF_8);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				return list;
			}
			
			public static void main(String[] args) {
				List<String> result =readFile("D:\\Sonam Data\\filedemo\\testfile2.txt");
				
				Iterator<String> it=result.iterator();
				while(it.hasNext())
				{
					System.out.println(it.next());
				}
			}
		
	}
	else if(scanner == 2)
	{
		
	}
	else if(Scanner ==3)

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	private List<String> readFile(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
