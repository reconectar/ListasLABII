
public class Lista47 {
	
	static int somaTermos(CPilha x){
		int soma = 0;
		while(x.quantidade()!=0) {
			if((int)x.peek()>0) {
				soma+=(int)x.desempilha();				
			}else {
				x.desempilha();
			}
		}
		
		return soma;
	}

	public static void main(String[] args) {
		
		CPilha a = new CPilha();
		
		a.empilha(-1);
		a.empilha(1);
		a.empilha(1);
		a.empilha(-3);
		
		System.out.println(somaTermos(a));
		
	}

}
