public class Bruxa extends Monstro{

    private Feitico[] feiticos = new Feitico[10];

    public Bruxa(int idade, int vida, int energia) {
        super(idade, vida, energia);
    }

    public boolean aprenderFeitico(String nome, int poder){
            for (int i = 0; i < this.feiticos.length; i++) {
                if(feiticos[i] == null){
                    this.feiticos[i] = new Feitico(nome, poder);
                    break;
                }
                System.out.println("Não aprendeu nada");
                return false;
        }
        System.out.println("Aprendeu feitiço" + nome );

            return true;
    }

    public void listarFeiticos(){

    }

    public void esquecerFeitico(int posicao){

    }

    public void lancarFeitico(Monstro monstroAlvo, int posicao){

    }
}
