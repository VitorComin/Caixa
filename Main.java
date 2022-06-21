class Main {
    public static void main(String[] args) {

        Caixa<Integer> caixa1 = new Caixa<>();
        
        caixa1.guardar(2);
        caixa2.guardar(2);
        caixa1.retirar(2);

        Caixa<String> caixa2 = new Caixa<>();
        
        caixa2.guardar("Item");
        caixa2.guardar("Item");
        caixa2.retirar("Item");

    }
}
