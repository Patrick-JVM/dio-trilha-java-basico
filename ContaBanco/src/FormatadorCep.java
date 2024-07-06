

public class FormatadorCep {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("244465.5");
            String replace = cepFormatado.replaceAll("\\.","");
            System.out.println(replace);
        } catch (CepInvalidoException e) {
            System.out.println("O seu cep precisa conter 8 digitos");
        
        }
    }
    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8){
            throw new CepInvalidoException();
        } else return cep;
        
    }
}
        