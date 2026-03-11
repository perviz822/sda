package facade_pattern.targeryan_civil_war;

public class DragonFacade {
    
    public void initiateDragon(String riderName,String riderHouse, String dragonName,int dragonAge){

        Rider rider = new Rider(riderName,riderHouse);
        Dragon balerion = new Dragon(dragonAge,dragonName,rider);
        balerion.supplyFood();
        balerion.planFlightPath();
        balerion.alertVillagers();

    }
    
}
