import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Principal {
    public static void main(String[] args) throws Exception {
        

        Path path = Paths.get("input.txt");
        List<String> lista = Files.readAllLines(path, StandardCharsets.UTF_8);

        if(!validaLista(lista)){
            System.out.println("Arquivo input.txt inválido");
            return;
        }

        // obtém os valores da gramática contidas no arquivo txt
        int iterations = Integer.parseInt(lista.get(0).substring(3).strip());
        String axion = lista.get(1).substring(3).strip();

        //considere o alfabeto Σ : F f + - [ ]
        Pattern pattern = Pattern.compile("p\\d : *(F|f|\\+|-|\\[|\\]) *-> *([F|f|\\+|-|\\[|\\]]+)");

        //obtém as regras de produção e as insere em um mapa
        Map<String, String> rules = new HashMap<String, String>();
        for(String line : lista){
            Matcher m = pattern.matcher(line);
            if(m.find()){
                rules.put(m.group(1), m.group(2));
            }
        }


        //constrói em cada iteração a nova string substituindo cada char com base nas regras de produção
        StringBuilder result= new StringBuilder();
        result.append(axion);
        System.out.println("n = 0: " + axion);
        for(int i = 1; i <= iterations; i++)
        {
            String currentString = result.toString();
            result.setLength(0);
            for (char c : currentString.toCharArray())
            {
                result.append(rules.get(String.valueOf(c)));
            }
            System.out.println("n = " + i + ": " + result.toString());
        }

        //TODO converte a string final em um código html

        //TODO cria o arquivo html
        
    }

    public static boolean validaLista(List<String> list) {
        // padrão definido da gramática
        Pattern pattern = Pattern.compile("^(p\\d+|Σ|n|ω|δ)\\s:");

        if(list.size() < 5)
            return false;

        // checa cada linha do arquivo se bate com o padrão da gramática
        for(String line : list){
            if(!pattern.matcher(line).find())
                return false;
        }
        return true;
    }

    public static void criaHtml(String[] conteudo) throws Exception{
        Path path = Paths.get("svg.html");
        StringBuilder build = new StringBuilder();
        build.append("<html><body><svg width=\"1920\" height=\"1080\" style=\"stroke:rgb(4, 205, 255);stroke-width:2\">");
        for(String s : conteudo){
            build.append(s);
        }
        build.append("</svg></body></html>");
        byte[] bytes = build.toString().getBytes();

        Files.write(path, bytes);
    }
}
