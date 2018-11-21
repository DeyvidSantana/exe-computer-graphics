package exe.computacaoGrafica.trabalhoIndividual2;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Polygon;

import javax.swing.JPanel;

//EXERCICIO 4
public class GraficoPoligono extends JPanel{
	
	public void paintComponent( Graphics g ){
		super.paintComponent( g ); // chama o paintComponent da superclasse
		this.setBackground( Color.WHITE );
	
		int[] eixoX = {0,300,800,300};
		int[] eixoY = {25,0,25,600};
		DesenharEixos(g, Color.BLACK, eixoX, eixoY);
		
		DesenharLinhasMarcadoras(g, Color.BLACK);
		DesenharLegendasMarcadoras(g, Color.BLUE, new Font( "Serif", Font.BOLD, 12 ));
	
		//Construindo o objeto polígono
		
		int[] valoresX = {75, 75, 175, 50, 150, 150, 50, 175};
		int[] valoresY = {250, 150, 225, 225, 150, 250, 175, 175};		
		
		Polygon poligono = new Polygon(valoresX, valoresY, 8);
		DesenharPoligono(g, Color.GREEN, poligono);		
		DesenharPoligono(g, Color.RED, AplicarEscala(poligono, 2, 2));
		DesenharPoligono(g, Color.BLUE, AplicarTranslacao(poligono, 3, 0));
	}
	
	public void DesenharEixos(Graphics g, Color color, int[] eixoX, int[] eixoY){
		g.setColor( color );
		g.drawLine( eixoX[0], eixoX[1], eixoX[2], eixoX[3] );
		g.drawLine( eixoY[0], eixoY[1], eixoY[2], eixoY[3] );
	}
	
	public void DesenharLinhasMarcadoras(Graphics g, Color color){		
		g.setColor( color );
		
		//Desenha as linhas marcadoras do eixo X
		for (int i = 25; i < 810; i+=50) {
			g.drawLine( i, 297, i, 303 );
		}
		
		//Desenha as linhas marcadoras do eixo Y
		for (int i = 50; i < 580; i+=50) {
			g.drawLine( 22, i, 28, i );
		}
	}
	
	public void DesenharLegendasMarcadoras(Graphics g, Color color, Font font){
		int countAux = 70;
		g.setColor( color );
	    g.setFont( font );

	    // Legendas do eixo X
	    for(int i = 1; i <= 15; i++){
	    	
	    	g.drawString("" + i + "", countAux, 315 );
	    	countAux += 50;
	    }
	    
	    //Legenda do eixo origem
	    g.drawString( "0", 15, 315 );
	    
	    countAux = 550;
	    
	    // Legendas do eixo Y
	    for(int i = -5; i <= 5; i++){
	    	if(countAux == 300) {
	    		countAux -= 50;
	    		continue;
	    	}
	    	
	    	g.drawString( "" + i + "", (countAux == 300)? 15 : 10, countAux );
	    	countAux -= 50;
	    }				
	}

	public void DesenharPoligono(Graphics g, Color color, Polygon poligono){
		g.setColor( color );
		g.drawPolygon(poligono);
	}

	public Polygon AplicarEscala(Polygon poligono, int valorEscalaX, int valorEscalaY){
		Polygon poligonoEscalado;		
		int[] valoresX = new int[8];
		int[] valoresY = new int[8];
		
		for(int i = 0; i < poligono.xpoints.length; i++){
			valoresX[i] = poligono.xpoints[i] * valorEscalaX;
		}
		
		for(int i = 0; i < poligono.ypoints.length; i++){
			valoresY[i] = poligono.ypoints[i] * valorEscalaY;
		}
		
		poligonoEscalado = new Polygon(valoresX, valoresY, 8);
		
		return poligonoEscalado;
	}
	
	public Polygon AplicarTranslacao(Polygon poligono, int valorTranslacaoX, int valorTranslacaoY){
		Polygon poligonoTransalado;		
		int[] valoresX = new int[8];
		int[] valoresY = new int[8];
		
		for(int i = 0; i < poligono.xpoints.length; i++){
			valoresX[i] = poligono.xpoints[i] + (valorTranslacaoX * 50);
		}
		
		for(int i = 0; i < poligono.ypoints.length; i++){
			valoresY[i] = poligono.ypoints[i] + (valorTranslacaoY * 50);
		}
		
		poligonoTransalado = new Polygon(valoresX, valoresY, 8);
		
		return poligonoTransalado;
	}
	
	public Polygon AplicarRotacao(Polygon poligono, double valorRotacao){
		Polygon poligonoRotacionado = new Polygon();
		
		return poligonoRotacionado;
	}
	
}
