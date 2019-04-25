package net.fisher.utils;

import net.fisher.constant.PathConstant;

import java.io.File;
import java.nio.file.Path;

public class PathUtil {
    public static String getPath() {
//        System.out.println(System.getProperty("file.separator"));
//        System.out.println(File.separator);

        String path = "";
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.startsWith("mac")) {
            path = PathConstant.MAC_PATH;
        } else if (osName.startsWith("win")) {
            path = PathConstant.WIN_PATH;
        } else if (osName.startsWith("linux") || osName.startsWith("unix")) {
            path = PathConstant.UNIX_LINUX_PATH;
        } else {
            path = "";
        }
        return path;
    }
}
