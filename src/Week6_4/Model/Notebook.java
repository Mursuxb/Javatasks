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

        @Override
        public String toString() {
            return this.title;
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
    public Note update(Note note, String title, String content) {
        notes.remove(note.getTitle());
        Note newNote = new Note (title, content);
        notes.put(title, newNote);
        return newNote;
    }

}
