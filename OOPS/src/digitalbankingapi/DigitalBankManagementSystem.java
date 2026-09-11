package digitalbankingapi;

public class DigitalBankManagementSystem {
    public static void main(String[] args) {
        DigitalBank d=new DigitalBank(101,"Sujay Chimane",123893739,55000.00);
        d.displayBankDetails();
        d.loanRequest();
        d.transferMoney();
        d.lifeInsurance();
    }
}
