package exemplos;

import java.util.HashMap;

public class Exemplo03 {
    public static void main(String[] args) {
        // HashMap< Key, Dado >
        HashMap<Integer, String> mapa = new HashMap<>();

        mapa.put(111, "Emerson");
        mapa.put(222, "Reginaldo");
        mapa.put(333, "Camila");
        mapa.put(444, "Renata");

        System.out.println(mapa.get(111));
        System.out.println(mapa.get(112));

    }
}
