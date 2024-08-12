package FactoryDesignPattern.SimpleFactory;

import FactoryDesignPattern.SimpleFactory.Database.Database;

import javax.management.Query;

public class Client {
    public static void main(String[] args) {

        String dbName = "MySQL";
        Database db = Database.createDatabaseObject(dbName);

    }
}
