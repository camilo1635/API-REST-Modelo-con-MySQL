package vista;


import java.util.Date;
import modelos.Cliente;
import servicios.ClienteServices;
import utilidades.Utilidades;

/**
 *
 * @author LENOVO
 */
public class vtnRegistrarCliente extends javax.swing.JFrame {

   private final ClienteServices objClienteServices;   
   
    public vtnRegistrarCliente(ClienteServices objClienteServices) {
        initComponents();
        this.objClienteServices=objClienteServices;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelInferior = new javax.swing.JPanel();
        jLabelDesarrolladoPor = new javax.swing.JLabel();
        jPanelSuperior = new javax.swing.JPanel();
        jLabelTituloJForm = new javax.swing.JLabel();
        jPanelCentral = new javax.swing.JPanel();
        jLabelCodigo = new javax.swing.JLabel();
        jLabelTipo = new javax.swing.JLabel();
        jTextFieldNombres = new javax.swing.JTextField();
        jLabelTitulo = new javax.swing.JLabel();
        jTextFieldApellidos = new javax.swing.JTextField();
        jButtonRegistrar = new javax.swing.JButton();
        jTextFieldCorreo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelInferior.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabelDesarrolladoPor.setText("Desarrollado por informática III");

        javax.swing.GroupLayout jPanelInferiorLayout = new javax.swing.GroupLayout(jPanelInferior);
        jPanelInferior.setLayout(jPanelInferiorLayout);
        jPanelInferiorLayout.setHorizontalGroup(
            jPanelInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInferiorLayout.createSequentialGroup()
                .addGap(194, 194, 194)
                .addComponent(jLabelDesarrolladoPor)
                .addContainerGap(196, Short.MAX_VALUE))
        );
        jPanelInferiorLayout.setVerticalGroup(
            jPanelInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelInferiorLayout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addComponent(jLabelDesarrolladoPor)
                .addGap(38, 38, 38))
        );

        getContentPane().add(jPanelInferior, java.awt.BorderLayout.PAGE_END);

        jPanelSuperior.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabelTituloJForm.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelTituloJForm.setForeground(new java.awt.Color(0, 51, 153));
        jLabelTituloJForm.setText("Registrar cliente");

        javax.swing.GroupLayout jPanelSuperiorLayout = new javax.swing.GroupLayout(jPanelSuperior);
        jPanelSuperior.setLayout(jPanelSuperiorLayout);
        jPanelSuperiorLayout.setHorizontalGroup(
            jPanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSuperiorLayout.createSequentialGroup()
                .addContainerGap(188, Short.MAX_VALUE)
                .addComponent(jLabelTituloJForm)
                .addGap(203, 203, 203))
        );
        jPanelSuperiorLayout.setVerticalGroup(
            jPanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSuperiorLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabelTituloJForm)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelSuperior, java.awt.BorderLayout.PAGE_START);

        jPanelCentral.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanelCentral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelCodigo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelCodigo.setForeground(new java.awt.Color(0, 0, 102));
        jLabelCodigo.setText("Nombres:");
        jPanelCentral.add(jLabelCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 31, -1, -1));

        jLabelTipo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelTipo.setForeground(new java.awt.Color(0, 0, 102));
        jLabelTipo.setText("Correo:");
        jPanelCentral.add(jLabelTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, -1, -1));
        jPanelCentral.add(jTextFieldNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 130, -1));

        jLabelTitulo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(0, 0, 102));
        jLabelTitulo.setText("Apellidos:");
        jPanelCentral.add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 61, -1, -1));
        jPanelCentral.add(jTextFieldApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(171, 58, 130, -1));

        jButtonRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/grabar.png"))); // NOI18N
        jButtonRegistrar.setText("Registrar");
        jButtonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarActionPerformed(evt);
            }
        });
        jPanelCentral.add(jButtonRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, -1, -1));
        jPanelCentral.add(jTextFieldCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 130, -1));

        getContentPane().add(jPanelCentral, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarActionPerformed
        
        String nombres, apellidos, correo;
        Date fechaCreacion;
        int cantidad;
        
        nombres=jTextFieldNombres.getText();
        apellidos=jTextFieldApellidos.getText();
        correo=jTextFieldCorreo.getText();
        fechaCreacion= new Date();
        Cliente objCliente=new Cliente(nombres, apellidos, correo, fechaCreacion);
        
        if(this.objClienteServices.consultarSiExisteClientePorCorreo(correo))
        {
            Utilidades.mensajeError("Error, el correo del cliente se encuentra registrado", "Error al registrar el cliente");
        }
        else
        {
            Cliente objClienteCreado= this.objClienteServices.registrarCliente(objCliente);            
            Utilidades.mensajeExito("Cliente registrado exitosmente", "Cliente registrado");
            
        }
       
        
    }//GEN-LAST:event_jButtonRegistrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonRegistrar;
    private javax.swing.JLabel jLabelCodigo;
    private javax.swing.JLabel jLabelDesarrolladoPor;
    private javax.swing.JLabel jLabelTipo;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabelTituloJForm;
    private javax.swing.JPanel jPanelCentral;
    private javax.swing.JPanel jPanelInferior;
    private javax.swing.JPanel jPanelSuperior;
    private javax.swing.JTextField jTextFieldApellidos;
    private javax.swing.JTextField jTextFieldCorreo;
    private javax.swing.JTextField jTextFieldNombres;
    // End of variables declaration//GEN-END:variables
}
