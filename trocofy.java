import java.util.*;

class Trocofy {

	public static void main(String args[]){

		//todos os valores devem estar em centavos
		System.out.print("inserir valor para calcular(centavos): ");
		try{
		int capital = Integer.valueOf(System.console().readLine());
		ArrayList<Integer> notas = new ArrayList<Integer>();
		ArrayList<Integer> notasCount = new ArrayList<Integer>();
		notas.add(10000);
		notas.add(5000);
		notas.add(2000);
		notas.add(1000);
		notas.add(500);
		ArrayList<Integer> moedas = new ArrayList<Integer>();
		ArrayList<Integer> moedasCount = new ArrayList<Integer>();
		moedas.add(100);
		moedas.add(50);
		moedas.add(25);
		moedas.add(10);
		moedas.add(5);
		moedas.add(1);

		for(int i : notas)
		{
			int count = 0;
			while(capital >= i) 
			{
				count++;
				capital -= i;
			}
			notasCount.add(count);
		}
		for(int i : moedas)
		{
			int count = 0;
			while(capital >= i) 
			{
				count++;
				capital -= i;
			}
			moedasCount.add(count);
		}
		/*fomato:
			notas :
			100 reais   --> 0
			50 reais    --> 0
			20 reais    --> 0
			10 reais    --> 0
			5 reais     --> 0
			moedas :
			100 cent   --> 0
			50 cent    --> 0
			25 cent    --> 0
			10 cent    --> 0
			5 cent     --> 0
			1 cent     --> 0
		*/
		System.out.println("notas :");
		for(int i = 0; i < notas.size(); i++) 
		{
			System.out.print(notas.get(i)/100 + " reais");
			for(int ind = 1; ind < 6 - Integer.toString(notas.get(i)/100).length(); ind++)
			{
				System.out.print(" ");
			}
			System.out.println(" --> " + notasCount.get(i));

		}
		System.out.println("moedas :");
		for(int i = 0; i < moedas.size(); i++) 
		{
			System.out.print(moedas.get(i) + " cent");
			for(int ind = 1; ind < 6 - Integer.toString(moedas.get(i)).length(); ind++)
			{
				System.out.print(" ");
			}
			System.out.println(" --> " + moedasCount.get(i));

		}
		}catch(Exception e){
			System.out.print("Erro!!!Valor muito alto!!!");
		}

	}

}