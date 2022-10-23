
public class Pessoa {
	private String nome;
	private Integer nasc;
	private String cidade;
	private String conta;
	protected Integer menu;

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getNasc() {
		return nasc;
	}
	public void setNasc(Integer nasc) {
		this.nasc = nasc;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getConta() {
		return conta;
	}
	public void setConta(String conta) {
		this.conta = conta;
	}
	public Integer getMenu() {
		System.out.println(
				"1- CADASTRAR\n"+
				"2- COBRAR\n"+
				"3- RECEBER SALÁRIO\n");
		return menu;
	}
	public Integer getMenu2() {
		System.out.println("1- ONDE É MINHA SALA?\n"
						  + "2- DEMITIR\n"
						  + "3- PROMOVER\n"
						  + "4- CONTRATAR \n");
		return menu;
	}
	public void setMenu(Integer menu) {
		this.menu = menu;
	}
	public void setMenu2(Integer menu) {
		this.menu = menu;
	}
}
