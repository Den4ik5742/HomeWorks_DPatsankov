package HomeWork3.Task_3;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;
import java.lang.*;

public class CreditsCardValidation {
    private String cardNumber;
    private String cardType;
    private String ownerName;
    private int expirationYear;
    private int expirationMonth;
    private int cvv;

    public CreditsCardValidation(String cardNumber, String cardType, String ownerName, int expirationYear, int expirationMonth, int cvv) {
        this.cardNumber = cardNumber;
        this.cardType = cardType;
        this.ownerName = ownerName;
        this.expirationYear = expirationYear;
        this.expirationMonth = expirationMonth;
        this.cvv = cvv;
    }

    public CreditsCardValidation() {

    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public int getExpirationYear() {
        return expirationYear;
    }

    public void setExpirationYear(int expirationYear) {
        this.expirationYear = expirationYear;
    }

    public int getExpirationMonth() {
        return expirationMonth;
    }

    public void setExpirationMonth(int expirationMonth) {
        this.expirationMonth = expirationMonth;
    }

    // Вывод списка карт
    public static void info(List<CreditsCardValidation> creditsList) {
        for (CreditsCardValidation creditCards : creditsList) {
            System.out.printf("Карта : %s, Вид : %s, Владелец : %s, Год : %d, Месяц: %d, CVV : %d\n", creditCards.getCardNumber(), creditCards.getCardType(), creditCards.getOwnerName(), creditCards.getExpirationYear(), creditCards.getExpirationMonth(), creditCards.getCvv());
        }
    }

    // Проверка унивкальности номера карты
    public String checkUniqueNumber(List<CreditsCardValidation> creditsList) {
        cardNumber = checkSizeNumber();
        for (CreditsCardValidation creditNumber : creditsList) {
            while (cardNumber.equals(creditNumber.getCardNumber())) {
                System.out.printf("\nНомер карты не уникален. Карта с этим номером существует.\n");
                cardNumber = checkSizeNumber();
            }
        }
        return cardNumber;
    }

    // Проверка длинны номера карты
    public String checkSizeNumber() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите номер карты(16 цифр) : ");
        cardNumber = in.next();
        while (cardNumber.length() != 16) {
            System.out.printf("\nНомер карты должен состоять из 16 чисел.");
            System.out.println("\nВведите номер карты(16 цифр) : ");
            cardNumber = in.next();
        }
        return cardNumber;
    }

    // Проверка вида карты
    public String checkCardType() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите тип карты(Visa/MasterCard) : ");
        cardType = in.next();
        while (true) {
            if (cardType.equals("Visa") || cardType.equals("MasterCard")) {
                break;
            } else {
                System.out.printf("\nТип карты должен быть Visa или MasterCard.");
                System.out.println("\nВведите тип карты(Visa/MasterCard) : ");
                cardType = in.next();
            }
        }
        return cardType;
    }

    // Проверка наличия введеного имени владельца карты
    public String checkCardOwnerName() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите фамилию латинскими буквами: ");
        ownerName = in.nextLine();
        while (ownerName.equals("")) {
            System.out.println("Ввод Фамилии обязателен : ");
            ownerName = in.nextLine();
        }
        ownerName = checkCardOwnerWithUpperLetter(ownerName);
        return ownerName;
    }

    // Проверка на Заглавную букву фамилии владельца
    public String checkCardOwnerWithUpperLetter(String ownerName) {
        Scanner in = new Scanner(System.in);
        char[] arr = ownerName.toCharArray();
        while ((arr[0] >= 97 && arr[0] <= 122)) {
            System.out.println("\nФамилия должна начинаться с большой буквы : ");
            ownerName = checkCardOwnerName();
            arr = ownerName.toCharArray();
        }
        return ownerName;
    }

    // Проверка истечения срока карты
    public int[] checkExpirationDate() {
        Scanner in = new Scanner(System.in);
        expirationMonth = checkMonthLength();
        expirationYear = checkYearLength();
        LocalDate today = LocalDate.now();
        int currentMonth = today.getMonthValue();
        int currentYear = today.getYear();
        while (currentYear > expirationYear) {
            System.out.printf("\nНеверная дата. Срок действия карты истек");
            expirationMonth = checkMonthLength();
            expirationYear = checkYearLength();
        }
        while (currentYear == expirationYear) {
            if (currentMonth > expirationMonth) {
                System.out.printf("\nНеверная дата. Срок действия карты истек");
                expirationMonth = checkMonthLength();
                expirationYear = checkYearLength();
            } else {
                break;
            }
        }
        return new int[]{expirationMonth, expirationYear};
    }

    // Проверка что месяц верный
    public int checkMonthLength() {
        Scanner in = new Scanner(System.in);
        System.out.println("\nВведите месяц :");
        expirationMonth = in.nextInt();
        while (expirationMonth < 1 || expirationMonth > 12) {
            System.out.printf("\nМесяц должен быть от 1 до 12.");
            System.out.println("\nВведите месяц еще раз :");
            expirationMonth = in.nextInt();
        }
        return expirationMonth;
    }

    // Проверка что год 4-значный
    public int checkYearLength() {
        Scanner in = new Scanner(System.in);
        System.out.println("\nВведите год :");
        expirationYear = in.nextInt();
        while (expirationYear < 1000 || expirationYear > 9999) {
            System.out.printf("\nГод должен быть 4 значный.");
            System.out.println("\nВведите год еще раз :");
            expirationYear = in.nextInt();
        }
        return expirationYear;
    }

    // Проверка что cvv код трехзначный
    public int checkCardCVV() {
        Scanner in = new Scanner(System.in);
        System.out.println("\nВведите cvv(3 цифры) : \n");
        cvv = in.nextInt();
        while (cvv < 100 || cvv > 999) {
            System.out.printf("\nНеверный cvv. Должно быть 3 цифры");
            System.out.println("\nВведите cvv :");
            cvv = in.nextInt();
        }
        return cvv;
    }
}


