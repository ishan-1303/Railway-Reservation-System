package Reservation;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.*;


class Ticket extends JFrame implements ActionListener
{
	JLabel pnr,title,name,contact,mail,source,destination,train,type,date,bill,sno;
	JTextField tname,tcontact,tmail,tpnr,tsrc,tdest,ttype,tdate,tbill,ttrain,tsno;
	JButton print;
	JPanel p1,p2;
	Connection con;
	
	public Ticket()
	{
		super("TICKET");
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
		title=new JLabel("TICKET");
		title.setBounds(250,10,200,30);
		
		
		
		p2=new JPanel();
		p2.setBounds(0, 55, getSize().width, getSize().height);
		p2.setLayout(null);
		p2.setBackground(new Color(153,153,153));
		
		int i=155;
		
		pnr=new JLabel("PNR");
		pnr.setBounds(50, 10, 150, 20);
		
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
		
		bill=new JLabel("Bill");
		bill.setBounds(50, 290, 150, 20);
		
		sno=new JLabel("Seat Number");
		sno.setBounds(275, 290, 150, 20);
		
		tpnr=new JTextField();
		tpnr.setBounds(130, 10, 200+i, 20);
		tpnr.setEditable(false);
		
		tname=new JTextField();
		tname.setBounds(130, 50, 200+i, 20);
		tname.setEditable(false);
		
		tcontact=new JTextField();
		tcontact.setBounds(130, 90, 200+i, 20);
		tcontact.setEditable(false);
		
		tmail=new JTextField();
		tmail.setBounds(130, 130, 200+i, 20);
		tmail.setEditable(false);
		
		tsrc=new JTextField();
		tsrc.setBounds(130, 170, 130, 20);
		tsrc.setEditable(false);
		
		tdest=new JTextField();
		tdest.setBounds(355, 170, 130, 20);
		tdest.setEditable(false);
		
		ttrain=new JTextField();
		ttrain.setBounds(130, 210, 200+i, 20);
		ttrain.setEditable(false);
		
		ttype=new JTextField();
		ttype.setBounds(130,250,130,20);
		ttype.setEditable(false);
		
		tdate=new JTextField();
		tdate.setBounds(355,250,130,20);
		tdate.setEditable(false);
		
		tbill=new JTextField();
		tbill.setBounds(130, 290, 130, 20);
		tbill.setEditable(false);
		
		tsno=new JTextField();
		tsno.setBounds(355, 290, 130, 20);
		tsno.setEditable(false);
		
		print=new JButton("PRINT TICKET");
		print.setBounds(230, 330, 130, 30);
		
		try
		{
			getTicket();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		p1.add(title);
		
		p2.add(pnr);
		p2.add(name);
		p2.add(contact);
		p2.add(mail);
		p2.add(source);
		p2.add(destination);
		p2.add(train);
		p2.add(type);
		p2.add(date);
		p2.add(bill);
		p2.add(sno);
		
		p2.add(tpnr);
		p2.add(tname);
		p2.add(tcontact);
		p2.add(tmail);
		p2.add(tsrc);
		p2.add(tdest);
		p2.add(tdate);
		p2.add(ttype);
		p2.add(ttrain);
		p2.add(tbill);
		p2.add(tsno);
		
		p2.add(print);
		
		add(p1);
		add(p2);
		
		print.addActionListener(this);
	}
	
	int ipnr,train_id,ibill;
	String idate,iname,imail,iphone,from,to,train_name,itype,seat;
	
	public void getTicket() throws Exception
	{
		 Class.forName("com.mysql.jdbc.Driver");  
	        System.out.println("Connection OK");
	        con=DriverManager.getConnection(  
	        		"jdbc:mysql://localhost:3307/railway","root","");
	        System.out.println("Driver OK");
	       
	        Statement s=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
			
	        String sql="SELECT * FROM reservation ORDER BY pnr DESC LIMIT 1";
	        ResultSet rs=s.executeQuery(sql);
	        
	        rs.next();
	        ipnr=rs.getInt(1);
	        iname=rs.getString(2);
	        imail=rs.getString(3);
	        iphone=rs.getString(4);
	        from=rs.getString(5);
	        to=rs.getString(6);
	        train_id=rs.getInt(7);
	        train_name=rs.getString(8);
	        itype=rs.getString(9);
	        ibill=rs.getInt(10);
	        idate=rs.getInt(11)+rs.getString(12)+rs.getInt(13);
	        seat=rs.getString(14);
	        
	        
	        tpnr.setText(""+ipnr);
	        tname.setText(iname);
	        tmail.setText(imail);
	        tcontact.setText(iphone);
	        tsrc.setText(from);
	        tdest.setText(to);
	        ttrain.setText(train_id+train_name);
	        ttype.setText(itype);
	        tbill.setText(""+ibill);
	        tdate.setText(idate);
	        tsno.setText(seat);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==print)
		{
			JOptionPane.showMessageDialog(this,"Ticket Printed","",JOptionPane.WARNING_MESSAGE);
			this.setVisible(false);
		}
	}
	
//	public static void main(String args[])
//	{
//		Ticket t=new Ticket();
//		
//		t.setVisible(true);
//	}
}