
package marcolista;

import java.awt.FlowLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.ListSelectionModel;


public class MarcoLista extends JFrame{
    private JList listaJListaColores;//Lista para mostrar los colores
  
    private final String nombresColores[]={
        "Negro","Azul","Cyan","Gris oscuro",
        "Gris","Verde","Gris claro","Magneta",
        "Naranja", "Rosa","Blanco","Amarillo"
    };
    
    private final Color colores[]={
        Color.BLACK,Color.BLUE, Color.CYAN, Color.DARK_GRAY,
        Color.GRAY,Color.GREEN, Color.LIGHT_GRAY,
        Color.MAGENTA, Color.ORANGE,Color.PINK,
        Color.RED, Color.WHITE,Color.YELLOW
    };
    
    public MarcoLista(){
        super("Pruebaa de JList");
        setLayout(new FlowLayout());

        listaJListaColores=new JList(nombresColores);//crea con nombre Colores
        listaJListaColores.setVisibleRowCount(5);//Muesta cinco filas a la vez

        //no permite selecciones multiples
        listaJListaColores.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        //agrega el marco un objeto JScrollPane que contiene a JList
        add(new JScrollPane(listaJListaColores));

        listaJListaColores.addListSelectionListener(new ListSelectionListener(){

            public void valueChanged(ListSelectionEvent ea){
                getContentPane().setBackground( colores [ listaJListaColores.getSelectedIndex() ] );

                 }//fin del metodo valueChanged
            }//fin de la clase interna anonima
        );//Fin de la llamada a addListSelectionListener
    }//fin del constructor Marco Lista
  
    public static void main(String[] args) {
        MarcoLista ml=new MarcoLista();
        ml.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ml.setSize(350,150);
        ml.setVisible(true);
    
    }
    
}//fin de la clase MarcoLista
