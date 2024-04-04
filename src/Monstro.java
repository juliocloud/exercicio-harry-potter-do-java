public class Monstro {
    private int idade;
    private int vida;
    private int energia;

    public Monstro(int idade, int vida, int energia) {
        this.idade = idade;
        this.vida = vida;
        this.energia = energia;
    }

    public void assustar(Monstro monstroAlvo){
        System.out.println("Assustando meu mano ");
        System.out.println(monstroAlvo.toString());
    }

    public int getIdade() {
        return idade;
    }

    public int getVida() {
        return vida;
    }

    public int getEnergia() {
        return energia;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }
}
