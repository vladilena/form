package controller;


import model.Model;
import model.entity.NotUniqueLoginException;
import model.entity.Note;
import view.View;

import java.util.Scanner;

public class Controller {
    private View view;
    private Model model;

    public Controller(View view, Model model) {
        this.view = view;
        this.model = model;
    }


    public void processUser() {
        Scanner sc = new Scanner(System.in);
        InputNoteNoteBook inputNote =
                new InputNoteNoteBook(sc, view);
        inputNote.inputNote();
        Note note = getNoteBook(inputNote);
        model.addNoteToBook(note);
        System.out.println(note);
    }

    public Note getNoteBook(InputNoteNoteBook inputNote) {
        Note note = null;
        while (true) {
            try {
                note = new Note(
                        inputNote.getFirstName(),
                        inputNote.getLogin(),
                        inputNote.getComment(),
                        inputNote.getHomePhoneNumber(),
                        inputNote.getMobilePhoneNumber(),
                        inputNote.getSecondMobilePhoneNumber(),
                        inputNote.getEmail(),
                        inputNote.getSkype(),
                        inputNote.getAddress(),
                        inputNote.getCreationDate()
                );
                break;
            } catch (NotUniqueLoginException e) {
                e.printStackTrace();
                System.out.println("Not unique login: " + e.getLoginData());
                inputNote.inputLogin();
            }
        }
        return note;
    }
}
