package pk_SuperBuscaMinas;

import static org.junit.Assert.*;
import java.util.List;
import org.junit.Test;
import pk_SuperBuscaMinas.BotonMina.Estado;
import pk_SuperBuscaMinas.BotonMina.Valor;
import pk_SuperBuscaMinas.Util.Posicion;


public class MatrizBotonesTest {
  
  @Test
  public void testHayBoton() {
    //Creo tabla de 10x10
    MatrizBotones tabla = new MatrizBotones(10, 10);
    //Creo un boton de mina
    BotonMina btnMina = new BotonMina();
    //Añado botones con minas en distintas posiciones
    tabla.getBoton(0, 0).setValor(Valor.MINA);
    tabla.getListaPosicionMinas().add(new Coordenadas(0, 0));
    
    tabla.getBoton(1, 2).setValor(Valor.MINA);
    tabla.getListaPosicionMinas().add(new Coordenadas(1, 2));
    
    tabla.getBoton(0, 1).setValor(Valor.MINA);
    tabla.getListaPosicionMinas().add(new Coordenadas(0, 1));
    
    tabla.getBoton(1, 0).setValor(Valor.MINA);
    tabla.getListaPosicionMinas().add(new Coordenadas(1, 0));
    
    tabla.getBoton(4, 2).setValor(Valor.MINA);
    tabla.getListaPosicionMinas().add(new Coordenadas(4, 2));
 
    //Compruebo que hay
    assertTrue(tabla.hayBoton(btnMina, Posicion.DER));
    assertTrue(tabla.hayBoton(btnMina, Posicion.INF));
    assertTrue(tabla.hayBoton(btnMina, Posicion.INF_DER));
    //Compruebo que no hay
    assertFalse(tabla.hayBoton(btnMina, Posicion.INF_IZQ));
    assertFalse(tabla.hayBoton(btnMina, Posicion.IZQ));
    assertFalse(tabla.hayBoton(btnMina, Posicion.SUP_DER));
    assertFalse(tabla.hayBoton(btnMina, Posicion.SUP_IZQ));
    assertFalse(tabla.hayBoton(btnMina, Posicion.SUP));
  }
  
  @Test
  public void testMuestraMinas() {
    //Creo tabla de 10x10
    MatrizBotones tabla = new MatrizBotones(10, 10);
    List<Coordenadas> listaMinas = tabla.getListaPosicionMinas();
    //Recorro la lista y compruebo cada uno de los elementos
    for (Coordenadas coordenada : listaMinas) {
      //Compruebo que los botones tienen estado mina
      assertEquals(tabla.getBoton(coordenada).getEstado(), Estado.MINA);
      //Compruebo que los botones no tienen otro estado
      assertNotEquals(tabla.getBoton(coordenada).getEstado(), Estado.PULSADO);
      assertNotEquals(tabla.getBoton(coordenada).getEstado(), Estado.BANDERA);
      assertNotEquals(tabla.getBoton(coordenada).getEstado(), Estado.PULSADO);
      assertNotEquals(tabla.getBoton(coordenada).getEstado(), Estado.NUMERO);
      assertNotEquals(tabla.getBoton(coordenada).getEstado(), Estado.BOTON);
    }
  }
  
}
