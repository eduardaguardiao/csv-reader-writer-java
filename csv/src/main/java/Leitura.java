import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Leitura {
    public static void main(String[] args) {

        // Estrutura Básica de Leitura de Arquivos
        try{
            FileInputStream inputStream = new FileInputStream("arquivo.txt");
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));

            String line;
            while((line = reader.readLine()) != null){
                System.out.println(line);
            }

            inputStream.close();
            reader.close();
        } catch (IOException e){
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}

//FileInputStream - Abre o arquivo "arquivo.txt" com InputStream;
//InputStreamReader - Cria um leitor para o arquivo.txt;
//BufferedReader: Lê o arquivo linha por linha.
//readLine(): Lê cada linha do arquivo até o final (quando retorna null).