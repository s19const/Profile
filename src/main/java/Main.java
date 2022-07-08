public class Main {

    public static void main(String[] args) {
        Person person = new Person();
        Person.birthday = new FormDate();

        Person.birthday.day = 13;
        Person.birthday.month = 6;
        Person.birthday.year = 1999;

        Person.name = "Иван";
        Person.passport = "4444 № 44444444";
        Person.patronymic = "Иванович";
        Person.phone = "+7 (999)-999-99-99";
        Person.surname = "Иванов";
        Person.subscription = true;


    }


}
