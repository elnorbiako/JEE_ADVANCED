package pl.coderslab.s3ex1;

public class AppConfig {

    static private AppConfig appConfig;

    private String dbHost;
    private String dbUser;
    private String dbPass;
    private String dbName;

    private AppConfig(){};

    static public AppConfig getConfig(){

        if ( appConfig == null){
            System.out.println("Create new object");
            appConfig = new AppConfig();
            //implement read config file
            appConfig.setDbHost("127.0.0.1")
                    .setDbName("JEE_ADV")
                    .setDbUser("root")
                    .setDbPass("password");
        }

        return appConfig;

    }


    public String getDbHost() {
        return dbHost;
    }

    private AppConfig setDbHost(String dbHost) {
        this.dbHost = dbHost;
        return this;
    }

    public String getDbUser() {
        return dbUser;
    }

    private AppConfig setDbUser(String dbUser) {
        this.dbUser = dbUser;
        return this;
    }

    public String getDbPass() {
        return dbPass;
    }

    private AppConfig setDbPass(String dbPass) {
        this.dbPass = dbPass;
        return this;
    }

    public String getDbName() {
        return dbName;
    }

    private AppConfig setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
}