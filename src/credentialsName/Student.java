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
	
	/**
	 * constructor for a person with two names.
	 * @param String primerNombre;
	 * @param String segundoNombre;
	 * @param String apellidoPaterno;
	 * @param String apellidoMaterno; 
	 */
	
	public Student(String pNombre, String sNombre, String pApellido, String sApellido){
		this.pNombre = pNombre;
		this.sNombre = sNombre;
		this.pApellido = pApellido;
		this.sApellido = sApellido;
	}
	
	/**
	 * constructor for a person with one name.
	 * @param String primerNombre;
	 * @param String segundoNombre;
	 * @param String apellidoPaterno;
	 * @param String apellidoMaterno; 
	 */
	
	public Student(String pNombre, String pApellido, String sApellido){
		this.pNombre = pNombre;
		this.sNombre = "";
		this.pApellido = pApellido;
		this.sApellido = sApellido;
	}
	
	
	

}
