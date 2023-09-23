package Week6_1.Model;

import java.util.HashMap;

public class Dictionary {
    private HashMap<String, String> dictionary;

    public Dictionary() {
        this.dictionary = new HashMap<String, String>();
    }
    public void addWord(String word, String definition) {
        this.dictionary.put(word, definition);
    }
    public String getDefinition(String word) {
        return this.dictionary.get(word);
    }
}
