package LeitorCSVFinal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;



public class TelaPrincipal extends JFrame {


	public TelaPrincipal() {




		JLabel etiqueta=new JLabel("Antony Motors");
		etiqueta.setBounds(150,0,150,50);
		this.add(etiqueta);

		JButton botao=new JButton("Funcionarios");

		botao.setBounds(40, 50, 300, 100);
		//adicionando o botão
		this.add(botao);

		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				JFrame telafuncionario = new JFrame();
				
				DefaultListModel lista1=new DefaultListModel<>();
				
				CarregadorFuncionario cf=new CarregadorFuncionario();
				List<Funcionario> funcionario=cf.LerFuncionarioArquivoCSV("pessoa.txt");
				
				for(Funcionario f:funcionario) {
					lista1.addElement(f.toString());
				}
				//lista1.addElement(new CarregadorFuncionario().LerFuncionarioArquivoCSV("pessoa.txt"));
				
			
				
				JList list=new JList<>(lista1);
				list.setBounds(50, 50, 200, 200);
				list.setLayout(null);
				
				
				
				
				telafuncionario.add(list);			
				telafuncionario.setVisible(true);
				telafuncionario.setBounds(50, 50, 700, 800);
			}
		});


		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setSize(400,650);  
		setLayout(null);  
		setVisible(true);  


	}

		


	






}


