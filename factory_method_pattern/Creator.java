package factory_method_pattern;

abstract class Creator {
    abstract DocumentParser createParser();

    String parsefile( String filepath) {
         return createParser().parsefile(filepath);
    }

    
}
