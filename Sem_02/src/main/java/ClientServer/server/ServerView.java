package ClientServer.server;

import ClientServer.server.ServerController;

public interface ServerView {
    void showMessage(String message);
    void setServerController(ServerController serverController);

}
