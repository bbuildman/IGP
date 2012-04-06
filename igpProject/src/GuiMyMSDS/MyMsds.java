package guimymsds;
import compound.CompoundBook;
import com.sun.tools.javac.code.Attribute;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import javax.swing.*;
import javax.swing.event.*;
import java.util.ArrayList;
import java.util.Vector;
import compound.CompoundBook;
/**
 * @author Eric Jorens
 */
public class MyMsds extends JFrame {
  // xlsBook represent a list of CompoundBook - a list of our table in form of an object parsed 
  final ArrayList<CompoundBook> xlsBook = new ArrayList<CompoundBook>();
  // groups is a vector that contain the name of our different group
  final Vector<String> groups = new Vector<String>();
  
    public MyMsds() {
        super("MyMSDS");
        initComponents();
    }

    private void mF1ActionPerformed(ActionEvent e) {
        //open action
        JOptionPane.showMessageDialog(null, "open");
    }

    private void mF2ActionPerformed(ActionEvent e) {
        //save as action
        JOptionPane.showMessageDialog(null, "save as");
    }

    private void mF3ActionPerformed(ActionEvent e) {
        //save action
        JOptionPane.showMessageDialog(null, "save");
    }

    private void mF4ActionPerformed(ActionEvent e) {
        //close action
        JOptionPane.showMessageDialog(null, "close");
    }

    private void mF5ActionPerformed(ActionEvent e) {
        //Exit command
        System.exit(0);
    }

    private void mE1ActionPerformed(ActionEvent e) {
        //edit action
        JOptionPane.showMessageDialog(null, "edit compound");
    }

    private void mV1ActionPerformed(ActionEvent e) {
        //view action
        gPane.setSelectedIndex(0);
    }

    private void mV2ActionPerformed(ActionEvent e) {
        //view action
        gPane.setSelectedIndex(1);
    }

    private void mC1ActionPerformed(ActionEvent e) {
        //comp action
        JOptionPane.showMessageDialog(null, "prev");
    }

    private void mC2ActionPerformed(ActionEvent e) {
        //comp action
        JOptionPane.showMessageDialog(null, "next");
    }

    private void mM1ActionPerformed(ActionEvent e) {
        //msds action
        JOptionPane.showMessageDialog(null, "look up");
    }

    private void mM2ActionPerformed(ActionEvent e) {
        //msds action
        JOptionPane.showMessageDialog(null, "view");
    }

    private void mH1ActionPerformed(ActionEvent e) {
        //help action
        JOptionPane.showMessageDialog(null, "help");
    }

    private void mH2ActionPerformed(ActionEvent e) {
        //help action
        JOptionPane.showMessageDialog(null, "about");
    }

    private void cListValueChanged(ListSelectionEvent e) {
        //compound select action
        //JOptionPane.showMessageDialog(null, "coupound item selected\nIndex: " + e.getFirstIndex());
    }

    private void gListValueChanged(ListSelectionEvent e) {
        //group select action
        
        //JOptionPane.showMessageDialog(null, "group item select\nIndex: " + e.getFirstIndex());
    }

    private void gAddActionPerformed(ActionEvent e) {
        //group add action
        //JOptionPane.showMessageDialog(null, "group add");
    }

    private void cAddActionPerformed(ActionEvent e) {
        //compound add action
        JOptionPane.showMessageDialog(null, "compound add");
    }

    private void initComponents() {

        //Components
        menuBar1 = new JMenuBar();
        mFile = new JMenu();
        mF1 = new JMenuItem();
        mF2 = new JMenuItem();
        mF3 = new JMenuItem();
        mF4 = new JMenuItem();
        mF5 = new JMenuItem();
        mEdit = new JMenu();
        mE1 = new JMenuItem();
        mView = new JMenu();
        mV1 = new JMenuItem();
        mV2 = new JMenuItem();
        mComp = new JMenu();
        mC1 = new JMenuItem();
        mC2 = new JMenuItem();
        mMsds = new JMenu();
        mM1 = new JMenuItem();
        mM2 = new JMenuItem();
        mHelp = new JMenu();
        mH1 = new JMenuItem();
        mH2 = new JMenuItem();
        gPane = new JTabbedPane();
        panel4 = new JPanel();
        mLab1 = new JLabel();
        sComp1 = new JTextField();
        gLab1 = new JLabel();
        cLab1 = new JLabel();
        cScroll = new JScrollPane();
        cList = new JList();
        mScroll = new JScrollPane();
        mText = new JTextArea();
        gScroll = new JScrollPane();
        gList = new JList();
        gAdd = new JButton();
        cAdd = new JButton();
        mEdit1 = new JButton();
        cPane = new JPanel();
        mLab2 = new JLabel();
        sComp2 = new JTextField();
        mScroll2 = new JScrollPane();
        mText2 = new JTextArea();
        cAdd2 = new JButton();
        mEdit2 = new JButton();
        prevComp = new JButton();
        nextComp = new JButton();
        
        //======== this ========
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        Container contentPane = getContentPane();
        contentPane.setLayout(new GridLayout());

        //======== menuBar1 ========
        {

            //======== mFile ========
            {
                mFile.setText("File");

                //---- mF1 ----
                mF1.setText("Open...");
                mF1.addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent e) {
                        mF1ActionPerformed(e);
                    }
                });
                mFile.add(mF1);

                //---- mF2 ----
                mF2.setText("Save As...");
                mF2.addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent e) {
                        mF2ActionPerformed(e);
                    }
                });
                mFile.add(mF2);

                //---- mF3 ----
                mF3.setText("Save");
                mF3.addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent e) {
                        mF3ActionPerformed(e);
                    }
                });
                mFile.add(mF3);

                //---- mF4 ----
                mF4.setText("Close");
                mF4.addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent e) {
                        mF4ActionPerformed(e);
                    }
                });
                mFile.add(mF4);

                //---- mF5 ----
                mF5.setText("Exit");
                mF5.addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent e) {
                        mF5ActionPerformed(e);
                    }
                });
                mFile.add(mF5);
            }
            menuBar1.add(mFile);

            //======== mEdit ========
            {
                mEdit.setText("Edit");

                //---- mE1 ----
                mE1.setText("Edit Compound...");
                mE1.addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent e) {
                        mE1ActionPerformed(e);
                    }
                });
                mEdit.add(mE1);
            }
            menuBar1.add(mEdit);

            //======== mView ========
            {
                mView.setText("View");

                //---- mV1 ----
                mV1.setText("Group View");
                mV1.addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent e) {
                        mV1ActionPerformed(e);

                    }
                });
                mView.add(mV1);

                //---- mV2 ----
                mV2.setText("Compound View");
                mV2.addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent e) {
                        mV2ActionPerformed(e);
                    }
                });
                mView.add(mV2);
            }
            menuBar1.add(mView);

            //======== mComp ========
            {
                mComp.setText("Compound");

                //---- mC1 ----
                mC1.setText("Previous");
                mC1.addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent e) {
                        mC1ActionPerformed(e);
                    }
                });
                mComp.add(mC1);

                //---- mC2 ----
                mC2.setText("Next");
                mC2.addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent e) {
                        mC2ActionPerformed(e);
                    }
                });
                mComp.add(mC2);
            }
            menuBar1.add(mComp);

            //======== mMsds ========
            {
                mMsds.setText("MSDS");

                //---- mM1 ----
                mM1.setText("Look up compound...");
                mM1.addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent e) {
                        mM1ActionPerformed(e);
                    }
                });
                mMsds.add(mM1);

                //---- mM2 ----
                mM2.setText("View Repository");
                mM2.addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent e) {
                        mM2ActionPerformed(e);
                    }
                });
                mMsds.add(mM2);
            }
            menuBar1.add(mMsds);

            //======== mHelp ========
            {
                mHelp.setText("Help");

                //---- mH1 ----
                mH1.setText("Help");
                mH1.addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent e) {
                        mH1ActionPerformed(e);
                    }
                });
                mHelp.add(mH1);

                //---- mH2 ----
                mH2.setText("About...");
                mH2.addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent e) {
                        mH2ActionPerformed(e);
                    }
                });
                mHelp.add(mH2);
            }
            menuBar1.add(mHelp);
        }
        setJMenuBar(menuBar1);

        //======== gPane ========
        {

            //======== panel4 ========
            {

                panel4.setLayout(new GridBagLayout());
                ((GridBagLayout) panel4.getLayout()).columnWidths = new int[]{41, 190, 6, 179, 0, 224, 153};
                ((GridBagLayout) panel4.getLayout()).rowHeights = new int[]{0, 0, 450, 0, 0};
                ((GridBagLayout) panel4.getLayout()).rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0E-4};

                //---- mLab1 ----
                mLab1.setText("MSDS");
                panel4.add(mLab1, new GridBagConstraints(4, 0, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 5, 5), 0, 0));
                panel4.add(sComp1, new GridBagConstraints(6, 0, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 5, 0), 0, 0));

                //---- gLab1 ----
                gLab1.setText("Group");
                gLab1.setBackground(Color.white);
                panel4.add(gLab1, new GridBagConstraints(0, 1, 2, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 5, 5), 0, 0));

                //---- cLab1 ----
                cLab1.setText("Compound");
                cLab1.setBackground(Color.white);
                panel4.add(cLab1, new GridBagConstraints(2, 1, 2, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 5, 5), 0, 0));

                //======== gScroll ========
                {

                    //---- gList ----

                    //sample data
                  
                    setGroupList();
                    //set the list                    
                    gList.addListSelectionListener(new ListSelectionListener() {

                        public void valueChanged(ListSelectionEvent event) {

                            if (!event.getValueIsAdjusting()) {//check if the value is adjusted
                                int size = xlsBook.get(gList.getSelectedIndex()).getBook().size();//get the size (number of coumpoud) of the selected Compoundbook int the xlsBook
                                String[] comps = new String[size];// array of commpounds set to the size (number of element) of the compoundBook
                                for (int i = 0; i < size; i++) {// this loop is addind coupound names in the array comps
                                    comps[i] = xlsBook.get(gList.getSelectedIndex()).getBook().get(i).get(0).getContents();
                                }
                                String[] name = {"compoud name", "Manufacturer", "Catalog #", "Location", "Size", "Quantity", "Amount Remaining", "Date Received", "CAS #"};
                                mText2.setText(CompoundBook.displayRows(xlsBook.get(gList.getSelectedIndex()).getBook(), name));
                                //mText2.setText((xlsBook.get(gList.getSelectedIndex()).displayRows(xlsBook.get(gList.getSelectedIndex()).getBook())));
                                cList.setListData(comps);// setting the compound list in the gui
                            }
                            
                            gListValueChanged(event);
                        }
                    });

                    

                    gScroll.setViewportView(gList);
                }
                panel4.add(gScroll, new GridBagConstraints(0, 2, 2, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 5, 5), 0, 0));
                //======== cScroll ========
                {

                    //---- cList ----
                
                    //final CompoundBook xlfile = new CompoundBook("/Users/bbuildman/Desktop/java/assignments/igpProject/src/AllCompounds.xls");
                
                    //String[] comps = new String[xlfile.getBook().size()];
                    
                    cList.addListSelectionListener(new ListSelectionListener() {
                        
                        public void valueChanged(ListSelectionEvent e) {
                            if (!e.getValueIsAdjusting()) {// check if the value of the cList selection has been changed
                                String[] name = {"compoud name", "Manufacturer", "Catalog #", "Location", "Size", "Quantity", "Amount Remaining", "Date Received", "CAS #"};
                                if (!cList.isSelectionEmpty()) {// in the case that the user selects another group, to avoid cList to be empty
                                    mText.setText(CompoundBook.displayRow(cList.getSelectedIndex(), xlsBook.get(gList.getSelectedIndex()).getBook(), name));
                                    cListValueChanged(e);
                                } else {
                                    mText.setText("");
                                }
                            }
                        }
                    });



                    cScroll.setViewportView(cList);
                }
                panel4.add(cScroll, new GridBagConstraints(2, 2, 2, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 5, 5), 0, 0));

                //======== mScroll ========
                {
                    mScroll.setViewportView(mText);
                }
                panel4.add(mScroll, new GridBagConstraints(4, 1, 3, 2, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 5, 0), 0, 0));

                

                //---- gAdd ---- adding a new group
                gAdd.setText("+");
                gAdd.addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent e) {
                        // I used the dialog box to get input
                        String filename = JOptionPane.showInputDialog(null, "Create a new group : ", "Add a new coumpond", 1);
                        
                        if (filename != null) {
                            JOptionPane.showMessageDialog(null, "You created the group : " + filename, "File created", 1);
                            //Create a new .xls file
                            File file = new File(filename + ".xls");
                            CompoundBook.initEmptySheet(filename+".xls", 9);
                            CompoundBook book = new CompoundBook(filename+".xls");
                            //add the new group our xlsBook (objec) and the group list 
                            xlsBook.add(book); 
                            groups.add(filename);
                            gList.setListData(groups);
                            /*
                             * To actually create a file specified by a
                             * pathname, use boolean createNewFile() method of
                             * Java File class.
                             *
                             * This method creates a new empty file specified if
                             * the file with same name does not exists.
                             *
                             * This method returns true if the file with the
                             * same name did not exist and it was created
                             * successfully, false otherwise.
                             */

                            boolean blnCreated = false;
                            try {
                                blnCreated = file.createNewFile();
                            } catch (IOException ioe) {
                                System.out.println("Error while creating a new empty file :" + ioe);
                            }
                            if (blnCreated) {
                                JOptionPane.showMessageDialog(null, "You created the file: " + filename+".xls",
                                        "Roseindia.net", 1);
                            }
                            /*
                             * If you run the same program 2 times, first time
                             * it should return true. But when we run it second
                             * time, it returns false because file was already
                             * exist.
                             */
                            //System.out.println("Was file " + file.getPath() + " created ? : " + blnCreated);

                        }
                            
                         
                        
                        gAddActionPerformed(e);
                    }
                });
                panel4.add(gAdd, new GridBagConstraints(0, 3, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 0, 5), 0, 0));

                //---- cAdd ----
                cAdd.setText("+");
                cAdd.addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent e) {
                        cAddActionPerformed(e);
                    }
                });
                panel4.add(cAdd, new GridBagConstraints(2, 3, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 0, 5), 0, 0));

                //---- mEdit1 ----
                mEdit1.setText("Edit");
                mEdit1.addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent e) {
                        mE1ActionPerformed(e);
                    }
                });
                panel4.add(mEdit1, new GridBagConstraints(4, 3, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 0, 5), 0, 0));
            }
            gPane.addTab("Groups", panel4);


            //======== cPane ========
            {
                cPane.setLayout(new GridBagLayout());
                ((GridBagLayout) cPane.getLayout()).columnWidths = new int[]{28, 29, 751, 70, 67};
                ((GridBagLayout) cPane.getLayout()).rowHeights = new int[]{0, 475, 0, 0};
                ((GridBagLayout) cPane.getLayout()).rowWeights = new double[]{0.0, 0.0, 0.0, 1.0E-4};

                //---- mLab2 ----
                mLab2.setText("MSDS");
                cPane.add(mLab2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 5, 5), 0, 0));
                cPane.add(sComp2, new GridBagConstraints(3, 0, 2, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 5, 0), 0, 0));

                //======== mScroll2 ========
                {
                    mScroll2.setViewportView(mText2);
                }
                cPane.add(mScroll2, new GridBagConstraints(0, 1, 5, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 5, 0), 0, 0));

                //---- cAdd2 ----
                cAdd2.setText("+");
                cAdd2.addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent e) {
                        cAddActionPerformed(e);
                    }
                });
                cPane.add(cAdd2, new GridBagConstraints(0, 2, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 0, 5), 0, 0));

                //---- mEdit2 ----
                mEdit2.setText("Edit");
                mEdit2.addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent e) {
                        mE1ActionPerformed(e);
                    }
                });
                cPane.add(mEdit2, new GridBagConstraints(1, 2, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 0, 5), 0, 0));

                //---- prevComp ----
                prevComp.setText("<");
                prevComp.addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent e) {
                        mC1ActionPerformed(e);
                    }
                });
                cPane.add(prevComp, new GridBagConstraints(3, 2, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 0, 5), 0, 0));

                //---- nextComp ----
                nextComp.setText(">");
                nextComp.addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent e) {
                        mC2ActionPerformed(e);
                    }
                });
                cPane.add(nextComp, new GridBagConstraints(4, 2, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 0, 0), 0, 0));
            }
            gPane.addTab("Compound", cPane);

        }
        contentPane.add(gPane);
        pack();
        setLocationRelativeTo(getOwner());
        setVisible(true);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }
    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Eric Jorens
    private JMenuBar menuBar1;
    private JMenu mFile;
    private JMenuItem mF1;
    private JMenuItem mF2;
    private JMenuItem mF3;
    private JMenuItem mF4;
    private JMenuItem mF5;
    private JMenu mEdit;
    private JMenuItem mE1;
    private JMenu mView;
    private JMenuItem mV1;
    private JMenuItem mV2;
    private JMenu mComp;
    private JMenuItem mC1;
    private JMenuItem mC2;
    private JMenu mMsds;
    private JMenuItem mM1;
    private JMenuItem mM2;
    private JMenu mHelp;
    private JMenuItem mH1;
    private JMenuItem mH2;
    private JTabbedPane gPane;
    private JPanel panel4;
    private JLabel mLab1;
    private JTextField sComp1;
    private JLabel gLab1;
    private JLabel cLab1;
    private JScrollPane cScroll;
    private JList cList;
    private JScrollPane mScroll;
    private JTextArea mText;
    private JScrollPane gScroll;
    private JList gList;
    private JButton gAdd;
    private JButton cAdd;
    private JButton mEdit1;
    private JPanel cPane;
    private JLabel mLab2;
    private JTextField sComp2;
    private JScrollPane mScroll2;
    private JTextArea mText2;
    private JButton cAdd2;
    private JButton mEdit2;
    private JButton prevComp;
    private JButton nextComp;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    
    /**
     * This program set the group list by adding all the .xls file in the current working
     * folder
     */
    public void setGroupList() {
        
        String path = "."; //curent folder
        String files; //files name
        File folder = new File(path); // get the folfer
        File[] listOfFiles = folder.listFiles(); //list of files
        for (int i = 0; i < listOfFiles.length; i++) {//this loop go trough the folder
            if (listOfFiles[i].isFile()) {
                files = listOfFiles[i].getName();
                if (files.endsWith(".xls") || files.endsWith(".XLS")) {//filter all the xls file
                    if(!files.equalsIgnoreCase(".xls")){
                    // add a new objet CompoundBook in a our xlsBook
                    xlsBook.add(new CompoundBook(files));
                    //add only the name of the file without the .xls extension
                    groups.add(files.substring(0, files.lastIndexOf(".")));
                    }
                }
            }
        }
        gList.setListData(groups); // set the group List on the GUI
    }

    public static void main(String[] args) {
        MyMsds t = new MyMsds();
        t.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
