package Week6_4.Model;

import java.util.HashMap;

public class Notebook {
    public static class Note {
        private String title;
        private String content;

        public Note(String title, String content) {
            this.title = title;
            this.content = content;
        }

        public String getTitle() {
            return this.title;
        }

        public String getContent() {
            return this.content;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public void setContent(String content) {
            this.content = content;
        }
    }


    private HashMap<String, Note> notes = new HashMap<>();

    public void add(Note note) {
        notes.put(note.getTitle(), note);
    }
    public Note get(String title) {
        return notes.get(title);
    }
    public void remove(String title) {
        notes.remove(title);
    }
    public void update(Note note, String title, String content) {
        notes.remove(note.getTitle());
        notes.put(title, new Note (title, content));
    }

}
