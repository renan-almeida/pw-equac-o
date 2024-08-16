public class equacao {
    public int a;
    public int b;
    public int c;
    public int delta;

    public void CalcDelta() {
        delta = b*b - 4 * a * c;
    }

    public String raiz() {
        String mensagem;
        if (delta < 0)
            mensagem = "Não existe raiz real";
        else if (delta == 0)
            mensagem = "Existe uma raiz real";
        else
            mensagem = "Existem duas raizes reais";
                    return mensagem;
    }

}
