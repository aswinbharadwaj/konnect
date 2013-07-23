/*
create circles that get displayed randomly
contains() - Ellipse2D
getPoint() - MouseEvent
remove from arraylist


randomization :

populate arraylist with circle coordinates
in groups of 5 and refresh the screen with new set of circles 
every 3 sec
when clicked change color
have count down timer
2 min game
max score 
*/

package game;

import java.awt.*;
import java.io.*;
import java.awt.geom.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.Timer;
import javax.swing.*;

public class GamePanel extends JPanel {

	private ArrayList<Point2D> allpoints;
	private ArrayList<Point2D> points;
	private ArrayList<Ellipse2D> ea = null;
	private MouseAction ma;
	public static JLabel tlab;
	private static int sc;
    
	public void makeCircles(){
		ea = new ArrayList<Ellipse2D>();
		Ellipse2D circle;
		Point2D corner;
		points = getSession();
		for(int i = 0; i < 5; ++i)
		{
			//ea.clear();
			corner = new Point2D.Double(points.get(i).getX()-10,points.get(i).getY()-10);
			circle = new Ellipse2D.Double();
			circle.setFrameFromCenter(points.get(i),corner);
			ea.add(circle);
			//System.out.println("added");
		}
	}
	
	public void setCircles(ArrayList<Ellipse2D> ea)
	{
		this.ea.clear();
		for(int i = 0;i < ea.size();++i)
			this.ea.add(i,ea.get(i));
	}
	
	
	public void paintComponent(Graphics g){
		//System.out.println("insidePC");
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D)g;
		setBackground(Color.BLACK);
		g2.setColor(Color.YELLOW);
		for(Ellipse2D circle:ea)
		{
			g2.fill(circle);
			g2.draw(circle);
			//System.out.println("circle add");
		}
		callListener(g2);
		//System.exit(0);
	}
	
	public void callListener(Graphics2D g2){
	 ma = new MouseAction(g2,ea,this);
	 addMouseListener(ma);
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JPanel jt = new JPanel();
		JPanel jb = new JPanel();
		JPanel jr = new JPanel();
		FileInputStream fstream;
		DataInputStream in;
		BufferedReader br;
		Icon ex = new ImageIcon("exit.png");
		JButton exitbutton = new JButton(ex);
		JLabel lab = new JLabel("Click To Exit /\\",JLabel.CENTER);
		lab.setForeground(new Color(100,100,255));
		lab.setFont(new java.awt.Font("Verdana",1,14));
		frame.setLayout(new BorderLayout());
		CountdownTimer ct = new CountdownTimer();
		frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		frame.setVisible(true);
		JPanel gamePane = new GamePanel();
		JLabel score = new JLabel();
		score.setForeground(new Color(100,100,255));
		score.setFont(new java.awt.Font("Verdana",1,14));
		//new CountdownTimer();
		while(ct.get() > 0)
		{
			//gamePane.removeAll();
			frame.getContentPane().removeAll();
			frame.getContentPane().add(gamePane,BorderLayout.CENTER);
			frame.add(jt.add(tlab),BorderLayout.NORTH);
			jb.add(lab);jb.add(exitbutton);
			frame.add(jb,BorderLayout.SOUTH);
			frame.pack();
			Wait.manySec(3);
			gamePane = new GamePanel();
			//gamePane = new GamePanel();
			//gamePane.updateUI();
		}
		try{
				fstream = new FileInputStream("count.txt");
				in = new DataInputStream(fstream);
				br = new BufferedReader(new InputStreamReader(in));
				while (br.readLine() != null){sc++;}
				in.close();
				}catch(Exception exception){}
			score.setText("SCORE "+String.valueOf(sc));
			jr.add(score);
			frame.add(jr,BorderLayout.EAST);
			frame.pack();
		//frame.getContentPane().setForeground(Color.BLACK);
	}
	
	public GamePanel() {
		super();
		createPoints();
		makeCircles();
		initGUI();
	}
	
	public ArrayList<Point2D> getSession()
	{
		Random rd = new Random();
		//points.clear();
		points = new ArrayList<Point2D>();
		for(int i = 0; i < 5; ++i)
		  points.add(i,allpoints.get(rd.nextInt(100)));
		return points;  
	}
	
	
	public void createPoints()
	{
		Point2D p;
		double x = 20,y = 20;
		//allpoints.clear();
		allpoints = new ArrayList<Point2D>();
		for(int i = 0;i < 10;++i)
		{
			
			for(int j = 0;j < 10;++j)
			{
				p = new Point2D.Double(x,y);
				allpoints.add(p);
				x+=20;
			}
			y+=20;
			x = 20;
		}
	}
	
	
	private void initGUI() {
		try {
			setPreferredSize(new Dimension(400, 300));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
}


class CountdownTimer extends GamePanel{
	Timer countdownTimer;
	int timeRemaining = 60;
	public CountdownTimer(){
        countdownTimer = new Timer(1000, new CountdownTimerListener());
		tlab = new JLabel("Time Left :"+String.valueOf(timeRemaining), JLabel.CENTER);
		tlab.setForeground(new Color(100,100,255));
		tlab.setFont(new java.awt.Font("Verdana",1,14));
		countdownTimer.start();
	}
	public int get(){return timeRemaining;}
	class CountdownTimerListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
		
			if(--timeRemaining > 0)
			 tlab.setText("Time Left :"+String.valueOf(timeRemaining));
			else{
			 tlab.setForeground(Color.RED);
			 tlab.setText("Time's up !");
			 countdownTimer.stop();
			}
		}
			
		
	}
 }

class MouseAction extends MouseAdapter{

	private Graphics2D g2;
	private ArrayList<Ellipse2D> ea;
	GamePanel p;
	FileWriter fstream;
	BufferedWriter out;
	
	public MouseAction(Graphics2D g2,ArrayList<Ellipse2D> ea,GamePanel p)
	{
		//this.ea = new ArrayList<Ellipse2D>();
		//this.ea.clear();
		//for(Ellipse2D e:ea)this.ea.add(e);
		this.ea = ea;
		this.g2 = g2;
		this.p = p;
		//g2.setPaint(Color.WHITE);
	}
	public void mouseClicked(MouseEvent me){
	//System.out.println(me.getPoint());
	//System.out.println(ea.size());
	//System.out.println(ea.size());
	for(Ellipse2D e:ea)
		if(e.contains(me.getPoint()))
		{
			ea.remove(e);
			//p.setCircles(ea);
			p.repaint();
			try{
			fstream = new FileWriter("count.txt",true);
			out = new BufferedWriter(fstream);
			out.write("click\n");
			out.close();
			}catch(Exception exception){}
			break;
		}
	}
	//public static int get(){return score;}
}

class Wait{
	 public static void manySec(long s) {
	 
     try {
       Thread.currentThread().sleep(s * 1000);
       }
     catch (InterruptedException e) {
       e.printStackTrace();
       }
     }
	}
