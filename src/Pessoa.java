public class Pessoa {
  
    private byte idade = 0;
    private short idadeQuaseImpossivel = 0;
    private float altura = 0;
    private char sexoM = 'M';
    private char sexoF = 'F';
    private double peso = 0;
    private boolean estaVivo = true;

    private int metrosQuadradosFazenda = 2147483647; //Esse valor corresponde ao valor do INT, e tambem pode ser negativo
    private long metrosQuadradosCidade = 9223372036854775807L; 

    public void saberIdade (int i){
        if (i > 127){
            setIdadeQuaseImpossivel((short)i);
        } else {
            setIdade((byte)i);
        }
    }

    public byte getIdade() {
        return idade;
    }

    public short getIdadeQuaseImpossivel() {
        return idadeQuaseImpossivel;
    }

    public float getAltura() {
        return altura;
    }

    public char getSexoM() {
        return sexoM;
    }

    public char getSexoF() {
        return sexoF;
    }

    public double getPeso() {
        return peso;
    }

    public int getMetrosQuadradosFazenda() {
        return metrosQuadradosFazenda;
    }

    public long getMetrosQuadradosCidade() {
        return metrosQuadradosCidade;
    }

    public boolean getEstavivo(){
        return estaVivo;
    }

    public void setIdade(byte idade) {
        this.idade = idade;
    }

    public void setIdadeQuaseImpossivel(short idadeQuaseImpossivel) {
        this.idadeQuaseImpossivel = idadeQuaseImpossivel;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void setSexoM(char sexoM) {
        this.sexoM = sexoM;
    }

    public void setSexoF(char sexoF) {
        this.sexoF = sexoF;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setMetrosQuadradosFazenda(int metrosQuadradosFazenda) {
        this.metrosQuadradosFazenda = metrosQuadradosFazenda;
    }

    public void setMetrosQuadradosCidade(long metrosQuadradosCidade) {
        this.metrosQuadradosCidade = metrosQuadradosCidade;
    }

    public void setEstaVivo(boolean estaVivo) {
        this.estaVivo = estaVivo;
    }
}