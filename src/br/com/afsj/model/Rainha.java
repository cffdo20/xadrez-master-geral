package br.com.afsj.model;

import br.com.afsj.control.Xadrez;

public class Rainha extends Peca{
    @Override
    public boolean movimentoOK(int x, int y) {
        if (posX == -1 && posY == -1) {
            return true;
        }
        if (cor == Xadrez.corBRANCA) {
            if ((x == posX) && (y == posY - 1)) {
                return true;
            }
        }

        if (cor == Xadrez.corPRETA) {
            if ((x == posX) && (y == posY + 1)) {
                return true;
            }
        }
        return false;
    }
}
