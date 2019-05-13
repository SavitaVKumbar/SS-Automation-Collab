package com.util.ss;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Platform;


public class ExcelUtil {
	
	//Main Directory of the project
    public static final String currentDir = System.getProperty("user.dir");
 
    //Location of Test data excel file
    public static String testDataExcelPath = null;
 
    //Excel WorkBook
    private static XSSFWorkbook excelWBook;
 
    //Excel Sheet
    private static XSSFSheet excelWSheet;
 
    //Excel cell
    private static XSSFCell cell;
 
    //Excel row
    private static XSSFRow row;
 
    //Row Number
    public static int rowNumber;
 
    //Column Number
    public static int columnNumber;
 
    //Setter and Getters of row and columns
    public static void setRowNumber(int pRowNumber) {
        rowNumber = pRowNumber;
    }
 
    public static int getRowNumber() {
        return rowNumber;
    }
 
    public static void setColumnNumber(int pColumnNumber) {
        columnNumber = pColumnNumber;
    }
 
    public static int getColumnNumber() {
        return columnNumber;
    }
 
    // It creates FileInputStream and set excel file and excel sheet to excelWBook and excelWSheet variables.
    public static void setExcelFileSheet(String sheetName) {
        
    	//MAC or Windows Selection for excel path
        if (Platform.getCurrent().toString().equalsIgnoreCase("MAC")) {
            testDataExcelPath = currentDir + "//resources//";
        } else if (Platform.getCurrent().toString().contains("WIN")) {
            testDataExcelPath = currentDir + "\\resources\\";       
        }
        
        try {
            // Open the Excel file
            FileInputStream ExcelFile = new FileInputStream(testDataExcelPath + "DataSheet.xlsx");
            excelWBook = new XSSFWorkbook(ExcelFile);
            excelWSheet = excelWBook.getSheet(sheetName);
        } catch (Exception e) {
            try {
                throw (e);
            } catch (IOException e1) {
                e1.printStackTrace();
            } catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
        }
    }
 
    //We are passing row number and column number as parameters.
    public static String getCellData(String sheetName,int RowNum, int ColNum) throws Exception {
    	setExcelFileSheet(sheetName);
        try {
            cell = excelWSheet.getRow(RowNum).getCell(ColNum);
            DataFormatter formatter = new DataFormatter();
            String cellData = formatter.formatCellValue(cell);
            return cellData;
        } catch (Exception e) {
            throw (e);
        }
    }
 
    //This method takes row number as a parameter and returns the data of given row number.
    public static XSSFRow getRowData(String sheetName, int RowNum) throws Exception {
    	setExcelFileSheet(sheetName);
        try {
            row = excelWSheet.getRow(RowNum);
            return row;
        } catch (Exception e) {
            throw (e);
        }
    }
 
    //This method gets excel file, row and column number and set a value to the that cell.
    public static void setCellData(String sheetName, String value, int RowNum, int ColNum) throws Exception {
    	setExcelFileSheet(sheetName);
        try {
            row = excelWSheet.getRow(RowNum);
            cell = row.getCell(ColNum);
            if (cell == null) {
                cell = row.createCell(ColNum);
                cell.setCellValue(value);
            } else {
                cell.setCellValue(value);
            }
            // Constant variables Test Data path and Test Data file name
            FileOutputStream fileOut = new FileOutputStream(testDataExcelPath + "DataSheet.xlsx");
            excelWBook.write(fileOut);
            fileOut.flush();
            fileOut.close();
        } catch (Exception e) {
            try {
                throw (e);
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }
    }
    
	public static String getCellValueByColumnName(String sheetName, String columnName) throws Exception {
		
		setExcelFileSheet(sheetName);
		String stringCellValue = "";
		int columnNumber = 0;
		row = ExcelUtil.getRowData(sheetName,0);

		for (int i = 0; i < row.getLastCellNum(); i++) {
			
			if (row.getCell(i).getStringCellValue().trim().equals(columnName)) {
				columnNumber = i;
				break;
			}
		}
			
		row = excelWSheet.getRow(1);
		cell = row.getCell(columnNumber);
		
		if (cell.getCellType()==CellType.STRING)
        {
			stringCellValue = cell.getStringCellValue();
        }
        else if(cell.getCellType() == CellType.NUMERIC)
        {
        	if (DateUtil.isCellDateFormatted(cell)) {
                Date date =  cell.getDateCellValue();
                System.out.println(date);
                	stringCellValue = date.toString();
	                System.out.println(stringCellValue);
            }
            else {
            	Double value = cell.getNumericCellValue();
                Long longValue = value.longValue();
                stringCellValue = new String(longValue.toString());
            }
        }
        else if(cell.getCellType() == CellType.BOOLEAN)
        {
        	stringCellValue = new String(new Boolean(
                    cell.getBooleanCellValue()).toString());
        }
        else if(cell.getCellType() == CellType.BLANK) {
        	stringCellValue = ""; 
		}
		return stringCellValue;
		
	}
	
	
	public static List<String> getCellValueByColumnName1(String sheetName, String columnName) throws Exception {
		
		setExcelFileSheet(sheetName);
		String stringCellValue1 = "";
		List<String> stringCellValue = new ArrayList<String>();
		int columnNumber = 0;
		row = ExcelUtil.getRowData(sheetName,0);

		for (int i = 0; i < row.getLastCellNum(); i++) {
			
			if (row.getCell(i).getStringCellValue().trim().equals(columnName)) {
				columnNumber = i;
				break;
			}
		}
		
		for (int i = 1; i < excelWSheet.getLastRowNum(); i++) {
			row = excelWSheet.getRow(i);
			cell = row.getCell(columnNumber);
			try {
				cell = excelWSheet.getRow(i).getCell(columnNumber);
				}catch(NullPointerException e) {
					System.out.println();
					System.out.println("Cell may be null");
				}
				
				if (cell.getCellType()==CellType.STRING)
		        {
					stringCellValue1 = cell.getStringCellValue();
					System.out.println(stringCellValue1);
					stringCellValue.add(stringCellValue1);
		        }
		        else if(cell.getCellType() == CellType.NUMERIC)
		        {   
		            if (DateUtil.isCellDateFormatted(cell)) {
		                Date date =  cell.getDateCellValue();
		                System.out.println(date);
		                
		                if((!(date.equals(""))) ||  (!(date.equals(" ")))) {
		                	stringCellValue1 = date.toString();
			                System.out.println(stringCellValue1);
		                	stringCellValue.add(stringCellValue1);
		                }  
		            }
		            else {
		            	Double value = cell.getNumericCellValue();
			            Long longValue = value.longValue();
			            stringCellValue1 = new String(longValue.toString());
			            stringCellValue.add(stringCellValue1);
		            }
		        }
		        else if(cell.getCellType() == CellType.BOOLEAN)
		        {
		        	stringCellValue1 = new String(new Boolean(
		                    cell.getBooleanCellValue()).toString());
		        	stringCellValue.add(stringCellValue1);
		        }
		        else if(cell.getCellType() == CellType.BLANK) {
		        	stringCellValue1 = ""; 
		        	stringCellValue.add(stringCellValue1);
				}
				
			}

		return stringCellValue;
	}
	
	public static void setDownloadedSheet(String excelFileName,String sheetName, String path) {
        
		testDataExcelPath = path; 
        try {
            // Open the Excel file
            FileInputStream ExcelFile = new FileInputStream(testDataExcelPath + excelFileName);
            excelWBook = new XSSFWorkbook(ExcelFile);
            excelWSheet = excelWBook.getSheet(sheetName);
        } catch (Exception e) {
            try {
                throw (e);
            } catch (IOException e1) {
                e1.printStackTrace();
            } catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
        }
    }
	
	@SuppressWarnings("null")
	public static List<String> getAllCellValuesByColumnName(String excelFile, String sheetName, String path, String columnName) throws Exception {
		
		setDownloadedSheet(excelFile, sheetName, path);
		List<String> stringCellValue = new ArrayList<String>();
		int columnNumber = 0;
		row = excelWSheet.getRow(0);

		for (int i = 0; i <= row.getLastCellNum(); i++) {
			
			if (row.getCell(i).getStringCellValue().trim().toLowerCase().contains(columnName.trim().toLowerCase())) {
				columnNumber = i;
				break;
			}
		}
		
		String stringCellValue1;
		for (int i = 1; i <= excelWSheet.getLastRowNum(); i++) {
			try {
			cell = excelWSheet.getRow(i).getCell(columnNumber);
			}catch(NullPointerException e) {
				System.out.println();
				System.out.println("Cell may be null");
			}
			
			if (cell.getCellType()==CellType.STRING)
	        {
				stringCellValue1 = cell.getStringCellValue();
				System.out.println(stringCellValue1);
				stringCellValue.add(stringCellValue1);
	        }
	        else if(cell.getCellType() == CellType.NUMERIC)
	        {   
	            if (DateUtil.isCellDateFormatted(cell)) {
	                Date date =  cell.getDateCellValue();
	                System.out.println(date);
	                
	                if((!(date.equals(""))) ||  (!(date.equals(" ")))) {
	                	stringCellValue1 = date.toString();
		                System.out.println(stringCellValue1);
	                	stringCellValue.add(stringCellValue1);
	                }  
	            }
	            else {
	            	Double value = cell.getNumericCellValue();
		            Long longValue = value.longValue();
		            stringCellValue1 = new String(longValue.toString());
		            stringCellValue.add(stringCellValue1);
	            }
	        }
	        else if(cell.getCellType() == CellType.BOOLEAN)
	        {
	        	stringCellValue1 = new String(new Boolean(
	                    cell.getBooleanCellValue()).toString());
	        	stringCellValue.add(stringCellValue1);
	        }
	        else if(cell.getCellType() == CellType.BLANK) {
	        	stringCellValue1 = ""; 
	        	stringCellValue.add(stringCellValue1);
			}
			
		}
		return stringCellValue;
		
	}

	//This method takes row number as a parameter and returns the data of given row number.
    public static int getNumberOfRows(String excelFile, String sheetName, String path) throws Exception {
    	setDownloadedSheet(excelFile, sheetName, path);
    	int rowCount = 0;
        try {
            rowCount = excelWSheet.getLastRowNum();
        } catch (Exception e) {
            throw (e);
        }
		return rowCount;
    }
}