package Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExpressaoLambda {
	
	public static void main(String[] args) {
		
/*EXPRESSÃO LAMBDA

 *		Essa expressão é uma função anonima que há no java.
  		Esta função não tem nome e pode ser passada por argumento
  		para métodos ou armazenada em variáveis.
  
 *		Essa expressão surgiu na versão Java 8, e muitos
  		profissionais utilizam essa função para simplificar o
  		código qu utiliza interfaces com métodos abstratos.
  
 *		A sua sintaxe é simples, e apresenta:
 		(PARÂMETROS) -> EXPRESSÃO/DECLARAÇÃO
 	
 *		Veja a seguir alguns exemplos da expressão Lambda.
 
 *		CURIOSIDADE:
 
 		RUNNABLE = É uma interface que pode ser implementada por
 		qualquer classe capaz de definir e executar por uma THREAD.
 		A classe pode definir um método sem argumento, chamado
 		'run()'
 	
 *		THREAD = É uma forma de executar um processo em paralelo a
 		ou processo em execução.
 */
		System.out.println("Criando um 'Hello Word' com Lambda sem parâmetro:");
		
//		Criando 'Hello Word' com Runnable + Lambda
		Runnable r =() -> System.out.println("Hello Word");
		
//		Executando o nosso Objeto com o método 'run()'
		r.run(/* Método sem argumento */);
		
		System.out.println("Criando um 'Olá' com Lambda com parâmetro:");
		
/*		INTERFACE FUNCIONAL
 
 *		Nos exemplos a seguir será utilizado as interfaces funcionais,
 		onde apenas um método abstrato será criado.
 		
 * 		OBS: As anotações não são obrigatorias
 */
		
//		Criando uma interface 'Saudacao', para instanciar um método
		@FunctionalInterface
		interface Saudacao{
			
//			Criando o método 'digaOI' com 'nome' do tipo String
			void digaOI(String name);
		}
		
//		Atribuindo o objeto ao parâmetro da interface
		Saudacao saudacao = (name) -> System.out.println("Oi, " + name);
		
//		Adicionado o valor no parâmetro que será atribuído ao objeto
		saudacao.digaOI("Lucas");
		
		System.out.println("\nCriando operações matemáticas com Lambda: ");
		
//		Criando uma interface 'OperacoesMatematica' com dois parâmetros
		@FunctionalInterface
		interface OperacaoMatematica {
			int operacao(int a, int b);
		}
		
//		Realizando as operações
		OperacaoMatematica adicao = (a, b) -> a + b;
		OperacaoMatematica subtracao = (a, b) -> a - b;
		
//		Imprimindo a soma das operações
		System.out.println("Adição: " + adicao.operacao(5, 3));
		System.out.println("subtração: " + subtracao.operacao(5, 3));

		System.out.println("\nCriando uma lista e selecionando os nomes com Lambda: ");
		
//		Criando uma lista de nomes
		List<String> nomes = Arrays.asList("Lucas", "juliana", "Nelson");
		
//		Ultilizando forEach com Lambda para imprimir
		nomes.forEach(nome -> System.out.println(nome));

		System.out.println("\nCriandp coleções stream e selecionando os nomes com Lambda:");
		
/*		CURIOSIDADE
 
 *		A STREAM API oferece a possibilidade de trabalhar com conjunto
 		de elementos de maneira mais simples. A proposta é diminuir a
 		forma de implementar controle de fluxo ao lidar com collections.
 		
 *		Podemos  trablhar com os elementos de um objeto, realizando ações
		de filtragem, mapeamento, transformação, etc.
		
 *		Uma STREAM COLLECT() realixa uma operação de redução mutável nos
 		elementos de fluxo. Isso significa que os elementos que são
 		processados são acumulados em um objeto que podem sofrer alterações.
 		
 *		No exemplo abaixo, usamos juto com parâmetros de método 'collection()'
 		o método 'toList()', que acumula os elementos em uma lista.
 */
		
//		Criando uma lista e atribuindo stream ao objeto
		List<String> filtroNomes = nomes.stream()
//									Criando filtro e adicionando expressão Lambda
									.filter(nome -> nome.startsWith("L"))
//									Utilizando o método 'collect()' e 'tolist()' como parâmetro
									.collect(Collectors.toList());
		
//		Selecionando os elementos da lista, ao qual passou pelo filtro
		System.out.println(filtroNomes);
		
	}
	
}
