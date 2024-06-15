package ClientServer;

import ClientServer.client.ClientController;
import ClientServer.client.ClientGUI;
import ClientServer.server.ServerController;
import ClientServer.server.FileStorage;
import ClientServer.server.ServerWindow;

public class Main {
    public static void main(String[] args) {
        ServerController serverController = new ServerController(new ServerWindow(), new FileStorage());

        new ClientController(new ClientGUI(), serverController);
        new ClientController(new ClientGUI(), serverController);
    }
}