package model.entity;

import java.util.ArrayList;
import java.util.List;

public class NoteBook {
    List<Note> noteBook = new ArrayList<>();

    public void addNote(Note note) {
        noteBook.add(note);

        ///отладочный
        System.out.println("-------------------"+"\n"+noteBook);
    }

}
