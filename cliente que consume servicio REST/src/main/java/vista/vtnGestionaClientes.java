package vista;

import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import modelos.Cliente;
import servicios.ClienteServices;
import utilidades.Utilidades;

public class vtnGestionaClientes extends javax.swing.JInternalFrame {

    private final ClienteServices objClienteServices;
    
    public vtnGestionaClientes(ClienteServices objClienteServices) {
        initComponents();
        this.objClienteServices=objClienteServices;
        this.jTableMostrarClientes.setDefaultRenderer(Object.class, new Render());
        inicializarTabla();
    }

     private void inicializarTabla()
    {
       DefaultTableModel model= new DefaultTableModel();       
       model.addColumn("Id");
       model.addColumn("Nombres");
       model.addColumn("Apellidos");
       model.addColumn("Email");
       model.addColumn("Fecha de creación");
       model.addColumn("actualizar");
       model.addColumn("eliminar");
       this.jTableMostrarClientes.setModel(model);
    }
    
     public void limpiarTabla(){
        
        DefaultTableModel modelo=(DefaultTableModel) this.jTableMostrarClientes.getModel();
        int filas=this.jTableMostrarClientes.getRowCount();
        for (int i = 0;filas>i; i++) {
            modelo.removeRow(0);
        }        
    }
     
     private void llenarTabla()
    {
        DefaultTableModel model=(DefaultTableModel) this.jTableMostrarClientes.getModel();
        limpiarTabla();
        List<Cliente> lista= this.objClienteServices.listarClientes();
        
        for (int i = 0; i < lista.size(); i++) {
            
            JButton JButtonActualizarUsuario = new JButton();
            JButtonActualizarUsuario.setName("Actualizar");
            JButtonActualizarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/lapiz.png")));

            
            JButton JButtonEliminarUsuario = new JButton();
            JButtonEliminarUsuario.setName("Eliminar");
            JButtonEliminarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/remove.png")));

            
            Object [] fila= { lista.get(i).getIdCliente()+"", lista.get(i).getNombre(), lista.get(i).getApellido(), lista.get(i).getEmail(),lista.get(i).getCreateAt()+"",JButtonActualizarUsuario,JButtonEliminarUsuario};
            model.addRow(fila);
        }
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelSuperior = new javax.swing.JPanel();
        jLabelGestionarClientes = new javax.swing.JLabel();
        jPanelInferior = new javax.swing.JPanel();
        jPanelCentral = new javax.swing.JPanel();
        jButtonRegistrarLibro = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableMostrarClientes = new javax.swing.JTable();
        jButtonActualizaTabla = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jPanelSuperior.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabelGestionarClientes.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelGestionarClientes.setText("Gestionar clientes");

        javax.swing.GroupLayout jPanelSuperiorLayout = new javax.swing.GroupLayout(jPanelSuperior);
        jPanelSuperior.setLayout(jPanelSuperiorLayout);
        jPanelSuperiorLayout.setHorizontalGroup(
            jPanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSuperiorLayout.createSequentialGroup()
                .addContainerGap(376, Short.MAX_VALUE)
                .addComponent(jLabelGestionarClientes)
                .addGap(353, 353, 353))
        );
        jPanelSuperiorLayout.setVerticalGroup(
            jPanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSuperiorLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabelGestionarClientes)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelSuperior, java.awt.BorderLayout.PAGE_START);

        jPanelInferior.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanelInferiorLayout = new javax.swing.GroupLayout(jPanelInferior);
        jPanelInferior.setLayout(jPanelInferiorLayout);
        jPanelInferiorLayout.setHorizontalGroup(
            jPanelInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 891, Short.MAX_VALUE)
        );
        jPanelInferiorLayout.setVerticalGroup(
            jPanelInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        getContentPane().add(jPanelInferior, java.awt.BorderLayout.PAGE_END);

        jPanelCentral.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButtonRegistrarLibro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/agregar.png"))); // NOI18N
        jButtonRegistrarLibro.setText("Registrar");
        jButtonRegistrarLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarLibroActionPerformed(evt);
            }
        });

        jTableMostrarClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTableMostrarClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMostrarClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableMostrarClientes);

        jButtonActualizaTabla.setText("Actualizar tabla");
        jButtonActualizaTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActualizaTablaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelCentralLayout = new javax.swing.GroupLayout(jPanelCentral);
        jPanelCentral.setLayout(jPanelCentralLayout);
        jPanelCentralLayout.setHorizontalGroup(
            jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCentralLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCentralLayout.createSequentialGroup()
                        .addComponent(jButtonActualizaTabla)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonRegistrarLibro))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 879, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelCentralLayout.setVerticalGroup(
            jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCentralLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonRegistrarLibro)
                    .addComponent(jButtonActualizaTabla))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(103, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelCentral, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRegistrarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarLibroActionPerformed
       vtnRegistrarCliente vtnObjRegistrarLibro= new vtnRegistrarCliente(this.objClienteServices);
       vtnObjRegistrarLibro.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       vtnObjRegistrarLibro.setVisible(true);
    }//GEN-LAST:event_jButtonRegistrarLibroActionPerformed

    private void jButtonActualizaTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActualizaTablaActionPerformed
       llenarTabla();        
    }//GEN-LAST:event_jButtonActualizaTablaActionPerformed

    private void jTableMostrarClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMostrarClientesMouseClicked
        int column = this.jTableMostrarClientes.getColumnModel().getColumnIndexAtX(evt.getX());
        int row = evt.getY()/jTableMostrarClientes.getRowHeight();
        
        if(row < jTableMostrarClientes.getRowCount() && row >= 0 && column < jTableMostrarClientes.getColumnCount() && column >= 0){
            Object value = jTableMostrarClientes.getValueAt(row, column);
            
            if(value instanceof JButton){
                
                ((JButton)value).doClick();
                JButton boton = (JButton) value;
                
                String idCliente = jTableMostrarClientes.getValueAt(row, 0).toString();
               
                if(boton.getName().equals("Eliminar")){
                   this.elimininarCliente(idCliente);
                }
                else if(boton.getName().equals("Actualizar")){
                   this.actualizarCliente(idCliente);
                }
            }
        }
    }//GEN-LAST:event_jTableMostrarClientesMouseClicked
    
    private void actualizarCliente(String idCliente)
    {
        Integer idClienteEntero=Integer.parseInt(idCliente);
        Cliente objCliente= this.objClienteServices.consultarCliente(idClienteEntero);
        vtnActualizarCliente vtnObjActualizarLibro= new vtnActualizarCliente(this.objClienteServices);
        vtnObjActualizarLibro.actualizarFormularioCliente(idClienteEntero, objCliente);
        vtnObjActualizarLibro.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        vtnObjActualizarLibro.setVisible(true);
    }
    
    private void elimininarCliente(String idCliente)
    {
        try{  
                if(Utilidades.mensajeConfirmacion("¿ Estás seguro de que quieres eliminar al cliente con id " + idCliente + " " 
                    +" ?", "Confirmación") == 0){
                   Integer idClienteEntero=Integer.parseInt(idCliente); 
                   boolean bandera=this.objClienteServices.eliminarCliente(idClienteEntero);
                   if(bandera==true)
                   {
                       Utilidades.mensajeExito("El cliente con id " + idCliente + " fue eliminado exitosamente", "Cliente eliminado");
                       llenarTabla();
                   }
                   else
                   {
                       Utilidades.mensajeAdvertencia("El cliente con id " + idCliente + " no fue eliminado", "Error al eliminar");

                   }
                }
            }catch(Exception ex){
                Utilidades.mensajeError("Error al eliminar el cliente. Intentelo de nuevo más tarde", "Error");
        }  
    }
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonActualizaTabla;
    private javax.swing.JButton jButtonRegistrarLibro;
    private javax.swing.JLabel jLabelGestionarClientes;
    private javax.swing.JPanel jPanelCentral;
    private javax.swing.JPanel jPanelInferior;
    private javax.swing.JPanel jPanelSuperior;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableMostrarClientes;
    // End of variables declaration//GEN-END:variables
}
