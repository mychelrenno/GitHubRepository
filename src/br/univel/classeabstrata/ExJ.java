package br.univel.classeabstrata;

class ExJ extends DesenhoAbstrato {

	public static int SIZE = 13;
	
	@Override
	public void desenhar() {
		
		System.out.println("\n\nj)\n\n");
		
		for (int linha = 0; linha < SIZE; linha++) {
			for (int col = 0; col < SIZE; col++) {
				System.out.print(col < linha || col >= SIZE - linha ? " " : "#");
			}
			System.out.print("\n");
		}
	}

	@Override
	protected String getNome() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
//	public static void main(String[] args) {
//		
//		int a = 2;
//		int b = 3;
//		
//		if ( a > b) {
//			System.out.println("maior");
//		} else {
//			System.out.println("menor");
//		}
//		
//		
//		System.out.println(a > b ? "maior" : "menor");
//	}
}