package br.univel.classeabstrata;

class ExE extends DesenhoAbstrato {

	public static int ALTURA = 8;

	@Override
	public void desenhar() {

		System.out.println("e)\n\n");

		for (int linha = 0; linha < 8; linha++) {
			for (int coluna = 0; coluna < ALTURA; coluna++) {

				if (coluna == 0 || coluna == ALTURA - 1 || linha == 0 || linha == ALTURA - 1) {
					System.out.print("#");
				} else {
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}

	}

	@Override
	protected String getNome() {
		// TODO Auto-generated method stub
		return null;
	}

}
