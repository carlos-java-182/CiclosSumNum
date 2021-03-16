package sumaNum;

import javax.swing.JOptionPane;

public class NumerosIntroducidos {

	public static void main(String[] args) {
		
		
		double numeros=0, resultado = 0;
		
		do {
			
			resultado += numeros;
			numeros= Double.parseDouble(JOptionPane.showInputDialog("Digita un número"));
			
			
		}while(numeros!=0);

		JOptionPane.showConfirmDialog(null, "La suma iterativa es: "+resultado);
		
	}

}
