public class Fatorial 
{

// versao
	public int calcularFatorial(int n)
	{
		int resultado = 1;
		
		if(n < 0)
			throw new IllegalArgumentException("Erro numero menor que 0");
		
		if(n == 0)
			throw new IllegalArgumentException("Erro numero menor que 0");
		
		
	
		for (int i = 2; i<= n; i++)
		{
			resultado += i;	
		}
		return resultado;

	}

}
