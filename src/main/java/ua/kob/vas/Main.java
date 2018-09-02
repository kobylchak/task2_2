package ua.kob.vas;

public class Main {
    public static void main(String[] args) {
        Card cardVsevolod = JSON.cardFromJson("json.txt");
        System.out.println(cardVsevolod.getName() + " " + cardVsevolod.getSurname() +
                " " + cardVsevolod.getPhones() + " " + cardVsevolod.getSites() + " " + cardVsevolod.getAddress());
    }
}
