package HomePage;
import Reservation.*;
import java.awt.*;
import java.applet.*;
import java.io.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.font.*;
import java.lang.String.*;
import java.util.*;
import java.text.*;
import java.sql.*;		
import java.awt.Graphics.*;
import javax.imageio.*;
import java.net.*;

public class Train_Report extends JFrame implements ActionListener
{
	JButton b11,b22,b33,b44;
	JTable table;
	//Table headings
	String[] colmn={"Train_ID","Train_Name","Station","Time_IN","Time_OUT","Platform"};//Customer.CName,Builder.BName,Plot.Plot_Name,Flat.Flat,Plot.Owner,Builder.BPrice
	//Rows and Column
	String[] colmn1= {"Train_ID","Train_Name","Station","Time_IN","Time_OUT","Platform","Source","Destination"};
	String[][] data;
	JScrollPane scrollpane ;
	PreparedStatement pstat;
	Connection con;
	String source,s1;
	Font f=new Font("Bookman Old Style",Font.BOLD, 15);
	public Train_Report(int id,String str)
	{
		super("Train Deatails (Please select your Destination)");
		b11=new JButton("BACK");
		//b22=new JButton("EXIT");
		b33=new JButton("Book Ticket");
		
		s1=str;
						
		b11.setForeground(Color.blue);
	//	b22.setForeground(Color.blue);
		b33.setForeground(Color.blue);
		
				
		this.setSize(1200,700);
		
		this.setLayout(null);	
		              b11.setBounds(495,620,120,25);
					  
					 // display(id);
				b33.setBounds(695,620,120,25);
				//b22.setBounds(595,620,80,25);
		  
					  
					  try
						{	

					        Class.forName("com.mysql.jdbc.Driver");  
					        System.out.println("Driver OK");
					        con=DriverManager.getConnection(  
					        		"jdbc:mysql://localhost:3307/railway","root","");
					        System.out.println("Connection OK");
					          	 	
					        Statement s=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
					    			
					        String sql="SELECT COUNT(*) FROM train_info where train_id ="+id;
					        ResultSet rs1=s.executeQuery(sql);
					        rs1.next();
					        int row=rs1.getInt(1);
					        data=new String[row][6];
						       
					       	ResultSet rs;	
							
					
							//int Train_id=10001;
							String st="select * from train_info where train_id ="+id;
						    rs=s.executeQuery(st);
						    
						    
							int i=0;
							while(rs.next())
								{
									int d1=rs.getInt(2);
									String d2=rs.getString(3);
								    String d3=rs.getString(4);
								    String d4=rs.getString(5);
								    String d5=rs.getString(6);
								    int d6=rs.getInt(7);
									
													
											data[i][0]=""+d1;
											data[i][1]=d2;
											data[i][2]=d3;
											data[i][3]=d4;
											data[i][4]=d5;
											data[i][5]=""+d6;
											
											
											i++;
									}
								}
									catch(Exception ee)
									{
									}

					            table=new JTable(data,colmn);
								//table.setEnabled(false);
								//table.setFont(f);
								//table.setForeground(Color.magenta);
								int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;
								int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS;
								scrollpane = new JScrollPane(table,v,h);
				                scrollpane.setBounds(50,50,1100,500);
							     	this.add(scrollpane);
									  
										   this.add(b11);
			//							   this.add(b22);
							         	
										   this.add(b33);
							          
						b11.addActionListener(this);
		//				b22.addActionListener(this);
						b33.addActionListener(this);
												
						this.setLocationRelativeTo(null);
				    
				    
					  
		this.setVisible(true);
    }	
    
	public Train_Report(String a)
	{
		super("Trains from "+a+"(Select Train which suits you)");
		source=a;
		b11=new JButton("BACK");
		//b22=new JButton("EXIT");
		b44=new JButton("SELECT");
	
						
		b11.setForeground(Color.blue);
		//b22.setForeground(Color.blue);
		b44.setForeground(Color.blue);
		
				
		this.setSize(1200,700);
		
		this.setLayout(null);	
		              b44.setBounds(695,620,120,25);
					  //b22.setBounds(595,620,80,25);
					  b11.setBounds(495,620,120,25);
					  
					 // display(id);
		
					  
					  try
						{	

					          	//Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
					        Class.forName("com.mysql.jdbc.Driver");  
					        System.out.println("Driver OK");
					        	 	//con=DriverManager.getConnection("jdbc:odbc:TYDSN","","");
					        con=DriverManager.getConnection(  
					        		"jdbc:mysql://localhost:3307/railway","root","");
					        System.out.println("Connection OK");
					          	 	
					        Statement s=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
					    			
				        String sql="SELECT COUNT(*) FROM train_info WHERE station=?";
					        PreparedStatement ps1=con.prepareStatement(sql);
					        	ps1.setString(1, a);
////						    ps1.setString(2, b);
////						    ps1.setString(3, b);
					        ResultSet rs1=ps1.executeQuery();
					        rs1.next();
					        int row=rs1.getInt(1);
					        data=new String[row][8];
						       
					       	ResultSet rs;	
							
							//int Train_id=10001;
							String st="SELECT * FROM train_info WHERE station=?";
						
						    PreparedStatement ps=con.prepareStatement(st);
						    ps.setString(1, a);
//						    ps.setString(2, b);
//						    ps.setString(3, b);
							rs=ps.executeQuery();
						    
						    
							int i=0;
							while(rs.next())
								{
									int d1=rs.getInt(2);
									String d2=rs.getString(3);
								    String d3=rs.getString(4);
								    String d4=rs.getString(5);
								    String d5=rs.getString(6);
								    int d6=rs.getInt(7);
								    String d7=rs.getString(8);
								    String d8=rs.getString(9);
								    
									
													
											data[i][0]=""+d1;
											data[i][1]=d2;
											data[i][2]=d3;
											data[i][3]=d4;
											data[i][4]=d5;
											data[i][5]=""+d6;
											data[i][6]=d7;
											data[i][7]=d8;
											
											
											i++;
									}
								}
								catch(Exception ee)
								{
									System.out.println(ee);
								}

					            table=new JTable(data,colmn1);
								//table.setEnabled(false);
								//table.setFont(f);
								//table.setForeground(Color.magenta);
								int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;
								int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS;
								scrollpane = new JScrollPane(table,v,h);
				                scrollpane.setBounds(50,50,1100,500);
							     	this.add(scrollpane);
									  
										   this.add(b11);
							//			   this.add(b22);
										   this.add(b44);
							          
						b11.addActionListener(this);
				//		b22.addActionListener(this);
						b44.addActionListener(this);
												
						this.setLocationRelativeTo(null);
				    
				    
					  
		this.setVisible(true);
    }
    public void actionPerformed(ActionEvent ae)
    {
    	if(ae.getSource()==b11)
    	{
    		this.setVisible(false);
    	}
    	if(ae.getSource()==b33)
    	{
    		int row=table.getSelectedRow();
    		String dest=table.getValueAt(row,2).toString();
    		
    		int row2=table.getSelectedRow();
    		String value=table.getValueAt(row2,0).toString();
        	int id=Integer.parseInt(value);
        	
    		new Book(s1,dest,id).setVisible(true);
    		this.setVisible(false);
    	}
    	int rowIndex=0;
    	int colIndex=0;
    	if(ae.getSource()==b44)
    	{
    		int row=table.getSelectedRow();
        	String value=table.getValueAt(row,0).toString();
        	int id=Integer.parseInt(value);
        	
        	new Train_Report(id,source).setVisible(true);
    		this.setVisible(false);
    		
    	}
    
    }
}
