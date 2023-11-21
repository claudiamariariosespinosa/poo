import javax.swing.*;

public class zapatos {

    //ATRIBUTOS
    String Nombre;
    String marca;
    String color;
    String textura;

    public static void main(String[] args) {
        zapatos botin = new zapatos();
        botin.Nombre = "botin";
        botin.marca = "lauress";
        botin.color = "negro";
        botin.textura = "suave";
        JOptionPane.showMessageDialog(null,"bienvenidos al almacen de zapatos de claudia");
        JOptionPane.showMessageDialog(null, "=====================================================\n"
                + ("modelo 1\n"
                + ("nombre\n: " + botin.Nombre)
                + ("marca: '\n" + botin.marca)
                + ("color: '\n" + botin.color)
                + ("textura: '\n" + botin.textura)
                + "este zapato proteje el pie brindando seguridad\n"
                + "====================================================="));



    zapatos sandalia = new zapatos();
    sandalia.Nombre="sandalias";
    sandalia.marca="sofi";
    sandalia.color="rosa palo";
    sandalia.textura="liso";
        JOptionPane.showMessageDialog(null,"=====================================================\n"
                +("modelo 2")
                +("nombre\n: "+sandalia.Nombre)
            +("marca: '\n"+sandalia.marca)
            +("color: '\n"+sandalia.color)
            +(" textura: '\n"+sandalia.textura)
            +"este zapato proteje el pie brindando seguridad\n"
            +"=====================================================");
        zapatos moscassine = new zapatos();
        moscassine.Nombre="mocassine";
        moscassine.marca="zabatini";
        moscassine.color="azul";
        moscassine.textura="suave";
        JOptionPane.showMessageDialog(null,"=====================================================\n"
                +("modelo no.3\n")
                +("nombre\n: "+    moscassine.Nombre)
                +("marca: '\n"+    moscassine.marca)
                +("color: '\n"+    moscassine.color)
                +("textura: '\n"+  moscassine.textura)
                +"este zapato proteje el pie brindando seguridad\n"
                +"=====================================================");




    }



}
