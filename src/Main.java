
public class Main {
    public static void main(String[] args) { 

        Pessoa pessoa = new Pessoa();
            
        pessoa.saberIdade(50);

        if (pessoa.getIdade() <= 127){
            System.out.println("Você está vivendo normalmente com " + pessoa.getIdade() + " anos de idade");
        }else{
            System.out.println("Você vive com " + pessoa.getIdadeQuaseImpossivel() + " anos de idade, e viveu muito tempo");
            pessoa.setIdadeQuaseImpossivel((short)0);
        }

        pessoa.saberIdade(130);

        if ((pessoa.getIdade() <= 127) && (pessoa.getIdadeQuaseImpossivel() <= 127)){
            System.out.println("Você está vivendo normalmente com " + pessoa.getIdade() + " anos de idade");
        }else{
            System.out.println("Você está com " + pessoa.getIdadeQuaseImpossivel() + " anos de idade, e viveu muito tempo");
            pessoa.setIdadeQuaseImpossivel((short)0);
        }

        System.out.println("Você e do sexo: " + pessoa.getSexoM());
        System.out.println("Você é do sexo: " + pessoa.getSexoF());

        System.out.println("A fazenda tem: " + pessoa.getMetrosQuadradosFazenda() + " Metros quadrados");
        System.out.println("A cidade tem : " + pessoa.getMetrosQuadradosCidade() + " Metros quadrados");

        pessoa.setAltura(1.80f);
        System.out.println("Sua altura é: " + pessoa.getAltura());

        pessoa.setPeso(80.20);
        System.out.println("Seu peso é: " + pessoa.getPeso());

        pessoa.setEstaVivo(true);
        
        if (pessoa.getEstavivo() == true){
            System.out.println("Você está vivo!");
        }else{
            System.out.println("Você está morto");
        }
    

    }
}