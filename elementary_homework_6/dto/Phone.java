package ua.hillel.tatiana.elementary_homework_6.dto;

public class Phone {
    private static int NUMBER_OF_ABONENT = 0;
    private int id = NUMBER_OF_ABONENT;
    private String surname;
    private String name;
    private String patronymic;
    private int year;
    private String address;
    private String phone;
    private String card;
    private double debit;
    private double credit;
    private int timeInCity;
    private int timeOutCity;
    private double internet;

    public Phone(String surname, String name, String patronymic, int year, String address, String phone, String card,
                 double debit, double credit, int timeInCity, int timeOutCity, double internet) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.year = year;
        this.address = address;
        this.phone = phone;
        this.card = card;
        this.debit = debit;
        this.credit = credit;
        this.timeInCity = timeInCity;
        this.timeOutCity = timeOutCity;
        this.internet = internet;
        NUMBER_OF_ABONENT++;
    }

    @Override
    public String toString() {
        return "Phone{ "  + surname + " " + name + " " + patronymic + " " +
                " - timeInCity = " + timeInCity +
                ", timeOutCity = " + timeOutCity +
                ", internet = " + internet +
                '}';
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }

    public double getDebit() {
        return debit;
    }

    public void setDebit(double debit) {
        this.debit = debit;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    public int getTimeInCity() {
        return timeInCity;
    }

    public void setTimeInCity(int timeInCity) {
        this.timeInCity = timeInCity;
    }

    public int getTimeOutCity() {
        return timeOutCity;
    }

    public void setTimeOutCity(int timeOutCity) {
        this.timeOutCity = timeOutCity;
    }

    public double getInternet() {
        return internet;
    }

    public void setInternet(double internet) {
        this.internet = internet;
    }


}
