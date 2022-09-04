package AugaluProjektas;

public class Plants {

    private String name;
    private String latinName;
    private boolean oneYear;
    private String continent;
    private double height;
    private boolean canEat;


    public Plants(){

    }

    public Plants(String name, String latinName, boolean oneYear, String continent, double height, boolean canEat) {
        this.name = name;
        this.latinName = latinName;
        this.oneYear = oneYear;
        this.continent = continent;
        this.height = height;
        this.canEat = canEat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLatinName() {
        return latinName;
    }

    public void setLatinName(String latinName) {
        this.latinName = latinName;
    }

    public boolean isOneYear() {
        return oneYear;
    }

    public void setOneYear(boolean oneYear) {
        this.oneYear = oneYear;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public boolean isCanEat() {
        return canEat;
    }

    public void setCanEat(boolean canEat) {
        this.canEat = canEat;
    }


    public String toString(){
        return  "\n"+
                "Augalo " +
                "Vardas = "+ name + "\n"+
                "Lotyniškas pavadinimas = " + latinName +"\n"+
                "Ar augalas vienmetis = " + (oneYear ? "Vinemetis" : "Daugiametis" )+"\n"+
                "Iš kurio žemyno kilęs = " + continent + "\n"+
                "Suaugusio augalo aukštis = " + height + "m" +"\n"+
                "Ar augalas valgomas = " + (canEat ? "Taip" : "Ne")+"\n";
    }
}
