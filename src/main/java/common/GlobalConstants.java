package common;

import lombok.Getter;

@Getter
public class GlobalConstants {
    private static GlobalConstants globalConstants;

    public static synchronized GlobalConstants getGlobalConstants(){
        if(globalConstants == null){
            globalConstants = new GlobalConstants();
        }
        return globalConstants;
    }

    private final long shortTimeout = 15;
    private final long longTimeout = 30;

    private final String projectPath = System.getProperty("user.dir");
    private final String osName = System.getProperty("os.name");
    private final String separator = System.getProperty("file.separator");
    private final String dataTestPath = projectPath + separator + "dataTest" + separator;

    private final String adminEmail = "admin@yourstore.com";
    private final String adminPassword = "admin";
}
