package ConversorMonedas;

import javax.swing.JOptionPane;

public class ConvertirMonedas {

	public void ConvertirPesoDominicanosADolares(double valor) {
		double monedaDolar = valor / 0.019;
		monedaDolar = (double) Math.round(monedaDolar * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaDolar + " Dolares");
	}

	public void ConvertirPesoDominicanosAEuro(double valor) {
		double monedaEuro = valor / 0.019;
		monedaEuro = (double) Math.round(monedaEuro * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaEuro + " Dolares");
	}

	public void ConvertirDePesosDominicanoaLibraEsterlina(double valor) {
		double monedaLibraEsterlina = valor / 0.017;
	monedaLibraEsterlina = (double) Math.round(monedaLibraEsterlina *100d) /100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaLibraEsterlina + " Dolares");
	}
	public void ConvertirDePesosaYen(double valor) {
		double monedaYen = valor / 2.71;
		monedaYen = (double) Math.round(monedaYen * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaYen + " Dolares");
	}

	public void ConvertirDePesosaWonCoreano(double valor) {
		double monedaWonCoreano = valor /0.47;
		monedaWonCoreano = (double) Math.round(monedaWonCoreano) / 100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaWonCoreano + " Dolares");
	}

	public void ConvertirDeDólarPesos(double valor) {
		double DólarPesos = valor / 0.019;
		DólarPesos = (double) Math.round(DólarPesos * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + DólarPesos + " Dolares");
	}

	public void ConvertirDeEuroPeso(double valor) {
		double monedaEuroPeso = valor / 52.17;
		monedaEuroPeso = (double) Math.round(monedaEuroPeso * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaEuroPeso + " Dolares");

	}

}
