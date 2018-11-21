package exe.computacaoGrafica.trabalhoIndividual2;

import javax.swing.JFrame;

//EXERCICIO 1
public class MostrarGraficoBarra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame frame = new JFrame( "Vendas de Carro - Gráfico de Barra" );
	    frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	    frame.add(new GraficoBarra());
	    frame.setSize( 508, 536 ); // configura o tamanho do frame
	    frame.setLocationRelativeTo(null);
	    frame.setVisible( true ); // exibe o frame
	}
}
