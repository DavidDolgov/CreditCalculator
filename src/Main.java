public class Main {
    public static void main(String[] args) {

        CreditPaymentService service = new CreditPaymentService();
        double money=1_000_000;          // общая сумма взята в кредит
        short time;                      // на сколько лет (входные данные, позже будем прописывать как условие)
        float percent=9.99F;             // годовая процентная ставка
        double payment;

        time=1;
        payment= service.calculate(money,time,percent);
        System.out.println();
        System.out.println("Кредит на сумму "+money+" рублей");
        System.out.println("Сроком на "+time+" год, со ставкой в "+percent+" процента.");
        System.out.println("Ежемесячный платёж равен "+(int)payment+" ₽ ");
        System.out.println();

        time=2;
        payment= service.calculate(money,time,percent);
        System.out.println();
        System.out.println("Кредит на сумму "+money+" рублей");
        System.out.println("Сроком на "+time+" года со ставкой в "+percent+" процента.");
        System.out.println("Ежемесячный платёж равен "+(int)payment+" ₽ ");
        System.out.println();

        time=3;
        payment= service.calculate(money,time,percent);
        System.out.println();
        System.out.println("Кредит на сумму "+money+" рублей");
        System.out.println("Сроком на "+time+" года со ставкой в "+percent+" процента.");
        System.out.println("Ежемесячный платёж равен "+(int)payment+" ₽ ");
        System.out.println();


    }
}