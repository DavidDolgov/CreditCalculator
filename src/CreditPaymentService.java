public class CreditPaymentService {

    public double calculate(double sum, short years, float bid) {
        float monthBid = bid / (100 * 12);                      // расчёт месечной процентной ставки
        int month = years * 12;
        double result = sum * (monthBid / (1 - Math.pow(1 + monthBid, -month)));
        return result;
    }
}
