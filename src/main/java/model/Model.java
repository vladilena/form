package model;

import model.entity.Note;
import model.entity.NoteBook;

public class Model {
    NoteBook noteBook = new NoteBook();

    public void addNoteToBook(Note note) {
        noteBook.addNote(note);
    }

}
