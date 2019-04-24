package net.fisher.utils;

public class PropertiesUtilTest {

    public static void main(String[] args) {

        //System.out.println(p.readProperty("db.url"));
        PropertiesUtil q = new PropertiesUtil("ConfigurableFactory.properties");
        PropertiesUtil.writeProperty("a.properties", "myUtils", "wang");
        PropertiesUtil p = new PropertiesUtil("a.properties");
        System.out.println(p.getProperties().get("myUtils"));

        System.exit(0);
    }
}
