import java.util.Arrays;

public class Principal {
    /*
     * A função recebe um inteiro entre 1 e 12 e retorna o mês correspondente por
     * extenso. Caso o mês informado não esteja entre 1 e 12, deverá ser retornado
     * "Mes Inexistente"
     * Ex: input: 1 - output: "Janeiro"
     * Ex: input: 13 - output: "Mês Desconhecido"
     */

    public static String returnMonth(int numberMonth) {
        switch (numberMonth) {
            case 1:
                return "Janeiro";
            case 2:
                return "Fevereiro";
            case 3:
                return "Março";
            case 4:
                return "Abril";
            case 5:
                return "Maio";
            case 6:
                return "Junho";
            case 7:
                return "Julho";
            case 8:
                return "Agosto";
            case 9:
                return "Setembro";
            case 10:
                return "Outubro";
            case 11:
                return "Novembro";
            case 12:
                return "Dezembro";
            default:
                return "Mês Desconhecido";
        }
    }

    /*
     * A função deverá receber um array com pelo menos 3 itens e retornar a média
     * simples de todos os itens do array.
     * Caso o array recebido possua menos que 3 itens, deverá ser retornado o
     * boleano false.
     * Ex: input: [4,6,8] - output 6
     * Ex: input: [1,2] - output false
     */
    public static void returnAverage(int[] numbers) {
        int sum = 0;
        if (numbers.length > 2) {
            for (int i = 0; i < numbers.length; i++) {
                sum += numbers[i];
            }
            int result = sum / numbers.length;
            System.out.println(result);
        } else {
            System.out.println(false);
        }
    }

    /*
     * Recebe um array de inteiros maiores que zero e retorna a quantidade de
     * números pares existentes no array
     * Ex: input: [1,2,3,4,5] - output: 2
     */
    public static int quantityPair(int[] pairs) {

        int qtd = 0;
        for (int i = 0; i < pairs.length; i++) {
            if (pairs[i] % 2 == 0) {
                qtd += 1;
            }
        }
        return qtd;
    }

    /*
     * A função deverá receber uma string e retornar a mesma invertida.
     * Ex: input: "bar" - output: "rab"
     */
    public static String reverseString(String sentence) {
        return new StringBuilder(sentence).reverse().toString();
    }

    /*
     * A função deverá receber uma string e substituir todas as vogais da mesma pelo
     * sinal '?'
     * Ex: input: 'Bar' - output: 'B?r'
     */
    public static String changeVowel(String sentence) {
        return sentence = sentence.replaceAll("a", "?").replaceAll("e", "?").replaceAll("i", "?").replaceAll("o", "?")
                .replaceAll("u", "?");
    }

    /*
     * A função deverá receber um array de inteiros como parâmetro e deverá retornar
     * o mesmo array ordenado em ordem crescente.
     * Ex: Input: [5,1,0,7,3,3] - Output: [0,1,3,3,5,7]
     */
    public static void sortNumbers(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    /*
     * A função irá receber um array de inteiros e retornar o primeiro elemento não
     * repetido.
     * Ex: input: [2,2,3,1,1,6] - output: 3
     */
    public static int onlyElement(int[] arr) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            result = result ^ arr[i];
        }
        return result;
    }

    /*
     * A função será utilizada em um sistema de caixa.
     * Ela receberá um valor inteiro, representando o valor a ser sacado e um array
     * contendo quais tipos de cédulas ela tem disponível.
     * O array de cédulas disponiveis indica quais valores de cédulas existirão no
     * caixa, a quantidade das mesmas é ilimitada. No caso do input [2,5,50], o
     * caixa terá quantidades ilimitadas de notas de 2, 5 e 50 para devolver ao
     * cliente.
     * A função deverá retornar o mínimo de cédulas necessarias possivel para o
     * saque em formato de um array, cuja chave seja o valor da cédula e o valor a
     * quantidade daquela cédula que será sacada.
     * 
     * Ex: input: 150 & [5, 50, 100] - output: ["100"=>1, "50"=>1].
     * Ex: input: 150 e [2, 5, 10] - output: ["10"=>15].
     */
    public static void menorNumeroNotas(int valor, int[] celulasDisp) {
        int soma, i = 0;
        while (true) {
            if (soma + celulasDisp[i] > valor) {
                i++;
            } else {
                if (valor - (soma + celulasDisp[i]) != 1) {
                    
                } else {
                    
                }
            }
        }
    }

    public static void main(String[] args) {
        // Ex01
        // System.out.println(returnMonth(5));

        // Ex02
        // int[] ex02 = {1,2,3};
        // returnAverage(nmrs);

        // Ex03
        // int[] ex03 = {1,2,3,4};
        // System.out.println(quantityPair(ex03));

        // Ex04
        // System.out.println(reverseString("bar"));

        // Ex05
        // System.out.println(changeVowel("sopa de letrinha"));

        // Ex06
        // int[] ex06 = {5,2,1,4};
        // sortNumbers(ex06);

        // Ex07
        // int[] ex07 = {2,2,3,1,1};
        // int[] ex07_1 = {2,2,11,1,1};
        // System.out.println(onlyElement(ex07));
        // System.out.println(onlyElement(ex07_1));


        //Escreva a diferença entre interfaces, instancias, objetos e classes no contexto de orientação a objeto:
        
        /*Classes são um meio de definir um molde do que queremos representar, já objetos, são instâncias dessa classe, que passa a representar o que queremos nos referir a partir da classe, um exemplo é a Classe Veiculo, podemos ter objetos referenciando Carros, Caminhões, Tratores e entre outros. 
         * Interface, diferentemente da classe, que possuí seus métodos já construidos, a Interface possuí apenas a declaração dos mesmos sem a implementação, tendo assim que ser implementados pela classe que estará utilizando
        */
    }
}
