/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.java2d4;

import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import javax.swing.*;
public class java2D4 extends JPanel
{public void paint( Graphics g )
{Graphics2D g2 = (Graphics2D)g;
// Círculo a rellenar
Ellipse2D circulo = new Ellipse2D.Float( 10,10,220,220 );
// Gradiente de color de azul a verde
GradientPaint gradiente = new GradientPaint( 75,75,Color.RED,
95,95,Color.green,true );
// Se fija el gradiente
g2.setPaint( gradiente );
// Se rellena el círculo
g2.fill( circulo );
}// Método principal de la clase
public static void main( String[] args ) {
JFrame ventana = new JFrame( "Tutorial de Java, Gráficos 2D" );
ventana.setSize( 250,270 );
// Receptor de eventos de cierre de la clase
ventana.addWindowListener( new WindowAdapter() {
public void windowClosing( WindowEvent evt ) {
System.exit( 0 );
}
} );Container ejemplo = new java2D4();
ventana.setContentPane( ejemplo );
ventana.setVisible( true );
}
}
 

