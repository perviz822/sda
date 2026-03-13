package singleton_pattern;

public class Gandalf {
    private static  Gandalf instance;

    public static  Gandalf getGandalf(){
        if (instance ==null){
            return  new Gandalf();
        }
        return instance;
    }

    public void issueOrder(String order){
        System.out.println("Gandalf commands:" + order);

    }


    
}
