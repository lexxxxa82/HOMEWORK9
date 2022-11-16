public class Main {
    public static void main(String[] args) {
        System.out.println("Задача № 1");
        {

            String firstName = "Ivan";
            String middleName = "Ivanovich";
            String lastName = "Ivanov";
            String fullName = lastName + " " + firstName + " " + middleName;
            System.out.println(fullName);

            System.out.println("Задача № 2");

            String fullNameСapital = fullName.toUpperCase();
            System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullNameСapital);
        }
        System.out.println("Задача № 3");
        String fullName = "Иванов Семён Семёнович";
        String correctFullName = fullName.replace("ё", "e");
        System.out.println("Данные ФИО сотрудника — " + correctFullName);

    }
}