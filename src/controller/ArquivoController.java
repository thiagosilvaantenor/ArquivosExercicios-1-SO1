package controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArquivoController {

	public ArquivoController() {
		super();
	}

	public void exibirFrutas(String caminho, String arquivo) throws IOException {
		File dir = new File(caminho);
		if (dir.exists() && dir.isDirectory()) {
			File arq = new File(caminho, arquivo);
			if (arq.exists() && arq.isFile()) {
				FileInputStream fluxo = new FileInputStream(arq);
				InputStreamReader leitor = new InputStreamReader(fluxo);
				BufferedReader buffer = new BufferedReader(leitor);
				String linha = buffer.readLine();
				String[] palavras;
				while (linha != null) {
					StringBuffer saida = new StringBuffer();
					if (linha.contains("Fruits")) {
						palavras = linha.split(",");
						// FOOD NAME[0], SCIENTIFIC NAME[1], GROUP[2], SUB GROUP[3]
						saida.append(palavras[0] + "\t");
						saida.append(palavras[1] + "\t");
						saida.append(palavras[3]);
						System.out.println(saida.toString());
					}
					linha = buffer.readLine();
				}
				fluxo.close();
				leitor.close();
				buffer.close();

			} else {
				throw new IOException("Arquivo nao existe");
			}
		} else {
			throw new IOException("Diretorio nao existe");
		}
	}

}
