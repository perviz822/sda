package lotr.regions;
import lotr.enemies.*;
public class Moria  extends Region{

    

   


    public  Enemy createEnemy(){
        return new Goblin();
    }
    public void spawnEnemies(Enemy instance){
        System.out.println("Enemies spawned");
       
    }

    public void checkCombatLogs(Enemy instance){
         System.out.println("Combat logs checked");

    }

     public void updateBattleLog(Enemy instance){
         System.out.println("Battle log updated");

    }
     public void moveEnemies(Enemy instance){
         System.out.println("Enemies moved");

    }
    
}
