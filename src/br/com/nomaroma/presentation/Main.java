package br.com.nomaroma.presentation;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import br.com.nomaroma.entities.Account;
import br.com.nomaroma.entities.AccountEnum;
import br.com.nomaroma.entities.Client;
import br.com.nomaroma.service.BankService;
import br.com.nomaroma.service.ServiceFactory;

/**
 * OBSERVA��ES: 
 * N�O � permitido o uso de nenhuma estrutura de repeti��o (for, while, do-while).
 * Tente, ao m�ximo, evitar o uso das estruturas if, else if, else e switch-case
 * 
 * @author VictorLira
 *
 */
public class Main {
	
	private static BankService service = ServiceFactory.getService();
	
	public static void main(String[] args) {
		imprimirNomesClientes();
		
	}
	
	/**
	 * 1. Imprima na tela o nome e e-mail de todos os clientes (sem repeti��o), usando o seguinte formato:
	 * Victor Lira - vl@cin.ufpe.br
	 */
	public static void imprimirNomesClientes() {
		service.listClients().stream()
				.distinct()
				.forEach(c -> System.out.println(c.getName().substring(0,1).toUpperCase().concat(c.getName().substring(1))+" - "+c.getEmail()))
				;
		
	}
	
	/**
	 * 2. Imprima na tela o nome do cliente e a m�dia do saldo de suas contas, ex:
	 * Victor Lira - 352
	 */
	public static void imprimirMediaSaldos() {
		throw new UnsupportedOperationException();
		
	}
	
	/**
	 * 3. Considerando que s� existem os pa�ses "Brazil" e "United States", 
	 * imprima na tela qual deles possui o cliente mais rico, ou seja,
	 * com o maior saldo somando todas as suas contas.
	 */
	public static void imprimirPaisClienteMaisRico() {
throw new UnsupportedOperationException();
	}
	
	/**
	 * 4. Imprime na tela o saldo m�dio das contas da ag�ncia
	 * @param agency
	 */
	public static void imprimirSaldoMedio(int agency) {
		throw new UnsupportedOperationException();
	}
	
	/**
	 * 5. Imprime na tela o nome de todos os clientes que possuem conta poupan�a (tipo SAVING)
	 */
	public static void imprimirClientesComPoupanca() {
		throw new UnsupportedOperationException();
		
	}
	
	/**
	 * 6.
	 * @param agency
	 * @return Retorna uma lista de Strings com o "estado" de todos os clientes da ag�ncia
	 */
	public static List<String> getEstadoClientes(int agency) {
		throw new UnsupportedOperationException();
	}
	
	/**
	 * 7.
	 * @param country
	 * @return Retorna uma lista de inteiros com os n�meros das contas daquele pa�s
	 */
	public static int[] getNumerosContas(String country) {
		throw new UnsupportedOperationException();
	}
	
	/**
	 * 8.
	 * Retorna o somat�rio dos saldos das contas do cliente em quest�o 
	 * @param clientEmail
	 * @return
	 */
	public static double getMaiorSaldo(String clientEmail) {
		throw new UnsupportedOperationException();
	}
	
	/**
	 * 9.
	 * Realiza uma opera��o de saque na conta de acordo com os par�metros recebidos
	 * @param agency
	 * @param number
	 * @param value
	 */
	public static void sacar(int agency, int number, double value) {
	throw new UnsupportedOperationException();
	}
	
	/**
	 * 10. Realiza um deposito para todos os clientes do pa�s em quest�o	
	 * @param country
	 * @param value
	 */
	public static void depositar(String country, double value) {
	throw new UnsupportedOperationException();
	}
	
	/**
	 * 11. Realiza uma transfer�ncia entre duas contas de uma ag�ncia.
	 * @param agency - ag�ncia das duas contas
	 * @param numberSource - conta a ser debitado o dinheiro
	 * @param numberTarget - conta a ser creditado o dinheiro
	 * @param value - valor da transfer�ncia
	 */
	public static void transferir(int agency, int numberSource, int numberTarget, double value) {
	throw new UnsupportedOperationException();
	}
	
	/**
	 * 12.
	 * @param clients
	 * @return Retorna uma lista com todas as contas conjuntas (JOINT) dos clientes
	 */
	public static List<Account> getContasConjuntas(List<Client> clients) {

		throw new UnsupportedOperationException();
	}
	
	/**
	 * 13.
	 * @param state
	 * @return Retorna uma lista com o somat�rio dos saldos de todas as contas do estado 
	 */
	public static double getSomaContasEstado(String state) {
		throw new UnsupportedOperationException();	
	}
	
	/**
	 * 14.
	 * @return Retorna um array com os e-mails de todos os clientes que possuem contas conjuntas
	 */
	public static String[] getEmailsClientesContasConjuntas() {
		throw new UnsupportedOperationException();
	}
	
	/**
	 * 15.
	 * @param number
	 * @return Retorna se o n�mero � primo ou n�o
	 */
	public static boolean isPrimo(int number) {
		throw new UnsupportedOperationException();
	}
	
	/**
	 * 16.
	 * @param number
	 * @return Retorna o fatorial do n�mero
	 */
	public static int getFatorial(int number) {
		throw new UnsupportedOperationException();
	}
}
