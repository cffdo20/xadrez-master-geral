package br.com.afsj.model;

public class Torre extends Peca {

    @Override
    public boolean movimentoOK(int x, int y) {
        if (posX == -1 && posY == -1) {
            // A torre ainda n�o foi colocada no tabuleiro, pode se mover para qualquer posi��o
            return true;
        }

        // Verificar se o movimento � horizontal ou vertical
        if (x == posX || y == posY) {
            // Movimento valido, pois � horizontal ou vertical
            return true;
        } else {
            // Movimento invalido
            return false;
        }
    }
}
