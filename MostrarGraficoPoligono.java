package exe.computacaoGrafica.trabalhoIndividual2;

import javax.swing.JFrame;

//EXERCICIO 4
public class MostrarGraficoPoligono {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame frame = new JFrame( "Teste Gráfico" );
	    frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	    frame.add(new GraficoPoligono());
	    frame.setSize( 800, 600 ); // configura o tamanho do frame
	    frame.setLocationRelativeTo(null);
	    frame.setVisible( true ); // exibe o frame
	}
}
