import java.util.Scanner;

public class Operacao {
	// Atributos
	Scanner leitor = new Scanner(System.in);
	int Numero;
	int Digito;
	int Soma;

//Metodo para leitura de dados digitados pelo usu�rio
	public void LeituraDados() {
		System.out.println("Informe um n�mero, para obter a soma entre as unidades EX:(2+0+1+5): ");
		Numero = leitor.nextInt();
	}

	// Metodo que soma todos os digitos do n�mero digitado.
	public int SomarDigitos() {

		while (Numero != 0) {
			Digito = Numero % 10;
			// Esta linha confere o valor do digito a cada repeti��o >>
			// System.out.println("Digito: " + Digito);
			Soma += Digito;
			Numero = Numero / 10;
			if (Numero == 0) {
				System.out.println("RESULTADO: " + Soma);
			}

		}

		return (Digito);

	}

}
