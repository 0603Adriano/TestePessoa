
public class TestePessoa {
	
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		p1.nome = "Maria";
		p1.idade = 20;
		p1.peso = 65;
		p1.altura = 1.70;
		p1.imc = p1.calculaIMC();
		p1.mostraPessoa();
		System.out.println("");
		
		Pessoa p2 = new Pessoa();
		p2.nome = "João";
		p2.idade = 30;
		p2.peso = 80.5;
		p2.altura = 1.82;
		p2.imc = p2.calculaIMC();
		p2.mostraPessoa();
	}
	
}
