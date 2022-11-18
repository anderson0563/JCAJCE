import javax.crypto.*;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class Main {
    public static void main(String[] args) throws NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, BadPaddingException, InvalidKeyException {

        KeyGenerator keygenerator = KeyGenerator.getInstance("DES");
        SecretKey desKey = keygenerator.generateKey();


        byte[] resposta = (new Encriptar()).textoEncriptado(desKey);
        System.out.println(String.valueOf(resposta));
        System.out.println((new Decriptar()).textoClaro(resposta, desKey));
    }
}
