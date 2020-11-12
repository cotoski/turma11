package exercicios.exercicio06;

public class Robo {
    private int x, y;
    private final int MAX_X;
    private final int MAX_Y;

    public Robo(int maxX, int maxY){
        if(maxX > 0 && maxY > 0){
            MAX_X = maxX;
            MAX_Y = maxY;
        }else{
            MAX_X = 10;
            MAX_Y = 10;            
        }
    }

    public void moverNorte(){
        if(y < MAX_Y ){
            y++;
        }
    }

    public void moverSul(){
        if(y > -MAX_Y ){
            y--;
        }
    }
    public void moverLeste(){
        if(x < MAX_X ){
            x++;
        }
    }

    public void moverOeste(){
        if(x > -MAX_Y ){
            x--;
        }
    }

    public String posicaoAtual(){
        return x + ":" + y;
    }

}