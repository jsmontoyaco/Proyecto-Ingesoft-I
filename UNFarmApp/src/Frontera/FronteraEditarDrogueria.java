package Frontera;

import Control.EditarDrogueria;
import Recursos.Funciones;
import Entidad.Drogueria;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class FronteraEditarDrogueria extends javax.swing.JPanel {

    EditarDrogueria drogueria = new EditarDrogueria();
    Funciones f = new Funciones();

    public FronteraEditarDrogueria() {
        initComponents();
        allSetEmpty();
        jlLogo.setSize(100, 100);
        jlLogo.setIcon(f.setImageBackground("/Recursos/logo.png", jlLogo));
        jlKit.setSize(100, 100);
        jlKit.setIcon(f.setImageBackground("/Recursos/medikit.png", jlKit));
        f.setStyleJButon(btnSalir);
        f.setStyleJButon(btnEditar);

    }

    public void allSetEmpty() {
        txtDireccion.setText("");
        txtEmail.setText("");
        txtNIT.setText("");
        txtNombreDrogueria.setText("");
        txtRepresentante.setText("");
        txtTelefono.setText("");
        f.setStyleJTextField(txtDireccion);
        f.setStyleJTextField(txtEmail);
        f.setStyleJTextField(txtNIT);
        f.setStyleJTextField(txtNombreDrogueria);
        f.setStyleJTextField(txtRepresentante);
        f.setStyleJTextField(txtTelefono);

    }
    
    
    public boolean initDrogueria(){
        if(drogueria.verDrogueria()){
            Drogueria drog = drogueria.obtenerDrogueria();
            this.txtNombreDrogueria.setText(drog.getNombredrogueria());
            this.txtNIT.setText(drog.getNitdrogueria());
            this.txtDireccion.setText(drog.getDirecciondrogueria());
            this.txtEmail.setText(drog.getEmail());
            this.txtRepresentante.setText(drog.getRepresentantelegal());
            this.txtTelefono.setText(drog.getTelefono());
            return true;
        }else
            return false;
    }

    
    @Override
    public void paintComponent(Graphics g) {
        ImageIcon imagen = new ImageIcon(getClass().getResource("/Recursos/fondo.png"));
        g.drawImage(imagen.getImage(), 0, 0, getWidth(), getHeight(), null);
        setOpaque(false);
        super.paintComponent(g);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlLogo = new javax.swing.JLabel();
        jlKit = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNombreDrogueria = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        txtNIT = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtRepresentante = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();

        setForeground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(0, 0));

        jlLogo.setPreferredSize(new java.awt.Dimension(100, 100));

        jlKit.setPreferredSize(new java.awt.Dimension(100, 100));

        jLabel1.setFont(new java.awt.Font("Leelawadee", 0, 34)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Edici??n de Droguer??a");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setPreferredSize(new java.awt.Dimension(300, 50));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Leelawadee", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Nombre Droguer??a");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel2.setPreferredSize(new java.awt.Dimension(220, 30));

        txtNombreDrogueria.setFont(new java.awt.Font("Leelawadee", 0, 24)); // NOI18N
        txtNombreDrogueria.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txtNombreDrogueria.setPreferredSize(new java.awt.Dimension(300, 30));
        txtNombreDrogueria.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNombreDrogueriaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNombreDrogueriaFocusLost(evt);
            }
        });
        txtNombreDrogueria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreDrogueriaActionPerformed(evt);
            }
        });
        txtNombreDrogueria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreDrogueriaKeyTyped(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Leelawadee", 0, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Direcci??n");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel3.setPreferredSize(new java.awt.Dimension(220, 30));

        txtDireccion.setFont(new java.awt.Font("Leelawadee", 0, 24)); // NOI18N
        txtDireccion.setPreferredSize(new java.awt.Dimension(300, 30));
        txtDireccion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDireccionFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDireccionFocusLost(evt);
            }
        });
        txtDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionActionPerformed(evt);
            }
        });
        txtDireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDireccionKeyTyped(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Leelawadee", 0, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Tel??fono");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel4.setPreferredSize(new java.awt.Dimension(220, 30));

        txtTelefono.setFont(new java.awt.Font("Leelawadee", 0, 24)); // NOI18N
        txtTelefono.setPreferredSize(new java.awt.Dimension(300, 30));
        txtTelefono.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtTelefonoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTelefonoFocusLost(evt);
            }
        });
        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });
        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });

        txtNIT.setFont(new java.awt.Font("Leelawadee", 0, 24)); // NOI18N
        txtNIT.setPreferredSize(new java.awt.Dimension(300, 30));
        txtNIT.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNITFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNITFocusLost(evt);
            }
        });
        txtNIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNITActionPerformed(evt);
            }
        });
        txtNIT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNITKeyTyped(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Leelawadee", 0, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("NIT");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel5.setPreferredSize(new java.awt.Dimension(220, 30));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Leelawadee", 0, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Representante Legal");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel6.setPreferredSize(new java.awt.Dimension(220, 30));

        txtRepresentante.setFont(new java.awt.Font("Leelawadee", 0, 24)); // NOI18N
        txtRepresentante.setPreferredSize(new java.awt.Dimension(300, 30));
        txtRepresentante.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtRepresentanteFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtRepresentanteFocusLost(evt);
            }
        });
        txtRepresentante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRepresentanteActionPerformed(evt);
            }
        });
        txtRepresentante.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRepresentanteKeyTyped(evt);
            }
        });

        txtEmail.setFont(new java.awt.Font("Leelawadee", 0, 24)); // NOI18N
        txtEmail.setPreferredSize(new java.awt.Dimension(300, 30));
        txtEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtEmailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEmailFocusLost(evt);
            }
        });
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEmailKeyTyped(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Leelawadee", 0, 24)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("E-mail");
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel7.setPreferredSize(new java.awt.Dimension(220, 30));

        btnSalir.setBackground(new java.awt.Color(204, 0, 0));
        btnSalir.setFont(new java.awt.Font("Leelawadee", 0, 20)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("Salir");
        btnSalir.setBorder(null);
        btnSalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSalir.setPreferredSize(new java.awt.Dimension(150, 40));
        btnSalir.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnSalir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnEditar.setBackground(new java.awt.Color(0, 158, 15));
        btnEditar.setFont(new java.awt.Font("Leelawadee", 0, 20)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setText("Editar");
        btnEditar.setPreferredSize(new java.awt.Dimension(150, 40));
        btnEditar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnEditar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlKit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(237, 237, 237)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jlLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 227, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtRepresentante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNIT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNombreDrogueria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(240, 240, 240))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlKit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jlLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreDrogueria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNIT, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRepresentante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSalir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreDrogueriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreDrogueriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreDrogueriaActionPerformed

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoActionPerformed

    private void txtDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionActionPerformed

    private void txtNITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNITActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNITActionPerformed

    private void txtRepresentanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRepresentanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRepresentanteActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        allSetEmpty();
        App.getInstance().ChangePanel(FramePrincipal.INTFronteraMenuAdministrador);
      //  App.getInstance().framePrincipal.splash.showAgain();
       // App.getInstance().framePrincipal.autenticarEmpleado.allSetEmpty();

    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtEmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isLetterOrDigit(c) && c != '@' && c != '.') {
            evt.consume();
        }
    }//GEN-LAST:event_txtEmailKeyTyped

    private void txtNombreDrogueriaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreDrogueriaKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isLetterOrDigit(c) && c != 32) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreDrogueriaKeyTyped

    private void txtDireccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDireccionKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isLetterOrDigit(c) && c != '-' && c != '.' && c != 32) {
            evt.consume();
        }
    }//GEN-LAST:event_txtDireccionKeyTyped

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void txtNITKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNITKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNITKeyTyped

    private void txtRepresentanteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRepresentanteKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isLetter(c) && c != 32) {
            evt.consume();
        }
    }//GEN-LAST:event_txtRepresentanteKeyTyped

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        
        Drogueria d = new Drogueria();
        d.setDirecciondrogueria(txtDireccion.getText());
        d.setEmail(txtEmail.getText());
        d.setNitdrogueria(txtNIT.getText());
        d.setNombredrogueria(txtNombreDrogueria.getText());
        d.setRepresentantelegal(txtRepresentante.getText());
        d.setTelefono(txtTelefono.getText());
        if (drogueria.validarDatos(d).equals("Registro exitoso")) {
            JLabel lb = new JLabel();
            lb.setSize(50, 50);
            JOptionPane.showMessageDialog(null,
                    "Drogueria actualizada Correctamente",
                    "Actualizaci??n exitosa",
                    JOptionPane.CANCEL_OPTION,
                    f.setImageBackground("/recursos/exito.png", lb)
            );
            allSetEmpty();
            App.getInstance().ChangePanel(FramePrincipal.INTFronteraMenuAdministrador);

        } else {
            JOptionPane.showMessageDialog(null,
                    "Algun Campo Esta Mal Diligenciado, Por Favor Verificarlos",
                    "Comprobar Campos",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    /*
        en las siguientes funciones de los TextFields (FocusLost y FocusGained)
        lo que se ate es validar si la longitud es correcta, si no es asi
        se evia una alerta de dialogo con el error y el campo se pone en rosado
        una vez perdido el foco, cuando se retoma se borra lo que hay dentro y
        se devuelve a su color original
     */
    private void txtNombreDrogueriaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreDrogueriaFocusLost
        if (!txtNombreDrogueria.getText().equals("")) {
            if (drogueria.validarNombre_drogueria(txtNombreDrogueria.getText())
                    .equals("Longitud nombre incorrecta")) {
                JOptionPane.showMessageDialog(null,
                        "El Nombre Debe Tener Entre 11 y 33 Caracteres",
                        "Longitud Nombre Incorrecta",
                        JOptionPane.ERROR_MESSAGE);
                txtNombreDrogueria.setBackground(f.fondoTxtError);

            }
        }
    }//GEN-LAST:event_txtNombreDrogueriaFocusLost

    private void txtNombreDrogueriaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreDrogueriaFocusGained
        if (txtNombreDrogueria.getBackground().equals(f.fondoTxtError)) {
            txtNombreDrogueria.setBackground(f.fondoTxt);
            txtNombreDrogueria.setText("");
        }
    }//GEN-LAST:event_txtNombreDrogueriaFocusGained

    private void txtDireccionFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDireccionFocusGained
        if (txtDireccion.getBackground().equals(f.fondoTxtError)) {
            txtDireccion.setBackground(f.fondoTxt);
            txtDireccion.setText("");
        }
    }//GEN-LAST:event_txtDireccionFocusGained

    private void txtDireccionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDireccionFocusLost
        if (!txtDireccion.getText().equals("")) {
            if (drogueria.validarDireccion(
                    txtDireccion.getText()).equals("Longitud direcci??n incorrecta")) {
                JOptionPane.showMessageDialog(null,
                        "La Direccion Debe Tener Entre 12 y 32 Caracteres",
                        "Longitud Direcci??n Incorrecta",
                        JOptionPane.ERROR_MESSAGE);
                txtDireccion.setBackground(f.fondoTxtError);

            }
        }
    }//GEN-LAST:event_txtDireccionFocusLost

    private void txtTelefonoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTelefonoFocusLost
        if (!txtTelefono.getText().equals("")) {
            if (drogueria.validarTelefono_drogueria(
                    txtTelefono.getText()).equals("N??mero telef??nico no v??lido")) {
                JOptionPane.showMessageDialog(null,
                        " El N??mero Telef??nico Debe Tener Entre 7 y 15 Caracteres",
                        "N??mero Telef??nico No V??lido",
                        JOptionPane.ERROR_MESSAGE);
                txtTelefono.setBackground(f.fondoTxtError);

            }
        }
    }//GEN-LAST:event_txtTelefonoFocusLost

    private void txtTelefonoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTelefonoFocusGained
        if (txtTelefono.getBackground().equals(f.fondoTxtError)) {
            txtTelefono.setBackground(f.fondoTxt);
            txtTelefono.setText("");
        }
    }//GEN-LAST:event_txtTelefonoFocusGained

    private void txtNITFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNITFocusLost
        if (!txtNIT.getText().equals("")) {
            if (drogueria.validarNit(
                    txtNIT.getText()).equals("Nit no v??lido")) {
                JOptionPane.showMessageDialog(null,
                        " Nit Debe Tener Entre 11 y 20 Caracteres",
                        "Nit No V??lido",
                        JOptionPane.ERROR_MESSAGE);
                txtNIT.setBackground(f.fondoTxtError);

            }
        }
    }//GEN-LAST:event_txtNITFocusLost

    private void txtNITFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNITFocusGained
        if (txtNIT.getBackground().equals(f.fondoTxtError)) {
            txtNIT.setBackground(f.fondoTxt);
            txtNIT.setText("");
        }
    }//GEN-LAST:event_txtNITFocusGained

    private void txtRepresentanteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRepresentanteFocusLost
        if (!txtRepresentante.getText().equals("")) {
            if (drogueria.validarRepresentante(
                    txtRepresentante.getText()).equals("Longitud representante legal incorrecta")) {
                JOptionPane.showMessageDialog(null,
                        "El Represetante Legal Debe Tener Entre 11 y 32 Caracteres",
                        "Lontigud Represetante Legal Incorrecta",
                        JOptionPane.ERROR_MESSAGE);
                txtRepresentante.setBackground(f.fondoTxtError);

            }
        }
    }//GEN-LAST:event_txtRepresentanteFocusLost

    private void txtRepresentanteFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRepresentanteFocusGained
        if (txtRepresentante.getBackground().equals(f.fondoTxtError)) {
            txtRepresentante.setBackground(f.fondoTxt);
            txtRepresentante.setText("");
        }
    }//GEN-LAST:event_txtRepresentanteFocusGained

    private void txtEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusLost
        if (!txtEmail.getText().equals("")) {
            if (drogueria.validarEmail(
                    txtEmail.getText()).equals("Correo no v??lido")) {
                JOptionPane.showMessageDialog(null,
                        "El Correo Debe Tener Entre 9 y 50 Caracteres,"
                        + "\n Ademas Debe Contener Una Arroba y Un Punto",
                        "Correo No V??lido",
                        JOptionPane.ERROR_MESSAGE);
                txtEmail.setBackground(f.fondoTxtError);

            }
        }
    }//GEN-LAST:event_txtEmailFocusLost

    private void txtEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusGained
        if (txtEmail.getBackground().equals(f.fondoTxtError)) {
            txtEmail.setBackground(f.fondoTxt);
            txtEmail.setText("");
        }
    }//GEN-LAST:event_txtEmailFocusGained


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jlKit;
    private javax.swing.JLabel jlLogo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNIT;
    private javax.swing.JTextField txtNombreDrogueria;
    private javax.swing.JTextField txtRepresentante;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
