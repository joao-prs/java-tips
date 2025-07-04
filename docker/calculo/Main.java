import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpExchange;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

public class Main {

    public static void main(String[] args) throws IOException {
        int port = 9000;
        HttpServer server = HttpServer.create(new InetSocketAddress(port), 0);
        server.createContext("/", new MyHandler());
        server.setExecutor(null); // Cria um executor padrão
        server.start();
        System.out.println("Servidor iniciado na porta " + port);
        System.out.println("Acesse: http://localhost:" + port);
    }

    static class MyHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange t) throws IOException {
            // Definindo os números para o cálculo
            double num1 = 10.0;
            double num2 = 5.0;
            double num3 = 2.0;
            double divisor = 3.0;
            double multiplicador = 4.0;

            // 1. Somatória
            double sum = num1 + num2 + num3;

            // 2. Divisão
            double divisionResult = sum / divisor;

            // 3. Multiplicação
            double finalResult = divisionResult * multiplicador;

            // Criando a resposta HTML
            String response = "<html><head><title>Calculadora Java</title>" +
                              "<style>" +
                              "body { font-family: 'Inter', sans-serif; display: flex; flex-direction: column; justify-content: center; align-items: center; height: 100vh; margin: 0; background-color: #f0f2f5; color: #333; }" +
                              ".container { background-color: #ffffff; padding: 30px; border-radius: 12px; box-shadow: 0 4px 15px rgba(0, 0, 0, 0.1); text-align: center; max-width: 500px; width: 90%; }" +
                              "h1 { color: #007bff; margin-bottom: 20px; }" +
                              "p { font-size: 1.1em; line-height: 1.6; }" +
                              "strong { color: #28a745; }" +
                              "</style>" +
                              "</head><body>" +
                              "<div class=\"container\">" +
                              "<h1>Resultado do Cálculo</h1>" +
                              "<p>Números utilizados: " + num1 + ", " + num2 + ", " + num3 + "</p>" +
                              "<p>Divisor: " + divisor + "</p>" +
                              "<p>Multiplicador: " + multiplicador + "</p>" +
                              "<p>Cálculo: <strong>( (" + num1 + " + " + num2 + " + " + num3 + ") / " + divisor + " ) * " + multiplicador + "</strong></p>" +
                              "<p>Resultado da Somatória: <strong>" + String.format("%.2f", sum) + "</strong></p>" +
                              "<p>Resultado da Divisão: <strong>" + String.format("%.2f", divisionResult) + "</strong></p>" +
                              "<p>Resultado Final: <strong>" + String.format("%.2f", finalResult) + "</strong></p>" +
                              "</div>" +
                              "</body></html>";

            // Enviando os cabeçalhos da resposta
            t.getResponseHeaders().set("Content-Type", "text/html; charset=UTF-8");
            t.sendResponseHeaders(200, response.getBytes().length);

            // Escrevendo o corpo da resposta
            OutputStream os = t.getResponseBody();
            os.write(response.getBytes());
            os.close();
        }
    }
}