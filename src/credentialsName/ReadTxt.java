/**
 * The finality of this class is read the name of an student <strings> in a .txt file
 * and put the content on a list of instance of the class Student
 * @author antonio
 * @version 1.0
 * @since December 24 2013
 */

package credentialsName;

import java.io.IOException;
import java.util.List;

public class ReadTxt {
	
	private List<Student> list = null;
	
	public ReadTxt(String path){
		try{
			list = readFile(path);
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
	
	
	private List<Student> readFile(String path) throws IOException{
		
		return null;
	}
	
	
	public List<Student> getList(){
		return list;
	}

}
