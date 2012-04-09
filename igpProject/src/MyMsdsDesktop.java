import GuiMyMSDS.AddWindow;
import compound.CompoundBook;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.*;
import javax.swing.event.*;


/*
 * Created by JFormDesigner on Mon Apr 02 22:50:53 EDT 2012
 */



/**
 * @author Eric Jorens
 */
public class MyMsdsDesktop extends JFrame {
  // xlsBook represent a list of CompoundBook - a list of our table in form of an object parsed 
  final ArrayList<CompoundBook> xlsBook = new ArrayList<CompoundBook>();
  // groups is a vector that contain the name of our different group
  final Vector<String> groups = new Vector<String>();	
  DefaultListModel groupList = new DefaultListModel();
  DefaultListModel compList = new DefaultListModel();
	public MyMsdsDesktop() {
		super("MyMsdsDesktop");
		initComponents();
	}

	private void mF5ActionPerformed(ActionEvent e) {
		//  add your code here

	}
	
	
	private void f1ActionPerformed(ActionEvent e) {
		//  add your code here
		noteTextArea.setFont(new Font("Times New Roman", Font.PLAIN, 15));
	}
	private void f2ActionPerformed(ActionEvent e) {
		//  add your code here
		noteTextArea.setFont(new Font("Times New Roman", Font.PLAIN, 20));
	}
	private void f3ActionPerformed(ActionEvent e) {
		//  add your code here
		noteTextArea.setFont(new Font("Times New Roman", Font.PLAIN, 30));
	}
	
	
	//NOTEPAD COLOURS
	private void yColActionPerformed(ActionEvent e) {
		//  add your code here
		noteTextArea.setBackground(new Color(250,250,210));
	}	
	private void gColActionPerformed(ActionEvent e) {
		//  add your code here
		noteTextArea.setBackground(new Color(127,255,212));
	}	
	private void wColActionPerformed(ActionEvent e) {
		//  add your code here
		noteTextArea.setBackground(new Color(255,255,255));
	}	
	private void bColActionPerformed(ActionEvent e) {
		//  add your code here
		noteTextArea.setBackground(new Color(135,206,250));
	}
	

	private void mExitActionPerformed(ActionEvent e) {
		//  add your code here
		int result = JOptionPane.showConfirmDialog(null, "Are you sure you want to Exit?", "Exit Dialogue",DISPOSE_ON_CLOSE);
		if(result == JOptionPane.YES_OPTION){
			System.exit(0);
		}
	}

	private void mH1ActionPerformed(ActionEvent e) {
		//  add your code here
		JOptionPane.showMessageDialog(null, "This is the help pane. Put link to help here.");
	}
	private void mH2ActionPerformed(ActionEvent e) {
		//  add your code here
		JOptionPane.showMessageDialog(null, "MyMsdsDesktop\nversion 2.0.0\nBEJ_Solutions");
	}
	
	
	
	private void mWin1ActionPerformed(ActionEvent e) {
		//  add your code here
		myMsds.move(10,10);
		myMsds.moveToFront();
		myMsds.show();
	}
	private void mWin2ActionPerformed(ActionEvent e) {
		//  add your code here
		myLook.move(10, 10);
		myLook.moveToFront();
		myLook.show();
	}
	private void mWin3ActionPerformed(ActionEvent e) {
		//  add your code here
		myNotes.move(10,10);
		myNotes.moveToFront();
		myNotes.show();
	}
	private void mWin4ActionPerformed(ActionEvent e) {
		//  add your code here
		myCalc.move(10,10);
		myCalc.moveToFront();
		myCalc.show();
	}



	private void gListValueChanged(ListSelectionEvent e) {
		//  add your code here
	}

	private void gAddActionPerformed(ActionEvent e) {
		//  add your code here
	}

	private void gRemoveActionPerformed(ActionEvent e) {
		//  add your code here
	}

	private void cListValueChanged(ListSelectionEvent e) {
		//  add your code here
	}

	private void cAddActionPerformed(ActionEvent e) {
		//  add your code here
	}

	private void cRemoveActionPerformed(ActionEvent e) {
		//  add your code here
	}

	private void mEditButtonActionPerformed(ActionEvent e) {
		//  add your code here
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		// Generated using JFormDesigner Evaluation license - Eric Jorens
		
                                                                        
            
                menuBar1 = new JMenuBar();
		mFile = new JMenu();
		mExit = new JMenuItem();
		mWindow = new JMenu();
		mWin1 = new JMenuItem();
		mWin2 = new JMenuItem();
		mWin3 = new JMenuItem();
		mWin4 = new JMenuItem();
		mHelp = new JMenu();
		mH1 = new JMenuItem();
		mH2 = new JMenuItem();
		mainPanel = new JPanel();
		desktopPane = new JDesktopPane();
		myMsds = new JInternalFrame();
		gPanel = new JPanel();
		gLab = new JLabel();
		gScroll2 = new JScrollPane();
		gList2 = new JList(groupList);
		gSubPanel = new JPanel();
		gButtonPanel = new JPanel();
		gAdd = new JButton();
		gRemove = new JButton();
		gLabPanel = new JPanel();
		gValLab = new JLabel();
		cPanel = new JPanel();
		cLab = new JLabel();
		cScroll2 = new JScrollPane();
		cList2 = new JList();
		cSubPanel = new JPanel();
		cButtonPanel = new JPanel();
		cAdd = new JButton();
		cRemove = new JButton();
		cValPanel = new JPanel();
		cValLab = new JLabel();
		mPanel = new JPanel();
		mLab = new JLabel();
		scrollPane4 = new JScrollPane();
		mText = new JTextArea();
		mButtonPanel = new JPanel();
		mEditButton = new JButton();
		myNotes = new JInternalFrame();
		noteBar = new JMenuBar();
		fSize = new JMenu();
		f1 = new JMenuItem();
		f2 = new JMenuItem();
		f3 = new JMenuItem();
		menuColour = new JMenu();
		yCol = new JMenuItem();
		bCol = new JMenuItem();
		gCol = new JMenuItem();
		wCol = new JMenuItem();
		noteScroll = new JScrollPane();
		noteTextArea = new JTextArea();
		myLook = new JInternalFrame();
		myCalc = new JInternalFrame();

		//======== this ========
		setMinimumSize(new Dimension(1200, 500));
		setName("main");
		Container contentPane = getContentPane();
		contentPane.setLayout(new GridLayout());

		//======== menuBar1 ========
		{

			//======== mFile ========
			{
				mFile.setText("File");
				mFile.setComponentPopupMenu(null);

				//---- mExit ----
				mExit.setText("Exit");
				mExit.addActionListener(new ActionListener() {
					
					public void actionPerformed(ActionEvent e) {
						mF5ActionPerformed(e);
						mExitActionPerformed(e);
					}
				});
				mFile.add(mExit);
			}
			menuBar1.add(mFile);

			//======== mWindow ========
			{
				mWindow.setText("Window");

				//---- mWin1 ----
				mWin1.setText("MyMSDS");
				mWin1.addActionListener(new ActionListener() {
					
					public void actionPerformed(ActionEvent e) {
						mWin1ActionPerformed(e);
					}
				});
				mWindow.add(mWin1);

				//---- mWin2 ----
				mWin2.setText("LookUp");
				mWin2.addActionListener(new ActionListener() {
					
					public void actionPerformed(ActionEvent e) {
						mWin2ActionPerformed(e);
					}
				});
				mWindow.add(mWin2);

				//---- mWin3 ----
				mWin3.setText("MyNotes");
				mWin3.addActionListener(new ActionListener() {
					
					public void actionPerformed(ActionEvent e) {
						mWin3ActionPerformed(e);
					}
				});
				mWindow.add(mWin3);

				//---- mWin4 ----
				mWin4.setText("MyCalc");
				mWin4.addActionListener(new ActionListener() {
					
					public void actionPerformed(ActionEvent e) {
						mWin4ActionPerformed(e);
					}
				});
				mWindow.add(mWin4);
			}
			menuBar1.add(mWindow);

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

		//======== mainPanel ========
		{

			// JFormDesigner evaluation mark
		mainPanel.setBorder(new javax.swing.border.CompoundBorder(
				new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
					"", javax.swing.border.TitledBorder.CENTER,
					javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
					java.awt.Color.red), mainPanel.getBorder())); mainPanel.addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});

			mainPanel.setLayout(new GridLayout());

			//======== desktopPane ========
			{
				desktopPane.setSelectedFrame(myMsds);

				//======== myMsds ========
				{
					myMsds.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
					myMsds.setClosable(true);
					myMsds.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
					myMsds.setTitle("MyMSDS");
					myMsds.setVisible(true);
					myMsds.setResizable(true);
					myMsds.setIconifiable(true);
					myMsds.setMinimumSize(new Dimension(900, 250));
					myMsds.setMaximizable(true);
					myMsds.setToolTipText("MyMSDS");
					Container myMsdsContentPane = myMsds.getContentPane();
					myMsdsContentPane.setLayout(new GridBagLayout());
					((GridBagLayout)myMsdsContentPane.getLayout()).columnWidths = new int[] {265, 262, 0, 0};
					((GridBagLayout)myMsdsContentPane.getLayout()).rowHeights = new int[] {0, 0};
					((GridBagLayout)myMsdsContentPane.getLayout()).columnWeights = new double[] {0.0, 0.0, 1.0, 1.0E-4};
					((GridBagLayout)myMsdsContentPane.getLayout()).rowWeights = new double[] {1.0, 1.0E-4};

					//======== gPanel ========
					{
						gPanel.setMinimumSize(new Dimension(100, 600));
						gPanel.setBackground(SystemColor.window);
						gPanel.setLayout(new GridBagLayout());
						((GridBagLayout)gPanel.getLayout()).columnWidths = new int[] {0, 0};
						((GridBagLayout)gPanel.getLayout()).rowHeights = new int[] {22, 373, 0, 0};
						((GridBagLayout)gPanel.getLayout()).columnWeights = new double[] {1.0, 1.0E-4};
						((GridBagLayout)gPanel.getLayout()).rowWeights = new double[] {0.0, 1.0, 0.0, 1.0E-4};

						//---- gLab ----
						gLab.setText("Group");
						gLab.setMinimumSize(new Dimension(35, 15));
						gLab.setBackground(SystemColor.window);
						gPanel.add(gLab, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
							GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
							new Insets(0, 0, 0, 0), 0, 0));

						//======== gScroll2 ========
						{
                                                //---- gList ----

                                                    //sample data

                                                    setGroupList();
                                                    //set the list

							//---- gList2 ----
							gList2.setMinimumSize(new Dimension(40, 100));
							gList2.addListSelectionListener(new ListSelectionListener() {
							
					                    public void valueChanged(ListSelectionEvent e) {
                                                                if (!e.getValueIsAdjusting() && !gList2.isSelectionEmpty()) {//check if the value is adjusted 
                                                                    //there's some kind of error here
                                                                    int size = xlsBook.get(gList2.getSelectedIndex()).getBook().size();//get the size (number of coumpoud) of the selected Compoundbook int the xlsBook
                                                                    String[] comps = new String[size];// array of commpounds set to the size (number of element) of the compoundBook
                                                                    for (int i = 0; i < size; i++) {// this loop is addind coupound names in the array comps
                                                                        comps[i] = xlsBook.get(gList2.getSelectedIndex()).getBook().get(i).get(0).getContents();
                                                                    }
                                                                    
                                                                    cList2.setListData(comps);// setting the compound list in the gui
                                                                }
                       
                                                                    gListValueChanged(e);
								}
							});
							gScroll2.setViewportView(gList2);
						}
						gPanel.add(gScroll2, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0,
							GridBagConstraints.CENTER, GridBagConstraints.BOTH,
							new Insets(0, 0, 0, 0), 0, 3));

						//======== gSubPanel ========
						{
							gSubPanel.setLayout(new GridLayout());

							//======== gButtonPanel ========
							{
								gButtonPanel.setMinimumSize(new Dimension(100, 35));
								gButtonPanel.setBackground(SystemColor.window);
								gButtonPanel.setLayout(new FlowLayout(FlowLayout.LEFT));

								//---- gAdd ----
								gAdd.setText("+");
								gAdd.setPreferredSize(new Dimension(60, 25));
								gAdd.setMinimumSize(new Dimension(44, 30));
								gAdd.setMaximumSize(new Dimension(44, 30));
								gAdd.setToolTipText("Add a Group");
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
                                                                            gList2.setListData(groups);
                                                                            if(!cList2.isSelectionEmpty()){
                                                                                    cList2.clearSelection();
                                                                                    gList2.clearSelection();
                                                                                    cList2.removeAll();
                                                                                    cList2.setModel(compList);
                                                                             }
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
								gButtonPanel.add(gAdd);

								//---- gRemove ----
								gRemove.setText("-");
								gRemove.setMinimumSize(new Dimension(44, 30));
								gRemove.setPreferredSize(new Dimension(60, 25));
								gRemove.setMaximumSize(new Dimension(44, 30));
								gRemove.setToolTipText("Remove selected Group");
								gRemove.addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent e) {
                                                                        
                                                                            if (!gList2.isSelectionEmpty()) {
                                                                                String filename = groups.get(gList2.getSelectedIndex()) + ".xls";
                                                                                
                                                                                int result = JOptionPane.showConfirmDialog(null,
                                                                                        "Do you want to remove :" + filename, "information",
                                                                                        JOptionPane.YES_NO_CANCEL_OPTION, 1);
                                                                                if (result == JOptionPane.YES_OPTION) {
                                                                                    boolean success = (new File(filename)).delete();
                                                                                   if(!cList2.isSelectionEmpty()){
                                                                                      cList2.clearSelection();
                                                                                      //cList2.removeAll();
                                                                                      //cList2 = new JList(compList);
                                                                                    }
                                                                              
                                                                                    if (success) {
                                                                                        JOptionPane.showMessageDialog(null, "You have successfuly remove the group : " + filename, "File removed", 2);
                                                                                        int index = gList2.getSelectedIndex();
                                                                                        xlsBook.remove(index);
                                                                                        groups.remove(index);        
                                                                                        gList2.setListData(groups);
                                                                                        
                                                                                    }

                                                                                }
                                                                            }
                                                                            gRemoveActionPerformed(e);
									}
								});
								gButtonPanel.add(gRemove);
							}
							gSubPanel.add(gButtonPanel);

							//======== gLabPanel ========
							{
								gLabPanel.setBackground(SystemColor.window);
								gLabPanel.setLayout(new FlowLayout());

								//---- gValLab ----
								gValLab.setText("# Groups");
								gValLab.setBackground(Color.white);
								gLabPanel.add(gValLab);
							}
							gSubPanel.add(gLabPanel);
						}
						gPanel.add(gSubPanel, new GridBagConstraints(0, 2, 1, 1, 0.0, 0.0,
							GridBagConstraints.CENTER, GridBagConstraints.BOTH,
							new Insets(0, 0, 0, 0), 0, 0));
					}
					myMsdsContentPane.add(gPanel, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
						GridBagConstraints.CENTER, GridBagConstraints.BOTH,
						new Insets(0, 0, 0, 0), 0, 0));

					//======== cPanel ========
					{
						cPanel.setMinimumSize(new Dimension(100, 600));
						cPanel.setBackground(SystemColor.window);
						cPanel.setLayout(new GridBagLayout());
						((GridBagLayout)cPanel.getLayout()).columnWidths = new int[] {0, 0};
						((GridBagLayout)cPanel.getLayout()).rowHeights = new int[] {21, 379, 0, 0};
						((GridBagLayout)cPanel.getLayout()).columnWeights = new double[] {1.0, 1.0E-4};
						((GridBagLayout)cPanel.getLayout()).rowWeights = new double[] {0.0, 1.0, 0.0, 1.0E-4};

						//---- cLab ----
						cLab.setText("Compound");
						cLab.setBackground(SystemColor.window);
						cLab.setMinimumSize(new Dimension(35, 15));
						cPanel.add(cLab, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
							GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
							new Insets(0, 0, 0, 0), 0, 0));

						//======== cScroll2 ========
						{

							//---- cList2 ----
							cList2.setMinimumSize(new Dimension(40, 100));
							cList2.addListSelectionListener(new ListSelectionListener() {
								
								public void valueChanged(ListSelectionEvent e) {
								      if (!e.getValueIsAdjusting()) {// check if the value of the cList selection has been changed
                                                                          String[] name = {"compound name", "Manufacturer", "Catalog #", "Location", "Size", "Quantity", "Amount Remaining", "Date Received", "CAS #"};
                                                                          if (!cList2.isSelectionEmpty()) {// in the case that the user selects another group, to avoid cList to be empty
                                                                              mText.setText(CompoundBook.displayRow(cList2.getSelectedIndex(), xlsBook.get(gList2.getSelectedIndex()).getBook(), name));
                                                                              cListValueChanged(e);
                                                                          } else {
                                                                              mText.setText("");
                                                                          }
                            
                        }
                                                                    cListValueChanged(e);
								}
							});
							cScroll2.setViewportView(cList2);
						}
						cPanel.add(cScroll2, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0,
							GridBagConstraints.CENTER, GridBagConstraints.BOTH,
							new Insets(0, 0, 0, 0), 0, 3));

						//======== cSubPanel ========
						{
							cSubPanel.setBackground(SystemColor.window);
							cSubPanel.setLayout(new GridLayout());

							//======== cButtonPanel ========
							{
								cButtonPanel.setMinimumSize(new Dimension(100, 35));
								cButtonPanel.setBackground(SystemColor.window);
								cButtonPanel.setLayout(new FlowLayout(FlowLayout.LEFT));

								//---- cAdd ----
								cAdd.setText("+");
								cAdd.setPreferredSize(new Dimension(60, 25));
								cAdd.setMinimumSize(new Dimension(44, 30));
								cAdd.setMaximumSize(new Dimension(44, 30));
								cAdd.setToolTipText("Add a Compound");
								cAdd.addActionListener(new ActionListener() {
									
									public void actionPerformed(ActionEvent e) {
                                                                            
                                                                            int index = cList2.getSelectedIndex(); // get the index of the compound 
                                                                            CompoundBook book = xlsBook.get(gList2.getSelectedIndex()); // get the book of the specific compound
                                                                            AddWindow gui = new AddWindow(MyMsdsDesktop.this, book); // open the edit window
                                                                            gui.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                                                                            gui.setSize(400, 350);
                                                                            gui.setLocation(300, 300);
                                                                            gui.setVisible(true);
                                                                            System.out.println(gui.getUpdate());
                                                                            cList2.clearSelection();
                                                                            if (gui.getUpdate()) {
                                                                                String files = new String(groups.elementAt(gList2.getSelectedIndex()));
                                                                                xlsBook.add(gList2.getSelectedIndex(), new CompoundBook(files + ".xls"));
                                                                                int size = xlsBook.get(gList2.getSelectedIndex()).getBook().size();//get the size (number of coumpoud) of the selected Compoundbook int the xlsBook
                                                                                String[] comps = new String[size];// array of commpounds set to the size (number of element) of the compoundBook
                                                                                for (int i = 0; i < size; i++) {// this loop is addind coupound names in the array comps
                                                                                    comps[i] = xlsBook.get(gList2.getSelectedIndex()).getBook().get(i).get(0).getContents();
                                                                                }

                                                                                cList2.setListData(comps);// setting the compound list in the gui
                                                                            }
                                                                            
                                                                            cAddActionPerformed(e);
									}
								});
								cButtonPanel.add(cAdd);

								//---- cRemove ----
								cRemove.setText("-");
								cRemove.setMinimumSize(new Dimension(44, 30));
								cRemove.setPreferredSize(new Dimension(60, 25));
								cRemove.setMaximumSize(new Dimension(44, 30));
								cRemove.setToolTipText("Remove selected Compound");
								cRemove.addActionListener(new ActionListener() {
									
									public void actionPerformed(ActionEvent e) {
									if (!cList2.isSelectionEmpty()) {
                                                                                int indC = cList2.getAnchorSelectionIndex();
                                                                                int indG = gList2.getSelectedIndex();
                                                                                CompoundBook book = xlsBook.get(indG);
                                                                                String compound = book.getBook().get(indC).get(0).getContents();
                                                                                cList2.clearSelection();
                                                                                
                                                                            
                                                                                int result = JOptionPane.showConfirmDialog(null,
                                                                                        "Do you want to remove :" + compound, "information",
                                                                                        JOptionPane.YES_NO_CANCEL_OPTION, 1);
                                                                                if (result == JOptionPane.YES_OPTION) {
                                                                                    boolean success = book.removeCompound(indC) ;
                                                                                   
                                                                              
                                                                                    if (success) {
                                                                                        JOptionPane.showMessageDialog(null, "You have successfuly remove the compound : " + compound, "Compound removed", 2);
                                                                                      
                                                                                        
                                                                                        CompoundBook copybook = new CompoundBook(book.getFileName());
                                                                                        //add the new group our xlsBook (objec) and the group list 
                                                                                        xlsBook.add(indG, copybook);
                                                                                        String files = new String(groups.elementAt(gList2.getSelectedIndex()));

                                                                                        int size = xlsBook.get(gList2.getSelectedIndex()).getBook().size();//get the size (number of coumpoud) of the selected Compoundbook int the xlsBook
                                                                                        String[] comps = new String[size];// array of commpounds set to the size (number of element) of the compoundBook
                                                                                        for (int i = 0; i < size; i++) {// this loop is addind coupound names in the array comps
                                                                                            comps[i] = xlsBook.get(gList2.getSelectedIndex()).getBook().get(i).get(0).getContents();
                                                                                        }

                                                                                    cList2.setListData(comps);// setting the compound list in the gui                                                     
                                                                                        
                                                                                    }

                                                                                }
                                                                            }	
                                                                            cRemoveActionPerformed(e);
									}
								});
								cButtonPanel.add(cRemove);
							}
							cSubPanel.add(cButtonPanel);

							//======== cValPanel ========
							{
								cValPanel.setBackground(SystemColor.window);
								cValPanel.setLayout(new FlowLayout());

								//---- cValLab ----
								cValLab.setText("# Compounds");
								cValLab.setBackground(Color.white);
								cValPanel.add(cValLab);
							}
							cSubPanel.add(cValPanel);
						}
						cPanel.add(cSubPanel, new GridBagConstraints(0, 2, 1, 1, 0.0, 0.0,
							GridBagConstraints.CENTER, GridBagConstraints.BOTH,
							new Insets(0, 0, 0, 0), 0, 0));
					}
					myMsdsContentPane.add(cPanel, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
						GridBagConstraints.CENTER, GridBagConstraints.BOTH,
						new Insets(0, 0, 0, 0), 0, 0));

					//======== mPanel ========
					{
						mPanel.setMinimumSize(new Dimension(100, 600));
						mPanel.setBackground(SystemColor.window);
						mPanel.setLayout(new GridBagLayout());
						((GridBagLayout)mPanel.getLayout()).columnWidths = new int[] {300, 0};
						((GridBagLayout)mPanel.getLayout()).rowHeights = new int[] {20, 441, 0, 0};
						((GridBagLayout)mPanel.getLayout()).columnWeights = new double[] {1.0, 1.0E-4};
						((GridBagLayout)mPanel.getLayout()).rowWeights = new double[] {0.0, 1.0, 0.0, 1.0E-4};

						//---- mLab ----
						mLab.setText("Compound Properties");
						mLab.setBackground(SystemColor.window);
						mPanel.add(mLab, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
							GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
							new Insets(0, 0, 5, 0), 0, 0));

						//======== scrollPane4 ========
						{

							//---- mText ----
							mText.setMinimumSize(new Dimension(40, 100));
							mText.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
							scrollPane4.setViewportView(mText);
						}
						mPanel.add(scrollPane4, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0,
							GridBagConstraints.CENTER, GridBagConstraints.BOTH,
							new Insets(0, 0, 5, 0), 0, 3));

						//======== mButtonPanel ========
						{
							mButtonPanel.setMinimumSize(new Dimension(100, 35));
							mButtonPanel.setBackground(SystemColor.window);
							mButtonPanel.setLayout(new FlowLayout(FlowLayout.LEFT));

							//---- mEditButton ----
							mEditButton.setText("Edit");
							mEditButton.setMinimumSize(new Dimension(44, 30));
							mEditButton.setPreferredSize(new Dimension(60, 25));
							mEditButton.setMaximumSize(new Dimension(44, 30));
							mEditButton.setToolTipText("Edit Properties");
							mEditButton.addActionListener(new ActionListener() {
								
								public void actionPerformed(ActionEvent e) {
                                                                    
                                                                int index = cList2.getSelectedIndex(); // get the index of the compound 
                                                                CompoundBook book = xlsBook.get(gList2.getSelectedIndex()); // get the book of the specific compound
                                                                String [] row = CompoundBook.rowToArray(index, book.getBook());// parse the the information of the compound into an array
								EditWindow gui = new EditWindow(MyMsdsDesktop.this, row, index, book); // open the edit window
                                                                gui.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                                                                gui.setSize(400,350);
                                                                gui.setLocation(300,300);
//                                                                gui.getRootPane().setOpaque(false);
//                                                                gui.getContentPane().setBackground(new Color(1, 1, 1, 1));
//                                                                gui.setBackground(new Color(1, 1, 1, 1));
                                                                gui.setVisible(true);
                                                                System.out.println(gui.getUpdate());
                                                                cList2.clearSelection();
                                                                if(gui.getUpdate()){
                                                                    String files = new String(groups.elementAt(gList2.getSelectedIndex()));
                                                                    xlsBook.add(gList2.getSelectedIndex(), new CompoundBook(files + ".xls"));
                                                                    int size = xlsBook.get(gList2.getSelectedIndex()).getBook().size();//get the size (number of coumpoud) of the selected Compoundbook int the xlsBook
                                                                    String[] comps = new String[size];// array of commpounds set to the size (number of element) of the compoundBook
                                                                    for (int i = 0; i < size; i++) {// this loop is addind coupound names in the array comps
                                                                        comps[i] = xlsBook.get(gList2.getSelectedIndex()).getBook().get(i).get(0).getContents();
                                                                    }
 
                                                                    cList2.setListData(comps);// setting the compound list in the gui
                                                                }
                                                                                                               
                                                               
                                                                        
                                                                    mEditButtonActionPerformed(e);
								}
							});
							mButtonPanel.add(mEditButton);
						}
						mPanel.add(mButtonPanel, new GridBagConstraints(0, 2, 1, 1, 0.0, 0.0,
							GridBagConstraints.CENTER, GridBagConstraints.BOTH,
							new Insets(0, 0, 0, 0), 0, 0));
					}
					myMsdsContentPane.add(mPanel, new GridBagConstraints(2, 0, 1, 1, 0.0, 0.0,
						GridBagConstraints.CENTER, GridBagConstraints.BOTH,
						new Insets(0, 0, 0, 0), 0, 0));
				}
				desktopPane.add(myMsds, JLayeredPane.DEFAULT_LAYER);
				myMsds.setBounds(235, 5, 920, 365);

				//======== myNotes ========
				{
					myNotes.setVisible(true);
					myNotes.setTitle("MyNotes");
					myNotes.setResizable(true);
					myNotes.setMaximizable(true);
					myNotes.setMinimumSize(new Dimension(250, 100));
					myNotes.setClosable(true);
					myNotes.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
					myNotes.setIconifiable(true);
					myNotes.setToolTipText("MyNotes");
					Container myNotesContentPane = myNotes.getContentPane();
					myNotesContentPane.setLayout(new GridLayout());

					//======== noteBar ========
					{

						//======== fSize ========
						{
							fSize.setText("f-size");

							//---- f1 ----
							f1.setText("1");
							f1.addActionListener(new ActionListener() {
								
								public void actionPerformed(ActionEvent e) {
									f1ActionPerformed(e);
								}
							});
							fSize.add(f1);

							//---- f2 ----
							f2.setText("2");
							f2.addActionListener(new ActionListener() {
								
								public void actionPerformed(ActionEvent e) {
									f2ActionPerformed(e);
								}
							});
							fSize.add(f2);

							//---- f3 ----
							f3.setText("3");
							f3.addActionListener(new ActionListener() {
								
								public void actionPerformed(ActionEvent e) {
									f3ActionPerformed(e);
								}
							});
							fSize.add(f3);
						}
						noteBar.add(fSize);

						//======== menuColour ========
						{
							menuColour.setText("colour");

							//---- yCol ----
							yCol.setText("yellow");
							yCol.addActionListener(new ActionListener() {
								
								public void actionPerformed(ActionEvent e) {
									yColActionPerformed(e);
								}
							});
							menuColour.add(yCol);

							//---- bCol ----
							bCol.setText("blue");
							bCol.addActionListener(new ActionListener() {
								
								public void actionPerformed(ActionEvent e) {
									bColActionPerformed(e);
								}
							});
							menuColour.add(bCol);

							//---- gCol ----
							gCol.setText("green");
							gCol.addActionListener(new ActionListener() {
								
								public void actionPerformed(ActionEvent e) {
									gColActionPerformed(e);
								}
							});
							menuColour.add(gCol);

							//---- wCol ----
							wCol.setText("white");
							wCol.addActionListener(new ActionListener() {
								
								public void actionPerformed(ActionEvent e) {
									wColActionPerformed(e);
								}
							});
							menuColour.add(wCol);
						}
						noteBar.add(menuColour);
					}
					myNotes.setJMenuBar(noteBar);

					//======== noteScroll ========
					{

						//---- noteTextArea ----
						noteTextArea.setFont(new Font("Times New Roman", Font.PLAIN, 20));
						noteTextArea.setFocusCycleRoot(true);
						noteTextArea.setBackground(new Color(250,250,210));
						noteScroll.setViewportView(noteTextArea);
					}
					myNotesContentPane.add(noteScroll);
				}
				desktopPane.add(myNotes, JLayeredPane.DEFAULT_LAYER);
				myNotes.setBounds(5, 5, 340, 355);

				//======== myLook ========
				{
					myLook.setResizable(true);
					myLook.setMaximizable(true);
					myLook.setVisible(true);
					myLook.setClosable(true);
					myLook.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
					myLook.setTitle("LookUp");
					myLook.setFocusCycleRoot(false);
					myLook.setMinimumSize(new Dimension(250, 100));
					myLook.setIconifiable(true);
					myLook.setToolTipText("LookUp");
					Container myLookContentPane = myLook.getContentPane();
					myLookContentPane.setLayout(new FlowLayout());
				}
				desktopPane.add(myLook, JLayeredPane.DEFAULT_LAYER);
				myLook.setBounds(305, 370, 795, 195);

				//======== myCalc ========
				{
					myCalc.setVisible(true);
					myCalc.setTitle("MyCalc");
					myCalc.setResizable(true);
					myCalc.setMaximizable(true);
					myCalc.setMinimumSize(new Dimension(250, 100));
					myCalc.setClosable(true);
					myCalc.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
					myCalc.setIconifiable(true);
					myCalc.setToolTipText("MyCalc");
					Container myCalcContentPane = myCalc.getContentPane();
					myCalcContentPane.setLayout(new GridLayout());
				}
				desktopPane.add(myCalc, JLayeredPane.DEFAULT_LAYER);
				myCalc.setBounds(15, 365, 295, 205);
			}
			mainPanel.add(desktopPane);
		}
		contentPane.add(mainPanel);
		setSize(1065, 680);
		setLocationRelativeTo(getOwner());
		setVisible(true);

	}


	private JMenuBar menuBar1;
	private JMenu mFile;
	private JMenuItem mExit;
	private JMenu mWindow;
	private JMenuItem mWin1;
	private JMenuItem mWin2;
	private JMenuItem mWin3;
	private JMenuItem mWin4;
	private JMenu mHelp;
	private JMenuItem mH1;
	private JMenuItem mH2;
	private JPanel mainPanel;
	private JDesktopPane desktopPane;
	private JInternalFrame myMsds;
	private JPanel gPanel;
	private JLabel gLab;
	private JScrollPane gScroll2;
	private JList gList2;
	private JPanel gSubPanel;
	private JPanel gButtonPanel;
	private JButton gAdd;
	private JButton gRemove;
	private JPanel gLabPanel;
	private JLabel gValLab;
	private JPanel cPanel;
	private JLabel cLab;
	private JScrollPane cScroll2;
	private JList cList2;
	private JPanel cSubPanel;
	private JPanel cButtonPanel;
	private JButton cAdd;
	private JButton cRemove;
	private JPanel cValPanel;
	private JLabel cValLab;
	private JPanel mPanel;
	private JLabel mLab;
	private JScrollPane scrollPane4;
	private JTextArea mText;
	private JPanel mButtonPanel;
	private JButton mEditButton;
	private JInternalFrame myNotes;
	private JMenuBar noteBar;
	private JMenu fSize;
	private JMenuItem f1;
	private JMenuItem f2;
	private JMenuItem f3;
	private JMenu menuColour;
	private JMenuItem yCol;
	private JMenuItem bCol;
	private JMenuItem gCol;
	private JMenuItem wCol;
	private JScrollPane noteScroll;
	private JTextArea noteTextArea;
	private JInternalFrame myLook;
	private JInternalFrame myCalc;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
	
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
        gList2.setListData(groups); // set the group List on the GUI
    }
        
	public static void main(String[] args) {
		MyMsdsDesktop t = new MyMsdsDesktop();
		t.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
}
