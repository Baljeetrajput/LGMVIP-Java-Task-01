import java.awt.*;
import java.awt.Component.*;
import java.awt.event.*;
import javax.swing.*;
class Currency1 extends JFrame implements ActionListener
{
	JTextField t1,t2,t3;
	JLabel l1,l2,l3;
	JButton b1,b2;
	int x,x4;
	JComboBox<String> cbx;
	Container cn;
	double f[]={83.21,0.82,101.25,0.56,11.45,21.53,87.69,19.07,60.65,3.01,16.11};
	String s[]={"Dollar","Ruble","Pound","Yen","Chines","Israeli shekel","Euro","Polish Zloty","Canadian Dollar","Turkish lira","Brazillian real"};
	double x5;
	
	Currency1()
	{
		
		setTitle("Currency Converter ");
	    setLayout(null);
		Font f=new Font("Copperplate Gothic Light",Font.BOLD,20);
		Font f1=new Font("Cascadia Code",Font.BOLD,20);
        cn=getContentPane();
		
		l1=new JLabel("ENTER INR ");
		l1.setBounds(120,100,150,40);
		add(l1);
		l1.setBackground(Color.WHITE);
		l1.setForeground(Color.BLACK);
		l1.setFont(f);
		
        t1=new JTextField(20);
          t1.setBounds(370,100,150,40);
		add(t1);
		t1.setFont(f1);
		t1.setBackground(Color.PINK);
		t1.setForeground(Color.BLACK);
		t1.setToolTipText("Enter some INR *** ");
		
		l2=new JLabel("  RESULT ");
		l2.setBounds(120,180,150,40);
		add(l2);
		l2.setBackground(Color.WHITE);
		l2.setForeground(Color.BLACK);
		l2.setFont(f);
		
        t2=new JTextField(20);
        t2.setBounds(370,180,150,40);
		add(t2);
		t2.setFont(f1);
		t2.setBackground(Color.PINK);
		t2.setForeground(Color.BLACK);
		t2.setToolTipText(" Result *** ");
		
		
		l3=new JLabel("SELECT CURRENCY");
		l3.setBounds(120,260,250,60);
		add(l3);
		l3.setBackground(Color.WHITE);
		l3.setForeground(Color.BLACK);	
		l3.setFont(f);
		
		
        cbx=new JComboBox<String>(s);
        cbx.setBounds(370,260,160,40);
        add(cbx);
		cbx.setForeground(Color.BLACK);
		cbx.setBackground(Color.PINK);
		cbx.setFont(new Font("CENTURY",Font.BOLD,20));
		cbx.setToolTipText("Select Currency *** ");
		
		b1=new JButton("CONVERT");
		add(b1);
		b1.setFont(new Font("CENTURY",Font.BOLD,15));
		b1.setBounds(150,350,120,50);
		b1.setForeground(Color.WHITE);
		b1.setBackground(Color.BLUE);
		
		b2=new JButton("CLEAR");
		add(b2);
		b2.setFont(new Font("CENTURY",Font.BOLD,17));
		b2.setBounds(300,350,100,50);
		b2.setForeground(Color.RED);
		b2.setBackground(Color.BLUE);
		
		b2.addActionListener(this);
		b1.addActionListener(this);
	}
	

	
	public void actionPerformed(ActionEvent e)
	{
		
		if(e.getSource()==b1)
		{
			String s3=(String)cbx.getSelectedItem();
			//System.out.println(s3);
			
			for(int j=0;j<=f.length-1;j++)
           	{
	         	if(s[j]==s3)
				{ 
			      x4=j;
				  x5= f[j];
				}
         	}
		}
		if(e.getSource()==b2)
		{
			t1.setText("");
			t2.setText("");
		}
		
		if(e.getSource()==b1)
		{
			cn.setBackground(Color.white);
			String s1=t1.getText();
		   // System.out.println(x);
		       
        try {
			
            int x1 = Integer.parseInt(s1);
           // System.out.println(x1);
		     double f2;
			 f2=x1*x5;
			 double x2=f2;
			 
			 String s2=""+x2;
			 
           // System.out.println(f2);
			t2.setText(s2);
			}
			catch (NumberFormatException ex)
			 {
           // System.out.println("Invalid input. Please enter a valid integer.");

			JOptionPane.showMessageDialog(this,"ENTER INR","TRY AGAIN",JOptionPane.WARNING_MESSAGE);
            } 
    } 
  }
}
class Demo
{
	public static void main(String ar[])
    {
		Currency1 c=new Currency1();
		c.setVisible(true);
		c.setBounds(500,100,700,700);
		c.setDefaultCloseOperation(c.EXIT_ON_CLOSE);
	}
}

    // ImageIcon i =new ImageIcon("bg2.JPG");;
	// Image img1=i.getImage();
	//img1.setBounds(0,0,500,500);
	

// public void paint(Graphics g)
	// {
	//super.paintComponent(g);
	// g.drawImage(img1,0,0,this);	
   // }
