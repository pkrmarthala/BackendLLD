package FactoryDesignPattern.SimpleFactory.Database;

public abstract class Database {
    public void connect() {

    }

    public void getURL() {

    }

    public void increasePoolSize() {

    }

    public void getVersion() {

    }

    public static Database createDatabaseObject(String dbName) {
        return DatabaseFactory.generateDatabaseObject(dbName);
    }

}
