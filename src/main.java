public class main {
    public static void main(String[] args) {

        int ticketPrice = 100000;
        int bonusMiles = 20;
        int totalBonus = ticketPrice / bonusMiles;

        System.out.println("За приобритение билета стоимостью " + ticketPrice + " руб., Вам будет начислено " + totalBonus + " бонусных миль.");
    }
}