

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 * 
 */
import compound.CompoundBook;
import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author bbuildman
 */
public class TestComp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CompoundBook xlfile = new CompoundBook(args[0]);
        ArrayList<String> compound = new ArrayList<String>();
       
//        for(int i =0; i<9; i++){
//            compound.add(args[3]);
//        }
        System.out.println(xlfile.getBook().size());
        System.out.println(xlfile.getBook().get(1).size());
        System.out.println(CompoundBook.rowToArray(0, xlfile.getBook()));
        //xlfile.addCompound(compound);
        //System.out.println( CompoundBook.displayRow(xlfile.search(args[1])));
        //System.out.println( xlfile.displayRows(xlfile.search( args[1],args[2])));
        // TODO code application logic here
        
        //CompoundBook.initEmptySheet("margaret.xls", 9);
        // Directory path here
        String path = ".";

        String files;
        File folder = new File(path);
        File[] listOfFiles = folder.listFiles();

        for (int i = 0; i < listOfFiles.length; i++) {

            if (listOfFiles[i].isFile()) {
                files = listOfFiles[i].getName();
                if (files.endsWith(".xls") || files.endsWith(".XLS")) {
                    System.out.println(files);
                }
            }
        }

    }
}
