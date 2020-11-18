package exercicios.exercicio02;

/*  
    Dependendo do contexto, temos 3 formas diferentes de refencia para o construtor
    
    Placar(); -  em outra classe (App)
    super();  -  quanto temos herança (subclasse chamando o contrutor da superclasse)
    this();   -  dentro da mesma classe, usando um construtor sobrecarregado
   
*/
public class Placar {
    private String nomeTime1, nomeTime2;
    private int golsTime1, golsTime2;

    public Placar() {
/*         this.nomeTime1 = "Time da casa";
        this.nomeTime2 = "Visitante"; */
        this("Time da casa", "Visitante");  //utiliza o construtor com 2 parâmetros
    }

    public Placar(String nomeTime1, String nomeTime2) {
        this.nomeTime1 = nomeTime1;
        this.nomeTime2 = nomeTime2;
/*         golsTime1 = 0;
        golsTime2 = 0; */
        //this(nomeTime1, nomeTime2, 0, 0);
    }

    public Placar(String nomeTime1, String nomeTime2, int golsTIme1, int golsTime2) {
        this.nomeTime1 = nomeTime1;
        this.nomeTime2 = nomeTime2;
        this.golsTime1 = golsTIme1;
        this.golsTime2 = golsTime2;
    }

    @Override
    public String toString() {
        return nomeTime1 + " " + golsTime1 + " X " + golsTime2 + " " + nomeTime2;
    }

}
