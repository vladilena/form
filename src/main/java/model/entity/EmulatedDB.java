package model.entity;


public enum EmulatedDB {
    NOTE_ONE("124", "simpleLogin"),
    NOTE_TWO("123", "notCleverLogin");
    private final String firstName;
    private final String login;

    EmulatedDB(String firstName, String login) {
        this.firstName = firstName;
        this.login = login;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLogin() {
        return login;
    }

    public static boolean checkLogin(String inputLogin) {
        for (EmulatedDB data : EmulatedDB.values()) {
            if (data.getLogin().equals(inputLogin)) return true;
        }
        return false;
    }
}

