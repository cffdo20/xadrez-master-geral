package br.com.afsj.model;

public class Torre extends Peca{
	
	@Override
	public boolean movimentoOK(int x, int y) {
		
		Tabuleiro tabuleiro = new Tabuleiro();
		
		//	'posX' e 'posY' são as posições atuais
		//	'x' e 'y' são as posições futuras (pretendidas)
		// Se a posição for -1 e -1, ou seja, peça fora do tabuleiro, o movimento é liberado para posicionamento inicial da peça.
		if (posX == -1 && posY == -1) {
			return true;
		}
		
		if (x == posX) {	// Se o movimento foi ao longo do x, ou seja movimento vertical (coluna)
				if(tabuleiro.caminhoLivre('v', x, posY, y)) {	// 'v' informa ao método que o movimento é na vertical,
																//	x indica em qual coluna ocorre a movimentação,
																//	posY seta a posição atual como inicial
																//	y seta a posição futura como final
					return true;
				}
		}
		if(y == posY){		// Se o movimento for ao longo do y, ou seja, movimento horizontal (linha)
				if(tabuleiro.caminhoLivre('h', y, posX, x)) {	// algumas mudanças:
																// 'h' indica movimento horizontal
																//	y indica em qual linha ocorre o movimento
																//	posX seta a posição atual como inicial
																//	Y seta a posição futura como final
					return true;
				}
		}
		return false;
	}

}
