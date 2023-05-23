package proxy_test;

public class Main {
    public static void main(String[] args) {
        IClient client = new Client("Dada");

        ProxyClient proxyClient = new ProxyClient(client);
        proxyClient.verificareAbonament(true);
        proxyClient.verificareAbonament(false);
    }
}
