import java.util.Scanner;

public class Main{
	
	public static void main(String[] args) {
	    
		//Campos da classe main
		
		char opcao;
		double a, b;	    

		//Instancias Scanner
		
		Scanner option = new Scanner(System.in);
		Scanner ent_dt = new Scanner(System.in);
		
		//Instancias das operações
		
		Soma soma = new Soma();
		Diferenca dif = new Diferenca();
		Mult mult = new Mult();
		Div div = new Div();
		Seno sen = new Seno();
		Coseno cos = new Coseno();
		Tang tan = new Tang();
		Raiz raiz = new Raiz();
		Pote pot = new Pote();

		//Solicitação da operação desejada
		
		System.out.println("Qual Operacao?");
	    	System.out.println("Soma(+), Subtracao(-), Divisao(/), Multiplicacao(*) Seno(s), Coseno(c), Tangente(t), Potencia(p), Raiz(r)");

		//Comando de entrada de teclado
		
		opcao = option.nextLine().charAt(0);
		
		//Operações
		
		switch (opcao){
		    
		    case '+':
		        System.out.println("Digite dois numeros para soma");
		        a = ent_dt.nextDouble();
		        b = ent_dt.nextDouble();
		        System.out.println("Soma = " + soma.soma_dois_num(a, b));
		        break;
		    case '-':
		        System.out.println("Digite dois numeros para subtracao");
		        a = ent_dt.nextDouble();
		        b = ent_dt.nextDouble();
		        System.out.println("Diferenca = " + dif.dif_dois_num(a, b));
		        break;
		    case '/':
		        System.out.println("Digite dois numeros para divisao");
		        a = ent_dt.nextDouble();
		        b = ent_dt.nextDouble();
		        System.out.println("Divisao = " + div.div_num(a, b));
		        break;
		    case '*':
		        System.out.println("Digite dois numeros para multiplicacao");
		        a = ent_dt.nextDouble();
		        b = ent_dt.nextDouble();
		        System.out.println("Multiplicacao = " + mult.mult_num(a, b));
		        break;
		    case 's':
		        System.out.println("Digite o valor");
		        a = ent_dt.nextDouble();
		        System.out.println("Seno = " + sen.seno(a));
		        break;
		    case 'c':
		        System.out.println("Digite o valor");
		        a = ent_dt.nextDouble();
		        System.out.println("Coseno = " + cos.coseno(a));
		        break;
		    case 't':
		        System.out.println("Digite o valor");
		        a = ent_dt.nextDouble();
		        System.out.println("Tangente = " + tan.tangente(a));
		        break;
		    case 'p':
		        System.out.println("Digite o numero e a potencia");
		        a = ent_dt.nextDouble();
		        b = ent_dt.nextDouble();
		        System.out.println("Potencia = " + pot.potencia(a, b));
		        break;
		    case 'r':
		        System.out.println("Digite o valor");
		        a = ent_dt.nextDouble();
		        System.out.println("Raiz = " + raiz.raiz(a));
		        break;
		    default :
		        System.out.println("Opcao incorreta");
		}

	}
    
}
