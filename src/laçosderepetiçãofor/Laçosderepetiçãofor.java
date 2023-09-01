package laçosderepetiçãofor;

public class Laçosderepetiçãofor {

	public static void main(String[] args) {
	Scanner leia = new Scanner();
	String number;
	System.out.println("Digite o dois números inteiros onde o primeiro deve ser menor que o segundo: "); 
	int num1 = leia.nextlnt();
	int num2 = leia.nextlnt();
	if ( num1 >= num2 ); {
	System.out.println("intervalo invalido");
	System.exit(0);
	}
	for ( int i = num1; i <= num2;  i++ ) {
		if ( i  % 3 ==0 && i  %  5 ==0)
			
			System.out.println(i);
		
			
	}
	
	}
  }



