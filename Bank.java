public class Bank {
    private String userName;
    private int password;
    private int totalMoney;
    private int creditLimit;

    public Bank(String userName, int password, int totalMoney, int creditLimit) {
        this.userName = userName;
        this.password = password;
        this.totalMoney = totalMoney;
        this.creditLimit = creditLimit;
    }
    public String makePayment(String inputUserName, int inputPassword, int amount) {
        if (inputUserName.equals(userName) && inputPassword == password) {
            if (amount <= totalMoney) {
                totalMoney -= amount;
                return "Успешно оплачено. Остаток на счете: " + totalMoney;
            } else {
                return "Ваша сумма денег не хватает, чтобы оплатить за продукты.";
            }
        } else {
            return "Неверное имя пользователя или пароль.";
        }
    }
    public String makePaymentWithCredit(String inputUserName, int inputPassword, int amount) {
        if (inputUserName.equals(userName) && inputPassword == password) {
            if (amount <= totalMoney + creditLimit) {
                totalMoney -= amount;
                return "Успешно оплачено с использованием кредита. Остаток на счете: " + totalMoney;
            } else {
                return "Недостаточно средств для оплаты и кредита.";
            }
        } else {
            return "Неверное имя пользователя или пароль.";
        }
    }


    @Override
    public String toString() {
        return "Bank{" +
                "userName='" + userName + '\'' +
                ", password=" + password +
                ", totalMoney=" + totalMoney +
                ", creditLimit=" + creditLimit+
                '}';
    }
}
