package com.malves;

import java.util.Scanner;

import com.malves.exception.ParametrosInvalidosException;

public class Contador {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o primeiro parâmetro: ");
		int parametroUm = scanner.nextInt();
		
		System.out.print("Digite o segundo parâmetro: ");
		int parametroDois = scanner.nextInt();
		
		try {
			contar(parametroUm, parametroDois);
		} catch(ParametrosInvalidosException e) {
			System.err.println(e.getMessage());
		}
		
		scanner.close();
	}
	
	public static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
		if (parametroUm > parametroDois) {
			throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
		}
		
		int contagem = parametroDois - parametroUm;
		
		System.out.println();
		
		for (int i = 1; i <= contagem; i++) {
			System.out.println(String.format("Imprimindo o número %d", i));
		}
	}
}
