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

public class CarregadorProdutos {
	
	
	public List<Concessionaria> LerConcessionariaArquivoCSV(String nomeArquivo) {
		// TODO Auto-generated method stub
		
		List<Concessionaria> concessionaria = new ArrayList<>();
		 
		
		Path caminhoDoArquivo=Paths.get(nomeArquivo);
		
		try (BufferedReader br=Files.newBufferedReader(caminhoDoArquivo,StandardCharsets.UTF_8)){
		
			String linha = br.readLine();
			
			
			while(linha!=null) {
				
				String[] campos=linha.split(",");
				
				String fabricante=campos[0];
				String modelo=campos[1];
				int ano=Integer.parseInt(campos[2]);
				double valorDoCarro=Double.parseDouble(campos[3]);
				String tipoDeTerreno=campos[4];
				String paisDeOrigem=campos[5];
				
				
				Concessionaria cs=new Concessionaria(fabricante, modelo, ano, valorDoCarro, tipoDeTerreno, paisDeOrigem);
				
				
				
				concessionaria.add(cs);
				
			
				
				//System.out.println(linha);
				
				linha=br.readLine();
				
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return concessionaria;
	}
		
	
	public List<Concessionaria> LerConcessionariaArquivoCSVWeb() {
		List<Concessionaria> concessionaria = new ArrayList<>();

		String site="https://raw.githubusercontent.com/antoniocleber/poo/master/carros.txt";
		
		try {
			URL u =new URL(site);
			
			Scanner s = new Scanner(u.openStream());
			
			while(s.hasNextLine()) {
				
				String linha=s.nextLine();
				String[] campos=linha.split(",");
				String fabricante=campos[0];
				String modelo=campos[1];
				int ano=Integer.parseInt(campos[2]);
				double valorDoCarro=Double.parseDouble(campos[3]);
				String tipoDeTerreno=campos[4];
				String paisDeOrigem=campos[5];
				concessionaria.add(new Concessionaria(fabricante, modelo, ano, valorDoCarro, tipoDeTerreno, paisDeOrigem));
			}
			s.close();
			
			return concessionaria;
		
		}catch (MalformedURLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return null;
	}
	
	
	
	

}
