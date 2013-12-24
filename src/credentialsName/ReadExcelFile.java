/**
 * In this class I want to read an .xlsx file and
 * save the content on an list.
 * I use the structure of the code of the next web page
 * http://www.programacion.com/articulo/leer_un_fichero_excel_en_java_utilizando_poi_438
 * I'm only make a few changes to adapt to my work.
 * For this proyect don't want read the cell with a numeric value, in another words,
 * we only want the text of the book
 * @author antonio
 * @since December 22 2013
 * @version 1.0
 */

package credentialsName;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFile {
	
	private List<Student> listOfElements;

	/**
	 * Constructor of the class. The parameter of the constructor
	 * are the path of the .xlsx file to read.
	 * @param String path
	 */
	
	public ReadExcelFile(String path) { 
		listOfElements = readExcelFile(path);
	}
	
	/**
	 * This method is the responsible of read the content of the .xlsx 
	 * file.
	 * @param path
	 * @return List<Student>
	 */
	
	private List<Student> readExcelFile(String path){
		List<Student> lista = new ArrayList<Student>();
		//We here going to try to read the file
		try{
			
			FileInputStream stream = new FileInputStream(path); //Here we make an Stream to the file. 
			//Now we going to make the instance that we can work by the book and the sheet of the file
			XSSFWorkbook workBook = new XSSFWorkbook(stream); //This is the workbook
			XSSFSheet sheet = workBook.getSheetAt(0);//This is the sheet of the file
			//Now we going to iterate the rows or columns of the .xlsx file to find the information
			//of the cell that we want
			Iterator<Row> rowIterator = sheet.rowIterator();//We going start by the rows
			String gruop = "edna";
			String index = "";
			while(rowIterator.hasNext()){
				XSSFRow row = (XSSFRow) rowIterator.next();//The actual row
				Iterator<Cell> cellIterator = row.cellIterator();//Now we stay in the cells of the row
				while(cellIterator.hasNext()){//Now we explore the cells of this row
					XSSFCell cell = (XSSFCell) cellIterator.next();
					String tmp = cell.toString();
					
					if(isNumber(tmp)){
						index = tmp;
						break;
					}else{
						lista.add(new Student(tmp, gruop,index));
					}
				}
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return lista;
	}
	
		

	/**
	 * Return metod for get the List<Student> of the .xlsx file
	 * @return List<Student>
	 */
	public List<Student> getList(){
		return listOfElements;
	}
	
	/**
	 * Determinate if an String are an positive integer or not
	 * @param String string
	 * @return boolean
	 */
	
	private boolean isNumber(String str){
		String modif = str.trim();
		int pos = str.indexOf(".");
		String tmp = modif;
		if(pos>-1){
			tmp = modif.substring(0, pos);
		}
		if(tmp.isEmpty() || tmp == ""){
			return false;
		}
		for(int i = 0; i < tmp.length(); i++){
			if (!Character.isDigit(tmp.charAt(i))) {
	            return false;
			}
		}
		return true;
	}
}
