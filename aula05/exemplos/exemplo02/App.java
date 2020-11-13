package exemplos.exemplo02;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<User> lista = new ArrayList<>();

        User user1 = new User("Emerson", "emerson@gmail.com");
        User user2 = new User("Richard", "richard@gmail.com");
        User user3 = new User("Rebeca", "rebeca@gmail.com");

        lista.add(user1);
        lista.add(user2);
        lista.add(user3);

        for (User item : lista) {
            System.out.println(item.getNome() + "-" + item.getEmail());
        }

    }

}
