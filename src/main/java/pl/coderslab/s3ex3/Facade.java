package pl.coderslab.s3ex3;

public class Facade implements AtmApi {

        private BankAccount bankAccount;
        private Transfer transfer;
        private PhoneCard phoneCard;
        private Loan loan;
        public Facade() {
            this.bankAccount = new BankAccount();
            this.transfer = new Transfer();
            this.phoneCard = new PhoneCard();
            this.loan = new Loan();
        }
        public void deposit(){
            this.bankAccount.deposit(); }
        public void payout(){
            this.bankAccount.deposit(); }
        public void transfer(){
            this.transfer.transferMoney(); }
        public void recharge(){
            this.phoneCard.recharge(); }
        public void loan(){
            this.loan.getLoan(); }


}
