/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista.Reserva;


import Utils.EmailSender;
import controller.IReservaDao;
import controllerImpl.ReservaDaoImpl;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import javax.swing.JOptionPane;
import model.Cliente;
import model.Reserva;

/**
 *
 * @author tpp
 */
public class EditarReserva extends javax.swing.JFrame {

    int idreserva;

    public EditarReserva(int idreserva) {
        this.idreserva = idreserva;
        initComponents();
        SearchReserva(idreserva);
    }

    public void SearchReserva(int idreserva) {

        IReservaDao rDAO = new ReservaDaoImpl();

        Reserva r = rDAO.searchById(idreserva);

        try {
            LabelDni.setText(r.getCliente().getDni());
            LabelNombre.setText(r.getCliente().getNombre());
            LabelEmail.setText(r.getCliente().getEmail());
            LabelIdCliente.setText(String.valueOf(r.getCliente().getIdcliente()));
            txtHabitación.setText(String.valueOf(r.getNumeroHabitacion()));
            System.out.println("piso"+r.getNumeroPiso());
            System.out.println("Precio"+r.getCosto());
            jSpinnerPiso.setValue(Integer.valueOf(r.getNumeroPiso()));
            LabelPrecio.setText(String.valueOf(r.getCosto()));
            String estado;
            if (r.getEstado().equals("R")) {
                estado = "Reservado";
            } else {
                estado = "Cancelado";
            }
            cmbEstado.setSelectedItem(estado);
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            Date fechaIngreso = dateFormat.parse(r.getFechaIngreso());
            Date fechaSalida = dateFormat.parse(r.getFechaSalida());
            DCFechaIngreso.setDate(fechaIngreso);
            DCFechaSalida.setDate(fechaSalida);

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al convertir las fechas.", "Error", JOptionPane.ERROR_MESSAGE);

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        LabelDni = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        LabelEmail = new javax.swing.JLabel();
        LabelNombre = new javax.swing.JLabel();
        LabelIdCliente = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        LabelPrecio = new javax.swing.JLabel();
        DCFechaIngreso = new com.toedter.calendar.JDateChooser();
        DCFechaSalida = new com.toedter.calendar.JDateChooser();
        jSpinnerPiso = new javax.swing.JSpinner();
        txtHabitación = new javax.swing.JTextField();
        btnCalPrecio = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        cmbEstado = new javax.swing.JComboBox<>();
        btnCancelar = new javax.swing.JButton();
        btnEnviarCorreo = new javax.swing.JButton();
        btnActualizarReserva = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(254, 254, 227));

        jPanel6.setBackground(new java.awt.Color(255, 204, 204));
        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel6.setPreferredSize(new java.awt.Dimension(700, 500));

        jPanel3.setBackground(new java.awt.Color(255, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del Cliente"));

        jLabel2.setText("DNI:");

        LabelDni.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        LabelDni.setText("******DNI");

        jLabel4.setText("Nombre:");

        jLabel5.setText("Email:");

        LabelEmail.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        LabelEmail.setText("*****EMAIL");

        LabelNombre.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        LabelNombre.setText("*****NOMBRE");

        LabelIdCliente.setBackground(new java.awt.Color(255, 204, 204));
        LabelIdCliente.setForeground(new java.awt.Color(255, 204, 204));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelDni)
                    .addComponent(LabelEmail))
                .addGap(165, 165, 165)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(LabelNombre))
                    .addComponent(LabelIdCliente))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(LabelDni)
                    .addComponent(jLabel4)
                    .addComponent(LabelNombre))
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(LabelEmail)
                    .addComponent(LabelIdCliente))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Reserva", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jLabel8.setText("Fecha Ingreso :");

        jLabel9.setText("Feha Salida:");

        jLabel11.setText("Habitación");

        jLabel12.setText("Piso N°:");

        jLabel13.setFont(new java.awt.Font("Inter", 1, 36)); // NOI18N
        jLabel13.setText("S/.");

        LabelPrecio.setFont(new java.awt.Font("Inter", 1, 24)); // NOI18N
        LabelPrecio.setText(".........");

        DCFechaIngreso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DCFechaIngresoMouseClicked(evt);
            }
        });

        DCFechaSalida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DCFechaSalidaMouseClicked(evt);
            }
        });

        btnCalPrecio.setText("Calcular Precio");
        btnCalPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalPrecioActionPerformed(evt);
            }
        });

        jLabel14.setText("Estado :");

        cmbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Reservado", "Cancelado", " " }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel12)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DCFechaIngreso, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jSpinnerPiso, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(DCFechaSalida, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                            .addComponent(txtHabitación))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(LabelPrecio))
                            .addComponent(btnCalPrecio, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addContainerGap(31, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cmbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(DCFechaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(DCFechaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCalPrecio))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinnerPiso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(txtHabitación, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(LabelPrecio)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(cmbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        btnCancelar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnEnviarCorreo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnEnviarCorreo.setText("Send Email");
        btnEnviarCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarCorreoActionPerformed(evt);
            }
        });

        btnActualizarReserva.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnActualizarReserva.setText("Actualizar Reserva");
        btnActualizarReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarReservaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(btnActualizarReserva)
                        .addGap(18, 18, 18)
                        .addComponent(btnEnviarCorreo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                        .addComponent(btnCancelar))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnActualizarReserva)
                    .addComponent(btnEnviarCorreo)
                    .addComponent(btnCancelar))
                .addContainerGap(83, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 627, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DCFechaIngresoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DCFechaIngresoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_DCFechaIngresoMouseClicked

    private void DCFechaSalidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DCFechaSalidaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_DCFechaSalidaMouseClicked

    private void btnCalPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalPrecioActionPerformed

        if (DCFechaIngreso.getDate() != null && DCFechaSalida.getDate() != null) {

            Date fechaIngreso = DCFechaIngreso.getDate();
            Date fechaSalida = DCFechaSalida.getDate();

            // Formatear las fechas
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            String fechaIngresoFormateada = sdf.format(fechaIngreso);
            String fechaSalidaFormateada = sdf.format(fechaSalida);

            // Mostrar las fechas formateadas
            System.out.println("Fecha de Ingreso: " + fechaIngresoFormateada);
            System.out.println("Fecha de Salida: " + fechaSalidaFormateada);

            // Convertir Date a LocalDate
            LocalDate localFechaIngreso = fechaIngreso.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            LocalDate localFechaSalida = fechaSalida.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

            // Calcular el número de días entre las fechas
            long diasEstadia = ChronoUnit.DAYS.between(localFechaIngreso, localFechaSalida);

            // Calcular el precio total
            final double precioPorDia = 60;
            double precioTotal = diasEstadia * precioPorDia;

            // Mostrar el resultado
            System.out.println("Número de días de estadía: " + diasEstadia);
            System.out.println("Precio total: S/" + precioTotal);

            LabelPrecio.setText(String.valueOf(precioTotal));
        } else {
            JOptionPane.showMessageDialog(null, "Seleccionar la fecha de Ingreso y salida ", "INFORMATION_MESSAGE", JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_btnCalPrecioActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnEnviarCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarCorreoActionPerformed
        String numeroTicket = LabelDni.getText();
        // capturar la fecha de compra actual y la fecha de retorno

        Date fechaIngreso = DCFechaIngreso.getDate();
        Date fechaSalida = DCFechaSalida.getDate();

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String fechaIngresoF = sdf.format(fechaIngreso);
        String fechaSalidaF = sdf.format(fechaSalida);
        String precio = LabelPrecio.getText();

        String destinatario = LabelEmail.getText();
        String asunto = "Confirmación de la reserva del hotel";
        String cuerpo = "Gracias por tu Reserva. Detalles de la reserva:\nNúmero de Ticket: " + numeroTicket
                + "\nFecha de Ingreso: " + fechaIngresoF
                + "\nFecha de Salida: " + fechaSalidaF
                + "\nPrecio a cancelar: S/" + precio
                + "\n\n ***Gracias por tu preferencia te esperamos***";

        System.out.println("des" + destinatario);
        System.out.println("asun" + asunto);
        System.out.println("cuerpo" + cuerpo);

        boolean result = EmailSender.enviarCorreo(destinatario, asunto, cuerpo);
        if (result) {
            JOptionPane.showMessageDialog(null, "Correo enviado Satisfactoriamente", "INFORMATION_MESSAGE", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Error de envio", "INFORMATION_MESSAGE", JOptionPane.INFORMATION_MESSAGE);

        }

    }//GEN-LAST:event_btnEnviarCorreoActionPerformed

    private void btnActualizarReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarReservaActionPerformed
        if ("******DNI".equals(LabelDni.getText())) {
            JOptionPane.showMessageDialog(null, "Debes selecionar aun cliente :( ", "INFORMATION_MESSAGE", JOptionPane.INFORMATION_MESSAGE);
        } else {
            IReservaDao rDao = new ReservaDaoImpl();
            Reserva r = new Reserva();
            Cliente c = new Cliente();

            Date fechaIngreso = DCFechaIngreso.getDate();
            Date fechaSalida = DCFechaSalida.getDate();

            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            String fechaIngresoF = sdf.format(fechaIngreso);
            String fechaSalidaF = sdf.format(fechaSalida);
            r.setFechaIngreso(fechaIngresoF);
            r.setFechaSalida(fechaSalidaF);
            r.setNumeroPiso(jSpinnerPiso.getValue().toString());
            r.setNumeroHabitacion(Integer.parseInt(txtHabitación.getText()));
            double costo = Double.parseDouble(LabelPrecio.getText());
            r.setCosto(costo);
            c.setIdcliente(Integer.parseInt(LabelIdCliente.getText()));
            r.setCliente(c);
            r.setEstado((String) cmbEstado.getSelectedItem());
            r.setIdReserva(idreserva);
            boolean result = rDao.update(r);
            if (result == true) {
                this.setVisible(false);
                JOptionPane.showMessageDialog(null, "Reserva registrada exitosamente !!! ", "INFORMATION_MESSAGE", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Registo de reserva Fallido :(", "ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);

            }
            

        }


    }//GEN-LAST:event_btnActualizarReservaActionPerformed

    private void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, "INFORMATION_MESSAGE", JOptionPane.INFORMATION_MESSAGE);
    }

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser DCFechaIngreso;
    private com.toedter.calendar.JDateChooser DCFechaSalida;
    private javax.swing.JLabel LabelDni;
    private javax.swing.JLabel LabelEmail;
    private javax.swing.JLabel LabelIdCliente;
    private javax.swing.JLabel LabelNombre;
    private javax.swing.JLabel LabelPrecio;
    private javax.swing.JButton btnActualizarReserva;
    private javax.swing.JButton btnCalPrecio;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEnviarCorreo;
    private javax.swing.JComboBox<String> cmbEstado;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JSpinner jSpinnerPiso;
    private javax.swing.JTextField txtHabitación;
    // End of variables declaration//GEN-END:variables
}
