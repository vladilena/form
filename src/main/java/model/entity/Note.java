package model.entity;


import java.time.LocalDateTime;
import java.util.ArrayList;

public class Note {
    private String firstName;
    private String login;
    private String comment;
    private String homePhoneNumber;
    private String mobilePhoneNumber;
    private String secondMobilePhoneNumber;
    private String email;
    private String skype;
    private LocalDateTime creationDate;
    private ArrayList<String> address;

    public Note() {
    }

    public Note(String firstName, String login, String comment, String homePhoneNumber, String mobilePhoneNumber, String secondMobilePhoneNumber, String email, String skype, ArrayList<String> address, LocalDateTime creationDate) throws NotUniqueLoginException {
        if (EmulatedDB.checkLogin(login)) throw new NotUniqueLoginException("Not unique login", login);
        this.firstName = firstName;
        this.login = login;
        this.comment = comment;
        this.homePhoneNumber = homePhoneNumber;
        this.mobilePhoneNumber = mobilePhoneNumber;
        this.secondMobilePhoneNumber = secondMobilePhoneNumber;
        this.email = email;
        this.skype = skype;
        this.address = address;
        this.creationDate = creationDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getHomePhoneNumber() {
        return homePhoneNumber;
    }

    public void setHomePhoneNumber(String homePhoneNumber) {
        this.homePhoneNumber = homePhoneNumber;
    }

    public String getMobilePhoneNumber() {
        return mobilePhoneNumber;
    }

    public void setMobilePhoneNumber(String mobilePhoneNumber) {
        this.mobilePhoneNumber = mobilePhoneNumber;
    }

    public String getSecondMobilePhoneNumber() {
        return secondMobilePhoneNumber;
    }

    public void setSecondMobilePhoneNumber(String secondMobilePhoneNumber) {
        this.secondMobilePhoneNumber = secondMobilePhoneNumber;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSkype() {
        return skype;
    }

    public void setSkype(String skype) {
        skype = skype;
    }

    public ArrayList<String> getAddress() {
        return address;
    }

    public void setAddress(ArrayList<String> adress) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User form is ( " +
                "\nfirstName: " + firstName + "; " +
                "\nlogin: " + login + "; " +
                "\ncomment: " + comment + "; " +
                "\nhomePhoneNumber: " + homePhoneNumber + "; " +
                "\nmobilePhoneNumber: " + mobilePhoneNumber + "; " +
                "\nsecondMobilePhoneNumber: " + secondMobilePhoneNumber + "; " +
                "\nemail: " + email + "; " +
                "\nskype: " + skype + "; " +
                "\ncreationDate: " + creationDate +
                "\naddress: " + address +
                ")\n";
    }
}
