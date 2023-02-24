package pk_SuperBuscaMinas;

import static org.junit.Assert.*;
import org.junit.Test;
import pk_SuperBuscaMinas.BotonMina.Estado;

public class BotonMinaTest {

  @Test
  public void cambiarAspectoBandera() {
    //Creo estado bandera
    Estado bandera = Estado.BANDERA; 
    //Creo un objeto bboton
    BotonMina btn1 = new BotonMina();
    //Le cambio el estado a bandera
    btn1.cambiarAspecto(bandera);
    //Compruebo
    assertEquals(bandera, btn1.getEstado());
  }
  
  @Test
  public void cambiarAspectoBoton() {
    //Creo estado bandera
    Estado boton = Estado.BOTON; 
    //Creo un objeto bboton
    BotonMina btn1 = new BotonMina();
    //Le cambio el estado a bandera
    btn1.cambiarAspecto(boton);
    //Compruebo
    assertEquals(boton, btn1.getEstado());
  }

  @Test
  public void cambiarAspectoPulsado() {
    //Creo estado pulsado
    Estado pulsado = Estado.PULSADO; 
    //Creo un objeto bboton
    BotonMina btn1 = new BotonMina();
    //Le cambio el estado a pulsado
    btn1.cambiarAspecto(pulsado);
    //Compruebo
    assertEquals(pulsado, btn1.getEstado());
  }
  
  @Test
  public void cambiarAspectoMina() {
    //Creo estado mina
    Estado mina = Estado.MINA; 
    //Creo un objeto bboton
    BotonMina btn1 = new BotonMina();
    //Le cambio el estado a mina
    btn1.cambiarAspecto(mina);
    //Compruebo
    assertEquals(mina, btn1.getEstado());
  }
  
  @Test
  public void cambiarAspectoNumero() {
    //Creo estado numero
    Estado numero = Estado.NUMERO; 
    //Creo un objeto bboton
    BotonMina btn1 = new BotonMina();
    //Le cambio el estado a numero
    btn1.cambiarAspecto(numero);
    //Compruebo
    assertEquals(numero, btn1.getEstado());
  }

}
