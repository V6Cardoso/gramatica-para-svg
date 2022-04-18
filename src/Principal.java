import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class Principal {
    public static void main(String[] args) throws Exception {
        

        Path path = Paths.get("input.txt");
        List<String> lista = Files.readAllLines(path, StandardCharsets.UTF_8);

        if(!validaLista(lista)){
            System.out.println("Arquivo input.txt inválido");
            return;
        }

        String axion = "A";
        Map<Character, String> rules = new HashMap<Character, String>();
        rules.put('A', "AB");
        rules.put('B', "A");

        StringBuilder result= new StringBuilder();
        result.append(axion);

        for(int i = 0; i < 5; i++)
        {
            String currentString = result.toString();
            result.setLength(0);
            for (char c : currentString.toCharArray())
            {
                result.append(rules.get(c));
            }
            System.out.println("n = " + i + ": " + result.toString());
        }
        
    }

    public static boolean validaLista(List<String> list) {
        // padrão definido da gramática
        Pattern pattern = Pattern.compile("^(p\\d+|n|ω|δ)\\s:");

        if(list.size() < 4)
            return false;

        // checa cada linha do arquivo se bate com o padrão da gramática
        for(String line : list){
            if(!pattern.matcher(line).matches())
                return false;
        }
        return true;
    }
}
