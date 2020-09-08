package exercicio;
import javax.swing.JOptionPane;

public class TesteObjetos {

	public static void main(String[] args) {
	
	
		Lugar[] Lug=new Lugar[5];
	
		Lug[0]=new Lugar("Brasil","America do Sul", "Equatorial", "Português", "Moeda");
		Lug[1]=new Lugar("Alemanha", "Europa", "Continental", "Alemão", "Euro");
		Lug[2]=new Lugar("China", "Asia", "Subtropical", "Chinês", "Renminbi");
		Lug[3]=new Lugar("Australia", "Oceania", "Tropical", "Inglês Australiano", "Dólar Australiano");
		Lug[4]=new Lugar("Russia", "Asia", "Continental", "Russo", "Rublo Russo");
				
		for(int i=0;i <5;i++)
		{
			System.out.println("Lugar" + "\t" + Lug[i].getPais() + "\t" + Lug[i].getContinente() + "\t" + Lug[i].getClima() + "\t" + Lug[i].getMoeda() + "\t" + Lug[i].getIdioma());
		}
	
		Pessoa [] Pes =new Pessoa [5];
		
		Pes[0]=new Pessoa("Amaro", 25, "M", "São José dos Campos", 997663848);
		Pes[1]=new Pessoa("Vitor", 23, "M", "Caçapava", 991331364);
		Pes[2]=new Pessoa("Hanna", 23, "F", "Caçapava", 988276443);
		Pes[3]=new Pessoa("Renan", 30, "M", "Taubaté", 997845685);
		Pes[4]=new Pessoa("Jessica", 50, "F", "Caraguatatuba", 997673808);
		
		
		for(int i=0;i <5;i++)
		{
		
			System.out.println("Pessoa" + "\t" + Pes[i].getNome() + "\t" + Pes[i].getIdade() + "\t" + Pes[i].getGenero() + "\t" + Pes[i].getCidade() + "\t" + Pes[i].getTelefone());
			
		}
		
		Alunos [] Alu = new Alunos [5];
		
		Alu[0]=new Alunos(JOptionPane.showInputDialog("Digite seu nome:"), 45554778, 25, "Banco de Dados", "Fim do Ano de 2020");
		Alu[1]=new Alunos(JOptionPane.showInputDialog("Digite seu nome:"), 88888888, 58, "ADS", "Fim do Ano de 2021");
		Alu[2]=new Alunos(JOptionPane.showInputDialog("Digite seu nome:"), 55555555, 24, "Logistica", "Meio do Ano de 2021");
		Alu[3]=new Alunos(JOptionPane.showInputDialog("Digite seu nome:"), 88888888, 58, "Manutenção de Aeronaves", "Fim do Ano de 2020");
		Alu[4]=new Alunos(JOptionPane.showInputDialog("Digite seu nome:"), 66666666, 21, "Banco de Dados", "Meio do ano de 2023");

		for(int i=0;i <5;i++)
		{
		
			System.out.println("Alunos" + "\t" + Alu[i].getNome() + "\t" + Alu[i].getRa() + "\t" + Alu[i].getIdade() + "\t" + Alu[i].getCurso() + "\t" + Alu[i].getConclusao());
			
		}
		
		Calcado [] Cal =new Calcado [5];
		
		Cal[0]=new Calcado("Corrida","Nike", 42, "Branco", "Emborrachado");
		Cal[1]=new Calcado("Salto","Vizzano", 35, "Nude", "Veludo");
		Cal[2]=new Calcado("Social","Democrata", 42, "Preto", "Couro");
		Cal[3]=new Calcado("Gladiador","Vizzano", 35, "Nude", "Couro");
		Cal[4]=new Calcado("Chinelo","Havaianas", 40, "Branco", "Emborrachado");
		
		for(int i=0;i <5;i++)
		{
		
			System.out.println("Calçados" + "\t" + Cal[i].getModelo() + "\t" + Cal[i].getMarca() + "\t" + Cal[i].getTamanho() + "\t" + Cal[i].getCor() + "\t" + Cal[i].getMaterial());
			
		}
		
		Profissao [] Pro=new Profissao [5];
		
		Pro[0]=new Profissao("Julio","Bombeiro",28,"Homem",3.500);
		Pro[1]=new Profissao("Nice","Enfermeira",33,"Mulher",2.500);
		Pro[2]=new Profissao("Julia","Policial",25,"Mulher",4.500);
		Pro[3]=new Profissao("Vitor","TI",24,"Homem",4.500);
		Pro[4]=new Profissao("Marcela","Costureira",45,"Mulher",2.000);

		for(int i=0;i <5;i++)
		{
		
			System.out.println("Profissional" + "\t" + Pro[i].getNome() + "\t" + Pro[i].getProfissao() + "\t" + Pes[i].getIdade() + "\t" + Pro[i].getGenero() + "\t" + Pro[i].getSalario());
		}
		
		Instrumentos [] Ins=new Instrumentos [5];
			
		Ins[0]=new Instrumentos("Violão","Acustico","Corda","Bege","Médio");
		Ins[1]=new Instrumentos("Saxofone","Sopranino","Sopro","Doruado","Pequeno");
		Ins[2]=new Instrumentos("Saxofone","Soprano","Corda","Dourado","Médio");
		Ins[3]=new Instrumentos("Bateria","Tambor","Percussão","Branca","Grande");
		Ins[4]=new Instrumentos("Violino","Acustico","Corda","Madeira","Médio");

		for(int i=0;i <5;i++)
		{
		
			System.out.println("Instrumentos" + "\t" + Ins[i].getNome() + "\t" + Ins[i].getModelo() + "\t" + Ins[i].getClasse() + "\t" + Ins[i].getCor() + "\t" + Ins[i].getTamanho());
		
		}	
			
			
	}		
		
}
	
	
