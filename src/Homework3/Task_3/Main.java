package HomeWork3.Task_3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Список карт :");
        CreditsCardValidation credits1 = new CreditsCardValidation("1111222233334444", "Visa", "Ivanov", 2021, 11, 333);
        CreditsCardValidation credits2 = new CreditsCardValidation("5555111133334444", "MasterCard", "Ivanov", 2023, 10, 123);
        CreditsCardValidation credits3 = new CreditsCardValidation("9999999999999999", "Visa", "Ivanov", 2025, 1, 999);
        List<CreditsCardValidation> creditsList = new ArrayList<>();
        creditsList.add(credits1);
        creditsList.add(credits2);
        creditsList.add(credits3);
        CreditsCardValidation.info(creditsList);
        CreditsCardValidation credits = new CreditsCardValidation();
        credits.setCardNumber(credits.checkUniqueNumber(creditsList));
        credits.setCardType(credits.checkCardType());
        credits.setOwnerName(credits.checkCardOwnerName());
        int expirationDate[] = credits.checkExpirationDate();
        credits.setExpirationYear(expirationDate[1]);
        credits.setExpirationMonth(expirationDate[0]);
        credits.setCvv(credits.checkCardCVV());
        System.out.println("Новый список карт :");
        creditsList.add(credits);
        CreditsCardValidation.info(creditsList);

    }
}

