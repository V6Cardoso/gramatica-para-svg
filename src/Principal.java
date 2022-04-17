import java.util.HashMap;
import java.util.Map;

public class Principal {
    public static void main(String[] args) throws Exception {
        
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
}
