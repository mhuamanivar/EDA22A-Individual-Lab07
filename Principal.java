
import java.util.Scanner;

public class Principal {
	
    public static void main(String[] args) {
        
        //Se crean los usuarios
        User u1, u2, u3, u4, u5, u6, u7, u8, u9;
        u1 = new User(1, "Lucia", "luc@unsa.edu.pe");
        u2 = new User(2, "Maria", "mar@unsa.edu.pe");
        u3 = new User(3, "Juan", "jua@unsa.edu.pe");
        u4 = new User(4, "Emerson", "eme@unsa.edu.pe");
        u5 = new User(5, "Nicky", "nic@unsa.edu.pe");
        u6 = new User(6, "Sofía", "sof@unsa.edu.pe");
        u7 = new User(7, "Melsy", "mel@unsa.edu.pe");
        u8 = new User(8, "Nexmy", "nex@unsa.edu.pe");
        u9 = new User(9, "Jorge", "jor@unsa.edu.pe");
        
        //Se crea la tabla de usuarios y se confirma que se encuentra vacía
        TablaHash usuarios = new TablaHash();
        System.out.println("Tabla vacía: "+usuarios.isEmpty()+"\n");
        
        //Se agregan los usuarios a la tabla
        System.out.println("Agregando elementos...\n");
        
        usuarios.put(u1.hashCode(),u1);
        usuarios.put(u2.hashCode(),u2);
        usuarios.put(u3.hashCode(),u3);
        usuarios.put(u4.hashCode(),u4);
        usuarios.put(u5.hashCode(),u5);
        usuarios.put(u6.hashCode(),u6);
        usuarios.put(u7.hashCode(),u7);
        usuarios.put(u8.hashCode(),u8);
        usuarios.put(u9.hashCode(),u9);
        
        //Se imprime la tabla con el método sobreescrito de toString() y se confirma que ya no esta vacía
        System.out.println("TABLA DE USUARIOS");
        System.out.println(usuarios);
        
        System.out.println("Tabla vacía: "+usuarios.isEmpty()+"\n");
        
        //Método para que el profesor pueda probar el código
        test(usuarios);
    }
    
    public static void test (TablaHash usuarios) {
        int opcion = 0;
        
        do {
            Scanner sc = new Scanner(System.in);
            
            //Se escribe el menú para realizar la opción que se escriba (Solo un número de la lista)
            System.out.println("_______________________________________________________________________________");
            System.out.println("MENU\n"
                    + "1. Retorna si la tabla esta vacía.\n"
                    + "2. Retorna cantidad de registros de la tabla.\n"
                    + "3. Retorna si el usuario se encuentra en la tabla según su código.\n"
                    + "4. Retorna si el usuario se encuentra en la tabla según sus datos.\n"
                    + "5. Retorna los datos de un usuario según su código.\n"
                    + "6. Añade un nuevo usuario a la tabla.\n"
                    + "7. Elimina un usuario de la tabla según su código.\n"
                    + "8. Limpiar toda la tabla.\n"
                    + "9. Retorna el hashcode de la tabla.\n"
                    + "10. Imprime toda la tabla.\n"
                    + "11. Salir.");
            
            System.out.println();
            
            //Número del 1 al 11
            System.out.println("Ingrese opción:");
            opcion = sc.nextInt();
            
            System.out.println();
            
            //De acuerdo a la opción se va a uno de los casos y se realiza lo previsto en el menú
            switch (opcion) {
                case 1:
                    System.out.println((usuarios.isEmpty()) ? "La tabla esta vacía." : "La tabla no esta vacía.");
                    break;
                case 2:
                    System.out.println("Cantidad de registros: "+usuarios.size());
                    break;
                case 3:
                    System.out.print("Ingrese código de usuario: ");
                    Integer k1 = sc.nextInt();
                    
                    System.out.println((usuarios.containsKey(k1)) ? "Usuario encontrado." : "Usuario no encontrado.");
                    break;
                case 4:
                    System.out.print("Ingrese nombre de usuario: ");
                    String n1 = sc.next();
                    System.out.print("Ingrese ID de usuario: ");
                    int id1 = sc.nextInt();
                    System.out.print("Ingrese gmail de usuario: ");
                    String g1 = sc.next();
                    User us1 = new User(id1,n1,g1);
                    
                    System.out.println((usuarios.containsValue(usuarios.get(us1.hashCode()))) ? "Usuario encontrado." : "Usuario no encontrado.");
                    break;
                case 5:
                    System.out.print("Ingrese código de usuario: ");
                    Integer k2 = sc.nextInt();
                    System.out.println((usuarios.containsKey(k2)) ? "Datos del usuario: "+usuarios.get(k2).toString() : "Usuario no encontrado.");
                    break;
                case 6:
                    System.out.print("Ingrese nombre de usuario: ");
                    String n2 = sc.next();
                    System.out.print("Ingrese ID de usuario: ");
                    int id2 = sc.nextInt();
                    System.out.print("Ingrese gmail de usuario: ");
                    String g2 = sc.next();
                    
                    User us2 = new User(id2,n2,g2);
                    System.out.println((usuarios.put(us2.hashCode(), us2)) ? "Usuario añadido." : "Usuario ya existente.");
                    break;
                case 7:
                    System.out.print("Ingrese código de usuario: ");
                    Integer k3 = sc.nextInt();
                    String d = (usuarios.containsKey(k3)) ? usuarios.get(k3).toString() : "";
                    System.out.println((usuarios.remove(k3)) ? "Usuario "+d+" eliminado." : "Usuario no encontrado.");
                    break;
                case 8:
                    usuarios.clear();
                    System.out.println("La tabla ha sido vaciada.");
                    break;
                case 9:
                    System.out.println("El hashcode de la tabla es: "+usuarios.hashCode());
                    break;
                case 10:
                    System.out.println("TABLA DE USUARIOS");
                    System.out.println(usuarios);
                    break;
            }
            
            System.out.println("_______________________________________________________________________________");
            System.out.println();
            
        } while (opcion != 11); //Cierra el programa con la opción 11
        
    }
}
