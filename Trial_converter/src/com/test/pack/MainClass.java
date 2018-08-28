package com.test.pack;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class MainClass {
	
	JFrame mainframe;
	JPanel jarpanel;
	JPanel warpanel;
	JPanel earpanel;
	JPanel jar_form_panel;
	
	JTabbedPane jtab;
	static MainClass mainclass;
	
	JLabel srcLabel = new JLabel("Path to src folder ");
	JTextField srcText = new JTextField(20);
	JLabel libLabel = new JLabel("Path to Libraries1");
	JTextField libText = new JTextField(20);
	JButton compileButton = new JButton("Compile");
	JButton convertButton = new JButton("Convert");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public MainClass()
	{
		mainframe = new JFrame();
		mainframe.setLayout(new BorderLayout());
	    jtab = new JTabbedPane();
	    jtab.setVisible(true);
	    jarpanel = new JPanel();
	    jarpanel.setVisible(true);
	    //jarpanel.setLayout(new BorderLayout());
	    warpanel = new JPanel();
	    warpanel.setVisible(true);
	    earpanel = new JPanel();
	    earpanel.setVisible(true);
	    jtab.add("JAR",jarpanel);
	    jtab.add("WAR",warpanel);
	    jtab.add("EAR",earpanel);
	    
	    jar_form_panel=new JPanel();
	    //jar_form_panel.setLayout(null);
	    srcLabel.setBounds(10, 10, 80, 25);
	    srcText.setBounds(100, 10, 160, 25);
	    jar_form_panel.add(srcLabel);
	    jar_form_panel.add(srcText);
	   
	    jar_form_panel.setVisible(true);
	    jarpanel.add(jar_form_panel,BorderLayout.NORTH);
	    
	    
	    
	    mainframe.add(jtab,BorderLayout.CENTER);
	    mainframe.setTitle("Converter");
		mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainframe.pack();
		// frame.setSize(500, 500);
		//System.out.println("Test2");
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		mainframe.setLocation(dim.width / 2 - mainframe.getSize().width / 2,
				dim.height / 2 - mainframe.getSize().height / 2);
		mainframe.setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
		mainframe.setVisible(true);
	    
		
	}
	
	
	public static void main(String args[])
	{
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				
				mainclass = new MainClass();
				
			}
		});
	}
	
	
	

}
