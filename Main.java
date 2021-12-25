import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean check;
        int n;
        double tiennap = 0;
        double tienmua = 0;
        double tienthua = 0 ;

        Machine machine = new Machine();
        Products product = new Products();

        while(true) {
            System.out.println("Enter your choice ");
            System.out.println("1.Recharge ");
            System.out.println("2.Buy water ");
            System.out.println("3.Receive products and change money ");
            System.out.println("4.Cancel ");

            n = scanner.nextInt();
            switch (n) {
                case (1):
                    System.out.println("Only receive ");
                    System.out.println("10.000 \t  20.000 \t 50.000 \t 100.000 \t 200.000 ");

                    do {
                        System.out.println("Please put money in the machine: ");
                        double nap = scanner.nextDouble();
                        if (nap  == 10000 || nap == 20000 || nap == 50000 || nap == 100000 || nap == 200000) {
                            machine.nap(nap);
                            tiennap = tiennap +  nap;
                            tienthua = tiennap ;
                            check = true;
                        } else {
                            System.out.println("incorrect currency");
                            check = false;
                        }

                        System.out.println("money deposited: " + tiennap);
                    } while (check == false);

                    break;


                case (2):
                    System.out.println("Please choose a drink ");
                    System.out.println("1.pepsi 10.000 \t 2.coke 10.000 \t 3.lemon 20.000 ");
                    int  choice = scanner.nextInt();

                    switch(choice) {
                        case 1:
                            if(tienthua < product.getPepsi()){
                                System.out.println("you don't have enough money to buy");
                            }
                            else{
                                System.out.println("successfully purchase");
                                tienmua = tienmua + product.getPepsi();
                                tienthua = tienthua - tienmua;
                            }

                            break;
                        case 2:

                            if(tienthua < 0){
                                System.out.println("you don't have enough money to buy ");
                            }
                            else{
                                System.out.println("successfully purchase");
                                tienmua = tienmua + product.getCoke();
                                tienthua = tienthua - tienmua;
                            }
                            break;
                        case 3:
                            if(tienthua < product.getLemon()){
                                System.out.println("you don't have enough money to buy");
                            }
                            else{
                                System.out.println("successfully purchase");
                                tienmua = tienmua + product.getLemon();
                                tienthua = tienthua - tienmua;
                            }

                            break;

                    }

                  break;
                case(3):

                        if(tienthua > 0){
                            System.out.println("receive products and change money:  "
                            + tienthua );
                            System.out.println("Thank youu!!");
                        }
                        else{
                            System.out.println("receive products ");
                            System.out.println("thank you");
                        }
                        tiennap = 0 ;
                        tienmua = 0;
                    break;
                case(4):
                    return;
            }
        }

    }
}
