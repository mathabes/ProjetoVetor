package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Produto;

public class TesteProduto2 {
	static String texto(String j) {
		return JOptionPane.showInputDialog(j);
	}
	static int inteiro(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}
	static double real(String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}

	public static void main(String[] args) {
		Produto[] vetorProduto = new Produto [3];
		int indice =0;
		int continuar =0;
		
		while(continuar == 0) {
			vetorProduto[indice] = new Produto();
			vetorProduto[indice].setTipo(texto("Digite o tipo do produto"));
			vetorProduto[indice].setMarca(texto("Digite a marca"));
			vetorProduto[indice].setQuant(inteiro("Digite a quantidade"));
			vetorProduto[indice].setValor(real("Digite o valor"));
			indice ++;
			
			continuar = JOptionPane.showConfirmDialog(null, "Adicionar produto no carrinho?", "Carrinho de Compras",
					JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		}
	}

}
