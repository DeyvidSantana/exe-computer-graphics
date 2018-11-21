package exe.computacaoGrafica.trabalhoIndividual2;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;

//EXERCICIO 2
public class GraficoSenoCosseno extends JPanel {

	public void paintComponent( Graphics g ){
		super.paintComponent( g ); // chama o paintComponent da superclasse
		this.setBackground( Color.WHITE );
	
		int[] eixoX = {0,240,640,240};
		int[] eixoY = {25,0,25,480};
		DesenharEixos(g, Color.BLACK, eixoX, eixoY);
		
		DesenharLinhasMarcadoras(g, Color.BLACK);
		DesenharLegendasMarcadoras(g, Color.BLUE, new Font( "Serif", Font.BOLD, 12 ));
	}
	
	public void DesenharEixos(Graphics g, Color color, int[] eixoX, int[] eixoY){
		g.setColor( color );
		g.drawLine( eixoX[0], eixoX[1], eixoX[2], eixoX[3] );
		g.drawLine( eixoY[0], eixoY[1], eixoY[2], eixoY[3] );
	}
	
	public void DesenharLinhasMarcadoras(Graphics g, Color color){		
		g.setColor( color );
		
		//Desenha as linhas marcadoras do eixo X
		for (int i = 25; i < 640; i+=50) {
			g.drawLine( i, 237, i, 243 );
		}
		
		//Desenha as linhas marcadoras do eixo Y
		for (int i = 40; i < 480; i+=50) {
			g.drawLine( 22, i, 28, i );
		}
	}
	
	public void DesenharLegendasMarcadoras(Graphics g, Color color, Font font){
		int countAux = 70;
		g.setColor( color );
	    g.setFont( font );

	    // Legendas do eixo X
	    for(int i = 1; i <= 12; i++){
	    	
	    	g.drawString("" + i + "", countAux, 255 );
	    	countAux += 50;
	    }
	    
	    //Legenda do eixo origem
	    g.drawString( "0", 15, 255 );
	    
	    countAux = 440;
	    
	    // Legendas do eixo Y
	    for(int i = -4; i <= 4; i++){
	    	if(countAux == 240) {
	    		countAux -= 50;
	    		continue;
	    	}
	    	
	    	g.drawString( "" + i + "", (countAux == 240)? 15 : 10, countAux );
	    	countAux -= 50;
	    }				
	}

	
}
