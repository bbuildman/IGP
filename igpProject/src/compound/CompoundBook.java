package compound;

/**
 * @author      Buildman Biyong
 * @version     1.0                 (the version of the package this class was first added to)                   
 * @since       2012-03-19          (a date or the version number of this program)
 */

import java.util.Iterator;
import java.util.ListIterator;
import java.io.File; 
import java.util.Date; 
import jxl.*;
import jxl.write.*;
import jxl.read.biff.BiffException;
import java.util.ArrayList;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.io.IOException;
import java.util.*;

/**
 *
 * @author bbuildman
 */
public class CompoundBook {
    
    
    /**
     * @param book contains a list of compound 
     * @param fileName .xls file name
     */
    private ArrayList<ArrayList<Cell>> book ;
    private String fileName;
    
    
    /**
     * Class Constructor
     * 
     * @param fileName .xls file name 
     * 
     */
    
    public CompoundBook(String fileName){
            //String path = new java.io.File(".").getCanonicalPath();
            
            // System.out.println("Wazzzza" + path+File.separator + fileName);
            setFileName(fileName);
            setBook(fileName);
        
    }
    
    /**
     * Set @param book 
     * 
     * Set @param book , create a list of compound (ArrayList<Cell>) from
     * the .xls file by creating an object WorkBook 
     * 
     * @throws BiffException
     * @throws IOException
     * 
     * @see jxl.Workbook.* 
     * @see jxl.Cell
     * @see jxl.Sheet
     * @param fileName .xls file name
     */
    public void setBook(String fileName){
        
        // open the file
        File inputWb = new File(fileName);
        this.book = new ArrayList<ArrayList<Cell>>();
        // create temporary list to contain the row (compound) information
        System.out.println("setBook :" + fileName);
        Workbook w;
        
        
        try {
            
            //parse the file in the object Workbook
            w = Workbook.getWorkbook(inputWb);
            
            //Open the first sheet in the .xls file
            Sheet sheet = w.getSheet(0);

            //Go trough the sheet
            for(int i=0; i<sheet.getRows();i++){//rows
                ArrayList<Cell> comp = new ArrayList<Cell>();
                for(int j = 0; j<sheet.getColumns();j++){//colums
                    
                    Cell cell = sheet.getCell(j,i);
                   
                    comp.add(j,cell);
                }
            
                // create the rows of coupound (ArrayList<Cell>)
                this.book.add(i,comp);
            }
            
            //free the memory space
            w.close();            
        }catch (BiffException e) {
            System.out.println("BiffException : " + e.getMessage());
            e.printStackTrace();
        }catch (IOException b) {
            System.out.println("IOException: " + b.getMessage());
            b.printStackTrace();
        }
    }
    
    /**
     * Set @param fileName
     * 
     * @param fileName .xls file name
     */
    public void setFileName(String fileName) {
        this.fileName = fileName.toString();
    }
    
    public String getFileName(){
        return this.fileName;
    }
    
    /**
     * search trough the @param book for specific rows
     * 
     * search for specific rows trough the @param book taking a String @param a 
     * parameter 
     * 
     * @param a String use to find specific rows 
     * @return list of rows corresponding to the search
     */
    
    public ArrayList<ArrayList<Cell>> search(String a){
        boolean find = false;
        int ind = -1;
        //contains the rows
        ArrayList<ArrayList<Cell>> rows = new ArrayList<ArrayList<Cell>>();
        //contains a row
        ArrayList<Cell> row = new ArrayList<Cell>();
        // go trough the search book;
        ListIterator<ArrayList<Cell>> searchBook =  book.listIterator();
        ListIterator<Cell> searchCell = null;
        
        Pattern pattern = Pattern.compile("^"+a+ "*",Pattern.CASE_INSENSITIVE);
        Matcher matcher = null;
        
        while (searchBook.hasNext()) {//go trough the row
            row = searchBook.next();
            searchCell = row.listIterator();// go trough the columns
            while(searchCell.hasNext()){
                Cell cell =searchCell.next();
                if (pattern.matcher(cell.getContents()).find()){// look for the matching string this part need more work
                    if (ind != book.indexOf(row)){
                        ind = book.indexOf(row);
                        rows.add(row);                        
                    }
                }
            }
            searchCell = null;

        }    
        if (rows.isEmpty()){
            return null;
        }else{
            return rows;
        }
               
    }
    /**
     * search trough the @param book for specific rows
     * 
     * search for specific rows trough the @param book taking a String @param a 
     * parameter 
     * 
     * @param a String use to find specific rows 
     * @return list of rows corresponding to the search
     */
    
    public ArrayList<ArrayList<Cell>> search(String a, int col){
        boolean find = false;
        int ind = -1;
        //contains the rows
        ArrayList<ArrayList<Cell>> rows = new ArrayList<ArrayList<Cell>>();
        //contains a row
        ArrayList<Cell> row = new ArrayList<Cell>();
        // go trough the search book;
        ListIterator<ArrayList<Cell>> searchBook =  book.listIterator();
        ListIterator<Cell> searchCell = null;
        
        Pattern pattern = Pattern.compile("^"+a ,Pattern.CASE_INSENSITIVE);
        Matcher matcher = null;
        
        while (searchBook.hasNext()) {//go trough the row
            row = searchBook.next();
            Cell cell = row.get(col);
                 
                if (pattern.matcher(cell.getContents()).find()){// look for the matching string this part need more work
                    if (ind != book.indexOf(row)){
                        ind = book.indexOf(row);
                        rows.add(row);                        
                    }
                }
            }
            
        if (rows.isEmpty()){
            return null;
        }else{
            return rows;
        }
               
    }
    
    /**
     * search trough the @param book for specific rows
     * 
     * search for specific rows trough the @param book taking a String @param a 
     * and @param b as parameters 
     * 
     * @param a String use to find specific rows 
     * @param b String use to find specific rows 
     * @return  list of rows corresponding to the search
     */
    
    public ArrayList<ArrayList<Cell>> search(String a, String b){// take two string argument return matching rows 
        int ind = -1;
        //contains the rows
        ArrayList<ArrayList<Cell>> rows = new ArrayList<ArrayList<Cell>>();
        
        //contains a row
        ArrayList<Cell> row = new ArrayList<Cell>();
        
        // go trough the search book;
        ListIterator<ArrayList<Cell>> searchBook =  book.listIterator();
        ListIterator<Cell> searchCell = null;
        ListIterator<Cell> searchCellBis = null;
        
        
        Pattern patternA = Pattern.compile("^" + a + "*",Pattern.CASE_INSENSITIVE);
        Pattern patternB = Pattern.compile("^" + b + "*",Pattern.CASE_INSENSITIVE);
        Matcher matcher = null;
        
        while (searchBook.hasNext()) {//go trough the row
            row = searchBook.next();
            searchCell = row.listIterator();// go trough the columns
            searchCellBis = row.listIterator();
            while(searchCell.hasNext()){
                if (patternA.matcher(searchCell.next().getContents()).find()) {// look for the matching string this part need more work
                    while (searchCellBis.hasNext()) {
                        if (patternB.matcher(searchCellBis.next().getContents()).find()) {
                            if (ind != book.indexOf(row)) {
                                ind = book.indexOf(row);
                                rows.add(row);
                            }
                        }
                    }
                }
            }
            searchCellBis = null;
            searchCell = null;
        }    
        if (rows.isEmpty()) {
            return null;
        } else {
            return rows;
        }
    }
    
    
    
    
    
    public ArrayList<ArrayList<Cell>> getBook(){
        return this.book;
    }

    /**
     * Edit a row in .xls sheet
     *
     * Edit a row in the .xls sheet using @param book
     *
     * @see jxl.write.WritableWorkbook
     * @see jxl.write.WritableSheet
     * 
     * @param index index of a row in @param book
     * @param compound ArrayList<String> store the compounds information
     */
    public  void editCompound(int index, ArrayList<String> compound) {
        File inputWb = new File(fileName);
        ArrayList<Cell> comp = new ArrayList<Cell>();
        Workbook w;
        try {
            
            //create workbook object from the file 
            w = Workbook.getWorkbook(inputWb);
            
            //create a copy of the workbook
            WritableWorkbook copy = Workbook.createWorkbook(new File(this.fileName), w);
            Sheet sheet = w.getSheet(0);
            
            //create a sheet object in order to modify the file
            WritableSheet sheet2 = copy.getSheet(0);
            System.out.println(book.get(index).size());
            //Add the compoumd in the sheet 
            for (int i = 0; i < book.get(index).size(); i++) {
                sheet2.addCell(new Label(book.get(index).get(i).getColumn(), book.get(index).get(i).getRow(), compound.get(i)));
            }
            
            copy.write();
            copy.close();
            w.close();
        } catch (BiffException e) {
            System.out.println("BiffException : " + e.getMessage());
        } catch (IOException b) {
            System.out.println("IOException: " + b.getMessage());
        } catch (WriteException e) {
            System.out.println("BiffException : " + e.getMessage());
            e.printStackTrace();
        }

    }

    /**
     * Add a row in .xls sheet
     *
     * add a row in the .xls sheet using @param book
     *
     * @see jxl.write.WritableWorkbook
     * @see jxl.write.WritableSheet
     * 
     * @param index index of a row in @param book
     * @param compound ArrayList<String> store the compounds information
     */
    public void addCompound(ArrayList<String> compound) {
        File inputWb = new File(fileName);
        ArrayList<Cell> comp = new ArrayList<Cell>();
        Workbook w;
        try {
            
            //create workbook object from the file 
            w = Workbook.getWorkbook(inputWb);
            
            //create a copy of the workbook
            WritableWorkbook copy = Workbook.createWorkbook(new File(this.fileName), w);
            Sheet sheet = w.getSheet(0);
            
            //create a sheet object in order to modify the file
            WritableSheet sheet2 = copy.getSheet(0);
           
            //Add the compoumd in the sheet 
            for (int i = 0; i < compound.size(); i++) {
                sheet2.addCell(new Label(i, book.size(), compound.get(i)));
            }
            copy.write();
            copy.close();
            w.close();
            //update the arrayList
            setBook(fileName);
        } catch (BiffException e) {
            System.out.println("BiffException : " + e.getMessage());
        } catch (IOException b) {
            System.out.println("IOException: " + b.getMessage());
        } catch (WriteException e) {
            System.out.println("BiffException : " + e.getMessage());
            e.printStackTrace();
        }

    }


    public String toString(){
        StringBuffer sb = new StringBuffer("");
        // go trough the search book;
        ListIterator<ArrayList<Cell>> searchBook =  book.listIterator();
        ListIterator<Cell> searchCell = null;
        
        //contains a row
        ArrayList<Cell> row = new ArrayList<Cell>();
        
        while(searchBook.hasNext()){
            row = searchBook.next();
            searchCell = row.listIterator();
            while(searchCell.hasNext()){
                sb.append(searchCell.next().getContents() + " ¡¡ ");
            }
            sb.append("\n");
            searchCell = null;
        }
        
        return sb.toString();
    }
    
    /**
     * Display the information in the the rows of the excel sheet
     *
     * @param rows rows of Cell
     * @param name column name of the table
     * @return a String representing the data in the rows
     */
    public static String displayRows(ArrayList<ArrayList<Cell>> rows, String[] name) {
        StringBuffer sb = new StringBuffer("");
        ListIterator<ArrayList<Cell>> searchBook = rows.listIterator();
        // go trough the search book;
        ListIterator<Cell> searchCell = null;

        //contains a row
        ArrayList<Cell> row = new ArrayList<Cell>();
        while (searchBook.hasNext()) {// search trouch a row
            row = searchBook.next();
            searchCell = row.listIterator();
            int i = 0;
            while (searchCell.hasNext() || i < name.length) { //search trough a column
                sb.append(name[i] + ": ");
                sb.append(searchCell.next().getContents() + "\n");
                i++;
            }
            sb.append("\n");
            searchCell = null;
        }



        return sb.toString();
    }
    /**
     * Static method take ArrayList<ArrayList<Cell>> an display it's content 
     * @param rows
     * @return a String representing the data in the row
     */
    public static String displayRow(ArrayList<ArrayList<Cell>> rows) {
        StringBuffer sb = new StringBuffer("");
        // go trough the search book;
        ListIterator<ArrayList<Cell>> searchBook = rows.listIterator();
        ListIterator<Cell> searchCell = null;

        //contains a row
        ArrayList<Cell> row = new ArrayList<Cell>();

        while (searchBook.hasNext()) {
            row = searchBook.next();
            searchCell = row.listIterator();
            while (searchCell.hasNext()) {
                sb.append(searchCell.next().getContents() + "\t" + " ¡¡ ");
            }
            sb.append("\n");
            searchCell = null;
        }

        return sb.toString();
    }
    /**
     * Display the content of a row
     * 
     * @param index index of the row in an ArrayList<ArrayList<Cell>>
     * @param rows  
     * @param name  column name of the rows in the table
     * @return 
     */
    public static String displayRow(int index, ArrayList<ArrayList<Cell>> rows, String[] name) {
        StringBuffer sb = new StringBuffer("");
        // go trough the search book;
        ListIterator<Cell> searchCell = null;

        //contains a row
        ArrayList<Cell> row = new ArrayList<Cell>();

        searchCell = rows.get(index).listIterator();
        int i = 0;
        while (searchCell.hasNext() || i < name.length) {
            sb.append(name[i] + ": ");
            sb.append(searchCell.next().getContents() + "\n");
            i++;
        }
        sb.append("\n");


        return sb.toString();
    }
    
    
    /**
     * This static method enter data in an empty dataSheet 
     * @param filename
     * @param numbOfCol 
     */
    public static void initEmptySheet(String filename, int numbOfCol) {
        try {


            WorkbookSettings wbSettings = new WorkbookSettings();
            wbSettings.setLocale(new Locale("en", "EN"));
            //create a Writable workbook
            WritableWorkbook copy = Workbook.createWorkbook(new File(filename), wbSettings);

            //create a sheet object in order to modify the file
            copy.createSheet("Compound", 0);
            WritableSheet sheet = copy.getSheet(0);

            //Add the compoumd in the sheet 
            sheet.addCell(new Label(0, 1, "Enter a new element"));
            for (int i = 1; i < numbOfCol; i++) {
                sheet.addCell(new Label(i, 1, "-"));
            }
            copy.write();
            copy.close();

        } catch (IOException b) {
            System.out.println("IOException: " + b.getMessage());
        } catch (WriteException e) {
            System.out.println("BiffException : " + e.getMessage());
            e.printStackTrace();
        }
    }
    
    /**
     * 
     * @param index
     * @param rows
     * @return 
     */
       public static String[] rowToArray(int index, ArrayList<ArrayList<Cell>> rows) {
    
        // go trough the search book;
        ListIterator<Cell> searchCell = null;

        System.out.println("size :"+rows.get(index).size());
        String[] aRow = new String[rows.get(index).size()];
        searchCell = rows.get(index).listIterator();
        int i = 0;
        while (searchCell.hasNext() && i < aRow.length) {
            aRow[i] = searchCell.next().getContents();
            System.out.println(aRow[i]+"\n");
            i++;
        }
     
        return aRow;
    }
       
       
       public boolean removeCompound(int index) {
        File inputWb = new File(fileName);
        ArrayList<Cell> comp = new ArrayList<Cell>();
        Workbook w;
        boolean success = false;
        try {
            
            //create workbook object from the file 
            w = Workbook.getWorkbook(inputWb);
            
            //create a copy of the workbook
            WritableWorkbook copy = Workbook.createWorkbook(new File(this.fileName), w);
            Sheet sheet = w.getSheet(0);
            
            //create a sheet object in order to modify the file
            WritableSheet sheet2 = copy.getSheet(0);
            System.out.println( "remove compound:" + book.get(index).size());
            //remove the compoumd in the sheet
            int row = book.get(index).get(0).getRow();
            sheet2.removeRow(row);
            success = true;
            copy.write();
            copy.close();
            w.close();
        } catch (BiffException e) {
            System.out.println("BiffException : " + e.getMessage());
        } catch (IOException b) {
            System.out.println("IOException: " + b.getMessage());
        } catch (WriteException e) {
            System.out.println("BiffException : " + e.getMessage());
            e.printStackTrace();
        }
        
        return success;

    }

       
       
       
}
