package exercicios.exercicio04;

public class Relogio {
    // atributos
    private int hora, minuto, segundo;

    // construtor
    public Relogio(int hora, int minuto, int segundo) {
        setHora(hora);
        setMinuto(minuto);
        setSegundo(segundo);
    }

    public void setHora(int hora) {
        if (hora >= 0 && hora <= 24) {
            this.hora = hora;
        }
    }

    public void setMinuto(int minuto) {
        if (minuto >= 0 && minuto < 60) {
            this.minuto = minuto;
        }
    }

    public void setSegundo(int segundo) {
        if (segundo >= 0 && segundo < 60) {
            this.segundo = segundo;
        }
    }

    public String exibir() {
        // System.out.printf("%02d:%02d:%02d\n", hora, minuto, segundo);
        return String.format("%02d:%02d:%02d", hora, minuto, segundo);
    }

}
