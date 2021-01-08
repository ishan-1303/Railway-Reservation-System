package Admin;

import javax.swing.*;

import HomePage.*;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class ViewTrains extends JFrame implements ActionListener
{
	JTable table;
	//Table headings
	String[] colmn1={"Train_ID","Train_Name","Station","Time_IN","Time_OUT","Platform"};//Customer.CName,Builder.BName,Plot.Plot_Name,Flat.Flat,Plot.Owner,Builder.BPrice
	//Rows and Column
	String[] colmn= {"Train_ID","Train_Name","Source","Destination","Stops"};
	String[][] data;
	JScrollPane scrollpane ;
	PreparedStatement pstat;
	JButton back,add,cancel,b44;
	Connection con;
	Font f=new Font("Bookman Old Style",Font.BOLD, 15);
	
	ViewTrains()
	{
		this.setSize(1200,700);
		
		this.setLayout(null);	
		
		back=new JButton("BACK");
		add=new JButton("ADD TRAIN");
		b44=new JButton("SELECT");
	
						
		back.setForeground(Color.blue);
		add.setForeground(Color.blue);
		b44.setForeground(Color.blue);
		
		 b44.setBounds(695,620,100,25);
		  add.setBounds(595,620,100,25);
		  back.setBounds(495,620,100,25);
		  
		  
		            
					  
					  try
						{	

					        Class.forName("com.mysql.jdbc.Driver");  
					        System.out.println("Connection OK");
					        con=DriverManager.getConnection(  
					        		"jdbc:mysql://localhost:3307/railway","root","");
					        System.out.println("Driver OK");
					          	 	
					        Statement s=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
					    			
					        String sql="SELECT COUNT(*) FROM trains";
					        ResultSet rs1=s.executeQuery(sql);
					        rs1.next();
					        int row=rs1.getInt(1);
					        data=new String[row][5];
						       
					       	ResultSet rs;	
							
					
							//int Train_id=10001;
							String st="select * from trains";
						    rs=s.executeQuery(st);
						    
						    
							int i=0;
							while(rs.next())
								{
									int d1=rs.getInt(1);
									String d2=rs.getString(2);
								    String d3=rs.getString(3);
								    String d4=rs.getString(4);
								    int d5=rs.getInt(5);
									
													
											data[i][0]=""+d1;
											data[i][1]=d2;
											data[i][2]=d3;
											data[i][3]=d4;
											data[i][4]=""+d5;
											
											i++;
									}
								}
									catch(Exception ee)
									{
										System.out.println(ee);
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
				                
				 			   					this.add(back);
											   this.add(add);
											   this.add(b44);
							   back.addActionListener(this);
							   add.addActionListener(this);
							  // cancel.addActionListener(this);
							   b44.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		if(ae.getSource()==back)
    	{
    		this.setVisible(false);
    	}
		int rowIndex=0;
    	int colIndex=0;
    	if(ae.getSource()==b44)
    	{
    		int row=table.getSelectedRow();
        	String value=table.getValueAt(row,0).toString();
        	int id=Integer.parseInt(value);
        	
        	new Train_Report(id,"").setVisible(true);
    		//this.setVisible(false);
    		
    	}
	}
	
	public static void main(String args[])
	{
		ViewTrains vt=new ViewTrains();
		vt.setVisible(true);
	}

	
}
