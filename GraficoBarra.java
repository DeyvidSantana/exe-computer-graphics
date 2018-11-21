package exe.computacaoGrafica.trabalhoIndividual2;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;

//EXERCICIO 1
public class GraficoBarra extends JPanel {

	public void paintComponent( Graphics g ){
		super.paintComponent( g ); // chama o paintComponent da superclasse
		this.setBackground( Color.WHITE );
	
		DesenharLinhaOrigem(g, Color.BLACK);
		
		DesenharRetangulos(g, Color.RED, 50, (480 - 350), 100, 350);
		DesenharRetangulos(g, Color.GREEN, 200, (480 - 250), 100, 250);
		DesenharRetangulos(g, Color.BLUE, 350, (480 - 100), 100, 100);
		
		DesenharLegenda(g, Color.RED, new Font( "Serif", Font.BOLD, 16 ), "FIAT - 3.500", 50, 120);
		DesenharLegenda(g, Color.GREEN, new Font( "Serif", Font.BOLD, 16 ), "GM - 2.500", 200, 220);
		DesenharLegenda(g, Color.BLUE, new Font( "Serif", Font.BOLD, 16 ), "FORD - 1.000", 350, 370);
	}
	
	public void DesenharLinhaOrigem(Graphics g, Color color){
		g.setColor( color );
		g.drawLine( 0, 480, 508, 480 );		
	}
	
	public void DesenharRetangulos(Graphics g, Color color, int x, int y, int width, int heigth){
		g.setColor( color );
		g.fillRect(x, y, width, heigth);
	}
	
	public void DesenharLegenda(Graphics g, Color color, Font font, String mensagem, int x, int y){
		g.setColor( color );
	    g.setFont( font );
	    g.drawString(mensagem, x, y);
	}
}
