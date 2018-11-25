package LeitorCSVFinal;

public class FuncionarioComissao extends Pessoa {
	
	private String departamento;
	private double salario;
	
	
	
	public FuncionarioComissao(String nome, String sobrenome, String sexo, String departamento, double salario) {
		super(nome, sobrenome, sexo);
		this.departamento = departamento;
		this.salario = salario;
		
	}


	public String getDepartamento() {
		return departamento;
	}


	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}


	public double getSalario() {
		return salario;
	}


	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double calcularComissao(double comissao) {
		if(getSalario()>= 2000 ) {
		comissao = 0;
		}else if(getSalario()<=2000) {
			comissao=(getSalario()*0.5);
		}
		return comissao;
		
	}

	
	
	


	@Override
	public String toString() {
		return "Funcionario com Comissao - Nome - " + getNome() + ", Sobrenome - " + getSobrenome() + ", Sexo - "
				+ getSexo() + ", Departamento - " + departamento + ", Salário Mensal - " + salario +" Comissão - "+calcularComissao(getSalario())+"";
	}


	
	
	
	
	
	
	
	

	
	

}
