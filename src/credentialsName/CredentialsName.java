/**
 * Main class of the proyect about put an string on an
 * .jgp file.
 * @author antonio
 * @version 1.0
 * @since December 22 1013 
 */
package credentialsName;

public class CredentialsName {

	public static void main(String[] args) {
		try{
			ReadExcelFile elementos = new ReadExcelFile("/home/antonio/workspace/credentialsName/src/credentialsName/"
					+ "listas.xlsx");
			for(int i = 0; i <= elementos.getList().size(); i++){
				System.out.println(elementos.getList().get(i));
			}
		}catch(Exception e){
			System.out.println("En el main");
			e.printStackTrace();
		}
	

	}

}
