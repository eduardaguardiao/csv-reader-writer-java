import java.io.*;

public class Escrita {
    public static void main(String[] args) {

        // Estrutura de Escrita de Arquivos
        try{
            OutputStream outputStream = new FileOutputStream("arquivo.txt");
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(outputStream));

            writer.write("Escrita de arquivo com java");
            writer.newLine();
            writer.write("Estrutura básica");

            writer.flush();
        } catch (IOException e){
            System.out.println("Erro ao ler escrever: " + e.getMessage());
        }

    }
}

//FileOutputStream - Cria um arquivo "arquivo.txt" na raiz do projeto e retorna um InputStream;
//OutputStreamWriter - Cria um objeto para escrever no arquivo.txt;
//BufferedWriter - Objeto para escrever no arquivo linha por linha.
//write() - Escreve uma String no arquivo;
//newLine() - Pula uma linha no arquivo;
// writer.flush() - força a gravação de qualquer dado que esteja armazenado no buffer