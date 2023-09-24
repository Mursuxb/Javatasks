package Week6_1.Controller;


import Model.Dictionary;
import View.DictionaryView;

public class DictionaryController {
    private DictionaryView view;
    private Dictionary dictionary = new Dictionary();


    public DictionaryController(DictionaryView view) {
        this.view = view;
    }

    public void getDefinition() {
        String word = view.getWord();
        String definition = dictionary.getDefinition(word);
        view.setResult(definition);
    }

    public void initialize() {
        dictionary.addWord("hello", "used as a greeting or to begin a telephone conversation.");
        dictionary.addWord("world", "the earth, together with all of its countries and peoples.");
        dictionary.addWord("lime", "a rounded citrus fruit similar to a lemon but greener, smaller, and with a thin rind and a more acid pulp.");
        dictionary.addWord("juice", "the liquid obtained from or present in fruit or vegetables.");
        dictionary.addWord("animal", "a living organism that feeds on organic matter, typically having specialized sense organs and nervous system and able to respond rapidly to stimuli.");
        dictionary.addWord("religion", "the belief in and worship of a superhuman controlling power, especially a personal God or gods.");
        dictionary.addWord("computer", "an electronic device for storing and processing data, typically in binary form, according to instructions given to it in a variable program.");
        dictionary.addWord("programming", "the action or process of writing computer programs.");
        dictionary.addWord("human", "of, relating to, or characteristic of people or human beings.");
        dictionary.addWord("living", "the pursuit of a lifestyle of the specified type.");
        dictionary.addWord("life", "the condition that distinguishes animals and plants from inorganic matter, including the capacity for growth, reproduction, functional activity, and continual change preceding death.");
        dictionary.addWord("sun", "the star around which the earth orbits.");
    }

    public static void main(String[] args) {
        DictionaryView.launch(DictionaryView.class);
    }
}
