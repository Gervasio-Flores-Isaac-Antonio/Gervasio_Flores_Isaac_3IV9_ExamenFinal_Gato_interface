
package ExamenGato2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class GatoApp extends javax.swing.JFrame {

    private int turn=2;
    private int usarboton[]={0,0,0,0,0,0,0,0,0};
    private int jugador1gano[]={0,0,0,0,0,0,0,0,0};
    private int jugador2gano[]={0,0,0,0,0,0,0,0,0};
    private static int puntosJugador1=0;
    private static int puntosJugador2=0;
    private static String puntaje1="0";
    private static String puntaje2="0";
    private Usuario usuario;
    private Usuario usuario2;
    
    
    
    
    
    public int jugador1gano(){
        if(jugador1gano[0]==1 && jugador1gano[1]==1 && jugador1gano[2]==1){
            return 1;
        }
         if(jugador1gano[3]==1 && jugador1gano[4]==1 && jugador1gano[5]==1){
            return 1;
        }
          if(jugador1gano[6]==1 && jugador1gano[7]==1 && jugador1gano[8]==1){
            return 1;
        }
           if(jugador1gano[0]==1 && jugador1gano[3]==1 && jugador1gano[6]==1){
            return 1;
        }
           if(jugador1gano[1]==1 && jugador1gano[4]==1 && jugador1gano[7]==1){
            return 1;
        }
            if(jugador1gano[2]==1 && jugador1gano[5]==1 && jugador1gano[8]==1){
            return 1;
        }
             if(jugador1gano[2]==1 && jugador1gano[4]==1 && jugador1gano[6]==1){
            return 1;
        }
              if(jugador1gano[0]==1 && jugador1gano[4]==1 && jugador1gano[8]==1){
            return 1;
        }
            
                return 0;
    }
    public int jugador2gano(){
        if(jugador2gano[0]==1 && jugador2gano[1]==1 && jugador2gano[2]==1){
            return 1;
        }
         if(jugador2gano[3]==1 && jugador2gano[4]==1 && jugador2gano[5]==1){
            return 1;
        }
          if(jugador2gano[6]==1 && jugador2gano[7]==1 && jugador2gano[8]==1){
            return 1;
        }
           if(jugador2gano[0]==1 && jugador2gano[3]==1 && jugador2gano[6]==1){
            return 1;
        }
           if(jugador2gano[1]==1 && jugador2gano[4]==1 && jugador2gano[7]==1){
            return 1;
        }
            if(jugador2gano[2]==1 && jugador2gano[5]==1 && jugador2gano[8]==1){
            return 1;
        }
             if(jugador2gano[2]==1 && jugador2gano[4]==1 && jugador2gano[6]==1){
            return 1;
        }
              if(jugador2gano[0]==1 && jugador2gano[4]==1 && jugador2gano[8]==1){
            return 1;
        }
            
                return 0;
    }
    
    public GatoApp() {
         initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        Boton1 = new javax.swing.JButton();
        Boton3 = new javax.swing.JButton();
        Boton2 = new javax.swing.JButton();
        Boton4 = new javax.swing.JButton();
        Boton5 = new javax.swing.JButton();
        Boton7 = new javax.swing.JButton();
        Boton6 = new javax.swing.JButton();
        Boton8 = new javax.swing.JButton();
        Boton9 = new javax.swing.JButton();
        resetear = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();

        jLabel9.setText("Edad:");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(300, 300));
        getContentPane().setLayout(null);

        Boton1.setFont(new java.awt.Font("Tahoma", 1, 56)); // NOI18N
        Boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton1ActionPerformed(evt);
            }
        });
        getContentPane().add(Boton1);
        Boton1.setBounds(71, 44, 166, 130);

        Boton3.setFont(new java.awt.Font("Tahoma", 1, 56)); // NOI18N
        Boton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton3ActionPerformed(evt);
            }
        });
        getContentPane().add(Boton3);
        Boton3.setBounds(500, 50, 166, 130);

        Boton2.setFont(new java.awt.Font("Tahoma", 1, 56)); // NOI18N
        Boton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton2ActionPerformed(evt);
            }
        });
        getContentPane().add(Boton2);
        Boton2.setBounds(290, 50, 166, 130);

        Boton4.setFont(new java.awt.Font("Tahoma", 1, 56)); // NOI18N
        Boton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton4ActionPerformed(evt);
            }
        });
        getContentPane().add(Boton4);
        Boton4.setBounds(63, 233, 166, 130);

        Boton5.setFont(new java.awt.Font("Tahoma", 1, 56)); // NOI18N
        Boton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton5ActionPerformed(evt);
            }
        });
        getContentPane().add(Boton5);
        Boton5.setBounds(280, 240, 166, 130);

        Boton7.setFont(new java.awt.Font("Tahoma", 1, 56)); // NOI18N
        Boton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton7ActionPerformed(evt);
            }
        });
        getContentPane().add(Boton7);
        Boton7.setBounds(60, 420, 166, 130);

        Boton6.setFont(new java.awt.Font("Tahoma", 1, 56)); // NOI18N
        Boton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton6ActionPerformed(evt);
            }
        });
        getContentPane().add(Boton6);
        Boton6.setBounds(510, 240, 166, 130);

        Boton8.setFont(new java.awt.Font("Tahoma", 1, 56)); // NOI18N
        Boton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton8ActionPerformed(evt);
            }
        });
        getContentPane().add(Boton8);
        Boton8.setBounds(280, 420, 166, 130);

        Boton9.setFont(new java.awt.Font("Tahoma", 1, 56)); // NOI18N
        Boton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton9ActionPerformed(evt);
            }
        });
        getContentPane().add(Boton9);
        Boton9.setBounds(510, 420, 166, 130);

        resetear.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        resetear.setText("Nuevo");
        resetear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetearActionPerformed(evt);
            }
        });
        getContentPane().add(resetear);
        resetear.setBounds(300, 580, 110, 30);

        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(810, 420, 79, 25);
        getContentPane().add(jLabel6);
        jLabel6.setBounds(2618, 386, 0, 0);
        getContentPane().add(jLabel7);
        jLabel7.setBounds(2618, 448, 0, 0);

        jLabel8.setText("Usuarios");

        jLabel10.setText("Edad:");

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jButton3.setText("usuario");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2))
                .addGap(230, 230, 230))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(750, 30, 404, 112);
        getContentPane().add(jLabel13);
        jLabel13.setBounds(2606, 1394, 0, 0);
        getContentPane().add(jLabel14);
        jLabel14.setBounds(2606, 1430, 0, 0);

        jLabel19.setText("score");

        jLabel3.setText("0");

        jLabel2.setText("0");

        jLabel23.setText("Usuario 1");

        jLabel24.setText("Edad");

        jLabel25.setText("Usuario 2");

        jLabel26.setText("Edad");

        jLabel27.setText("score 2");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel25)
                        .addGap(42, 42, 42))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel26)
                        .addGap(68, 68, 68))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel27))
                        .addGap(54, 54, 54))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(jLabel26))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(720, 210, 200, 190);

        jButton4.setText("usuario 2");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(750, 140, 90, 25);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton1ActionPerformed
       if(usarboton[0]==0){
            if(turn%2==0){
            turn++;
            Boton1.setText("X");
            usarboton[0]=1;
            jugador1gano[0]=1;
            
            revisa();

        }else{
            turn++;
            Boton1.setText("O");
            usarboton[0]=1;
            jugador2gano[0]=1;
            
            revisa();

            
        }
       }else{
           JOptionPane.showMessageDialog(rootPane, "este boton ya esta usado");
       }
       
    }//GEN-LAST:event_Boton1ActionPerformed

    private void Boton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton2ActionPerformed
        
         if(usarboton[1]==0){
            if(turn%2==0){
            turn++;
            Boton2.setText("X");
             usarboton[1]=1;
            jugador1gano[1]=1;
            
            revisa();
//            int resultado1=jugador1gano();
//            int resultado2=jugador2gano();
//            
//            if(resultado1==1){
//                JOptionPane.showMessageDialog(rootPane, "*****tu has ganado. felicitaciones*****");
//            }else if(resultado2==1){
//                JOptionPane.showMessageDialog(rootPane, "*****JAJAJAJAJAJAJAJA.....mala suerte. ha ganado la maquina*****");
//            }
            
        }else{
            turn++;
            Boton2.setText("O");
            usarboton[1]=1;
            jugador2gano[1]=1;
            
            revisa();
//            int resultado1=jugador1gano();
//            int resultado2=jugador2gano();
//            
//            if(resultado1==1){
//                JOptionPane.showMessageDialog(rootPane, "*****tu has ganado. felicitaciones*****");
//            }else if(resultado2==1){
//                JOptionPane.showMessageDialog(rootPane, "*****JAJAJAJAJAJAJAJA.....mala suerte. ha ganado la maquina*****");
//            }
        }
            
       }else{
           JOptionPane.showMessageDialog(rootPane, "este boton ya esta usado");
       }
    }//GEN-LAST:event_Boton2ActionPerformed

    private void Boton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton3ActionPerformed
        
          if(usarboton[2]==0){
            if(turn%2==0){
            turn++;
            Boton3.setText("X");
            usarboton[2]=1;
            jugador1gano[2]=1;
            
            revisa();
//            int resultado1=jugador1gano();
//            int resultado2=jugador2gano();
//            
//            if(resultado1==1){
//                JOptionPane.showMessageDialog(rootPane, "*****tu has ganado. felicitaciones*****");
//            }else if(resultado2==1){
//                JOptionPane.showMessageDialog(rootPane, "*****JAJAJAJAJAJAJAJA.....mala suerte. ha ganado la maquina*****");
//            }
        }else{
            turn++;
            Boton3.setText("O");
            usarboton[2]=1;
            jugador2gano[2]=1;
            
            revisa();
//            int resultado1=jugador1gano();
//            int resultado2=jugador2gano();
//            
//            if(resultado1==1){
//                JOptionPane.showMessageDialog(rootPane, "*****tu has ganado. felicitaciones*****");
//            }else if(resultado2==1){
//                JOptionPane.showMessageDialog(rootPane, "*****JAJAJAJAJAJAJAJA.....mala suerte. ha ganado la maquina*****");
//            }
        }
       }else{
           JOptionPane.showMessageDialog(rootPane, "este boton ya esta usado");
       }
        
    }//GEN-LAST:event_Boton3ActionPerformed

    private void Boton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton4ActionPerformed
       
          if(usarboton[3]==0){
            if(turn%2==0){
            turn++;
            Boton4.setText("X");
            usarboton[3]=1;
            jugador1gano[3]=1;
            
            revisa();
//            int resultado1=jugador1gano();
//            int resultado2=jugador2gano();
//            
//            if(resultado1==1){
//                JOptionPane.showMessageDialog(rootPane, "*****tu has ganado. felicitaciones*****");
//            }else if(resultado2==1){
//                JOptionPane.showMessageDialog(rootPane, "*****JAJAJAJAJAJAJAJA.....mala suerte. ha ganado la maquina*****");
//            }
        }else{
            turn++;
            Boton4.setText("O");
            usarboton[3]=1;
            jugador2gano[3]=1;
            
            revisa();
//            int resultado1=jugador1gano();
//            int resultado2=jugador2gano();
//            
//            if(resultado1==1){
//                JOptionPane.showMessageDialog(rootPane, "*****tu has ganado. felicitaciones*****");
//            }else if(resultado2==1){
//                JOptionPane.showMessageDialog(rootPane, "*****JAJAJAJAJAJAJAJA.....mala suerte. ha ganado la maquina*****");
//            }
        }
       }else{
           JOptionPane.showMessageDialog(rootPane, "este boton ya esta usado");
       }
    }//GEN-LAST:event_Boton4ActionPerformed

    private void Boton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton5ActionPerformed
        
         if(usarboton[4]==0){
            if(turn%2==0){
            turn++;
            Boton5.setText("X");
            usarboton[4]=1;
            jugador1gano[4]=1;
            
            revisa();
//            int resultado1=jugador1gano();
//            int resultado2=jugador2gano();
//            
//            if(resultado1==1){
//                JOptionPane.showMessageDialog(rootPane, "*****tu has ganado. felicitaciones*****");
//            }else if(resultado2==1){
//                JOptionPane.showMessageDialog(rootPane, "*****JAJAJAJAJAJAJAJA.....mala suerte. ha ganado la maquina*****");
//            }
        }else{
            turn++;
            Boton5.setText("O");
            usarboton[4]=1;
            jugador2gano[4]=1;
            
            revisa();
//            int resultado1=jugador1gano();
//            int resultado2=jugador2gano();
//            
//            if(resultado1==1){
//                JOptionPane.showMessageDialog(rootPane, "*****tu has ganado. felicitaciones*****");
//            }else if(resultado2==1){
//                JOptionPane.showMessageDialog(rootPane, "*****JAJAJAJAJAJAJAJA.....mala suerte. ha ganado la maquina*****");
//            }
        }
       }else{
           JOptionPane.showMessageDialog(rootPane, "este boton ya esta usado");
       }
    }//GEN-LAST:event_Boton5ActionPerformed

    private void Boton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton6ActionPerformed
          if(usarboton[5]==0){
            if(turn%2==0){
            turn++;
            Boton6.setText("X");
            usarboton[5]=1;
            jugador1gano[5]=1;
            
            revisa();
//            int resultado1=jugador1gano();
//            int resultado2=jugador2gano();
//            
//            if(resultado1==1){
//                JOptionPane.showMessageDialog(rootPane, "*****tu has ganado. felicitaciones*****");
//            }else if(resultado2==1){
//                JOptionPane.showMessageDialog(rootPane, "*****JAJAJAJAJAJAJAJA.....mala suerte. ha ganado la maquina*****");
//            }
        }else{
            turn++;
            Boton6.setText("O");
            usarboton[5]=1;
            jugador2gano[5]=1;
            
            revisa();
//            int resultado1=jugador1gano();
//            int resultado2=jugador2gano();
//            
//            if(resultado1==1){
//                JOptionPane.showMessageDialog(rootPane, "*****tu has ganado. felicitaciones*****");
//            }else if(resultado2==1){
//                JOptionPane.showMessageDialog(rootPane, "*****JAJAJAJAJAJAJAJA.....mala suerte. ha ganado la maquina*****");
//            }
        }
       }else{
           JOptionPane.showMessageDialog(rootPane, "este boton ya esta usado");
       }
    }//GEN-LAST:event_Boton6ActionPerformed

    private void Boton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton7ActionPerformed
        
        if(usarboton[6]==0){
            if(turn%2==0){
            turn++;
            Boton7.setText("X");
            usarboton[6]=1;
            jugador1gano[6]=1;
            
            revisa();
//            int resultado1=jugador1gano();
//            int resultado2=jugador2gano();
//            
//            if(resultado1==1){
//                JOptionPane.showMessageDialog(rootPane, "*****tu has ganado. felicitaciones*****");
//            }else if(resultado2==1){
//                JOptionPane.showMessageDialog(rootPane, "*****JAJAJAJAJAJAJAJA.....mala suerte. ha ganado la maquina*****");
//            }
        }else{
            turn++;
            Boton7.setText("O");
            usarboton[6]=1;
            jugador2gano[6]=1;
            
            revisa();
//            int resultado1=jugador1gano();
//            int resultado2=jugador2gano();
//            
//            if(resultado1==1){
//                JOptionPane.showMessageDialog(rootPane, "*****tu has ganado. felicitaciones*****");
//            }else if(resultado2==1){
//                JOptionPane.showMessageDialog(rootPane, "*****JAJAJAJAJAJAJAJA.....mala suerte. ha ganado la maquina*****");
//            }
        }
       }else{
           JOptionPane.showMessageDialog(rootPane, "este boton ya esta usado");
       }
    }//GEN-LAST:event_Boton7ActionPerformed

    private void Boton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton8ActionPerformed
        
          if(usarboton[7]==0){
            if(turn%2==0){
            turn++;
            Boton8.setText("X");
            usarboton[7]=1;
            jugador1gano[7]=1;
            
            revisa();
//            int resultado1=jugador1gano();
//            int resultado2=jugador2gano();
//            
//            if(resultado1==1){
//                JOptionPane.showMessageDialog(rootPane, "*****tu has ganado. felicitaciones*****");
//            }else if(resultado2==1){
//                JOptionPane.showMessageDialog(rootPane, "*****JAJAJAJAJAJAJAJA.....mala suerte. ha ganado la maquina*****");
//            }
        }else{
            turn++;
            Boton8.setText("O");
            usarboton[7]=1;
            jugador2gano[7]=1;
            
            revisa();
//            int resultado1=jugador1gano();
//            int resultado2=jugador2gano();
//            
//            if(resultado1==1){
//                JOptionPane.showMessageDialog(rootPane, "*****tu has ganado. felicitaciones*****");
//            }else if(resultado2==1){
//                JOptionPane.showMessageDialog(rootPane, "*****JAJAJAJAJAJAJAJA.....mala suerte. ha ganado la maquina*****");
//            }
        }
       }else{
           JOptionPane.showMessageDialog(rootPane, "este boton ya esta usado");
       }
    }//GEN-LAST:event_Boton8ActionPerformed

    private void Boton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton9ActionPerformed
        
          if(usarboton[8]==0){
            if(turn%2==0){
            turn++;
            Boton9.setText("X");
            usarboton[8]=1;
            jugador1gano[8]=1;
            
            revisa();
//            int resultado1=jugador1gano();
//            int resultado2=jugador2gano();
//            
//            if(resultado1==1){
//                JOptionPane.showMessageDialog(rootPane, "*****tu has ganado. felicitaciones*****");
//            }else if(resultado2==1){
//                JOptionPane.showMessageDialog(rootPane, "*****JAJAJAJAJAJAJAJA.....mala suerte. ha ganado la maquina*****");
//            }
        }else{
            turn++;
            Boton9.setText("O");
            usarboton[8]=1;
            jugador2gano[8]=1;
            
            revisa();
//            int resultado1=jugador1gano();
//            int resultado2=jugador2gano();
//            
//            if(resultado1==1){
//                JOptionPane.showMessageDialog(rootPane, "*****tu has ganado. felicitaciones*****");
//            }else if(resultado2==1){
//                JOptionPane.showMessageDialog(rootPane, "*****JAJAJAJAJAJAJAJA.....mala suerte. ha ganado la maquina*****");
//            }
        }
       }else{
           JOptionPane.showMessageDialog(rootPane, "este boton ya esta usado");
       }
    }//GEN-LAST:event_Boton9ActionPerformed

    private void resetearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetearActionPerformed
        
        Boton1.setText("");
        Boton2.setText("");
        Boton3.setText("");
        Boton4.setText("");
        Boton5.setText("");
        Boton6.setText("");
        Boton7.setText("");
        Boton8.setText("");
        Boton9.setText("");
       
        turn=2;
        for(int i=0;i<9;i++){
            usarboton[i]=0;
        }
        for(int i=0;i<9;i++){
            jugador1gano[i]=0;
        }
        for(int i=0;i<9;i++){
            jugador2gano[i]=0;
        }
        
    }//GEN-LAST:event_resetearActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.out.println("boton guardar");
       
        String archivo="C:\\isaac2\\isaac.txt";
        
        FileWriter escribir;
       
       
    try {

        escribir = new FileWriter(archivo, true);
        escribir.write(usuario.getNombre());
        escribir.write("\n");
        escribir.write(usuario.getEdad());
        escribir.write("\n");
        escribir.write(usuario.getPuntaje());
        escribir.write("\n");
        escribir.write("\n");
        escribir.write(usuario2.getNombre());
        escribir.write("\n");
        escribir.write(usuario2.getEdad());
        escribir.write("\n");
        escribir.write(usuario2.getPuntaje());
        escribir.write("\n");
        escribir.write("\n");
        escribir.close();

    } catch (FileNotFoundException ex) {
        JOptionPane.showMessageDialog(null, "Error al guardar, ponga nombre al archivo");
    } catch (IOException ex) {
        JOptionPane.showMessageDialog(null, "Error al guardar, en la salida");
    }  
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        String nombre = jTextField1.getText();
        String edad = jTextField2.getText();

        jLabel6.setText(nombre);
        jLabel7.setText(edad);
        
        usuario = new Usuario(nombre,edad, puntaje1);
       
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        
        String nombre = jTextField1.getText();
        String edad = jTextField2.getText();

        jLabel13.setText(nombre);
        jLabel14.setText(edad);
        
     
        usuario2 = new Usuario(nombre,edad, puntaje2);
        
    }//GEN-LAST:event_jButton4ActionPerformed
    
     public void leeArchivo(String archivo) throws FileNotFoundException, IOException {
        System.out.println("muestraContenido");
        String cadena;
      FileReader f = new FileReader(archivo);
      BufferedReader b = new BufferedReader(f);
      while((cadena = b.readLine())!=null) {
          System.out.println(cadena);
      }
      b.close();
}
     
     public void revisa(){
     
     int resultado1=jugador1gano();
            int resultado2=jugador2gano();
            
            if(resultado1==1){
             
                JOptionPane.showMessageDialog(rootPane, "*****tu has ganado. felicitaciones*****");
            
            puntosJugador1++;

            puntaje1 = Integer.toString(puntosJugador1);
            
            
            jLabel2.setText(Integer.toString(puntosJugador1));
            
            
            
            }else if(resultado2==1){
                JOptionPane.showMessageDialog(rootPane, "*****JAJAJAJAJAJAJAJA.....mala suerte. ha ganado la maquina*****");
            puntosJugador2++;
            
            puntaje2 = Integer.toString(puntosJugador2);
            
            
            jLabel3.setText(Integer.toString(puntosJugador2));
            
            }
     
     
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
            java.util.logging.Logger.getLogger(GatoApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GatoApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GatoApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GatoApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GatoApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton1;
    private javax.swing.JButton Boton2;
    private javax.swing.JButton Boton3;
    private javax.swing.JButton Boton4;
    private javax.swing.JButton Boton5;
    private javax.swing.JButton Boton6;
    private javax.swing.JButton Boton7;
    private javax.swing.JButton Boton8;
    private javax.swing.JButton Boton9;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JButton resetear;
    // End of variables declaration//GEN-END:variables

    
    
   
}