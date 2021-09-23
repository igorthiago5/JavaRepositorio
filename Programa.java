package Principal;
import java.util.Scanner;
import java.util.Locale;
import Classe.Banco;
public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Banco b = new Banco();
		System.out.println("Entre com o número da conta");
		int conta = sc.nextInt();
		b.setConta(conta);
		System.out.println("Entre o nome do titular");
		String nome = sc.next();
		b.setNome(nome);
		System.out.println(b.toString());
		System.out.println("Deseja adiconar saldo a conta? s/n");
		char v = sc.next().charAt(0);
		if(v == 's') {
			System.out.println("Entre com o saldo que deseja adicionar");
			double saldo = sc.nextDouble();
			b.AdicionarSaldo(saldo);
			System.out.println("Saldo adicionado com sucésso");
			System.out.println(b.toString());
		}
		System.out.println("Qual valor deseja sacar?");
		double sacar = sc.nextDouble();
		b.ReomverSaldo(sacar);
		System.out.println(b.toString());
		
	}

}
