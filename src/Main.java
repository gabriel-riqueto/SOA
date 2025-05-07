import Vinhicola.VinhicolaServerpl;

import javax.xml.ws.Endpoint;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Web Service está no ar!");
        Endpoint.publish("http://127.0.0.1:9876/Vinhicola", new VinhicolaServerpl());
        }
    }
