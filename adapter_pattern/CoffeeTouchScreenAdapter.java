package adapter_pattern;

public class CoffeeTouchScreenAdapter  implements CoffeMachineInterface  {
    private OldCoffeeMachine oldMachine;

    public void  CoffeeTouchscreenAdapter(OldCoffeeMachine oldMachine) {
        this.oldMachine= oldMachine;
    }

    
       @Override
       public void chooseFirstSelection(){
         oldMachine.selectA();
       }


       @Override
       public void chooseSecondSelection(){
         oldMachine.selectB();
       }

    
}
