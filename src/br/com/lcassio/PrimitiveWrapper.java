package br.com.lcassio;

public class PrimitiveWrapper {

    public static void main(String args[]) {
        // Valor primitivo
        int primitiveValue = 15;

        // Conversão em wrapper
        Integer wrapperValue = Integer.valueOf(primitiveValue);

        // Imprimindo valor primitivo
        System.out.println("Primitive Value: " + primitiveValue);

        // Imprimindo valor wrapper
        System.out.println("Wrapper Value: " + wrapperValue);
    }
}
