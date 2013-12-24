/**
 * Class to represent an student.
 * This class have by parameters the type of
 * a name in Mexico, in another words.
 * First name
 * Second name
 * Last name
 * @author antonio
 * @since 23 December 2013
 * @version 1.0
 */

package credentialsName;

import java.util.StringTokenizer;


public class Student {
		
	private String pNombre;
	private String sNombre;
	private String pApellido;
	private String sApellido;
	private String group;
	
	
	/**
	 *Default constructor 
	 */
	
	public Student(){
		
	}
	
	
	/**
	 * Constructor used by the way of the read of an
	 * .xlsx file using XSSF-POI in the class ReadExcel 
	 * of this package 
	 */
	
	public Student(String token, String group){
		makeStudent(token, group);
	}
	
	/**
	 * constructor for a person with two names.
	 * @param String primerNombre
	 * @param String segundoNombre
	 * @param String apellidoPaterno
	 * @param String apellidoMaterno
	 * @param String group 
	 */
	
	public Student(String pNombre, String sNombre, String pApellido, String sApellido, String group){
		this.pNombre = pNombre;
		this.sNombre = sNombre;
		this.pApellido = pApellido;
		this.sApellido = sApellido;
		this.group = group;
	}
	
	/**
	 * constructor for a person with one name.
	 * @param String primerNombre
	 * @param String segundoNombre
	 * @param String apellidoMaterno
	 * @param String group
	 */
	
	public Student(String pNombre, String pApellido, String sApellido, String group){
		this.pNombre = pNombre;
		this.sNombre = "";
		this.pApellido = pApellido;
		this.sApellido = sApellido;
		this.group = group;
	}
	
	/**
	 * Set the first name
	 * @param String pName 
	 */
	
	public void setPNombre(String pName){
		this.pNombre = pName;
	}
	
	/**
	 * Set the second name
	 * @param String sName 
	 */
	
	public void setSNombre(String sName){
		this.sNombre = sName;
	}
	
	/**
	 * Set the first last name
	 * @param String pName 
	 */
	
	public void setPApellido(String pApellido){
		this.pApellido = pApellido;
	}
	
	/**
	 * Set the second last name
	 * @param String sApellido 
	 */
	
	public void setSApellido(String sApellido){
		this.sApellido = sApellido;
	}
	
	
	/**
	 * Set the group of an student.
	 * @param String 
	 */
	
	public void setGrupo(String group){
		this.group = group;
	}
	
	
	/**
	 * Get the first name
	 * @return String
	 */
	
	public String getPNombre(){
		return pNombre;
	}
	
	/**
	 * Get the second name
	 * @return String
	 */
	
	public String getSNombre(){
		return sNombre;
	}

	
	/**
	 * Get the first name
	 * @return String
	 */
	
	public String getPApellido(){
		return pApellido;
	}
	
	/**
	 * Get the second name
	 * @return String
	 */
	
	public String getSApellido(){
		return sApellido;
	}
	
	/**
	 * Getter method to know the group of an student
	 * @return String
	 */
	
	public String getGrupo(){
		return group;
	}
	
	/**
	 * This method make an student that previously has been extracted by the buffer  
	 * string of an xlsx file.
	 * @param String buffer 
	 * @param String group
	 */
	
	private void makeStudent(String buffer, String group){
		StringTokenizer token = new StringTokenizer(buffer.trim());
		int flag = 1;
		if(determinate(buffer) == 1){//In this case, he have two names
			while(token.hasMoreElements()){
				if(flag == 4){
					setPNombre(token.nextToken("*"));
				}
				if(flag == 3){
					setSNombre(token.nextToken("*"));
				}
				if(flag == 2){
					setPApellido(token.nextToken("*"));
				}
				if(flag == 1){
					setSApellido(token.nextToken("*"));
				}
				flag++;
			}
		}else{
			//In this case, the student have only one name
			while(token.hasMoreElements()){
				if(flag == 3){
					setPNombre(token.nextToken("*"));
				}
				if(flag == 2){
					setPApellido(token.nextToken("*"));
				}
				if(flag == 1){
					setSApellido(token.nextToken("*"));
				}
				flag++;
			}
		}
		
	}
	
	/**
	 * Determinate if an student have two names or only one. The string in the .xlsx file
	 * have * instead of whites. We now count the repeats of *. If the studen have two names
	 * then we have 3 * in the string, this is 1 module 2, in other case, the student have only
	 * one name, then his name only have 2 * this is 0 module 2
	 * @param String
	 * @return int 
	 */
	
	private int determinate(String name){
		int count = 0;
		for(int i = 0; i < name.length(); i++){
			if(name.charAt(i)=='*'){
				count++;
			}
		}
		return count%2;
	}
	
	
	/**
	 * Method to String about an student
	 * @return String
	 */

	@Override
	public String toString() {
		return "Student [pNombre=" + pNombre + ", sNombre=" + sNombre
				+ ", pApellido=" + pApellido + ", sApellido=" + sApellido
				+ ", group=" + group + "]";
	}
	
}
