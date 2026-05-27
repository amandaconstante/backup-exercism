public class LogLevels {
    
    public static String message(String logLine) {
        String[] subLogLine = logLine.split("]: ");
        return subLogLine[1].trim();
    }

    public static String logLevel(String logLine) {
        String[] subStr = logLine.split("]: ");
        String result = subStr[0].substring(1);
        return result.toLowerCase();
    }

    public static String reformat(String logLine) {
        String result = message(logLine) + " (" + logLevel(logLine) + ")";
        return result;
    }
}
