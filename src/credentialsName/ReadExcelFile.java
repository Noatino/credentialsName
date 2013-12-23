/**
 * In this class I wan to read an .xlsx file and
 * save the content on an list.
 * I use the structure of the code of the next web page
 * http://www.programacion.com/articulo/leer_un_fichero_excel_en_java_utilizando_poi_438
 * I'm only make a few changes to adapt to my work 
 * @author antonio
 * @since December 22 2013
 * @version 1.0
 */

package credentialsName;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Row;

public class ReadExcelFile {
	
	private List<String> listOfElements;

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
	 * @return List<String>
	 */
	
	private List<String> readExcelFile(String path){
		List<String> lista = new ArrayList<String>();
		//We here going to try to read the file
		try{
			FileInputStream stream = new FileInputStream(path); //Here we make an Stream to the file. 
			POIFSFileSystem streamFileSystem = new POIFSFileSystem(stream); //Here we make an File System of the file stream
			//Now we going to make the instance that we can work by the book and the sheet of the file
			HSSFWorkbook workBook = new HSSFWorkbook(streamFileSystem); //This is the workbook
			HSSFSheet sheet = workBook.getSheetAt(0);//This is the sheet of the file
			//Now we going to iterate the rows and columns of the .xlsx file to find the information
			//of the cell that we want
			Iterator<Row> rowIterator = sheet.rowIterator();//First start by the rows
			while(rowIterator.hasNext()){
				
			}
			
		}catch(IOException e){
			
		}
		
		return lista;
	}
	
	public List<String> getList(){
		return listOfElements;
	}

}
