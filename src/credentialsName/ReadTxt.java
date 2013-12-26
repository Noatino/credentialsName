/**
 * The finality of this class is read the name of an student list<strings> 
 * in a .txt file and put the content on a list of instance of the class 
 * Student
 * @author antonio
 * @version 1.0
 * @since December 24 2013
 */

package credentialsName;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class ReadTxt {
	
	private List<Student> list = null;
	
	
	/**
	 * Constructor of the class
	 * @param String path
	 */
	
	public ReadTxt(String path){
		try{
			list = readFile(path);
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
	/**
	 * In this method we make all the dirty job to read an .txt file 
	 * @param path
	 * @return List<Student>
	 * @throws IOException
	 */
	
	private List<Student> readFile(String path) throws IOException{
		try{
			File file = new File(path);
			BufferedReader buffer = new BufferedReader(new FileReader(file));
			String line = buffer.readLine(); //Actual line from the file
			String tmp;
			while(line != null){

				//tmp = line.substring(18, 67);
				System.out.println(line);//Borrar
				line = buffer.readLine();//Actual line from the file
			}
			buffer.close();
		}catch(NullPointerException e){ //Exception of File
			System.out.println("File not found");
			e.printStackTrace();
		}catch(FileNotFoundException e){//Exception of FileReader
			System.out.println("File not found");
			e.printStackTrace();

		}
		
		
		
		
		return null;
	}
	
	/**
	 * Return the list of Student's content in the file.
	 * @return
	 */
	
	public List<Student> getList(){
		return list;
	}

}
