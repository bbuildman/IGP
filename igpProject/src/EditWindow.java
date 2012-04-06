/**
 * @author      Buildman Biyong
 * @version     1.0                 (the version of the package this class was first added to)                   
 * @since       2012-03-19          (a date or the version number of this program)
 */

import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;
import jxl.Cell;

/**
 *
 * @author bbuildman
 */
public class EditWindow extends JDialog {
    
    private JLabel compoundName, manufacturer, catalog,
            location, size, quantity, amRem,
            dateReceived, CAS ;
    private JTextField a,b,c,d,e,f,g,h,i;
    private JButton editButton;
     
    
    public EditWindow (JFrame frame, String[] row){
        super(frame,"Edit Compound",true);
        setLayout(new FlowLayout());
        
       
        
        a = new JTextField(row[0],10);
        add(a);
        
        compoundName = new JLabel("Compound Name");
        add(compoundName);
        
        b = new JTextField(row[1],10);
        add(b);
        
        manufacturer = new JLabel("Manufacturer");
        add(manufacturer);
         
        c = new JTextField(row[2],10);
        add(c);
        
        catalog = new JLabel("Catalog");
        add(compoundName);
        
        d = new JTextField(row[3],10);
        add(d);
       
         location = new JLabel("Location");
        add(location);
       
        
        e = new JTextField(row[4],10);
        add(e);
       
         size = new JLabel("Size");
        add(size);
       
        
        f = new JTextField(row[5],10);
        add(f);
       
         quantity = new JLabel("quantity");
        add(quantity);
       
        
        g = new JTextField(row[6],10);
        add(g);
        
        amRem = new JLabel("Amount remaining");
        add(amRem);
        
        
        editButton = new JButton("edit");
        add(editButton);
        
        
    }
    
   
    

}
