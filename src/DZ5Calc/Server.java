package DZ5Calc;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


public class Server {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(1234)) {
            System.out.println("Сервер запущен, ожидаем соединение....");
            Socket socket = serverSocket.accept();
            System.out.println("Клиент подключился к серверу!");
            DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
            DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());

            while (true) {
                String clientRequest = dataInputStream.readUTF();
                if (clientRequest.equals("end")) break;
                System.out.println("Мы получили строку: " + clientRequest);
                dataOutputStream.writeUTF("Reshenie " + result(clientRequest));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static Double result(String vyrajenie){
        Double result=0.0;
        String[] num=null;
        if (vyrajenie.contains("/")){
            num=vyrajenie.split("/");

            result=Double.parseDouble(num[0].toString())/Double.parseDouble(num[1].toString());
        }
        if (vyrajenie.contains("*")){
            num=vyrajenie.split("*");
            result=Double.parseDouble(num[0].toString())*Double.parseDouble(num[1].toString());
        }
        if (vyrajenie.contains("+")){
            num=vyrajenie.split("+");
            result=Double.parseDouble(num[0].toString())+Double.parseDouble(num[1].toString());
        }
        if (vyrajenie.contains("-")){
            num=vyrajenie.split("-");
            result=Double.parseDouble(num[0].toString())-Double.parseDouble(num[1].toString());
        }

        return result;
    }
}
