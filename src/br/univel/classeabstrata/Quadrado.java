package br.univel.classeabstrata;

/**
 *    Desenha a figura abaixo com largura = SIZE;
 * 
 * 
 *      ****
 *      *  *
 *      *  *
 *      ****
 */
class Quadrado extends DesenhoAbstrato {

	public static int SIZE = 4;

	@Override
	public void desenhar() {
		for (int linha = 0; linha < SIZE; linha++) {
			for (int coluna = 0; coluna < SIZE; coluna++) {
				if (linha == 0 || linha == SIZE - 1) {
					System.out.print("*");
				} else {
					if (coluna == 0 || coluna == SIZE - 1) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
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
