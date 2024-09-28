package FactoryDesignPattern.SimpleFactory.Database;

public class DatabaseFactory {
    public static Database generateDatabaseObject(String dbName) {
        if(dbName.equalsIgnoreCase("Mysql")) {
            return new MySQL();
        }

        else if(dbName.equalsIgnoreCase("PostGreSQL")) {
            return new PostGreSQL();
        }

        else if(dbName.equalsIgnoreCase("MongoDB")) {
            return new MongoDB();
        }

        return null;
    }
}
