import java.util.Date;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        BezeciPas run = new BezeciPas(false, 0);
        Rotopad rotopad = new Rotopad(false, 0);
        Bench bench = new Bench(false, 0);
        Dumbell dumbell = new Dumbell(false, 0);
        String vstup= "";

        while(!vstup.equals("0")) {
            System.out.println("1: Pujcit\n2: Vratit\n3: údržba\n4: vypis");
            System.out.println("Pro ukonceni programu stisknete: 0.");
            vstup = sc.nextLine();

            switch(vstup) {
                case "1":
                    String vyber="";
                    System.out.println("Jake zarizení si chcete půjčit?");
                    while(!vyber.equals("0")) {
                        System.out.println("1: Bezeci Pas\n2: Bench\n3: Rotopad\n4: činka");
                        System.out.println("Pro Vrácení zpátky: 0.");
                        vyber = sc.nextLine();

                        switch (vyber) {
                            case "1":
                                run.rezervace();
                                break;
                            case "2":
                                bench.rezervace();
                                break;
                            case "3":
                                rotopad.rezervace();
                                break;
                            case "4":
                                dumbell.rezervace();
                                break;
                            case "0":
                                System.out.println("Program vás vrací zpět");
                                break;
                        }
                    }
                    break;
                case "2":
                    String vyber2="";
                    System.out.println("Jake zarizení budete vracet?");
                    while(!vyber2.equals("0")) {
                        System.out.println("1: Bezeci Pas\n2: Bench\n3: Rotopad\n4: činka");
                        System.out.println("Pro Vrácení zpátky: 0.");
                        vyber2 = sc.nextLine();

                        switch (vyber2) {
                            case "1":
                                run.vraceni();
                                break;
                            case "2":
                                bench.vraceni();
                                break;
                            case "3":
                                rotopad.vraceni();
                                break;
                            case "4":
                                dumbell.vraceni();
                                break;
                            case "0":
                                System.out.println("Program váš vrací zpět");
                                break;
                        }
                    }
                    break;
                case "3":
                    String vyber3="";
                    System.out.println("Na jakém zařízení chcete provést údržbu?");
                    while(!vyber3.equals("0")) {
                        System.out.println("1: Bezeci Pas\n2: Bench\n3: Rotopad\n4: činka");
                        System.out.println("Pro Vrácení zpátky: 0.");
                        vyber3 = sc.nextLine();

                        switch (vyber3) {
                            case "1":
                                run.udrzba();
                                break;
                            case "2":
                                bench.udrzba();
                                break;
                            case "3":
                                rotopad.udrzba();
                                break;
                            case "4":
                                dumbell.udrzba();
                                break;
                            case "0":
                                System.out.println("Program vás vrací zpět");
                                break;
                        }
                    }
                    break;
                case "4":
                    String vyber4="";
                    System.out.println("O jakém uařízení chcete vypsat info?");
                    while(!vyber4.equals("0")) {
                        System.out.println("1: Bezeci Pas\n2: Bench\n3: Rotopad\n4: činka");
                        System.out.println("Pro Vrácení zpátky: 0.");
                        vyber4 = sc.nextLine();

                        switch (vyber4) {
                            case "1":
                                run.vypisInfo();
                                break;
                            case "2":
                                bench.vypisInfo();
                                break;
                            case "3":
                                rotopad.vypisInfo();
                                break;
                            case "4":
                                dumbell.vypisInfo();
                                break;
                            case "0":
                                System.out.println("Program vás vrací zpět");
                                break;
                        }
                    }
                    break;

                case "0":
                    System.out.println("Program se ukončuje");
                    break;
                default:
                    System.out.println("Zadana neplatna volba. Oprav se: ");
            }
        }
    }
}