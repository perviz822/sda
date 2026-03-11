package facade_pattern.targeryan_civil_war;

public class Dragon {
    public int age;
    public String name;
    public Rider rider;

    public Dragon(int age, String name, Rider rider){
        this.age = age;
        this.rider=rider;
        this.name=name;

    }


    public void supplyFood(){
        System.out.println(name + " " + "was supplied with food");
    }
    public  void planFlightPath(){
         System.out.println(name + " " + "was provided with flight route");
    }
    public void  alertVillagers(){
        System.out.println("The Villagers were alerted from " + "Dragon" + name);
    }
   

}
