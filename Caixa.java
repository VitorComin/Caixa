public class Caixa<T> {

    T objeto;

    public void guardar(T object) {
        if (this.objeto == null ) {
            this.objeto = obj;
            System.out.println("Objeto" + this.objeto.getClass().getTypeName() + "adicionado");
        } else {
            System.out.println("A caixa já tem objeto");
        }
    }

    public void retirar(T object) {
        if (this.objeto != null) {
            this.objeto = null;
            System.out.println("Objeto" + object.getClass().getName() + "removido" );
        }
    }

}
