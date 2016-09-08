    import java.util.Scanner;

    public class AtmMain {
        public static void main(String[] args){
            Scanner password = new Scanner(System.in);
            String pass;
            Atm enterPassword = new Atm();
            System.out.println("Enter your ATM password: ");
            pass = password.nextLine();
            enterPassword.setPassword(pass);


            enterPassword.displayPassword();

            int x,y,z;


            x=1;
            y=2;
            z=3;

            System.out.println("Select an option");
            System.out.println(" 1 for withdrawal");
            System.out.println(" 2 for balance");
            System.out.println(" 3 for Deposit");

            Scanner option= new Scanner(System.in);

            int number= option.nextInt();

            enterPassword.optionChoose(number);

            if(number==x || number==y || number==z){
                System.out.println("Loading...");
            }else{
                System.out.println("Invalid Command");
            }

                int balance = 0;

            if(number == y){
                System.out.println("Your balance is " + balance + " naira");
            }

            if(number== z){
                System.out.println("Deposit into your account:");
                Scanner deposit = new Scanner(System.in);
                int actualDeposit = deposit.nextInt();
                int mainBalance = actualDeposit + balance;
                enterPassword.balance(mainBalance);
                System.out.println("Your balance is now " + mainBalance + " naira");
                System.out.println("Select an option");
                System.out.println(" 1 for withdrawal");
                System.out.println(" 2 for balance");
                System.out.println(" 3 for Deposit");
                Scanner choose= new Scanner(System.in);

                int digit= choose.nextInt();

                if(digit==x || digit==y || digit==z){
                System.out.println("Loading...");
            }else{
                System.out.println("Invalid Command");
            }

            if(digit == y){
                System.out.println("Your balance is " + mainBalance + " naira");
            }



            }


            if(number == x){
                if(balance == 0){
                    System.out.println("Your account is empty. Deposit into your account");
                    System.out.println("Select an option");
                        System.out.println(" 3 for Deposit");
                        Scanner choose= new Scanner(System.in);

                        int digit= choose.nextInt();

                        if(digit==z){
                        System.out.println("Loading...");
                        }else{
                            System.out.println("Invalid Command");
                        }
                        System.out.println("How much do you want to deposit?");
                        Scanner deposit = new Scanner(System.in);
                        int actualDeposit = deposit.nextInt();
                        int mainBalance = actualDeposit + balance;
                        enterPassword.balance(mainBalance);
                        System.out.println("Your balance is now " + mainBalance + " naira");
                        System.out.println("Select an option");
                        System.out.println(" 1 for withdrawal");
                        System.out.println(" 2 for balance");
                        System.out.println(" 3 for Deposit");
                        Scanner choose2= new Scanner(System.in);

                        int digit2= choose2.nextInt();

                        if(digit2==x || digit2==y || digit2==z){
                        System.out.println("Loading...");
                    }else{
                        System.out.println("Invalid Command");
                    }

                    if(digit2 == y){
                        System.out.println("Your balance is " + mainBalance + " naira");
                    }

                    if(digit2 == x){
                                System.out.println("How much do you want to withdraw ?");
                                Scanner remove = new Scanner(System.in);
                                int withdraw= remove.nextInt();

                                if(mainBalance < withdraw){
                                    System.out.println("Your funds are insufficient");
                                }else{
                                int currentBalance= mainBalance - withdraw;
                                System.out.println("Your withdrew "+ withdraw +" from " + mainBalance );
                            }
                                }

                }


            }




        }

    }