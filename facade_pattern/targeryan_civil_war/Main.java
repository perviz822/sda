package facade_pattern.targeryan_civil_war;

public class Main {

    public  static void main (String [] args){
        //create rider
        Rider aegon = new Rider("Aegon","Targeryan");
        Dragon balerion = new Dragon(250,"Balerion",aegon);
        balerion.supplyFood();
        balerion.planFlightPath();
        balerion.alertVillagers();
        
    }
    
}
