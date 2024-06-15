package ClientServer.server;

public interface LogInOut {
    void saveInLog(String text);
    String readLog();
    void appendLog(String text);

}
