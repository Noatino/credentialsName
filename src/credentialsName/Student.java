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
