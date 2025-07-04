public class TiposVariaveis {
    byte idade = 123;
    short ano = 2021;
    int cep = 60442464;
    long cpf = 12345678900L;
    float pi = 3.14F;
    double salario = 1275.33;

    short numeroCurto = 1;
    int numeroNormal = numeroCurto;
    short numeroCurto2 = (short)numeroNormal; //casting 

    final double VALOR_DE_PI = 3.141592653589; //Definição de Constante (Não pode mudar seu valor)
}
