public class lista32 {
	public static void main(String[] args) {
		CPilha pilha1 = new CPilha();
		CPilha pilha2 = new CPilha();

		for (int i = 0; i < 10; i++) {
			pilha1.empilha(i + 1);
		}

		for (int i = 0; i < 10; i++) {
			System.out.println(pilha1.peek());
			pilha2.empilha(pilha1.desempilha());
		}
	}
}