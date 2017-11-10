/**
 *  A classe fibonacci tem duas abordagens para comparação entre o tempo de carregamento;
 *  A primeiro abordagem F1, utiliza da técnica de recursão; já a segunda abordagem
 *  mantem um array com os valores anteriores evitando recalcular este valores.
 *
 *  @author David Souza
 */
public class Fibonacci
{
    /**
     * Recebe um valor inteiro e retorna o resultado do Fibonacci deste valor
     *
     * @param N número inteiro que deseja obter o Fibonacci
     * @return o valor das somas dos Fibonaccis anteriores ou o se o N for 0 e 1 se o N for 1
     */
    public static long F1(int N)
    {
        if (N == 0) return 0;
        if (N == 1) return 1;
        return F1(N-1) + F1(N-2);
    }
    /**
     * Esta abordagem recebe um array com os fibonacci anteriores e o N que será calculado;
     * desta forma há apenas uma atribuição de soma em cada requisição.
     *
     * @param N número inteiro que deseja obter o Fibonacc
     * @param fiboArray número inteiro que deseja obter o Fibonacc
     * @return o valor das somas dos Fibonaccis anteriores
     */
    public static long F2(long[] fiboArray, int N) {
	
	fiboArray[N] = fiboArray[N-1]+fiboArray[N-2];
	return fiboArray[N];
    }
    /**
     * Executa as duas abordagens do Fibonacci de 0 até 90 e imprime o resultado.
     * É executado primeiro o F2 devido a ser mais rápido.
     */
    public static void main(String[] args)
    {
        long[] fiboArray = new long[91];
	fiboArray[0] = 0;
	fiboArray[1] = 1;

	/*System.out.println("---------- Versão salvando em um array (F2) -----------");
        for (int N = 2; N <= 90; N++)
            System.out.println(N + " " + F2(fiboArray,N));
*/
	System.out.println("---------- Versão somente recursiva (F1) -----------");
	for (int N = 0; N <= 90; N++)
	    System.out.println(N + " " + F1(N));
    }
}
