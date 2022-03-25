/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package reto_tecnico;

/**
 *
 * @author WPOSS
 */
public class Juego extends javax.swing.JFrame implements ICambiarVentana {

    public Juego() {

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rbg_JP_grupoBotones = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        txt_JP_roda = new javax.swing.JLabel();
        txt_JP_acumulado = new javax.swing.JLabel();
        txt_JP_pregunta = new javax.swing.JLabel();
        rbtn_JP_opcion1 = new javax.swing.JRadioButton();
        rbtn_JP_opcion2 = new javax.swing.JRadioButton();
        rbtn_JP_opcion3 = new javax.swing.JRadioButton();
        rbtn_JP_opcion4 = new javax.swing.JRadioButton();
        btn_JP_retirar = new javax.swing.JButton();
        txt_JP_categoria = new javax.swing.JLabel();
        btn_JP_siguiente = new javax.swing.JButton();
        txt_JP_premio = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));

        txt_JP_roda.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txt_JP_roda.setText("RONDA 1");

        txt_JP_acumulado.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_JP_acumulado.setText("ACUMULADO");

        txt_JP_pregunta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_JP_pregunta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_JP_pregunta.setText("¿Cuál es la nación más pequeña del mundo?");

        rbtn_JP_opcion1.setText("Andorra");

        rbtn_JP_opcion2.setText("Mónaco");

        rbtn_JP_opcion3.setText("El Vaticano");

        rbtn_JP_opcion4.setText("Alaska");

        btn_JP_retirar.setText("RETIRARSE");
        btn_JP_retirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_JP_retirarActionPerformed(evt);
            }
        });

        txt_JP_categoria.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_JP_categoria.setText("CATEGORIA");

        btn_JP_siguiente.setText("SIGUIENTE");
        btn_JP_siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_JP_siguienteActionPerformed(evt);
            }
        });

        txt_JP_premio.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_JP_premio.setText("PREMIO A CONSEGUIR");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(223, 223, 223)
                        .addComponent(txt_JP_roda))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(btn_JP_retirar, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(btn_JP_siguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbtn_JP_opcion1)
                            .addComponent(rbtn_JP_opcion2)
                            .addComponent(rbtn_JP_opcion3)
                            .addComponent(rbtn_JP_opcion4)
                            .addComponent(txt_JP_pregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_JP_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_JP_acumulado, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_JP_premio, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(txt_JP_roda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(txt_JP_premio, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txt_JP_acumulado, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txt_JP_categoria)
                .addGap(36, 36, 36)
                .addComponent(txt_JP_pregunta)
                .addGap(38, 38, 38)
                .addComponent(rbtn_JP_opcion1)
                .addGap(18, 18, 18)
                .addComponent(rbtn_JP_opcion2)
                .addGap(18, 18, 18)
                .addComponent(rbtn_JP_opcion3)
                .addGap(18, 18, 18)
                .addComponent(rbtn_JP_opcion4)
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_JP_retirar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_JP_siguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_JP_retirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_JP_retirarActionPerformed

    }//GEN-LAST:event_btn_JP_retirarActionPerformed

    private void btn_JP_siguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_JP_siguienteActionPerformed

    }//GEN-LAST:event_btn_JP_siguienteActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Juego().setVisible(true);
            }
        });
    }

    @Override
    public void cambiarVentana() {
        Inicio inicio = new Inicio();
        inicio.setVisible(true);
        this.dispose();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_JP_retirar;
    private javax.swing.JButton btn_JP_siguiente;
    private javax.swing.JPanel jPanel1;
    private javax.swing.ButtonGroup rbg_JP_grupoBotones;
    private javax.swing.JRadioButton rbtn_JP_opcion1;
    private javax.swing.JRadioButton rbtn_JP_opcion2;
    private javax.swing.JRadioButton rbtn_JP_opcion3;
    private javax.swing.JRadioButton rbtn_JP_opcion4;
    private javax.swing.JLabel txt_JP_acumulado;
    private javax.swing.JLabel txt_JP_categoria;
    private javax.swing.JLabel txt_JP_pregunta;
    private javax.swing.JLabel txt_JP_premio;
    private javax.swing.JLabel txt_JP_roda;
    // End of variables declaration//GEN-END:variables
}
