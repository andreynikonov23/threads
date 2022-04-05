package nick.pack;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        NoteThread noteThread = new NoteThread();
        noteThread.start();
    }
    public static class NoteThread extends Thread {
        private ArrayList<String> notes = new ArrayList<>();

        public void run() {
            for (int i = 1, j = 0; i <= 1000; i++, j++) {
                Note note = new Note("Thread" + i, i);
                String res = addNote(note.getName(), note.getIndex());
                notes.add(res);
                if (i == 2){
                    removeNote(note.getName());
                    i++;
                    j--;
                }
                System.out.println(notes.get(j));
            }
        }

        public String addNote(String name, int index) {
            String str = name + "-Note" + index;
            return str;
        }

        public void removeNote(String str) {
            for (int i = 0; i < notes.size(); i++) {
                StringBuilder builder = new StringBuilder(String.valueOf(notes.get(i)));
                String name = builder.substring(0, 7);
                if (name.equals(str)) {
                    notes.remove(i);
                }
            }
        }
    }
}
