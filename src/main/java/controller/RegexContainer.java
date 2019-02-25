package controller;

public interface RegexContainer {

    String REGEX_NAME_UKR = "^[А-ЯҐІЇЄ][а-яґіїє'-\\s]{1,20}$";
    String REGEX_NAME_LAT = "^[A-Z][a-z]{1,20}$";
    String REGEX_LOGIN = "^[A-Za-z0-9_-]{8,20}$";
    String REGEX_COMMENT = "[A-Za-zА-Яа-яЄєЇїЄє'-.,\\s\\n]{0,50}";
    String REGEX_PHONE_NUMBER = "[\\+][0-9]{3}\\-{1}[0-9]{2}\\-{1}[0-9]{5,15}";
    String REGEX_EMAIL = "(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:(2(5[0-5]|[0-4][0-9])|1[0-9][0-9]|[1-9]?[0-9]))\\.){3}(?:(2(5[0-5]|[0-4][0-9])|1[0-9][0-9]|[1-9]?[0-9])|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])";
    String REGEX_SKYPE = "[A-Za-z0-9_-]{0,20}";
    String REGEX_INDEX = "[0-9]{1,20}";
    String REGEX_CITY = "[A-Z-]{2,20}";
    String REGEX_STREET = "[A-Z-0-9]{2,20}";
    String REGEX_BUILDING = "[A-Z-0-9/.]{2,20}";
    String REGEX_APARTMENT = "[A-Z-0-9/.]{2,20}";


}