package exe.computacaoGrafica.trabalhoIndividual2;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;

//EXERCICIO 3
public class GraficoVetorPasso extends JPanel {

	public void paintComponent( Graphics g ){
		super.paintComponent( g ); // chama o paintComponent da superclasse
		this.setBackground( Color.WHITE );
	
		int[] eixoX = {0,240,640,240};
		int[] eixoY = {25,0,25,480};
		DesenharEixos(g, Color.BLACK, eixoX, eixoY);
		
		DesenharLinhasMarcadoras(g, Color.BLACK);
		DesenharLegendasMarcadoras(g, Color.BLUE, new Font( "Serif", Font.BOLD, 12 ));
	
		//Teste conforme exercício
		double[] vetorExemplo = {3,3,4,4,3.5,4,3,3,3,4,4,3.5,4,3,3.5,4,3,3,3,3.5,4,3,3,3,2.5,3,2};
		double passoExemplo = 0.5;
		DesenharGrafico(g, Color.RED, vetorExemplo, passoExemplo);
		
		double[] vetorExercicio = {1,1,2,2,1.5,2,1,1,1,2,2,1.5,2,1,1.5,2,1,1,1,1.5,2,1,1,1,0.5,1,0};
		double passoExercicio = 0.5;
		DesenharGrafico(g, Color.GREEN, vetorExercicio, passoExercicio);
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

	public void DesenharGrafico(Graphics g, Color color, double[] vetor, double passo){
		g.setColor( color );
		
		int[] vetorConvertido = new int[30];
		vetorConvertido = ConverterVetor(vetor);
				
		int passoConvertido = (int) (passo * 50);
		//int passoConvertido = 25;
		
		for (int i = 1; i < vetorConvertido.length; i++) {
			g.drawLine( passoConvertido, vetorConvertido[i-1], passoConvertido + 25, vetorConvertido[i] );
			passoConvertido+=25;
			
			if(passoConvertido == 625){
				break;
			}
		}
	}
	
	public int[] ConverterVetor(double[] vetor){
		
		int[] vetorConvertido = new int[30];
		
		for (int i = 0; i < vetor.length; i++) {
			if(vetor[i] == 4.0){
				vetorConvertido[i] = 40;
				continue;
			} else if (vetor[i] == 3.5){
				vetorConvertido[i] = 65;
				continue;
			} else if (vetor[i] == 3.0){
				vetorConvertido[i] = 90;
				continue;
			} else if (vetor[i] == 2.5){
				vetorConvertido[i] = 115;
				continue;
			} else if (vetor[i] == 2.0){
				vetorConvertido[i] = 140;
				continue;
			} else if (vetor[i] == 1.5){
				vetorConvertido[i] = 165;
				continue;
			} else if (vetor[i] == 1.0){
				vetorConvertido[i] = 190;
				continue;
			} else if (vetor[i] == 0.5){
				vetorConvertido[i] = 215;
				continue;
			} else if (vetor[i] == 0){
				vetorConvertido[i] = 240;
				continue;
			}
		}
		
		return vetorConvertido;
	}
	
}
