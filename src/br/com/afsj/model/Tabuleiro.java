package br.com.afsj.model;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import br.com.afsj.control.Xadrez;
import br.com.afsj.view.IBispo;
import br.com.afsj.view.ICavalo;
import br.com.afsj.view.IPeao;
import br.com.afsj.view.IPeca;
import br.com.afsj.view.IRainha;
import br.com.afsj.view.IRei;
import br.com.afsj.view.ITabuleiro;
import br.com.afsj.view.ITorre;

public class Tabuleiro {

	protected static JFrame TELA;
	
	public static ArrayPecas listaBrancas = new ArrayPecas();
	public static ArrayPecas listaPretas = new ArrayPecas();

	protected static int corJogadorAtual = Xadrez.corBRANCA;
	protected static Peca pecaMarcada = null;
	protected static IPeca iPecaMarcada = null;
	
	protected static ITabuleiro iTabuleiro = new ITabuleiro();
	
	protected static Peao peaoBranco1 = new Peao();
	protected static IPeao iPeaoBranco1 = new IPeao(peaoBranco1);
	
	protected static Peao peaoBranco2 = new Peao();
	protected static IPeao iPeaoBranco2 = new IPeao(peaoBranco2);
	
	protected static Peao peaoBranco3 = new Peao();
	protected static IPeao iPeaoBranco3 = new IPeao(peaoBranco3);
	
	protected static Peao peaoBranco4 = new Peao();
	protected static IPeao iPeaoBranco4 = new IPeao(peaoBranco4);
	
	protected static Peao peaoBranco5 = new Peao();
	protected static IPeao iPeaoBranco5 = new IPeao(peaoBranco5);
	
	protected static Peao peaoBranco6 = new Peao();
	protected static IPeao iPeaoBranco6 = new IPeao(peaoBranco6);
	
	protected static Peao peaoBranco7 = new Peao();
	protected static IPeao iPeaoBranco7 = new IPeao(peaoBranco7);
	
	protected static Peao peaoBranco8 = new Peao();
	protected static IPeao iPeaoBranco8 = new IPeao(peaoBranco8);

	protected static Peao peaoPreto1 = new Peao();
	protected static IPeao iPeaoPreto1 = new IPeao(peaoPreto1);
	
	protected static Peao peaoPreto2 = new Peao();
	protected static IPeao iPeaoPreto2 = new IPeao(peaoPreto2);
	
	protected static Peao peaoPreto3 = new Peao();
	protected static IPeao iPeaoPreto3 = new IPeao(peaoPreto3);
	
	protected static Peao peaoPreto4 = new Peao();
	protected static IPeao iPeaoPreto4 = new IPeao(peaoPreto4);
	
	protected static Peao peaoPreto5 = new Peao();
	protected static IPeao iPeaoPreto5 = new IPeao(peaoPreto5);
	
	protected static Peao peaoPreto6 = new Peao();
	protected static IPeao iPeaoPreto6 = new IPeao(peaoPreto6);
	
	protected static Peao peaoPreto7 = new Peao();
	protected static IPeao iPeaoPreto7 = new IPeao(peaoPreto7);
	
	protected static Peao peaoPreto8 = new Peao();
	protected static IPeao iPeaoPreto8 = new IPeao(peaoPreto8);
	
	protected static Cavalo cavaloBranco1 = new Cavalo();
	protected static ICavalo iCavaloBranco1 = new ICavalo(cavaloBranco1);
	
	protected static Cavalo cavaloBranco2 = new Cavalo();
	protected static ICavalo iCavaloBranco2 = new ICavalo(cavaloBranco2);

	protected static Cavalo cavaloPreto1 = new Cavalo();
	protected static ICavalo iCavaloPreto1 = new ICavalo(cavaloPreto1);
	
	protected static Cavalo cavaloPreto2 = new Cavalo();
	protected static ICavalo iCavaloPreto2 = new ICavalo(cavaloPreto2);
		
	protected static Bispo bispoBranco1 = new Bispo();
	protected static IBispo iBispoBranco1 = new IBispo(bispoBranco1);
	
	protected static Bispo bispoBranco2 = new Bispo();
	protected static IBispo iBispoBranco2 = new IBispo(bispoBranco2);
	
	protected static Bispo bispoPreto1 = new Bispo();
	protected static IBispo iBispoPreto1 = new IBispo(bispoPreto1);
	
	protected static Bispo bispoPreto2 = new Bispo();
	protected static IBispo iBispoPreto2 = new IBispo(bispoPreto2);
	
	protected static Torre torreBranca1 = new Torre();
	protected static ITorre iTorreBranca1 = new ITorre(torreBranca1);
	
	protected static Torre torreBranca2 = new Torre();
	protected static ITorre iTorreBranca2 = new ITorre(torreBranca2);

	protected static Torre torrePreta1 = new Torre();
	protected static ITorre iTorrePreta1 = new ITorre(torrePreta1);
	
	protected static Torre torrePreta2 = new Torre();
	protected static ITorre iTorrePreta2 = new ITorre(torrePreta2);
	
	protected static Rainha rainhaBranca1 = new Rainha();
	protected static IRainha iRainhaBranca1 = new IRainha(rainhaBranca1);
	
	protected static Rainha rainhaPreto1 = new Rainha();
	protected static IRainha iRainhaPreto1 = new IRainha(rainhaPreto1);
	
	protected static Rei reiBranco1 = new Rei();
	protected static IRei iReiBranco1 = new IRei(reiBranco1);
	
	protected static Rei reiPreto1 = new Rei();
	protected static IRei iReiPreto1 = new IRei(reiPreto1);
	
	//protected static Peca peca = new Peca();

	public void iniciar(Tradutor t) {

		TELA = new JFrame(t.traduzir("Xadrez"));

		// Brancas
		peaoBranco1.setCor(Xadrez.corBRANCA);
		peaoBranco1.mover(0, 6);
		iPeaoBranco1.setIconeBranco(new ImageIcon("imagens/Peao-Brancas-Branco.png"));
		iPeaoBranco1.setIconeMarrom(new ImageIcon("imagens/Peao-Brancas-Marrom.png"));
		iPeaoBranco1.mover(0, 6);
		TELA.getContentPane().add(iPeaoBranco1.getImagem());
		listaBrancas.add(peaoBranco1);

		peaoBranco2.setCor(Xadrez.corBRANCA);
		peaoBranco2.mover(1, 6);
		iPeaoBranco2.setIconeBranco(new ImageIcon("imagens/Peao-Brancas-Branco.png"));
		iPeaoBranco2.setIconeMarrom(new ImageIcon("imagens/Peao-Brancas-Marrom.png"));
		iPeaoBranco2.mover(1, 6);
		TELA.getContentPane().add(iPeaoBranco2.getImagem());
		listaBrancas.add(peaoBranco2);
		
		peaoBranco3.setCor(Xadrez.corBRANCA);
		peaoBranco3.mover(2, 6);
		iPeaoBranco3.setIconeBranco(new ImageIcon("imagens/Peao-Brancas-Branco.png"));
		iPeaoBranco3.setIconeMarrom(new ImageIcon("imagens/Peao-Brancas-Marrom.png"));
		iPeaoBranco3.mover(2, 6);
		TELA.getContentPane().add(iPeaoBranco3.getImagem());
		listaBrancas.add(peaoBranco3);
		
		peaoBranco4.setCor(Xadrez.corBRANCA);
		peaoBranco4.mover(3, 6);
		iPeaoBranco4.setIconeBranco(new ImageIcon("imagens/Peao-Brancas-Branco.png"));
		iPeaoBranco4.setIconeMarrom(new ImageIcon("imagens/Peao-Brancas-Marrom.png"));
		iPeaoBranco4.mover(3, 6);
		TELA.getContentPane().add(iPeaoBranco4.getImagem());
		listaBrancas.add(peaoBranco4);
		
		peaoBranco5.setCor(Xadrez.corBRANCA);
		peaoBranco5.mover(4, 6);
		iPeaoBranco5.setIconeBranco(new ImageIcon("imagens/Peao-Brancas-Branco.png"));
		iPeaoBranco5.setIconeMarrom(new ImageIcon("imagens/Peao-Brancas-Marrom.png"));
		iPeaoBranco5.mover(4, 6);
		TELA.getContentPane().add(iPeaoBranco5.getImagem());
		listaBrancas.add(peaoBranco5);
		
		peaoBranco6.setCor(Xadrez.corBRANCA);
		peaoBranco6.mover(5, 6);
		iPeaoBranco6.setIconeBranco(new ImageIcon("imagens/Peao-Brancas-Branco.png"));
		iPeaoBranco6.setIconeMarrom(new ImageIcon("imagens/Peao-Brancas-Marrom.png"));
		iPeaoBranco6.mover(5, 6);
		TELA.getContentPane().add(iPeaoBranco6.getImagem());
		listaBrancas.add(peaoBranco6);
		
		peaoBranco7.setCor(Xadrez.corBRANCA);
		peaoBranco7.mover(6, 6);
		iPeaoBranco7.setIconeBranco(new ImageIcon("imagens/Peao-Brancas-Branco.png"));
		iPeaoBranco7.setIconeMarrom(new ImageIcon("imagens/Peao-Brancas-Marrom.png"));
		iPeaoBranco7.mover(6, 6);
		TELA.getContentPane().add(iPeaoBranco7.getImagem());
		listaBrancas.add(peaoBranco7);
		
		peaoBranco8.setCor(Xadrez.corBRANCA);
		peaoBranco8.mover(7, 6);
		iPeaoBranco8.setIconeBranco(new ImageIcon("imagens/Peao-Brancas-Branco.png"));
		iPeaoBranco8.setIconeMarrom(new ImageIcon("imagens/Peao-Brancas-Marrom.png"));
		iPeaoBranco8.mover(7, 6);
		TELA.getContentPane().add(iPeaoBranco8.getImagem());
		listaBrancas.add(peaoBranco8);
		
		torreBranca1.setCor(Xadrez.corBRANCA);
		torreBranca1.mover(0, 7);
		iTorreBranca1.setIconeBranco(new ImageIcon("imagens/Torre-Brancas-Branco.png"));
		iTorreBranca1.setIconeMarrom(new ImageIcon("imagens/Torre-Brancas-Marrom.png"));
		iTorreBranca1.mover(0, 7);
		TELA.getContentPane().add(iTorreBranca1.getImagem());
		listaBrancas.add(torreBranca1);
		
		torreBranca2.setCor(Xadrez.corBRANCA);
		torreBranca2.mover(7, 7);
		iTorreBranca2.setIconeBranco(new ImageIcon("imagens/Torre-Brancas-Branco.png"));
		iTorreBranca2.setIconeMarrom(new ImageIcon("imagens/Torre-Brancas-Marrom.png"));
		iTorreBranca2.mover(7, 7);
		TELA.getContentPane().add(iTorreBranca2.getImagem());
		listaBrancas.add(torreBranca2);

		cavaloBranco1.setCor(Xadrez.corBRANCA);
		cavaloBranco1.mover(1, 7);
		iCavaloBranco1.setIconeBranco(new ImageIcon("imagens/Cavalo-Brancas-Branco.png"));
		iCavaloBranco1.setIconeMarrom(new ImageIcon("imagens/Cavalo-Brancas-Marrom.png"));
		iCavaloBranco1.mover(1, 7);
		TELA.getContentPane().add(iCavaloBranco1.getImagem());
		listaBrancas.add(cavaloBranco1);
		
		cavaloBranco2.setCor(Xadrez.corBRANCA);
		cavaloBranco2.mover(6, 7);
		iCavaloBranco2.setIconeBranco(new ImageIcon("imagens/Cavalo-Brancas-Branco.png"));
		iCavaloBranco2.setIconeMarrom(new ImageIcon("imagens/Cavalo-Brancas-Marrom.png"));
		iCavaloBranco2.mover(6, 7);
		TELA.getContentPane().add(iCavaloBranco2.getImagem());
		listaBrancas.add(cavaloBranco2);
		
		bispoBranco1.setCor(Xadrez.corBRANCA);
		bispoBranco1.mover(2, 7);
		iBispoBranco1.setIconeBranco(new ImageIcon("imagens/Bispo-Brancas-Branco.png"));
	    iBispoBranco1.setIconeMarrom(new ImageIcon("imagens/Bispo-Brancas-Marrom.png"));
		iBispoBranco1.mover(2, 7);
		TELA.getContentPane().add(iBispoBranco1.getImagem());
		listaBrancas.add(bispoBranco1);
		
		bispoBranco2.setCor(Xadrez.corBRANCA);
		bispoBranco2.mover(5, 7);
		iBispoBranco2.setIconeBranco(new ImageIcon("imagens/Bispo-Brancas-Branco.png"));
		iBispoBranco2.setIconeMarrom(new ImageIcon("imagens/Bispo-Brancas-Marrom.png"));
		iBispoBranco2.mover(5, 7);
		TELA.getContentPane().add(iBispoBranco2.getImagem());
		listaBrancas.add(bispoBranco2);
		
		reiBranco1.setCor(Xadrez.corBRANCA);
		reiBranco1.mover(3, 7);
		iReiBranco1.setIconeBranco(new ImageIcon("imagens/Rei-Brancas-Branco.png"));
		iReiBranco1.setIconeMarrom(new ImageIcon("imagens/Rei-Brancas-Marrom.png"));
		iReiBranco1.mover(3, 7);
		TELA.getContentPane().add(iReiBranco1.getImagem());
		listaBrancas.add(reiBranco1);
		
		rainhaBranca1.setCor(Xadrez.corBRANCA);
		rainhaBranca1.mover(4, 7);
		iRainhaBranca1.setIconeBranco(new ImageIcon("imagens/Raiha-Brancas-Branco.png"));
		iRainhaBranca1.setIconeMarrom(new ImageIcon("imagens/Rainha-Brancas-Marrom.png"));
		iRainhaBranca1.mover(4, 7);
		TELA.getContentPane().add(iRainhaBranca1.getImagem());
		listaBrancas.add(rainhaBranca1);
		
		// Pretas
		peaoPreto1.setCor(Xadrez.corPRETA);
		peaoPreto1.mover(0, 1);
		iPeaoPreto1.setIconeBranco(new ImageIcon("imagens/Peao-Pretas-Branco.png"));
		iPeaoPreto1.setIconeMarrom(new ImageIcon("imagens/Peao-Pretas-Marrom.png"));
		iPeaoPreto1.mover(0, 1);
		TELA.getContentPane().add(iPeaoPreto1.getImagem());
		listaPretas.add(peaoPreto1);
		
		peaoPreto2.setCor(Xadrez.corPRETA);
		peaoPreto2.mover(1, 1);
		iPeaoPreto2.setIconeBranco(new ImageIcon("imagens/Peao-Pretas-Branco.png"));
		iPeaoPreto2.setIconeMarrom(new ImageIcon("imagens/Peao-Pretas-Marrom.png"));
		iPeaoPreto2.mover(1, 1);
		TELA.getContentPane().add(iPeaoPreto2.getImagem());
		listaPretas.add(peaoPreto2);
		
		peaoPreto3.setCor(Xadrez.corPRETA);
		peaoPreto3.mover(2, 1);
		iPeaoPreto3.setIconeBranco(new ImageIcon("imagens/Peao-Pretas-Branco.png"));
		iPeaoPreto3.setIconeMarrom(new ImageIcon("imagens/Peao-Pretas-Marrom.png"));
		iPeaoPreto3.mover(2, 1);
		TELA.getContentPane().add(iPeaoPreto3.getImagem());
		listaPretas.add(peaoPreto3);
		
		peaoPreto4.setCor(Xadrez.corPRETA);
		peaoPreto4.mover(3, 1);
		iPeaoPreto4.setIconeBranco(new ImageIcon("imagens/Peao-Pretas-Branco.png"));
		iPeaoPreto4.setIconeMarrom(new ImageIcon("imagens/Peao-Pretas-Marrom.png"));
		iPeaoPreto4.mover(3, 1);
		TELA.getContentPane().add(iPeaoPreto4.getImagem());
		listaPretas.add(peaoPreto4);
		
		peaoPreto5.setCor(Xadrez.corPRETA);
		peaoPreto5.mover(4, 1);
		iPeaoPreto5.setIconeBranco(new ImageIcon("imagens/Peao-Pretas-Branco.png"));
		iPeaoPreto5.setIconeMarrom(new ImageIcon("imagens/Peao-Pretas-Marrom.png"));
		iPeaoPreto5.mover(4, 1);
		TELA.getContentPane().add(iPeaoPreto5.getImagem());
		listaPretas.add(peaoPreto5);
		
		peaoPreto6.setCor(Xadrez.corPRETA);
		peaoPreto6.mover(5, 1);
		iPeaoPreto6.setIconeBranco(new ImageIcon("imagens/Peao-Pretas-Branco.png"));
		iPeaoPreto6.setIconeMarrom(new ImageIcon("imagens/Peao-Pretas-Marrom.png"));
		iPeaoPreto6.mover(5, 1);
		TELA.getContentPane().add(iPeaoPreto6.getImagem());
		listaPretas.add(peaoPreto6);
		
		peaoPreto7.setCor(Xadrez.corPRETA);
		peaoPreto7.mover(6, 1);
		iPeaoPreto7.setIconeBranco(new ImageIcon("imagens/Peao-Pretas-Branco.png"));
		iPeaoPreto7.setIconeMarrom(new ImageIcon("imagens/Peao-Pretas-Marrom.png"));
		iPeaoPreto7.mover(6, 1);
		TELA.getContentPane().add(iPeaoPreto7.getImagem());
		listaPretas.add(peaoPreto7);
		
		peaoPreto8.setCor(Xadrez.corPRETA);
		peaoPreto8.mover(7, 1);
		iPeaoPreto8.setIconeBranco(new ImageIcon("imagens/Peao-Pretas-Branco.png"));
		iPeaoPreto8.setIconeMarrom(new ImageIcon("imagens/Peao-Pretas-Marrom.png"));
		iPeaoPreto8.mover(7, 1);
		TELA.getContentPane().add(iPeaoPreto8.getImagem());
		listaPretas.add(peaoPreto8);

		cavaloPreto1.setCor(Xadrez.corPRETA);
		cavaloPreto1.mover(1, 0);
		iCavaloPreto1.setIconeBranco(new ImageIcon("imagens/Cavalo-Pretas-Branco.png"));
		iCavaloPreto1.setIconeMarrom(new ImageIcon("imagens/Cavalo-Pretas-Marrom.png"));
		iCavaloPreto1.mover(1, 0);
		TELA.getContentPane().add(iCavaloPreto1.getImagem());
		listaPretas.add(cavaloPreto1);
		
		cavaloPreto2.setCor(Xadrez.corPRETA);
		cavaloPreto2.mover(1, 0);
		iCavaloPreto2.setIconeBranco(new ImageIcon("imagens/Cavalo-Pretas-Branco.png"));
		iCavaloPreto2.setIconeMarrom(new ImageIcon("imagens/Cavalo-Pretas-Marrom.png"));
		iCavaloPreto2.mover(6, 0);
		TELA.getContentPane().add(iCavaloPreto2.getImagem());
		listaPretas.add(cavaloPreto2);
		
		bispoPreto1.setCor(Xadrez.corPRETA);
		bispoPreto1.mover(2, 0);
		iBispoPreto1.setIconeBranco(new ImageIcon("imagens/Bispo-Pretas-Branco.png"));
		iBispoPreto1.setIconeMarrom(new ImageIcon("imagens/Bispo-Pretas-Marrom.png"));
		iBispoPreto1.mover(2, 0);
		TELA.getContentPane().add(iBispoPreto1.getImagem());
		listaPretas.add(bispoPreto1);
		
		bispoPreto2.setCor(Xadrez.corPRETA);
		bispoPreto2.mover(5, 0);
		iBispoPreto2.setIconeBranco(new ImageIcon("imagens/Bispo-Pretas-Branco.png"));
		iBispoPreto2.setIconeMarrom(new ImageIcon("imagens/Bispo-Pretas-Marrom.png"));
		iBispoPreto2.mover(5, 0);
		TELA.getContentPane().add(iBispoPreto2.getImagem());
		listaPretas.add(bispoPreto2);
		
		torrePreta1.setCor(Xadrez.corPRETA);
		torrePreta1.mover(0, 0);
		iTorrePreta1.setIconeBranco(new ImageIcon("imagens/Torre-Pretas-Branco.png"));
		iTorrePreta1.setIconeMarrom(new ImageIcon("imagens/Torre-Pretas-Marrom.png"));
		iTorrePreta1.mover(0, 0);
		TELA.getContentPane().add(iTorrePreta1.getImagem());
		listaPretas.add(torrePreta1);
		
		torrePreta2.setCor(Xadrez.corPRETA);
		torrePreta2.mover(7, 0);
		iTorrePreta2.setIconeBranco(new ImageIcon("imagens/Torre-Pretas-Branco.png"));
		iTorrePreta2.setIconeMarrom(new ImageIcon("imagens/Torre-Pretas-Marrom.png"));
		iTorrePreta2.mover(7, 0);
		TELA.getContentPane().add(iTorrePreta2.getImagem());
		listaPretas.add(torrePreta2);
		
		rainhaPreto1.setCor(Xadrez.corPRETA);
		rainhaPreto1.mover(4, 0);
		iRainhaPreto1.setIconeBranco(new ImageIcon("imagens/Rainha-Pretas-Branco.png"));
		iRainhaPreto1.setIconeMarrom(new ImageIcon("imagens/Rainha-Pretas-Marrom.png"));
		iRainhaPreto1.mover(4, 0);
		TELA.getContentPane().add(iRainhaPreto1.getImagem());
		listaPretas.add(rainhaPreto1);
		
		reiPreto1.setCor(Xadrez.corPRETA);
		reiPreto1.mover(3, 0);
		iReiPreto1.setIconeBranco(new ImageIcon("imagens/Rei-Pretas-Branco.png"));
		iReiPreto1.setIconeMarrom(new ImageIcon("imagens/Rei-Pretas-Marrom.png"));
		iReiPreto1.mover(3, 0);
		TELA.getContentPane().add(iReiPreto1.getImagem());
		listaPretas.add(reiPreto1);
		
		TELA.getContentPane().add(iTabuleiro.getImagem());
		TELA.setSize(400, 400);
		TELA.setVisible(true);
		TELA.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void avaliarEventoPeca(Peca p, IPeca ip) {
		if (p.getCor() == corJogadorAtual) 
			marcarPeca(p, ip);
		else if (pecaMarcada != null)
			capturarPeca(p, ip);		
	}
	
	public static void avaliarEventoTabuleiro(int x, int y) {
		if ( (pecaMarcada != null) && (x >= 0) && (x <= 7) && (y >=0) && (y <= 7) ) {
			moverPecaMarcada(x, y);
		}
	}

	public static void marcarPeca(Peca p, IPeca ip) {
		if (iPecaMarcada != null)
			iPecaMarcada.desmarcar();
		    pecaMarcada = p;
		    iPecaMarcada = ip;
		    iPecaMarcada.marcar();
	}

	public static void capturarPeca(Peca p, IPeca ip) {
		if (pecaMarcada.capturar(p.getPosX(), p.getPosY())) {
			ip.remover();
			TELA.getContentPane().remove(ip.getImagem());
			iPecaMarcada.desmarcar();
			iPecaMarcada.mover(p.getPosX(), p.getPosY());
			p.remover();
			pecaMarcada = null;
			iPecaMarcada = null;
			if (corJogadorAtual == Xadrez.corBRANCA)
				corJogadorAtual = Xadrez.corPRETA;
			else
				corJogadorAtual = Xadrez.corBRANCA;			
		}
	}
	
	public static void moverPecaMarcada(int x, int y) {
		if (pecaMarcada.mover(x, y)) {
			iPecaMarcada.desmarcar();
			iPecaMarcada.mover(x, y);
			pecaMarcada = null;
			iPecaMarcada = null;
			if (corJogadorAtual == Xadrez.corBRANCA)
				corJogadorAtual = Xadrez.corPRETA;
			else
				corJogadorAtual = Xadrez.corBRANCA;
		}
	}
}
