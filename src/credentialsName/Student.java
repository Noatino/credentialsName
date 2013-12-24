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
		
	private String nombre;
	private String pApellido;
	private String sApellido;
	private String group;
	private String index;
	
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
	
	public Student(String token, String group, String index){
		makeStudent(token, group, index);
	}
	
	
	/**
	 * constructor for a person with one name.
	 * @param String primerNombre
	 * @param String segundoNombre
	 * @param String apellidoMaterno
	 * @param String group
	 * @param String index
	 */
	
	public Student(String nombre, String pApellido, String sApellido, String group, String index){
		this.nombre = nombre;
		this.pApellido = pApellido;
		this.sApellido = sApellido;
		this.group = group;
		this.index = index;
	}
	
	/**
	 * Set the first name
	 * @param String pName 
	 */
	
	public void setnombre(String nombre){
		this.nombre = nombre;
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
	 * Set the index of the student of the school
	 * @param String
	 */
	
	public void setNum(String index){
		this.index = index;
	}
	
	
	/**
	 * Get the first name
	 * @return String
	 */
	
	public String getnombre(){
		return nombre;
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
	 * @param String index
	 */
	
	public String getNum(){
		return index;
	}
	
	private void makeStudent(String buffer, String group, String index){
		StringTokenizer token = new StringTokenizer(buffer.trim());
		int flag = 1;
		while(token.hasMoreElements()){
			if(flag == 3){
				setnombre(token.nextToken("*"));
			}
			if(flag == 2){
				setPApellido(token.nextToken("*"));
			}
			if(flag == 1){
				setSApellido(token.nextToken("*"));
			}
			flag++;
		}
		this.group = group;
		this.index = index;
		
	}


	@Override
	public String toString() {
		return "Student [nombre=" + nombre + ", pApellido=" + pApellido
				+ ", sApellido=" + sApellido + ", group=" + group + ", index="
				+ index + "]";
	}
	
}
