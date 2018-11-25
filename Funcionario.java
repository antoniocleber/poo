package LeitorCSVFinal;

public class Funcionario extends Pessoa  {


	private double salario;
	private String departamento;



	public Funcionario(String nome, String sobrenome, String sexo, double salario, String departamento) {
		super(nome, sobrenome, sexo);
		this.salario = salario;
		this.departamento = departamento;
	}



	public double getSalario() {
		return salario;
	}



	public void setSalario(double salario) {
		this.salario = salario;
	}



	public String getDepartamento() {
		return departamento;
	}



	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}



	@Override
	public String toString() {
		return "Funcionario - Nome - " + getNome() + ",  Sobrenome - " + getSobrenome() + ", Sexo - " + getSexo()
		+ ", Salario Mensal =  " + salario + ", Departamento  -  " + departamento +"" ;
	}



	
}









