public class lista33 {
	public static void main(String[] args) {
		CPilha pilha1 = new CPilha();
		CFila fila1 = new CFila();

		for (int i = 0; i < 10; i++) {
			pilha1.empilha(i + 1);
		}

		for (int i = 0; i < 10; i++) {
			System.out.println(pilha1.peek());
			fila1.enfileira(pilha1.desempilha());
		}
	}
}