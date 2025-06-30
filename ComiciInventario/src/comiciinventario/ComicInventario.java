/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package comiciinventario;

import Modelo.Comic;
import Modelo.Usuario;
import java.util.*;
import java.io.*;

/**
 *
 * @author dell
 */
public class ComicInventario {

  
    public static void main(String[] args) {
        
 Scanner sc= new Scanner(System.in);
 ArrayList<Comic> listaComic = new ArrayList<>();
 HashMap<String, Usuario>ListaUsuario= new HashMap<>();
 HashSet<String> ListaUnicaAutor= new HashSet<>();
 TreeSet <String> ListaOrdenadaTitulo= new TreeSet<>();
 
 try{
     
     BufferedReader lector = new BufferedReader(new FileReader("Comic.csv"));
            String linea;

            while ((linea = lector.readLine()) != null) {
                String[] partes = linea.split(",");
                String titulo = partes[0];
                String autor = partes[1];

                Comic comic = new Comic(titulo, autor);
                listaComic.add(comic);
                ListaUnicaAutor.add(partes [1]);
                ListaOrdenadaTitulo.add(partes [0]);
            }

            lector.close();
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
        System.out.println();
        
         System.out.println("Lista de Comics : ");
         System.out.println();
         for(Comic comic: listaComic){
             System.out.println(comic);
 }
 
        try{
            System.out.println("-----------------------------------------------------------------");
            System.out.println("Autores Unicos: ");
            for (String s: ListaUnicaAutor) {
                System.out.println(s);
            }
        }catch(Exception e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
        
        try{
            System.out.println("-----------------------------------------------------------------");
            System.out.println("Titulos ordenados: ");
            for (String e: ListaOrdenadaTitulo) {
                System.out.println(e);
            }
        }catch(Exception e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
        
        try{
            System.out.println("");
        System.out.println("Ingrese su nombre; ");
        String nom=sc.nextLine();
        System.out.println("Ingrese su nombre; ");
        String rut=sc.nextLine();
        sc.close();
        
        Usuario u=new Usuario(nom, rut);
        ListaUsuario.put(nom, u);
        
        FileWriter escritor = new FileWriter("usuario.txt", true);
        escritor.write("- "+u.getNombre()+""+u.getRut()+"\n");
        escritor.close();
            System.out.println("Usuario registrado correctamente");
        }catch(Exception e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
        
        System.out.println("-----------------------------------------------------------------");
        System.out.println("Usuarios registrados: ");
        for (Usuario u: ListaUsuario.values()) {
            System.out.println("- "+u);
            
        }
               
        
    }
    
}

   
