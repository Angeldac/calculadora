package calculoadora;

public class Calculoadora {

    public static void main(String[] args) {
        ventana inicio = new ventana();
        inicio.setTitle("calculadora basica");
        inicio.setBounds(500, 100, 400, 600);
        inicio.setResizable(false);
        inicio.insertarPanel();
        inicio.insertarEtiquetas();
        inicio.insertarTexto();
        inicio.insertarBotones();
    }

}
