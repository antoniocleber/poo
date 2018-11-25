package LeitorCSVFinal;

public class Concessionaria extends Carro {
	
	private double valorDoCarro ;
	private String tipoDeTerreno;
	private String paisDeOrigem;
	
	
	public Concessionaria(String fabricante, String modelo, int ano, double valorDoCarro, String tipoDeTerreno, String paisDeOrigem) {
		super(fabricante, modelo, ano);
		this.valorDoCarro = valorDoCarro;
		this.tipoDeTerreno = tipoDeTerreno;
		this.paisDeOrigem = paisDeOrigem;
	}	


	
	public double getValorDoCarro() {
		return valorDoCarro;
	}


	public void setValorDoCarro(double valorDoCarro) {
		this.valorDoCarro = valorDoCarro;
	}


	public String getTipoDeTerreno() {
		return tipoDeTerreno;
	}


	public void setTipoDeTerreno(String tipoDeTerreno) {
		this.tipoDeTerreno = tipoDeTerreno;
	}


  
	@Override
	public String toString() {
		return " Fabricante -  " + getFabricante() + " - Modelo - " + getModelo() + " - Ano De Fabricação - "
				+ getAno() + " - Valor Do Carro - " + valorDoCarro + " - Terreno Ideal - " + tipoDeTerreno + "";
	}
	
	
	
	
	
	

}
