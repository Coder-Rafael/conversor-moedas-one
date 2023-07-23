
public class ConversorMoedas {
	
	//Taxas de câmbio fornecidas pelo chatGPT(2021)
	private double dolar = 5.50;
	private double dolarCanadense = 4.20;
	private double euro = 6.80;
	private double libra = 7.80;
	private double pesoArgentino = 0.065;
	
	public double converteQuantia(double quantiaReal, double quantiaMoeda, String moeda) {
		
		double conversao = 0;
		
		switch(moeda) {
		
		case "Dólar": conversao = quantiaReal * this.dolar;
			break;	
		case "Dólar Canadense": conversao = quantiaReal * this.dolarCanadense;
			break;
		case "Euro": conversao = quantiaReal * this.euro;
			break;
		case "Libra": conversao = quantiaReal * this.libra;
			break;
		case "Peso Argentino": conversao = quantiaReal * this.pesoArgentino;
			break;
		}
		
		return conversao;
	}
	
}
