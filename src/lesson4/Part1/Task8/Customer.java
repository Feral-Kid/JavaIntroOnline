package lesson4.Part1.Task8;

public class Customer {

    private long id = 0;
    private String name = "";
    private String surName = "";
    private String patronymic = "";
    private String address = "";
    private long creditCardNumber = 0;
    private String bankAccountNumber = "";

    @Override
    public String toString() {
        return "Customer" +
                "id=" + id + '\n' +
                "name='" + name + '\n' +
                "surName='" + surName + '\n' +
                "patronymic='" + patronymic + '\n' +
                "address='" + address + '\n' +
                "creditCardNumber=" + creditCardNumber + '\n' +
                "bankAccountNumber='" + bankAccountNumber + '\n';
    }

    public Customer(long id, String name, String surName, String patronymic, String address, long creditCardNumber, String bankAccountNumber) {
        this.id = id;
        this.name = name;
        this.surName = surName;
        this.patronymic = patronymic;
        this.address = address;
        this.creditCardNumber = creditCardNumber;
        this.bankAccountNumber = bankAccountNumber;
    }

    public Customer() {

    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public long getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(long creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public String getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(String bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }
}
