package by.andd3dfx.logger;

import java.io.StringWriter;

public class LogsCollector {

    private static final StringWriter writer = new StringWriter();

    public static void append(String s) {
        writer.append(s);
    }

    public static String text() {
        return writer.toString();
    }
}
