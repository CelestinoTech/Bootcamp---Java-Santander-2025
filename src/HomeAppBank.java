import java.util.InputMismatchException;

public class HomeAppBank {
    private float balance;
    private float sake;
    private float deposit;
    private float pay;
    private float especialCheck;
    private boolean useEspecialCheck;
    private boolean existAccount;

    //Constructor
    public HomeAppBank(float balance,float sake,float deposit,float pay,float especialCheck, boolean useEspecialCheck,boolean existAccount ){
        this.balance = balance;
        this.sake = sake;
        this.deposit = deposit;
        this.pay = pay;
        this.especialCheck = especialCheck;
        this.useEspecialCheck = useEspecialCheck;
        this.existAccount = existAccount;
    }

    //Consulta Saldo
    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public float getSake() {
        return sake;
    }

    public void setSake(float sake) {
        this.sake = sake;
    }

    public float getDeposit() {
        return deposit;
    }

    public void setDeposit(float deposit) {
        this.deposit = deposit;
    }

    public float getPay() {
        return pay;
    }

    public void setPay(float pay) {
        this.pay = pay;
    }

    //Consultar Cheque Especial
    public float getEspecialCheck() {
        return especialCheck;
    }

    public void setEspecialCheck(float especialCheck) {
        this.especialCheck = especialCheck;
    }

    public boolean isUseEspecialCheck() {
        return useEspecialCheck;
    }

    public void setUseEspecialCheck(boolean useEspecialCheck) {
        this.useEspecialCheck = useEspecialCheck;
    }

    public boolean isExistAccount() {
        return existAccount;
    }

    public void setExistAccount(boolean existAccount) {
        this.existAccount = existAccount;
    }

    public float createAccount(float value){
        if (existAccount == true){
            System.out.println("Ops, conta ja existente.");
        }else{
            //System.out.println("Vamos criar uma conta. Digite o valor inicial");
            if (value <= 0){
                negativeValueAlert();
            }else {
                if (value <= 500){
                    especialCheck = 50;
                }else {
                    //Necessario deixar explicito que o 0.50 é float pois numeros flutuantes em java tendem a ser double
                    especialCheck = (value * 0.50f);
                }
                balance += value;
                existAccount = true;
            }

        }
        return balance;
    }

    public float deposit(float value){
        if (value <= 0){
            negativeValueAlert();
        }else {
            System.out.println("Deposito realizado com sucesso");
            balance += value;
        }
        return balance;
    }

    public float sake(float value) throws InputMismatchException {
        if (value < 0){
            negativeValueAlert();
        }else {
            if (value <= balance){
                balance -= value;
                System.out.println("Saque realizado com sucesso");
            }else if (value > balance){
                float dif = value - balance;
                if (especialCheck >= dif){
                    balance = 0;
                    float multa = (dif * 0.20f);
                    balance -= multa;
                    especialCheck -= dif;
                    useEspecialCheck = true;
                    System.out.println("Multa aplicada: " + multa);
                    System.out.println("Saque realizado com Cheque especial.");
                }else {
                    System.out.println("Cheque insuficiente");
                }
            }
        }
        return balance;
    }

    public float payTicket(float ticket){
       if (ticket <= 0){
           System.out.println("Boleto Invalido");
       } else if (ticket > balance) {
           System.out.println("Saldo insuficiente");
       }else {
           System.out.println("Pagamento Realizado com Sucesso");
           balance -= ticket;
       }
        return  balance;
    }

    public void negativeValueAlert(){
        System.out.println("Valor Invalido. Digite um valor maior que zero");
    }


}