package view;

import java.io.IOException;

import controller.ArquivoController;

public class Arquivo {

	public static void main(String[] args) {
		String diretorio = "C:\\TEMP";
		String arquivo = "generic_food.csv";
		ArquivoController exercicio1 = new ArquivoController();

		try {
			exercicio1.exibirFrutas(diretorio, arquivo);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
