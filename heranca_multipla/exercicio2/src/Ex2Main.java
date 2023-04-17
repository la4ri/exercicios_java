public class Ex2Main {
    public static void main(String[] args) throws Exception {

        Funcionario funcionario = new Funcionario("Larissa", 1231231312, 123123213, 2000.00);
        funcionario.aumento();
        funcionario.exibDados();

        Administrativo administrativo = new Administrativo("Evandro", 369393996, 369369369, 2000.0, 123456, "noturno");
        administrativo.aumento();
        administrativo.exibDados();

        Assistente assistente = new Assistente("Vicente", 852852584, 123456789, 2000.0, 987654);
        assistente.aumento();
        assistente.exibDados();

        Gerente gerente = new Gerente("Guilherme", 1234567891, 325852456, 3000.0, "alto");
        gerente.aumento();
        gerente.exibDados();

        Tecnico tecnico = new Tecnico("Francisco", 587456982, 125745889, 2000.0, 587587);
        tecnico.aumento();
        tecnico.exibDados();
    }
}
