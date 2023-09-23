package Week6_1.Controller;

import Week6_1.Model.Dictionary;

// The DictionaryController class (Controller) is responsible for the dictionary's functionality. It should interact with the Dictionary class to perform the search operation.
public class DictionaryController {
    private Dictionary dictionary;

    public DictionaryController() {
        this.dictionary = new Dictionary();
    }

    public static void main(String[] args) {
        DictionaryController dictionaryController = new DictionaryController();
        dictionaryController.dictionary.addWord("hello", "used as a greeting or to begin a telephone conversation.");
        dictionaryController.dictionary.addWord("world", "the earth, together with all of its countries and peoples.");
        dictionaryController.dictionary.addWord("lime", "a rounded citrus fruit similar to a lemon but greener, smaller, and with a thin rind and a more acid pulp.");
        dictionaryController.dictionary.addWord("juice", "the liquid obtained from or present in fruit or vegetables.");
        dictionaryController.dictionary.addWord("animal", "a living organism that feeds on organic matter, typically having specialized sense organs and nervous system and able to respond rapidly to stimuli.");
        dictionaryController.dictionary.addWord("religion", "the belief in and worship of a superhuman controlling power, especially a personal God or gods.");
        dictionaryController.dictionary.addWord("computer", "an electronic device for storing and processing data, typically in binary form, according to instructions given to it in a variable program.");
        dictionaryController.dictionary.addWord("programming", "the action or process of writing computer programs.");
        dictionaryController.dictionary.addWord("human", "of, relating to, or characteristic of people or human beings.");
        dictionaryController.dictionary.addWord("living", "the pursuit of a lifestyle of the specified type.");
        dictionaryController.dictionary.addWord("life", "the condition that distinguishes animals and plants from inorganic matter, including the capacity for growth, reproduction, functional activity, and continual change preceding death.");
        dictionaryController.dictionary.addWord("sun", "the star around which the earth orbits.");
    }
}
