public class Pessoa {
	
	//Atributos
	public String nome;
	public int idade;
	public double altura;
	public double peso;
	public String cpf;
	public double imc;
	
	//Métodos
	public double CalculaIMC() {
		double calc = peso / (altura * altura);
		return calc;
	}
	
	public void MostraPessoa() {
		String txt = "A pessoa: " + nome;
		txt += "\n com idade: " + idade;
		txt += "\n com peso: " + peso;
		txt += "\n com altura: " + altura;
		txt += "\n possui um IMC de : " + imc;
		System.out.println(txt);
	}
}