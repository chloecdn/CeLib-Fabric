package de.celinadev.celibfabric.logging;

import org.apache.logging.log4j.LogManager;

public class TextLogging {

    public static void info(String prefix, String text) {
        LogManager.getLogger(prefix).info(text);
    }

    public static void warn(String prefix, String text) {
        LogManager.getLogger(prefix).warn(text);
    }

    public static void error(String prefix, String text) {
        LogManager.getLogger(prefix).error(text);
    }
}
