import java.util.HashMap;

public class Translator {
    HashMap<Integer, String> numericAlpha = new HashMap<>();

    Translator(Integer[] numeric, String[] alphabetic) {
        for (int i = 0; i < alphabetic.length; i++) {
            numericAlpha.put(numeric[i], alphabetic[i]);
        }
    }

    public String translate(Integer number) {
        return numericAlpha.getOrDefault(number, "ongeldig");
    }
}
