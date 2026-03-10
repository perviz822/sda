package lotr.regions;
import lotr.enemies.*;

 public abstract class Region {

     public void initiateBattleWorkFlow(){
       Enemy instance = createEnemy();
       spawnEnemies(instance);
       moveEnemies(instance);
       updateBattleLog(instance);
       checkCombatLogs(instance);

     };

     abstract void spawnEnemies(Enemy instance);
     abstract void moveEnemies(Enemy instance);
     abstract void checkCombatLogs(Enemy instance);
     abstract void updateBattleLog(Enemy instance);
     abstract  Enemy createEnemy();


    
}
