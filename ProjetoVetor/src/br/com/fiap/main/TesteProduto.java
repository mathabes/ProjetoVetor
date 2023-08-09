package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Produto;

public class TesteProduto {
	static String texto(String j) {
		return JOptionPane.showInputDialog(j);
	}
	static int inteiro(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}
	static double real(String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}
	static double valorTotal(Produto[] p, int i) {
		double total = 0;
		for(int c = 0; c < i; c ++) {
			total += p[c].getValor() * p[c].getQuant();		}
		return total;
	}
	public static void main(String[] args) {
		Produto vetorProduto[] = new Produto[5];
		int indice = 0;
		
		do {
			vetorProduto[indice] = new Produto();
			vetorProduto[indice].setTipo(texto("Digite o tipo do produto"));
			vetorProduto[indice].setMarca(texto("Digite a marca"));
			vetorProduto[indice].setQuant(inteiro("Digite a quantidade"));
			vetorProduto[indice].setValor(real("Digite o valor"));
			indice ++;
		}while(JOptionPane.showConfirmDialog(null, "Adicionar produto no carrinho?", "Carrinho de Compras",
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0);
		for (int contador =0; contador < indice; contador ++) {
			System.out.println("Tipo: " + vetorProduto[contador].getTipo() +
					"Marca: " + vetorProduto[contador].getMarca() +
					"Quantidade: " + vetorProduto[contador].getQuant() +
					"Valor: " + vetorProduto[contador].getValor());
		}
		System.out.println("Valor Total: " + valorTotal(vetorProduto, indice));
	}
	

}
