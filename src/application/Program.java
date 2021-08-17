package application;

import java.util.Scanner;

import boardgame.Posicao;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Posicao posicao = new Posicao(3, 5);
		System.out.println(posicao);

	}

}
