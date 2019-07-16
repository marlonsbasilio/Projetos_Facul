package jogo;

import jplay.Sprite;
import jplay.URL;

public class Ouro extends Sprite {

	public Ouro(int x, int y) {
		super(URL.sprite("gold.png"),1);
		this.x = x;
		this.y = y;
		this.setTotalDuration(500);
	}
	public int quantidade = 10;
	
	public void Steal(Jogador jogador) {
		if ((jogador.x >= this.x -30 && jogador.x <= this.x +30) && (jogador.y >= this.y -30 && jogador.y <= this.y +30)) {
		jogador.gold += quantidade;
		this.x = 10000;
		}
		
	}
}