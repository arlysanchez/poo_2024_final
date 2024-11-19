/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista.Reserva;

import Utils.EmailSender;
import controller.IClientDao;
import controller.IReservaDao;
import controllerImpl.ClienteDaoImpl;
import controllerImpl.ReservaDaoImpl;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import javax.swing.JOptionPane;
import model.Cliente;
import model.Reserva;
import model.Usuario;

/**
 *
 * @author tpp
 */
public class NewReserva extends javax.swing.JFrame {
    int idCliente;
    /**
     * Creates new form NewReserva
     */
    public NewReserva() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_dni = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        labelDni = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        labelCliente = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        labelEmail = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        FI_date = new com.toedter.calendar.JDateChooser();
        FS_date = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnCalcular = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jSpinnerPiso = new javax.swing.JSpinner();
        jLabel11 = new javax.swing.JLabel();
        txtHabitación = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        LabelPrecio = new javax.swing.JLabel();
        btnGenerarReserva = new javax.swing.JButton();
        btnEnviarCorreo = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 204));

        jPanel1.setBackground(new java.awt.Color(254, 254, 227));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Buscar Cliente"));

        jLabel1.setText("DNI:");

        btnBuscar.setBackground(new java.awt.Color(255, 153, 102));
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addComponent(txt_dni, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnBuscar)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_dni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del cliente"));

        jLabel2.setText("DNI:");

        labelDni.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelDni.setText("***DNI***");

        jLabel3.setText("Nombre: ");

        labelCliente.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelCliente.setText("***Name***");

        jLabel4.setText("Email:");

        labelEmail.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelEmail.setText("***EMAIL***");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addGap(36, 36, 36)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(labelDni)
                        .addGap(138, 138, 138)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(labelCliente))
                    .addComponent(labelEmail))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(labelDni)
                    .addComponent(jLabel3)
                    .addComponent(labelCliente))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(labelEmail))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Reserva"));

        jLabel5.setText("Ingreso");

        jLabel6.setText("Salida");

        btnCalcular.setText("calcular Precio");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        jLabel12.setText("Piso N°:");

        jLabel11.setText("Habitación");

        jLabel13.setFont(new java.awt.Font("Inter", 1, 36)); // NOI18N
        jLabel13.setText("S/.");

        LabelPrecio.setFont(new java.awt.Font("Inter", 1, 24)); // NOI18N
        LabelPrecio.setText(".........");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(29, 29, 29)
                        .addComponent(FI_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(FS_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(btnCalcular)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSpinnerPiso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(txtHabitación)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(LabelPrecio)
                        .addGap(21, 21, 21))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCalcular)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(FI_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(FS_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinnerPiso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(txtHabitación, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(LabelPrecio)
                    .addComponent(jLabel12))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        btnGenerarReserva.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnGenerarReserva.setText("Generar Reserva");
        btnGenerarReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarReservaActionPerformed(evt);
            }
        });

        btnEnviarCorreo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnEnviarCorreo.setText("Send Email");
        btnEnviarCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarCorreoActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnGenerarReserva)
                                        .addGap(19, 19, 19)
                                        .addComponent(btnEnviarCorreo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                                        .addComponent(btnCancelar))
                                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnEnviarCorreo)
                    .addComponent(btnGenerarReserva))
                .addContainerGap(73, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
try {
            String dni = txt_dni.getText();

            IClientDao clDAO = new ClienteDaoImpl();
            Cliente cliente = clDAO.searchByDni(dni);

            if (cliente == null) {
                mostrarMensaje("Cliente no registrado:");
            } else {
                this.idCliente = cliente.getIdcliente();
                labelDni.setText(cliente.getDni());
                labelCliente.setText(cliente.getNombre());
                labelEmail.setText(cliente.getEmail());
            }
        } catch (Exception ex) {
            // Manejar excepciones, por ejemplo, mostrar un mensaje de error
            mostrarMensaje("Error al buscar cliente: " + ex.getMessage());
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnGenerarReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarReservaActionPerformed
        if ("***DNI***".equals(labelDni.getText()) && ".........".equals(LabelPrecio.getText())  ) {
            JOptionPane.showMessageDialog(null, "Debes selecionar aun cliente :( ", "INFORMATION_MESSAGE", JOptionPane.INFORMATION_MESSAGE);
        } else {
            IReservaDao rDao = new ReservaDaoImpl();
            Reserva r = new Reserva();
            Cliente c = new Cliente();
            
            Usuario u = new Usuario();
            u.setIdUsuario(1);
            

            Date fechaIngreso = FI_date.getDate();
            Date fechaSalida = FS_date.getDate();

            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            String fechaIngresoF = sdf.format(fechaIngreso);
            String fechaSalidaF = sdf.format(fechaSalida);
            r.setFechaIngreso(fechaIngresoF);
            r.setFechaSalida(fechaSalidaF);
            r.setNumeroPiso(jSpinnerPiso.getValue().toString());
            r.setNumeroHabitacion(Integer.parseInt(txtHabitación.getText()));
            double costo = Double.parseDouble(LabelPrecio.getText());
            r.setCosto(costo);
            c.setIdcliente(idCliente);
            r.setCliente(c);
            r.setEstado("R");
            r.setUsuario(u);
            System.out.println("datos"+r);
            boolean result = rDao.insert(r);

            if (result == true) {
                JOptionPane.showMessageDialog(null, "Reserva registrada exitosamente !!! ", "INFORMATION_MESSAGE", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Registo de reserva Fallido :(", "ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);

            }

        }

    }//GEN-LAST:event_btnGenerarReservaActionPerformed

    private void btnEnviarCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarCorreoActionPerformed
        String numeroTicket = labelDni.getText();
        // capturar la fecha de compra actual y la fecha de retorno

        Date fechaIngreso = FI_date.getDate();
        Date fechaSalida = FS_date.getDate();

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String fechaIngresoF = sdf.format(fechaIngreso);
        String fechaSalidaF = sdf.format(fechaSalida);
        String precio = LabelPrecio.getText();

        String destinatario = labelEmail.getText();
        String asunto = "Confirmación de la reserva del hotel";
        String cuerpo = "Gracias por tu Reserva. Detalles de la reserva:"
        + "\nNúmero de Ticket: " + numeroTicket
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

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
     if (FI_date.getDate() != null && FS_date.getDate() != null) {

            Date fechaIngreso = FI_date.getDate();
            Date fechaSalida = FS_date.getDate();

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
            final double precioPorDia = 80;
            double precioTotal = diasEstadia * precioPorDia;

            // Mostrar el resultado
            System.out.println("Número de días de estadía: " + diasEstadia);
            System.out.println("Precio total: S/" + precioTotal);

            LabelPrecio.setText(String.valueOf(precioTotal));
        } else {
            JOptionPane.showMessageDialog(null, "Seleccionar la fecha de Ingreso y salida ", "INFORMATION_MESSAGE", JOptionPane.INFORMATION_MESSAGE);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, "INFORMATION_MESSAGE", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewReserva().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser FI_date;
    private com.toedter.calendar.JDateChooser FS_date;
    private javax.swing.JLabel LabelPrecio;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEnviarCorreo;
    private javax.swing.JButton btnGenerarReserva;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSpinner jSpinnerPiso;
    private javax.swing.JLabel labelCliente;
    private javax.swing.JLabel labelDni;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JTextField txtHabitación;
    private javax.swing.JTextField txt_dni;
    // End of variables declaration//GEN-END:variables
}