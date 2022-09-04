package AugaluProjektas;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //    private String name;
        //    private String latinName;
        //    private boolean oneYear;
        //    private String continent;
        //    private Integer height;
        //    private boolean canEat;

        Plants pl = new Plants();
        pl.setName("Kalankė");
        pl.setLatinName("Kalanchöe");
        pl.setOneYear(false);
        pl.setContinent("Madagascar"); //  Africa
        pl.setHeight(1); //can reach 6 m; most species are less tha 1 m;
        pl.setCanEat(true);

        Plants pl2 = new Plants();
        pl2.setName("Kavos medis");
        pl2.setLatinName("Coffea arabica");
        pl2.setOneYear(false);
        pl2.setContinent("Ethiopia");
        pl2.setHeight(12); // between 9 and 12 m
        pl2.setCanEat(true);

        Plants pl3 = new Plants("Bazilikas", "Ocimum basilicum",false,"India",0.150,true ); //between 30 and 150 cm

        Plants pl4 = new Plants("Rožė","Rosa", false,"New Zealand",0.090, true);



//        System.out.println(pl);
//        System.out.println();
//        System.out.println(pl2);
//        System.out.println();
//        System.out.println(pl3);
//        System.out.println();
//        System.out.println(pl4);

        ArrayList <Plants> plants = new ArrayList<>();
        plants.add(pl);
        plants.add(pl2);
        plants.add(pl3);
        plants.add(pl4);
        System.out.println(plants);


    }

}

