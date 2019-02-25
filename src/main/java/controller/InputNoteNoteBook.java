package controller;


import view.View;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

import static controller.RegexContainer.*;
import static view.TextConstant.*;


class InputNoteNoteBook {
    private Scanner sc;
    private View view;

    private String firstName;
    private String login;
    private String comment;
    private String homePhoneNumber;
    private String mobilePhoneNumber;
    private String secondMobilePhoneNumber;
    private String email;
    private String skype;
    private ArrayList<String> address;
    private LocalDateTime creationDate;

    InputNoteNoteBook(Scanner sc, View view) {
        this.sc = sc;
        this.view = view;
    }

    void inputNote() {
        UtilityController contr = new UtilityController(sc, view);
        String str = ((String.valueOf(view.bundle.getLocale()).equals("ua")))
                ? REGEX_NAME_UKR : REGEX_NAME_LAT;
        this.firstName =
                contr.inputStringValueWithScanner
                        (FIRST_NAME, str);
        this.login =
                contr.inputStringValueWithScanner
                        (LOGIN_DATA, REGEX_LOGIN);

        this.comment = contr.inputStringValueWithScanner(COMMENT_DATA, REGEX_COMMENT);
        this.homePhoneNumber = contr.inputStringValueWithScanner(HOME_PHONE_DATA, REGEX_PHONE_NUMBER);
        this.mobilePhoneNumber = contr.inputStringValueWithScanner(MOBILE_PHONE_DATA, REGEX_PHONE_NUMBER);
        this.secondMobilePhoneNumber = contr.inputStringValueWithScanner(SECOND_MOBILE_PHONE_DATA, REGEX_PHONE_NUMBER);
        this.email = contr.inputStringValueWithScanner(EMAIL_DATA, REGEX_EMAIL);
        this.skype = contr.inputStringValueWithScanner(SKYPE_DATA, REGEX_SKYPE);
        this.address = inputAddress(contr);
        this.creationDate = creationDate.now();

    }

    private ArrayList<String> inputAddress(UtilityController contr) {
        ArrayList<String> list = new ArrayList<>();
        list.add(contr.inputStringValueWithScanner(INDEX_DATA, REGEX_INDEX));
        list.add(contr.inputStringValueWithScanner(CITY_DATA, REGEX_CITY));
        list.add(contr.inputStringValueWithScanner(STREET_DATA, REGEX_STREET));
        list.add(contr.inputStringValueWithScanner(BUILDING_DATA, REGEX_BUILDING));
        list.add(contr.inputStringValueWithScanner(APARTMENT_DATA, REGEX_APARTMENT));
        return list;
    }

    public void inputLogin (){
        UtilityController utilityController =
                new UtilityController(sc, view);
        this.login =
                utilityController.inputStringValueWithScanner
                        (LOGIN_DATA, REGEX_LOGIN);


    }
    Scanner getSc() {
        return sc;
    }

    View getView() {
        return view;
    }

    String getFirstName() {
        return firstName;
    }

    String getLogin() {
        return login;
    }

    String getComment() {
        return comment;
    }

    String getHomePhoneNumber() {
        return homePhoneNumber;
    }

    String getMobilePhoneNumber() {
        return mobilePhoneNumber;
    }

    String getSecondMobilePhoneNumber() {
        return secondMobilePhoneNumber;
    }

    String getEmail() {
        return email;
    }

    String getSkype() {
        return skype;
    }

    public ArrayList<String> getAddress() {
        return address;
    }

    LocalDateTime getCreationDate() {
        return creationDate;
    }
}
