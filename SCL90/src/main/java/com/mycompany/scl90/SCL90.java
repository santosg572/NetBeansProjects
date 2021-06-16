/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.scl90;

import java.util.Locale;
import java.util.ResourceBundle;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.*;

public class SCL90 extends JFrame {
	Iden_SCL90 Iden;
	private Font font = new Font("serif", Font.ITALIC+Font.BOLD, 36);
	
	public SCL90() {
		
		super("");

		Toolkit tk = Toolkit.getDefaultToolkit ();
		Dimension screen = tk.getScreenSize ();
		
		int sx = (int) screen.getHeight();
		int sy = (int) screen.getWidth();
		int ex = 800;
		int ey = 250;
		
		int x0 =  (int) ((sy-ex)/2);
		int y0 =  (int) ((sx-ey)/2);
		
		Iden = new Iden_SCL90();
		add(Iden);
		
		setLocation (x0, y0);
		setSize(ex, ey);
		setVisible(true);
		
	}

	 public static void main(String args[]) {
		new SCL90();
	 }

}

