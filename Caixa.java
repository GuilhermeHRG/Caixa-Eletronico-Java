import java.util.Scanner;

public class Caixa extends Pessoa {

	public static void main(String[] args) {
		int op, op2, esc, log;
		Double val;
		String t, con, n;
		Scanner ler = new Scanner(System.in);
		Cliente c = new Cliente();
		Funcionario f = new Funcionario();
		Gerente g = new Gerente();
		Pessoa p = new Pessoa();
		System.out.println("UM PROJETO DESENVOLVIDO POR GUILHERME GUELERE\n\n");

		System.out.println("QUEM ESTÁ ACESSANDO?\n" + "1- GERENTE\n" + "2- FUNCIONÁRIO\n" + "3- CLIENTE ");
		log = ler.nextInt();

		if (log == 3) {
			System.out.println("MENU CLIENTE\n");
			System.out.println("NÚMERO DA CONTA: ");
			con = ler.next();
			c.setConta(con);
			System.out.println("BEM-VINDO O NÚMERO DA SUA CONTA É: " + con);

			System.out.println("SEU SALDO ATUAL É DE R$ : " + c.getSaldo() + " FAÇA SEU PRIMEIRO DEPÓSITO...");
			System.out.println("DEPOSITAR? : SIM(1)  NÃO(0)");
			op2 = ler.nextInt();

			while (op2 == 1) {

				if (op2 == 1) {

					System.out.println("SELECIONE ALGUMA DAS OPÇÕES: " + "\n1- SAQUE " + "\n2- TRANSFERÊNCIA "
							+ "\n3- SALDO E EXTRATO " + "\n4- DEPOSITAR ");
					op = ler.nextInt();
					switch (op) {

					case 1:
						System.out.println("SEU SALDO É DE : R$ " + c.getSaldo());
						System.out.println("INSIRA O VALOR DO SAQUE: R$ ");
						val = ler.nextDouble();
						if (val <= c.getSaldo()) {
							c.pagarSacar(val);
							System.out.println("SEU SALDO É DE : R$ " + c.getSaldo());
							break;
						} else {
							System.out.println("SALDO INSUFICIENTE");
							break;
						}
					case 2:
						System.out.println("DIGITE O NUMERO DA CONTA DESTINO DA TRANSFERÊNCIA: ");
						t = ler.next();
						System.out.println("DIGITE O VALOR DA TRANSFERÊNCIA: R$ ");
						val = ler.nextDouble();
						if (c.getSaldo() >= val) {
							c.pagarSacar(val, t);
							break;
						} else {
							System.out.println("SALDO INSUFICIENTE");
							break;
						}
					case 3:
						System.out.println("DIGITE O NUMERO DA SUA CONTA: ");
						t = ler.next();
						System.out.println("O SALDO DA CONTA " + t + " é de R$" + c.getSaldo());
						break;
					case 4:
						System.out.println("DIGITE O VALOR DO DEPÓSITO: R$ ");
						val = ler.nextDouble();
						c.setSaldo(val + c.getSaldo());
						System.out.println("SEU SALDO AGORA É DE " + c.getSaldo());
						break;
					default:
						System.out.println("OPÇÃO INVÁLIDA");
						break;

					}

					System.out.println("DESEJA MAIS USAR UM SERVIÇO?  SIM(1)  NÃO(0) ");
					esc = ler.nextInt();
					if (esc == 1) {
						System.out.println("SELECIONE ALGUMA DAS OPÇÕES: " + "\n1- SAQUE " + "\n2- TRANSFERÊNCIA "
								+ "\n3- SALDO E EXTRATO " + "\n4- DEPOSITAR ");
						op = ler.nextInt();
						switch (op) {

						case 1:
							System.out.println("SEU SALDO É DE : R$ " + c.getSaldo());
							System.out.println("INSIRA O VALOR DO SAQUE: R$ ");
							val = ler.nextDouble();
							if (val <= c.getSaldo()) {
								c.pagarSacar(val);
								System.out.println("SEU SALDO É DE : R$ " + c.getSaldo());
								break;
							} else {
								System.out.println("SALDO INSUFICIENTE");
								break;
							}
						case 2:
							System.out.println("DIGITE O NUMERO DA CONTA DESTINO DA TRANSFERÊNCIA: ");
							t = ler.next();
							System.out.println("DIGITE O VALOR DA TRANSFERÊNCIA: R$ ");
							val = ler.nextDouble();
							if (c.getSaldo() >= val) {
								c.pagarSacar(val, t);
								break;
							} else {
								System.out.println("SALDO INSUFICIENTE");
								break;
							}
						case 3:
							System.out.println("DIGITE O NUMERO DA SUA CONTA: ");
							t = ler.next();
							System.out.println("O SALDO DA CONTA " + t + " é de R$" + c.getSaldo());
							break;
						case 4:
							System.out.println("DIGITE O VALOR DO DEPÓSITO: R$ ");
							val = ler.nextDouble();
							c.setSaldo(val + c.getSaldo());
							System.out.println("SEU SALDO AGORA É DE " + c.getSaldo());
							break;
						default:
							System.out.println("OPÇÃO INVÁLIDA");
							break;
						}
					} else if (esc != 1) {
						System.out.println("SAINDO..");
						break;
					}
					ler.close();

				}
			}

		}
		if (log == 1) {
			System.out.println("MENU GERENTE\n");
			// System.out.println("ÓLÁ GERENTE DA "+g.getSala());
			g.getMenu2();
			esc = ler.nextInt();
			if (esc == 1) {
				System.out.println(g.getSala());
			} else if (esc == 2) {
				g.demitir();
				n = ler.next();
				System.out.println("FUNCIONÁRIO " + n + " DEMITIDO.");
			} else if (esc == 3) {
				g.promo();
				n = ler.next();
				con = ler.next();
				System.out.println("FUNCIONÁRIO " + n + " PROMOVIDO A " + con);
			} else if (esc == 4) {
				g.contrat();
				n = ler.next();
				con = ler.next();
			} else {
				return;
			}

		}
		if (log == 2) {
			System.out.println("MENU FUNCIONARIO\n");
			f.getMenu();
			esc = ler.nextInt();
			if (esc == 1) {
				f.cadastro();
				n = ler.next();
				con = ler.next();
				System.out.println(n.toUpperCase() + " CADASTRADO!\n" + "CONTA: " + con);
				p.setNome(n);
				p.setConta(con);
				System.out.println("\nSUCESSO!!!");
			} else if (esc == 2) {
				f.cobrar();
				n = ler.next();
				con = ler.next();
				System.out.println("COBRANÇA DE R$ " + con + " ENVIADA PARA CONTA: " + n);
			} else if (esc == 3) {
				System.out.println("SEU SALÁRIO DE R$ " + f.getSalario() + " FOI RECEBIDO EM SUA CONTA!");
			}

		} else {
		}

	}
	
	

}
