package LeitorCSVFinal;

import java.io.BufferedReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarregadorFuncionario {



	public List<Funcionario> LerFuncionarioArquivoCSV(String nomeArquivo) {
		// TODO Auto-generated method stub

		List<Funcionario> funcionario = new ArrayList<>();

		Path caminhoDoArquivo=Paths.get(nomeArquivo);

		try (BufferedReader br=Files.newBufferedReader(caminhoDoArquivo,StandardCharsets.UTF_8)){

			String linha = br.readLine();


			while(linha!=null) {

				String[] campos=linha.split(",");

				String nome=campos[0];
				String sobrenome=campos[1];
				String departamento=campos[2];
				String sexo=campos[3];
				double salario=Double.parseDouble(campos[4]);
				Funcionario fn=new Funcionario(nome, sobrenome, sexo, salario, departamento);



				funcionario.add(fn);
				//System.out.println(linha);

				linha=br.readLine();

			}


		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return funcionario;
	}


	public List<Funcionario> LerFuncionarioArquivoCSVWeb() {
		List<Funcionario> funcionario = new ArrayList<>();

		String site="https://raw.githubusercontent.com/antoniocleber/poo/master/funcionarioWeb.txt";

		try {
			URL u =new URL(site);

			Scanner s = new Scanner(u.openStream());

			while(s.hasNextLine()) {

				String linha=s.nextLine();
				String[] campos=linha.split(",");
				String nome=campos[0];
				String sobrenome=campos[1];
				String departamento=campos[2];
				String sexo=campos[3];
				double salario=Double.parseDouble(campos[4]);
				funcionario.add(new Funcionario(nome, sobrenome, sexo, salario, departamento));
			}
			s.close();

			return funcionario;

		}catch (MalformedURLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return null;
	}


	public List<FuncionarioComissao> LerFuncionarioComissaoArquivoCSV(String nomeArquivo){

		List<FuncionarioComissao> funcionarioComissao = new ArrayList<>();

		Path caminhoDoArquivo=Paths.get(nomeArquivo);

		try (BufferedReader br=Files.newBufferedReader(caminhoDoArquivo,StandardCharsets.UTF_8)){

			String linha = br.readLine();


			while(linha!=null) {

				String[]campos=linha.split(",");

				String nome=campos[0];
				String sobrenome=campos[1];
				String departamento=campos[2];
				String sexo=campos[3];
				double salario=Double.parseDouble(campos[4]);
				//double comissao=Double.parseDouble(campos[5]);

				FuncionarioComissao fnc=new FuncionarioComissao(nome, sobrenome, sexo, departamento, salario);

				funcionarioComissao.add(fnc);


				linha=br.readLine();

			}


		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		return funcionarioComissao;

	}

	public double calcularFolhaPagamento(double cfp) {
		FuncionarioComissao fc = new FuncionarioComissao("Antonio", "Cleber", "m", "TI", 0);
		cfp = 0;
		cfp = cfp + fc.getSalario() + fc.calcularComissao(fc.getSalario());
		
		return cfp;
	}

}


	





