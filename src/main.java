public class main {
    public static void main(String[] args) {

        int TicketPrice = 100000;
        int BonusMiles = 20; // за каждые 20 рублей, потраченные на билет, начисляется 1 миля.
        int TotalBonus = TicketPrice / BonusMiles ;

        System.out.println("За приобритение билета стоимостью " + TicketPrice + " руб., Вам будет начислено " + TotalBonus + " бонусных миль.");

    }
}










