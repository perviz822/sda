package command_pattern.without_command;

public class Main {
    public static void  main(String [] args){
         Gandalf gandalf = new Gandalf();
         Door door = new Door();
         gandalf.openDoor(door);
         gandalf.closeDoor(door);
    }
    
}
