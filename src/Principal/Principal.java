/**
 * 
 */
package Principal;
/**
 * @author kathe 
 *
 */

import javax.swing.JOptionPane;

import ConversorMonedas.OpcionesConversion;

public class Principal {

	public static void main(String[] args) {
		
		OpcionesConversion conversion = new OpcionesConversion();
		
		while (true) {
			String opciones = JOptionPane.showInputDialog(null, "Seleccione una opci�n de conversi�n", "Men�", JOptionPane.PLAIN_MESSAGE, null, 
					new Object[] {"Conversor de Monedas", "Conversor de Temperatura"}, "Elegir").toString();
			
			switch (opciones) {
			case "Conversor de Monedas" :
				String input = JOptionPane.showInputDialog(null,  "Ingrese un valor");
				double valorRecibido = Double.parseDouble(input);
				conversion.ConvertirMonedas(valorRecibido);
				
				int respuesta = JOptionPane.showConfirmDialog(null, "Deseas realizar otra convesi�n?");
				if (JOptionPane.OK_OPTION ==respuesta) {
					System.out.println("Selecci�n afrimativa");
				}else {
					JOptionPane.showMessageDialog(null, "Programa Finalizado");
			
				}
				break;
			}
		}

	}

}
