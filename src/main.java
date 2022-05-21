public class main {
    public static void main(String[] args) {

        int ticketprice = 100000;
        int bonusmiles = 20;
        int totalbonus = ticketprice / bonusmiles;

        System.out.println("За приобритение билета стоимостью " + ticketprice + " руб., Вам будет начислено " + totalbonus + " бонусных миль.");

    }
}