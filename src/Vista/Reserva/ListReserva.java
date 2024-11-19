/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Vista.Reserva;

import controller.IReservaDao;
import controllerImpl.ReservaDaoImpl;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Reserva;

/**
 *
 * @author tpp
 */
public class ListReserva extends javax.swing.JPanel {

    IReservaDao rDAO = new ReservaDaoImpl();
    Reserva r = new Reserva();

    public ListReserva() {
        initComponents();
        cargarReserva();

    }

    public void cargarReserva() {
        List<Reserva> lista = rDAO.listAll();

        DefaultTableModel tableModel = (DefaultTableModel) tbl_reserva.getModel();
        tableModel.setNumRows(0);

        for (Reserva r : lista) {
            String estado;
            if (r.getEstado().equals("R")) {
                estado = "Reservado";
            } else {
                estado = "Cancelado";
            }
            Object[] rowData
                    = {
                        r.getIdReserva(),
                        r.getFechaIngreso(),
                        r.getFechaSalida(),
                        r.getCliente().getNombre(),
                        r.getNumeroPiso(),
                        r.getNumeroHabitacion(),
                        r.getCosto(),
                        estado
                    };
            tableModel.addRow(rowData);
        }

        tbl_reserva.setModel(tableModel);
        JOptionPane.showMessageDialog(null, "Carga Completada :) ", "INFORMATION_MESSAGE", JOptionPane.INFORMATION_MESSAGE);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_reserva = new javax.swing.JTable();
        btnReload = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 204, 204));

        tbl_reserva.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "id", "Ingreso", "Salida", "Cliente", "Piso", "Habitacion", "Costo", "Estado"
            }
        ));
        jScrollPane1.setViewportView(tbl_reserva);

        btnReload.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/img/reload.png"))); // NOI18N

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/img/edit.png"))); // NOI18N

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/img/delete.png"))); // NOI18N

        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/img/mas.png"))); // NOI18N
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(btnReload)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEditar)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAdd)
                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnReload)
                    .addComponent(btnEditar)
                    .addComponent(btnDelete))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd))
                .addContainerGap(213, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        NewReserva n = new NewReserva();
        n.setVisible(true);
        n.setLocationRelativeTo(null);
        n.setSize(700, 500);
        n.setLocation(400,300);


    }//GEN-LAST:event_btnAddActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnReload;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_reserva;
    // End of variables declaration//GEN-END:variables
}
