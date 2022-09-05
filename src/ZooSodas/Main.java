package ZooSodas;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Sveiki apsilankę mūsų Zoo sodo tinklapyje!");

        boolean shouldContinue = true;
        Scanner sc = new Scanner(System.in);

        Animals simba = new Animals("Simba", "Liūtas", true, "Hakuna Matata",1994, "Ruda, kreminė, auksinė.", 1.20);
        Animals pumba = new Animals("Pumba", "Karpuotis", true, "Hakuna Matata", 1994, "Juoda, ruda, rožinė", 0.84);
        Animals timon = new Animals("Timonas", "Surikata", true, "Hakuna Matata", 1994, "Ruda, kreminė, raudona", 0.30);
        Animals sidney = new Animals("Sidas", "Tinginys", true, "Ledo,Sniego, Bandos Slėniai", 2002, "Šviesiai geltona", 1.5);
        Animals manny = new Animals("Menis", "Mamutas", true, "Bandos Slėnis", 2002, "Tamsiai ruda", 6.57);
        Animals diego = new Animals("Diegas", "Kardadantis tigras", true, "Ledo/Sniego Slėnis", 2002,"Šviesi oranžinė",1.00);
        Animals rudy = new Animals("Rudis", "Barioniksas", true,"Dino pasaulis", 2009, "pilka", 9.00);
        Animals buck = new Animals("Bakas", "Žebenkštis", true, "Dino pasauli", 2009, "Kaštoninė", 0.30);

        ArrayList<Animals> animalsNames = new ArrayList<>();



        ArrayList<Animals> animals = new ArrayList<>();
        animals.add(simba);
        animals.add(pumba);
        animals.add(timon);
        animals.add(sidney);
        animals.add(manny);
        animals.add(diego);
        animals.add(rudy);
        animals.add(buck);


        while (shouldContinue){
            menu();
            int opt = sc.nextInt();
            sc.nextLine();
            switch (opt) {
                case 0:
                    System.out.println("Ačiū, kad apsilankėte! Lauksime sugrįžtant.");
                    shouldContinue = false;
                    break;
                case 1:
                    System.out.println("Gyvūnų sąrašas");
                    printAnimals(animals);
                    break;
//                case 2:
//                    System.out.println("Galite pridėti gyvūną");
//                    addAnimal(sc, animals);
//                    break;
//                case 3:
//                    System.out.println("gGalite redaguoti gyvūną.");
//                    editAnimal(sc, animals);
//                    break;
                case 4:
                    System.out.println("Galite pašalinti gyvūną.");
                    deleteAnimal(sc, animals);
                    break;
                default:
                    System.out.println("Ar Jūsų pasirinkimas tikrai teisigas?");
            }
            System.out.println("..............................................");
        }

    }1

    public static void menu() {
        System.out.println("Norite pamatyti gyvūnų sąrašą? Spauskite 1.");
//        System.out.println("Norite pamatyti detalesnę detalesnę gyvūno informaciją? Spauskite 2.");
        System.out.println("Norite pridėti gyvūną? Spauskite 2.");
        System.out.println("Norėite redaguoti gyvūną? Spauskite 3.");
        System.out.println("Norite ištrinti gyvūną? Spauskite 4.");
        System.out.println("Norėite išeiti iš tinklapio? Spauskite 0.");
    }

    public static void printAnimals(ArrayList<Animals> arr) {
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(i + 1 + ". " + arr.get(i));
        }
    }

//    public static void addAnimal(Scanner sc, ArrayList<Animals> arr) {
//        arr.add(sc.nextLine());
//    }

//    public static void editAnimal(Scanner sc, ArrayList<Animals> arr) {
//        printAnimals(arr);
//        System.out.println("Pasirinkite gyvūną, kurį norite readaguoti.");
//        int nr = sc.nextInt();
//        sc.nextLine();
//        System.out.println("Jūsų redaguojamas gyvūnas yra: " + arr.get(nr - 1) + ". Suveskite jo naują informaciją");
//        arr.set(nr - 1, sc.nextLine());
//    }

    public static void deleteAnimal(Scanner sc, ArrayList<Animals> arr) {
        printAnimals(arr);
        System.out.println("Pasirinkite gyvūnąm kurį norite pašalinti.");
        int nr = sc.nextInt();
        sc.nextLine();
        System.out.println("Jūs sėkmingai pašalinote: " + arr.get(nr - 1) + ".");
        arr.remove(nr - 1);
    }


}
