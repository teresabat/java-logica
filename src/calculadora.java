import java.util.Scanner;

public class calculadora {
	public static void main(String[] args) {
		// Criar uma instancia da classe Scanner para ler a entrada do vlaor
		Scanner scanner = new Scanner(System.in);

		// Solicita ao user que insira o primeiro numero
		System.out.println("Digite o primeiro numero: ");
		int num1 = scanner.nextInt();

		// Solicita ao user que insira o segundo numero
		System.out.println("Digite o segundo numero: ");
		int num2 = scanner.nextInt();

		// Solicita ao usuario que escolha a operação matematica
		System.out.println("Escola a operação matemática (+ , - , * , / ):");
		char operacao = scanner.next().charAt(0);

		// Variável para armazerar o resultaod da operacao
		double resultado = 0;

		// Estrutura condicional para realizar a operacao escolhida
		switch (operacao) {
		case '+':
			resultado = num1 + num2; // Realiza a adição
			break;
		case '-':
			resultado = num1 - num2; // Realiza a subtracao
			break;
		case '*':
			resultado = num1 * num2; // Realiza a multiplicacao
			break;
		case '/':
			resultado = num1 / num2; // Realiza a divisao

			// Verifica se o divisor nao e zero para evitar divisao por zero
			if (num2 != 0) {
				resultado = num1 / num2; // Realiza a divisao
			} else {
				System.out.println("Erro: Divisao por zero nao e permitida.");
				return;
			}
			break;
		default:
			System.out.println("Operação invalida.");
			return; // Encerra o programa
		}

		// Exibie o resultado da operacao
		System.out.println("O resultado é: " + resultado);

		// Fecha o scanner para liberar os recursos
		scanner.close();

	}
}
