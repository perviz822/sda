package factory_method_pattern;

public class ExcellCreator  extends Creator{
    public ExcellParser createParser(){
        return new ExcellParser();
    }
    
}
