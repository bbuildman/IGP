/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GuiMyMSDS;

import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;
import jxl.Cell;
import static java.awt.GridBagConstraints.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import compound.CompoundBook;

/**
 *
 * @author bbuildman
 */
public class AddWindow extends JDialog {
    private JLabel compoundName, manufacturer, catalog,
            location, size, quantity, amRem,
            dateReceived, cas ;
    private JTextField a,b,c,d,e,f,g,h,i;
    private JButton editButton, cancelButton;
    private ArrayList<String> updates;
    private boolean update = false;
   
    public AddWindow (JFrame frame, final CompoundBook book){
        
        super(frame,"Edit Compound",true);
        
        setLayout( new GridBagLayout());

        GridBagConstraints leftCons = new GridBagConstraints();
        leftCons.anchor = NORTHEAST;
        leftCons.fill = NONE;
        leftCons.weightx = 1.0;
        leftCons.gridy = RELATIVE;
        leftCons.gridx = 0;
        leftCons.insets = new Insets(1, 4, 1, 4);

        GridBagConstraints rightCons = new GridBagConstraints();
        rightCons.anchor = NORTHWEST;
        rightCons.fill = HORIZONTAL;
        rightCons.weightx = 1.0;
        rightCons.gridy = RELATIVE;
        rightCons.gridx = 1;
        rightCons.insets = leftCons.insets;
        
        GridBagConstraints rightConsB = new GridBagConstraints();
        rightConsB.anchor = NORTHWEST;
        rightConsB.fill = NONE;
        rightConsB.weightx = 1.0;
        rightConsB.gridy = RELATIVE;
        rightConsB.gridx = 1;
        rightConsB.insets = leftCons.insets;
        
        
        
        compoundName = new JLabel("Compound Name");
        add(compoundName, leftCons);
        a = new JTextField("",10);
        add(a, rightCons);
        
       manufacturer = new JLabel("Manufacturer");
        add(manufacturer, leftCons);        
        b = new JTextField("-",10);
        add(b, rightCons);
        
        catalog = new JLabel("Catalog");
        add(catalog, leftCons);   
        c = new JTextField("-",10);
        add(c, rightCons);
          
        location = new JLabel("Location");
        add(location, leftCons);
        d = new JTextField("-",10);
        add(d, rightCons);
       
        size = new JLabel("Size");
        add(size, leftCons);
        e = new JTextField("-",10);
        add(e, rightCons);
                    
        quantity = new JLabel("quantity");
        add(quantity, leftCons);
        f = new JTextField("-",10);
        add(f, rightCons);
              
        amRem = new JLabel("Amount remaining");
        add(amRem, leftCons);
        g = new JTextField("-",10);
        add(g,rightCons);
        
        dateReceived = new JLabel("Date received");
        add(dateReceived, leftCons);
        h = new JTextField("-",10);
        add(h,rightCons);  
        
        cas = new JLabel("CAS #");
        add(cas, leftCons);
        i = new JTextField("-",10);
        add(i,rightCons);
        
        editButton = new JButton("update");
        
        editButton.addActionListener(new ActionListener(){
            
            public void actionPerformed(ActionEvent event) {
                
                updates = new ArrayList<String>();
                updates.add(a.getText());
                updates.add(b.getText());
                updates.add(c.getText());
                updates.add(d.getText());
                updates.add(e.getText());
                updates.add(f.getText());
                updates.add(g.getText());
                updates.add(h.getText());
                updates.add(i.getText());
                book.addCompound(updates);
                update =  true;
                
                setVisible(false);
            }

        });
        add(editButton,leftCons);
        
        cancelButton = new JButton("cancel");
        cancelButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){
                setVisible(false);
            }
        }
               
                );
        add(cancelButton,rightConsB);
        
    }
    
   public boolean getUpdate(){
       return update;
   }
}
