package br.univel.classeabstrata;

class ExD extends DesenhoAbstrato {

	public static int ALTURA = 8;
	
	@Override
	public void desenhar() {
		
		System.out.println("d)\n\n");
		
		int brancos = ALTURA - 1;
		for (int linha = 0; linha <= 8; linha++) {
			for (int coluna = 0; coluna <= ALTURA; coluna++) {
				if (coluna > brancos) {
					System.out.print("#");
				} else {
					System.out.print(" ");
				}
			}
			brancos--;
			System.out.print("\n");
		}
		
	}

	@Override
	protected String getNome() {
		// TODO Auto-generated method stub
		return null;
	}

}
