package ConversorMonedas;

import javax.swing.JOptionPane;

public class OpcionesConversion {
	
	ConvertirMonedas monedas = new ConvertirMonedas();
	
	public void ConvertirMonedas(double valor) {
	String opcion = JOptionPane.showInputDialog(null,
			"Elije la moneda a la que deseas convertir tu dinero", "Moneda", JOptionPane.PLAIN_MESSAGE, null, new Object[] 
					{"De Pesos Dominicano a D�lar", "De Pesos Dominicano a Euro", "De Pesos Dominicano a Libra Esterlina", "De Pesos a Yen", "De Pesos a Won Coreano", 
					"De D�lar a Pesos","De Euro a Pesos"},"Selecci�n").toString();

	switch (opcion) {
	case "De Pesos Dominicano a D�lar" :
		monedas.ConvertirPesoDominicanosADolares(valor);
		break;
	
	case "De Pesos Dominicano a Euro" :
		monedas.ConvertirPesoDominicanosAEuro(valor);
		break;
		
	case "De Pesos Dominicano a Libra Esterlina" :
		monedas.ConvertirPesoDominicanosAEuro(valor);
		break;
	
	case "De Pesos a Yen" :
		monedas.ConvertirDePesosaYen(valor);
		break;
		
	case "De Pesos a Won Coreano" :
		monedas.ConvertirDePesosaWonCoreano(valor);
		break;
	
	case "De D�lar a Pesos" :
		monedas.ConvertirDeD�larPesos(valor);
		break;
		
	case "De Euro a Pesos" :
		monedas.ConvertirDeEuroPeso(valor);
		break;
		
		}
	}
}
