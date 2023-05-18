
package vista;

import controlador.Control;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import modelo.Pokemon;
import vista.Landing;


public class ImportView extends javax.swing.JFrame {

    public ImportView() throws IOException {
        initComponents();
        Control controller = new Control();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setTitle("Pokemon Tower");
        ImageIcon icon = controller.FrameSetImg("pokeball.png");
        this.setIconImage(icon.getImage());
        jTextArea1.setText("¿Quieres importar Pokemon? \nEl formato a seguir es, separado por comas:\n"
                + "1. Nombre (String)  2. Ataque (int)\n3. Vida (int)  4. Velocidad (int)\n"
                + "5. Movimiento 1 (String)\n"
                + "6. Movimiento 2 (String)\n"
                + "\n"
                + "Seleccione el fichero usando el panel inferior");
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jFileChooser1 = new javax.swing.JFileChooser();
        No = new javax.swing.JButton();
        Yes = new javax.swing.JButton();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jFileChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 440, 280));

        No.setFont(new java.awt.Font("Source Code Pro", 1, 14)); // NOI18N
        No.setText("No");
        No.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NoActionPerformed(evt);
            }
        });
        jPanel1.add(No, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 730, -1, -1));

        Yes.setFont(new java.awt.Font("Source Code Pro", 1, 14)); // NOI18N
        Yes.setText("Si");
        Yes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YesActionPerformed(evt);
            }
        });
        jPanel1.add(Yes, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 730, -1, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Source Code Pro", 1, 12)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setFocusable(false);
        jTextArea1.setRequestFocusEnabled(false);
        jPanel1.add(jTextArea1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 440, 140));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/banner.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoActionPerformed
        try {
            Landing landing = new Landing();
            this.dispose();
        } catch (IOException ex) {
            Logger.getLogger(ImportView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_NoActionPerformed

    private void YesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YesActionPerformed
        File fichero = jFileChooser1.getSelectedFile();
        int cont = 0;
        try {
            Scanner lector = new Scanner(fichero);
            while (lector.hasNextLine()) {
                cont += 1;
                String linea = lector.nextLine();

                String[] valores = linea.split(", "); // Divide la línea en función de la coma y el espacio

                String nombre = valores[0];
                int ataque = Integer.parseInt(valores[1]);
                int vida = Integer.parseInt(valores[2]);
                int velocidad = Integer.parseInt(valores[3]);
                String imagen = "images/" + nombre + ".png";
                int poder = 12;
                String evolucion = null;
                String movimiento1 = valores[4];
                String movimiento2 = valores[5];
                
                String sentencia = "INSERT INTO POKEMON VALUES('" + nombre + "', '" + ataque + "', '" + vida + "', '" + velocidad + "', '" + imagen +
                        "', '" + poder + "', '" + evolucion + "', '" + movimiento1 + "', '" + movimiento2 + "');";
                
                bd.Conexion.EjecutarUpdate(sentencia);
                
                String nombreArchivo = "src/import/importeds.md";
                FileWriter filewriter = new FileWriter(nombreArchivo, true); // Utiliza el constructor con el segundo parámetro como 'true'
                BufferedWriter writer = new BufferedWriter(filewriter);

                // Resto de tu código para escribir en el archivo

                writer.write("### Nombre del Pokemon: " + nombre);
                writer.write("![alt text](../images/" + nombre + ".png)");
                writer.newLine();
                writer.write("Ataque: " + ataque);
                writer.newLine();
                writer.write("Vida: " + vida);
                writer.newLine();
                writer.write("Velocidad: " + velocidad);
                writer.newLine();
                writer.write("Movimiento 1: " + movimiento1);
                writer.newLine();
                writer.write("Movimiento 2: " + movimiento2);
                writer.newLine();
                writer.close();
            }
            lector.close();
            Landing landing = new Landing();
            this.dispose();
        } catch (FileNotFoundException e) {
            System.out.println("Los datos introducidos no son correctos o ya han sido introducidos.");
        } catch (IOException ex) {
            Logger.getLogger(ImportView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_YesActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton No;
    private javax.swing.JButton Yes;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
