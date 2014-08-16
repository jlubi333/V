package util;

import java.io.InputStream;

public abstract class GameResources {
    private static final String RESOURCE_DIRECTORY = "/res/";

    public static InputStream getPathToResource(String res) {
        return GameResources.class.getResourceAsStream(RESOURCE_DIRECTORY + res);
    }
}
