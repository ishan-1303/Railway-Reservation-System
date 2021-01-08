package Reservation;

import HomePage.*;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Random;

import javax.swing.*;

public class Book extends JFrame implements ActionListener
{
	JLabel title,name,contact,mail,source,destination,train,type,date;
	JTextField tname,tcontact,tmail;
	JButton book,cancel,search;
	JComboBox src,dest,trn,res,day,month,year;
	JPanel p1,p2;
	Connection con;
	
	public Book()
	{
		super("Reservation");
		setSize(600,500);
		setLayout(null);
		
		Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
		int x=(d.width-getSize().width)/2;
		int y=(d.height-getSize().height)/2;
		setLocation(x,y);
		
		p1=new JPanel();
		p1.setBounds(0, 0, getSize().width, 50);
		p1.setLayout(null);
		p1.setBackground(new Color(102,102,102));
		title=new JLabel("Ticket Booking");
		title.setBounds(250,10,200,30);
		
		
		
		p2=new JPanel();
		p2.setBounds(0, 55, getSize().width, getSize().height);
		p2.setLayout(null);
		p2.setBackground(new Color(153,153,153));
		
		int i=155;
		
		name=new JLabel("Name");
		name.setBounds(50,50,150,20);
		
		contact=new JLabel("Contact");
		contact.setBounds(50,90,150,20);
		
		mail=new JLabel("Mail");
		mail.setBounds(50,130,150,20);
		
		source=new JLabel("Source");
		source.setBounds(50,170,150,20);
		
		destination=new JLabel("Destination");
		destination.setBounds(275,170,150,20);
		
		train=new JLabel("Train");
		train.setBounds(50,210,150,20);
		
		type=new JLabel("Type");
		type.setBounds(50,250,150,20);
		
		date=new JLabel("Date");
		date.setBounds(275, 250, 150, 20);
		
		tname=new JTextField();
		tname.setBounds(130, 50, 200+i, 20);
		
		tcontact=new JTextField();
		tcontact.setBounds(130, 90, 200+i, 20);
		
		tmail=new JTextField();
		tmail.setBounds(130, 130, 200+i, 20);

		src=new JComboBox();
		src.setBounds(130, 170, 130, 20);
		
		dest=new JComboBox();
		dest.setBounds(355, 170, 130, 20);
		
		try
		{
			showStation();
		}
		catch(Exception e)
		{
			
		}
		
		search=new JButton("Search Trains");
		search.setBounds(355, 210, 130, 20);
		
		trn=new JComboBox();
		trn.setBounds(130,210,130,20);
		
		res=new JComboBox();
		res.setBounds(130,250,130,20);
		res.addItem("FIRST CLASS");
		res.addItem("SECOND CLASS");
		
		day=new JComboBox();
		day.setBounds(330, 250, 40, 20);
		for(int j=1;j<=31;j++)
		{
			day.addItem(j);
		}
		
		String[] m= {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
		month=new JComboBox(m);
		month.setBounds(375, 250, 50, 20);
		
		year=new JComboBox();
		year.setBounds(430, 250, 55, 20);
		for(int j=2018;j<2030;j++)
		{
			year.addItem(j);
		}
		
		book=new JButton("BOOK TICKET");
		book.setBounds(130, 290, 130, 30);
		
		cancel=new JButton("CANCEL");
		cancel.setBounds(355, 290, 130, 30);
		
		p1.add(title);
		
		p2.add(name);
		p2.add(contact);
		p2.add(mail);
		p2.add(source);
		p2.add(destination);
		p2.add(train);
		p2.add(type);
		p2.add(date);
		
		p2.add(tname);
		p2.add(tcontact);
		p2.add(tmail);
		
		p2.add(src);
		p2.add(dest);
		p2.add(trn);
		p2.add(res);
		p2.add(day);
		p2.add(month);
		p2.add(year);
		
		p2.add(book);
		p2.add(cancel);
		p2.add(search);
		
		add(p1);
		add(p2);
		
		search.addActionListener(this);
		book.addActionListener(this);
		cancel.addActionListener(this);
	}
	String a,b;
	int c;
	public Book(String a1, String b1,int c1)
	{
		super("Reservation");
		setSize(600,500);
		setLayout(null);
		a=a1;
		b=b1;
		c=c1;
		Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
		int x=(d.width-getSize().width)/2;
		int y=(d.height-getSize().height)/2;
		setLocation(x,y);
		
		p1=new JPanel();
		p1.setBounds(0, 0, getSize().width, 50);
		p1.setLayout(null);
		p1.setBackground(new Color(102,102,102));
		title=new JLabel("Ticket Booking");
		title.setBounds(250,10,200,30);
		
		
		
		p2=new JPanel();
		p2.setBounds(0, 55, getSize().width, getSize().height);
		p2.setLayout(null);
		p2.setBackground(new Color(153,153,153));
		
		int i=155;
		
		name=new JLabel("Name");
		name.setBounds(50,50,150,20);
		
		contact=new JLabel("Contact");
		contact.setBounds(50,90,150,20);
		
		mail=new JLabel("Mail");
		mail.setBounds(50,130,150,20);
		
		source=new JLabel("Source");
		source.setBounds(50,170,150,20);
		
		destination=new JLabel("Destination");
		destination.setBounds(275,170,150,20);
		
		train=new JLabel("Train");
		train.setBounds(50,210,150,20);
		
		type=new JLabel("Type");
		type.setBounds(50,250,150,20);
		
		date=new JLabel("Date");
		date.setBounds(275, 250, 150, 20);
		
		tname=new JTextField();
		tname.setBounds(130, 50, 200+i, 20);
		
		tcontact=new JTextField();
		tcontact.setBounds(130, 90, 200+i, 20);
		
		tmail=new JTextField();
		tmail.setBounds(130, 130, 200+i, 20);

		src=new JComboBox();
		src.setBounds(130, 170, 130, 20);
		
		dest=new JComboBox();
		dest.setBounds(355, 170, 130, 20);
		
		try
		{
			showStation();
		}
		catch(Exception e)
		{
			
		}
		
		search=new JButton("Search Trains");
		search.setBounds(355, 210, 130, 20);
		
		trn=new JComboBox();
		trn.setBounds(130,210,200+i,20);
		
		res=new JComboBox();
		res.setBounds(130,250,130,20);
		res.addItem("FIRST CLASS");
		res.addItem("SECOND CLASS");
		
		day=new JComboBox();
		day.setBounds(330, 250, 40, 20);
		for(int j=1;j<=31;j++)
		{
			day.addItem(j);
		}
		
		String[] m= {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
		month=new JComboBox(m);
		month.setBounds(375, 250, 50, 20);
		
		year=new JComboBox();
		year.setBounds(430, 250, 55, 20);
		for(int j=2018;j<2030;j++)
		{
			year.addItem(j);
		}
		
		book=new JButton("BOOK TICKET");
		book.setBounds(130, 290, 130, 30);
		
		cancel=new JButton("CANCEL");
		cancel.setBounds(355, 290, 130, 30);
		try
		{
			showStation();
		}
		catch(Exception e)
		{
			
		}
		p1.add(title);
		
		p2.add(name);
		p2.add(contact);
		p2.add(mail);
		p2.add(source);
		p2.add(destination);
		p2.add(train);
		p2.add(type);
		p2.add(date);
		
		p2.add(tname);
		p2.add(tcontact);
		p2.add(tmail);
		
		p2.add(src);
		p2.add(dest);
		p2.add(trn);
		p2.add(res);
		p2.add(day);
		p2.add(month);
		p2.add(year);
		
		p2.add(book);
		p2.add(cancel);
		//p2.add(search);
		
		add(p1);
		add(p2);
		
		//search.addActionListener(this);
		book.addActionListener(this);
		cancel.addActionListener(this);
	}
	public void showStation()throws Exception
	{
		src.addItem(a);
		dest.addItem(b);

		 Class.forName("com.mysql.jdbc.Driver");  
	        System.out.println("Driver OK");
	        con=DriverManager.getConnection(  
	        		"jdbc:mysql://localhost:3307/railway","root","");
	        System.out.println("Connection OK");
	       
	        Statement s=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
			
	        String a=(String) src.getSelectedItem();
	        String b=(String)dest.getSelectedItem();
	       // String c=(String)src.getSelectedItem();
       	
	        
	        String sql="SELECT train_id,name FROM trains WHERE train_id="+c;
	        PreparedStatement ps=con.prepareStatement(sql);
//	        ps.setString(1, a );
//      	ps.setString(2, b);
////       	ps.setString(3, c);
       	ResultSet rs=ps.executeQuery();
        
       	trn.removeAllItems();
       	rs.next();
       	trn.addItem(rs.getInt(1)+""+rs.getString(2));
	}
	
	public void showTrain()throws Exception
	{
		
		
		 Class.forName("com.mysql.jdbc.Driver");  
	        System.out.println("Driver OK");
	        con=DriverManager.getConnection(  
	        		"jdbc:mysql://localhost:3307/railway","root","");
	        System.out.println("Connection OK");
	       
	        Statement s=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
			
	        String a=(String) src.getSelectedItem();
	        String b=(String)dest.getSelectedItem();
	       // String c=(String)src.getSelectedItem();
        	
	        
	        String sql="SELECT d.train_id,d.train_name FROM "+a+" as d JOIN "+b+" as e WHERE d.train_id=e.train_id";
	        PreparedStatement ps=con.prepareStatement(sql);
//	        ps.setString(1, a );
//       	ps.setString(2, b);
////        	ps.setString(3, c);
        	ResultSet rs=ps.executeQuery();
        
        	trn.removeAllItems();
        	
        	while(rs.next())
        	{
        		
        		trn.addItem(rs.getInt(1)+rs.getString(2));
        		//System.out.println(rs.getString(1));
        	}
        	
	}
	
	public void bookTicket() throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");  
        System.out.println("Connection OK");
        con=DriverManager.getConnection(  
        		"jdbc:mysql://localhost:3307/railway","root","");
        System.out.println("Driver OK");
       
        Statement s=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
		
        String sql="INSERT INTO reservation VALUES(NULL,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        
        PreparedStatement ps=con.prepareStatement(sql);
        ps.setString(1, tname.getText());
        ps.setString(2, tmail.getText());
        ps.setString(3, tcontact.getText());
        ps.setString(4, src.getSelectedItem().toString());
        ps.setString(5, dest.getSelectedItem().toString());
        ps.setInt(6, Integer.parseInt(trn.getSelectedItem().toString().substring(0,5)));
        ps.setString(7, trn.getSelectedItem().toString().substring(5));
        ps.setString(8, res.getSelectedItem().toString());
        int amt;
        if(res.getSelectedItem().toString().equals("FIRST CLASS"))
        {
        	amt=500;
        }
        else
        {
        	amt=300;
        }
        ps.setInt(9, amt);
        
        ps.setInt(10, Integer.parseInt(day.getSelectedItem().toString()));
        ps.setString(11, month.getSelectedItem().toString());
        ps.setInt(12, Integer.parseInt(year.getSelectedItem().toString()));
        
        final String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        final int N = alphabet.length();

        Random r = new Random();
        char c = (char) (65 + r.nextInt(20));
        //return random_3_Char;
        int n=r.nextInt(100);
        //System.out.println(c+"-"+n);
        
        ps.setString(13, c+"-"+n);
        
        ps.executeUpdate();
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==search)
		{
			try
			{
				showTrain();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		if(ae.getSource()==book)
		{
			if(tname.getText().equals("") || tcontact.getText().equals("") || tmail.getText().equals(""))
			{
				JOptionPane.showMessageDialog(this, "Please fill all the fields", "warning", 1);
			}
			else if(src.getSelectedItem().equals(dest.getSelectedItem()))
			{
				JOptionPane.showMessageDialog(this, "Source and Destination are same", "warning", 1);
			}
			else if(trn.getItemCount() == 0)
			{
				JOptionPane.showMessageDialog(this, "Please select Train", "warning", 1);
			}
			else
			{
				try
				{
					bookTicket();
					new Ticket().setVisible(true);
					this.setVisible(false);
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
			}
		}
		if(ae.getSource()==cancel)
		{
			this.setVisible(false);
		}
	}
	
}