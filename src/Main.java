import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Sistema sis = new Sistema();
        Persona p1 = new Persona("Facu Arriaran", "Arias 321");
        Persona p2 = new Persona("Gian Fornasari", "Arias 321");
        Persona p3 = new Persona("Rama", "Arias 321");
        Persona p4 = new Persona("Tomas", "Arias 321");
        Persona p5 = new Persona("Pepe", "Arias 321");
        Persona p6 = new Persona("Conio", "Arias 321");
        sis.registrarPersona("Facu Arriaran", "Arias 321");
        sis.registrarPersona("Gian Fornasari", "Arias 321");
        sis.registrarPersona("Rama", "Arias 321");
        sis.registrarPersona("Tomas", "Arias 321");
        sis.registrarPersona("Pepe", "Arias 321");
        sis.registrarPersona("Conio", "Arias 321");

        sis.registrarProducto("Chocolate","Choco", 55.2,100, p1);
        sis.registrarProducto("Arroz","Choco", 12.2,100, p2);
        sis.registrarProducto("Fideos","Choco", 25.2,150, p3);
        sis.registrarProducto("Leche","Choco", 35.2,300, p4);
        sis.registrarProducto("Agua","Choco", 95.2,40, p5);
        sis.registrarProducto("Chocolate","Choco", 55.2,100, p3);
        sis.registrarProducto("Arroz","Choco", 12.2,100, p4);
        sis.registrarProducto("Fideos","Choco", 25.2,150, p5);
        sis.registrarProducto("Leche","Choco", 35.2,300, p2);
        sis.registrarProducto("Agua","Choco", 95.2,40, p1);

        System.out.println(sis.buscarPersona("Gian Fornasari").getNombre());
        List<Producto> prods = sis.buscarProducto("Chocolate");
        System.out.println(sis.buscarProducto("Chocolate"));

    }
}