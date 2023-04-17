public class Ex3Main {
    public static void main(String[] args) throws Exception {
        Vip vip = new Vip(100.0, 50.0);
        vip.imprimeValor();
        vip.imprimeIngressoVip();

        Normal normal = new Normal(80.0);
        normal.imprimeValor();
        normal.imprimeIngressoNormal();
    }
}
