package Tema10Ficheros.Relacion1Solu;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Carlos
 * 
 * 
 * 
 */
public class Agenda11 {

    private ArrayList<Contacto> listaContactos;

    public Agenda11() {
        this.listaContactos = new ArrayList<>();
    }

    public ArrayList<Contacto> getListaContactos() {
        return listaContactos;
    }

    public void añadirContacto(String nombre, int telefono) {
        Contacto Contac = new Contacto(nombre, telefono);
        this.listaContactos.add(Contac);
    }

    public void añadirAux(String nombre, int telefono) {
        try (DataOutputStream bw = new DataOutputStream(new FileOutputStream("agenda.dat", true));) {
            bw.writeUTF(nombre + "-");
            bw.writeInt(telefono);
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void eliminarContacto(String nombre) {
        for (int i = 0; i < this.listaContactos.size(); i++) {
            if (this.listaContactos.get(i).getNombre().equals(nombre)) {
                this.listaContactos.remove(i);
                System.out.println("El contacto ha sido eliminado");
            }
        }
        try (DataOutputStream bw = new DataOutputStream(new FileOutputStream("agenda.dat", false));) {
            for (int i = 0; i < this.listaContactos.size(); i++) {
                bw.writeUTF(this.listaContactos.get(i).getNombre() + "-");
                bw.writeInt(this.listaContactos.get(i).getTelefono());
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }

    public void imprimirContactos() {
        try (DataInputStream br = new DataInputStream(new FileInputStream("agenda.dat"));) {
            while (true) {
                System.out.print(br.readUTF());
                System.out.print(br.readInt() + "\n");
            }
        } catch (EOFException ex) {

        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

}
