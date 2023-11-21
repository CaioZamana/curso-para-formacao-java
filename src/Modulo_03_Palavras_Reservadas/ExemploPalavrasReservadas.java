package Modulo_03_Palavras_Reservadas;
public class ExemploPalavrasReservadas {

    // Variáveis para demostrar tipos primitivos
    int abstractVar;
    boolean assertVar;
    boolean booleanVar;
    int breakVar;
    byte byteVar;
    int caseVar;
    char charVar;
    int classVar;
    int constVar;  // 'const' não é utilizado, mas está na lista oficial
    int continueVar;
    int doVar;
    double doubleVar;
    int elseVar;
    int enumVar;
    int extendsVar;
    int finalVar;
    int finallyVar;
    float floatVar;
    int forVar;
    int gotoVar;
    int ifVar;

    // ... continua para cada palavra reservada

    public static void main(String[] args) {
        // Instância da classe para acessar variáveis
        ExemploPalavrasReservadas instancia = new ExemploPalavrasReservadas();

        // Atribuição de valores para algumas variáveis (para evitar erros de compilação)
        instancia.abstractVar = 0;
        instancia.assertVar = true;
        instancia.booleanVar = false;

        instancia.breakVar = 1;
        instancia.byteVar = 5;
        instancia.caseVar = 8;
        instancia.charVar = 'A';
        instancia.classVar = 3;

        // ... atribua valores para cada variável declarada

        // Saída dos valores das variáveis para demonstrar a declaração
        System.out.println("abstractVar: " + instancia.abstractVar);
        System.out.println("assertVar: " + instancia.assertVar);
        System.out.println("booleanVar: " + instancia.booleanVar);
        System.out.println("breakVar: " + instancia.breakVar);
        System.out.println("byteVar: " + instancia.byteVar);
        System.out.println("caseVar: " + instancia.caseVar);
        System.out.println("charVar: " + instancia.charVar);
        System.out.println("classVar: " + instancia.classVar);

        // ... exiba os valores de todas as variáveis declaradas
    }
}
