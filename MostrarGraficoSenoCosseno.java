package exe.computacaoGrafica.trabalhoIndividual2;

import javax.swing.JFrame;

//EXERCICIO 2
public class MostrarGraficoSenoCosseno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame frame = new JFrame( "Teste Gráfico" );
	    frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	    frame.add(new GraficoSenoCosseno());
	    frame.setSize( 640, 480 ); // configura o tamanho do frame
	    frame.setLocationRelativeTo(null);
	    frame.setVisible( true ); // exibe o frame
	}
}
