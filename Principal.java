package LeitorCSVFinal;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;



public class Principal {
	
	public static void main(String[] args) {
		
		
		
		/*CarregadorFuncionarioComissao cfc=new CarregadorFuncionarioComissao();
		
		List<FuncionarioComissao> funcionarioComissao = cfc.LerFuncionarioComissaoArquivoCSV("pessoa.txt");
		
		for(FuncionarioComissao fc:funcionarioComissao) {
			
			System.out.println(fc.toString());
		}*/
		
		
		
		CarregadorFuncionario cf =new CarregadorFuncionario();
		
		List<Funcionario> funcionario = cf.LerFuncionarioArquivoCSV("pessoa.txt");
		List<FuncionarioComissao> funcionarioComissao = cf.LerFuncionarioComissaoArquivoCSV("pessoa.txt");
		
		for(Funcionario f:funcionario){
			
			if(f.getSalario()>=2000){
			System.out.println(f.toString());
			}
		}
		
		
			
			
			for(FuncionarioComissao fc:funcionarioComissao){
				
				if(fc.getSalario()<=2000) {
				System.out.println(fc.toString());
				}
		}
		
			
			
			double cfp = 0;
			System.out.println(cf.calcularFolhaPagamento(cfp));
			
			
		/*List<Funcionario> funcionarioWeb = cf.LerFuncionarioArquivoCSVWeb();
		
		for(Funcionario f:funcionarioWeb) {
			System.out.println(f.toString());
		}*/
		
		
		/*CarregadorProdutos csc=new CarregadorProdutos();
		
		List<Concessionaria> concessionaria = csc.LerConcessionariaArquivoCSV("produtos.txt");
		
		
		
		for(Concessionaria cs:concessionaria ) {
			System.out.println(cs.toString());
			
		}
		
		List<Concessionaria> concessionariaWeb =csc.LerConcessionariaArquivoCSVWeb();
		
		for(Concessionaria cs:concessionariaWeb) {
			System.out.println(cs.toString());
		}*/
		
		
		//new TelaPrincipal();
		
		
		
	}


		
}


