/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import servicios.ClienteServices;

public class VtnPrincipal extends javax.swing.JFrame {
    
    private VtnVerEstadisticas objVtnVerEstadisticas;
    private VtnConsultarCliente objVtnVerPrestamos;
    private vtnGestionaClientes objVtnGestionarLibro;
    private ClienteServices objClienteServices;    
        
    public VtnPrincipal() {
        initComponents();
        establecerIconoOrganizacion();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
    
    public void asociarServicio(ClienteServices objClienteServices)
    {
        this.objClienteServices=objClienteServices;
        relacionarInternalFrameConJdesptokPane();
    }
    
    private void relacionarInternalFrameConJdesptokPane()
    {
        this.objVtnVerEstadisticas=new VtnVerEstadisticas();         
        this.jDesktopPanelPrincipal.add(this.objVtnVerEstadisticas);
        
        this.objVtnVerPrestamos= new VtnConsultarCliente(this.objClienteServices);
        this.jDesktopPanelPrincipal.add(this.objVtnVerPrestamos);
        
        this.objVtnGestionarLibro= new vtnGestionaClientes(this.objClienteServices);
        this.jDesktopPanelPrincipal.add(this.objVtnGestionarLibro);
    }

    private void establecerIconoOrganizacion()
    {
        ImageIcon img1= new javax.swing.ImageIcon(getClass().getResource("/recursos/logo.png"));        
        this.jLabelImagenOrganizacion.setIcon(img1);
        this.jLabelImagenOrganizacion.setText("");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelSuperior = new javax.swing.JPanel();
        jLabelImagenOrganizacion = new javax.swing.JLabel();
        jPanelMenu = new javax.swing.JPanel();
        jButtonGestionarClientes = new javax.swing.JButton();
        jButtonConsultar = new javax.swing.JButton();
        jButtonVerEstadisticas = new javax.swing.JButton();
        jPanelInferior = new javax.swing.JPanel();
        jPanelCentral = new javax.swing.JPanel();
        jDesktopPanelPrincipal = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelSuperior.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabelImagenOrganizacion.setText("jLabel1");

        jPanelMenu.setBackground(new java.awt.Color(153, 153, 255));

        jButtonGestionarClientes.setText("Gestionar clientes");
        jButtonGestionarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGestionarClientesActionPerformed(evt);
            }
        });

        jButtonConsultar.setText("Consultar cliente");
        jButtonConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultarActionPerformed(evt);
            }
        });

        jButtonVerEstadisticas.setText("Ver estadisticas");
        jButtonVerEstadisticas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerEstadisticasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelMenuLayout = new javax.swing.GroupLayout(jPanelMenu);
        jPanelMenu.setLayout(jPanelMenuLayout);
        jPanelMenuLayout.setHorizontalGroup(
            jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMenuLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jButtonGestionarClientes)
                .addGap(47, 47, 47)
                .addComponent(jButtonConsultar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(jButtonVerEstadisticas)
                .addGap(28, 28, 28))
        );
        jPanelMenuLayout.setVerticalGroup(
            jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMenuLayout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonGestionarClientes)
                    .addComponent(jButtonConsultar)
                    .addComponent(jButtonVerEstadisticas))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanelSuperiorLayout = new javax.swing.GroupLayout(jPanelSuperior);
        jPanelSuperior.setLayout(jPanelSuperiorLayout);
        jPanelSuperiorLayout.setHorizontalGroup(
            jPanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSuperiorLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabelImagenOrganizacion)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSuperiorLayout.createSequentialGroup()
                .addContainerGap(94, Short.MAX_VALUE)
                .addComponent(jPanelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(82, Short.MAX_VALUE))
        );
        jPanelSuperiorLayout.setVerticalGroup(
            jPanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSuperiorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelImagenOrganizacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelSuperior, java.awt.BorderLayout.PAGE_START);

        jPanelInferior.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanelInferiorLayout = new javax.swing.GroupLayout(jPanelInferior);
        jPanelInferior.setLayout(jPanelInferiorLayout);
        jPanelInferiorLayout.setHorizontalGroup(
            jPanelInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 726, Short.MAX_VALUE)
        );
        jPanelInferiorLayout.setVerticalGroup(
            jPanelInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        getContentPane().add(jPanelInferior, java.awt.BorderLayout.PAGE_END);

        jPanelCentral.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jDesktopPanelPrincipalLayout = new javax.swing.GroupLayout(jDesktopPanelPrincipal);
        jDesktopPanelPrincipal.setLayout(jDesktopPanelPrincipalLayout);
        jDesktopPanelPrincipalLayout.setHorizontalGroup(
            jDesktopPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 714, Short.MAX_VALUE)
        );
        jDesktopPanelPrincipalLayout.setVerticalGroup(
            jDesktopPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 236, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanelCentralLayout = new javax.swing.GroupLayout(jPanelCentral);
        jPanelCentral.setLayout(jPanelCentralLayout);
        jPanelCentralLayout.setHorizontalGroup(
            jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCentralLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPanelPrincipal)
                .addContainerGap())
        );
        jPanelCentralLayout.setVerticalGroup(
            jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCentralLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPanelPrincipal)
                .addContainerGap())
        );

        getContentPane().add(jPanelCentral, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarActionPerformed
        this.objVtnVerPrestamos.setVisible(true);
        this.objVtnVerEstadisticas.setVisible(false);
        this.objVtnGestionarLibro.setVisible(false);
    }//GEN-LAST:event_jButtonConsultarActionPerformed

    private void jButtonVerEstadisticasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerEstadisticasActionPerformed
        this.objVtnVerEstadisticas.setVisible(true);
        this.objVtnVerPrestamos.setVisible(false);
        this.objVtnGestionarLibro.setVisible(false);
    }//GEN-LAST:event_jButtonVerEstadisticasActionPerformed

    private void jButtonGestionarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGestionarClientesActionPerformed
        this.objVtnGestionarLibro.setVisible(true);
        this.objVtnVerEstadisticas.setVisible(false);
        this.objVtnVerPrestamos.setVisible(false);
    }//GEN-LAST:event_jButtonGestionarClientesActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonConsultar;
    private javax.swing.JButton jButtonGestionarClientes;
    private javax.swing.JButton jButtonVerEstadisticas;
    private javax.swing.JDesktopPane jDesktopPanelPrincipal;
    private javax.swing.JLabel jLabelImagenOrganizacion;
    private javax.swing.JPanel jPanelCentral;
    private javax.swing.JPanel jPanelInferior;
    private javax.swing.JPanel jPanelMenu;
    private javax.swing.JPanel jPanelSuperior;
    // End of variables declaration//GEN-END:variables
}
