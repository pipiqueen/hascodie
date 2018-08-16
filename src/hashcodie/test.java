package hashcodie;

import javax.swing.JOptionPane;

public class test {

	public static void main(String[] args) {
		
		zapat2 Zapato = new zapat2 ("Marco", 39, true);
		zapat2 sandalia = new zapat2 ("analia", 43, false);
		
		
		zapat2 namae = new zapat2 (JOptionPane.showInputDialog("ingrese nombre") , Integer.parseInt(JOptionPane.showInputDialog("ingrese talle")),Boolean.parseBoolean(JOptionPane.showInputDialog("si esta vendido, true") ));
	System.out.println(namae.equals(sandalia));
		
		
			
		}

	}


