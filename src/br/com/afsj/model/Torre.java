package br.com.afsj.model;

public class Torre extends Peca {
	@Override
	public boolean movimentoOK(int x, int y) {
		if (posX == -1 && posY == -1) {
			return true;
		}
		if ( ( (x == posX+3 || x == posX-3) && (y == posY-2 || y == posY+2) ) ||
			 ( (x == posX+2 || x == posX-2) && (y == posY-3 || y == posY+3) ) ) {
			return true ;
		}
		return false;
	}

}
