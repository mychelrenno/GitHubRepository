package br.univel.classeabstrata;

class ExA extends DesenhoAbstrato {

	public static int ALTURA = 8;
	
	@Override
	public void desenhar() {
		
		System.out.println("a)\n\n");
		
		int caracteres = 1;
		for (int linha = 0; linha < 8; linha++) {
			for (int coluna = 0; coluna < caracteres; coluna++) {
				System.out.print("#");
			}
			caracteres++;
			System.out.print("\n");
		}
		
	}

	@Override
	protected String getNome() {
		// TODO Auto-generated method stub
		return null;
	}

}
