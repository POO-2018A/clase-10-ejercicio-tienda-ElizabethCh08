package ejercicioTienda;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        Tienda [] tienda = new Tienda[1];

        System.out.println("Ingrese el nombre de la tienda: ");
        String nombreTienda = scan.nextLine();
        System.out.println("Ingrese la direccion: ");
        String direccion = scan.nextLine();

        tienda[0] = new Tienda (nombreTienda,direccion);
        System.out.println("El nombre de la tienda es: "+tienda[0].getNombre());
        System.out.println("La direccion es: "+tienda[0].getDireccion());

        int opcion=0;
        int productost=0;
        String marca;
        String codigo;
        String tipo;
        Double precio;

        Tienda[] producto = new Tienda[10];


        do{
            System.out.println("\tMENU PRINCIPAL");
            System.out.println("  1.- Ingresar nuevo producto");
            System.out.println("  2.- Visualizar lista de productos");
            System.out.println("  3.- Salir");
            opcion = scan.nextInt();

            switch(opcion){
                case 1:
                    System.out.println("Cuantos productos desea ingresar ");
                    productost=scan.nextInt();
                    scan.nextLine();
                    System.out.println("Ingrese la marca del producto: ");
                     marca = scan.nextLine();
                    System.out.println("Ingrese el codigo: ");
                     codigo = scan.nextLine();
                    System.out.println("Ingrese el tipo: (Comida, Tecnologia, Belleza)");
                     tipo = scan.nextLine();
                    System.out.println("Ingrese el precio: ");
                     precio = scan.nextDouble();
                    producto [productost] = new Tienda(marca,codigo,tipo,precio);
                    productost++;
                    System.out.println(" ");
                    break;
                case 2:

                    if(productost == 0){
                        System.out.println("No existe ningun producto");
                    }
                    for(int i=0; i<productost ; i++){
                        System.out.println("Producto " + (i+1)+" :" );
                        System.out.println("Marca: " + producto[i].getMarca());
                        System.out.println("Codigo: " + producto[i].getCodigo());
                        System.out.println("Tipo: " + producto[i].getTipo());
                        System.out.println("Precio: " + producto[i].getPrecio()+" $");
                        System.out.println(" ");
                    }

                    break;
                case 3:
                    System.out.println("Adios");
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }
        }while(opcion!=3);




    }

}
