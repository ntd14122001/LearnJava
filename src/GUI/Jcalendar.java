package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

class emp {
	String m, n;
}

public class Jcalendar extends JFrame implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JTextField loginid, attempt, tli, lid;
	JPasswordField password;
	JLabel l1, l2, head;
	JButton m2;

	public Jcalendar() {
		try {
			UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
		} catch (Exception e) {
		}
		JLabel lmn = new JLabel("DMWA");
		add(lmn);
		setTitle("DWMA");
		setLayout(new FlowLayout());
		l1 = new JLabel("username: ");
		l2 = new JLabel("password: ");
		loginid = new JTextField(12);
		JButton z = new JButton("login");
		password = new JPasswordField(12);
		password.addActionListener(this);
		add(l1);
		add(loginid);
		add(l2);
		add(password);
		add(z);
		m2 = new JButton("attendance reports");
		m2.addActionListener(this);
		z.addActionListener(this);
		JLabel l3 = new JLabel("Login status :  ");
		add(l3);
		attempt = new JTextField(20);
		add(attempt);
		tli = new JTextField(20);
		JLabel l4 = new JLabel("                                        times logged in by the user : ");
		add(l4);
		add(tli);
		JLabel jl1 = new JLabel("login details: ");
		add(jl1);
		lid = new JTextField(40);
		add(lid);
		add(m2);
	}

	public void actionPerformed(ActionEvent ae) {
		if (ae.getActionCommand() == "login") {
			int mon = 0;
			try {
				BufferedReader bk = new BufferedReader(new FileReader("db.txt"));
				while (bk.readLine() != null) {
					mon++;
				}
			} catch (Exception e) {
			}
			int att[] = new int[mon];
			int attt[] = new int[mon];
			String sss = "";
			String s123 = " ";
			String sss1 = "";
			String s1231 = " ";
			try {
				BufferedReader b = new BufferedReader(new FileReader("attendance.txt"));
				while ((sss = b.readLine()) != null) {
					s123 = s123 + sss + "\n";
				}
			} catch (Exception e) {
			}
			try {
				BufferedReader b1 = new BufferedReader(new FileReader("xyz.txt"));
				while ((sss1 = b1.readLine()) != null) {
					s1231 = s1231 + sss1 + "\n";
				}
			} catch (Exception e) {
			}

			StringTokenizer st123 = new StringTokenizer(s123, " \n");
			int tk = 0;
			while (st123.hasMoreTokens()) {
				att[tk] = Integer.parseInt(st123.nextToken());
				tk++;
			}
			StringTokenizer st1231 = new StringTokenizer(s1231, " \n");
			int tk1 = 0;
			while (st1231.hasMoreTokens()) {
				attt[tk1] = Integer.parseInt(st1231.nextToken());
				tk1++;
			}

			int k = 0;
			emp empl = new emp();
			try {
				BufferedReader br = new BufferedReader(new FileReader("db.txt"));
				String str = " ";
				outter: while ((str = br.readLine()) != null) {

					StringTokenizer st = new StringTokenizer(str, " \n");
					while (st.hasMoreTokens()) {
						empl.m = st.nextToken();
						empl.n = st.nextToken();
						String lk = new String(password.getPassword());
						boolean klklkl = (empl.m.equals(loginid.getText()) && empl.n.equals(lk));
						Calendar c1 = Calendar.getInstance();
						int duke = c1.get(Calendar.DAY_OF_YEAR);
						if (klklkl && ((duke) != attt[k])) {

							att[k] = att[k] + 1;
							attempt.setText("Attendance updated");
							tli.setText(att[k] + "   times");
							@SuppressWarnings("resource")
							PrintWriter p = new PrintWriter(new FileOutputStream("attendance.txt"), true);
							for (int j = 0; j < mon; j++) {
								String strld = "" + att[j];
								p.println(strld);
							}
							Calendar c = Calendar.getInstance();
							attt[k] = c.get(Calendar.DAY_OF_YEAR);
							PrintWriter p1 = new PrintWriter(new FileOutputStream("xyz.txt"), true);
							for (int j1 = 0; j1 < mon; j1++) {
								String strld1 = "" + attt[j1];
								p1.println(strld1);
							}
							Date now = new Date();
							String m = now.toString();
							lid.setText("logged in at : " + m);
							break outter;
						} else {
							attempt.setText("invalid userid or password");
						}

					}
					k++;
				}
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		if (ae.getActionCommand() == "attendance") {
		}
		if (ae.getActionCommand() == "attendance reports") {
			report r = new report();
			r.setSize(400, 600);
			r.setVisible(true);
			r.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			repaint();

		}
		repaint();
	}

	public void paint(Graphics g) {
	}

	public static void main(String args[]) {
		Jcalendar f = new Jcalendar();
		f.setSize(600, 600);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class report extends JFrame implements ActionListener {
	JLabel zm1, zm2;
	JTextField bm1, bm2;
	JButton jb;
	int m;
	String mad1;
	int a[] = new int[100];

	public report() {
		try {
			UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
		} catch (Exception e) {
		}

		setTitle("reports");
		setLayout(new FlowLayout());
		zm1 = new JLabel("name");
		zm2 = new JLabel("attendance");
		bm1 = new JTextField(10);
		bm2 = new JTextField(10);
		add(zm1);
		add(bm1);
		add(zm2);
		add(bm2);
		jb = new JButton("check");
		add(jb);
		jb.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand() == "check") {
			int k = 1;
			try {
				BufferedReader br = new BufferedReader(new FileReader("db.txt"));
				String str = " ";
				Outer: while ((str = br.readLine()) != null) {

					StringTokenizer st = new StringTokenizer(str, " \n");
					while (st.hasMoreTokens()) {
						String mad = st.nextToken();
						String mad2 = st.nextToken();
						mad1 = bm1.getText();
						if (mad1.equals(mad))
							break Outer;
						else
							k++;

					}
				}
			} catch (Exception e1) {
			}

			try {
				BufferedReader br = new BufferedReader(new FileReader("attendance.txt"));
				String str = " ";
				System.out.println(k);
				int i = 1;
				while ((str = br.readLine()) != null) {

					StringTokenizer st = new StringTokenizer(str, "\n");
					int land = Integer.parseInt(str);
					a[i] = land;
					if (i == k) {

						bm2.setText(a[i] + "");
					}
					i++;

				}
			} catch (Exception e1) {
			}

		}
	}
}