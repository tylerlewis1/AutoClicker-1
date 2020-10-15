import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;



public class GUI extends javax.swing.JFrame {
    
    RobotClicker rc = new RobotClicker();
    static KeyEvent kevt;
    static ActionEvent aevt;
    public Robot robot;
    
    private int delay;
    private int repetitions;
    
    public boolean lock_mouse = false;
    public boolean multiple_mouse_clicks = false;
    public boolean endless = false;
    
    public static boolean start_hotkey = false;
    public static boolean close_hotkey = false;
    public static boolean GUI_active = true;

    
    public GUI() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_repetitions = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_delay = new javax.swing.JTextField();
        lbl_error = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        txt_multipleAmount = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jCheckBox2 = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        txt_delaymultiple = new javax.swing.JTextField();
        jCheckBox3 = new javax.swing.JCheckBox();
        btd_start = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Autoclicker");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("delay ms");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("repetitions");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel3.setText("Autoclicker");

        txt_delay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_delayActionPerformed(evt);
            }
        });

        lbl_error.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbl_error.setText("Error:");

        jCheckBox1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCheckBox1.setText("Lock Mouse");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("amount multiple click locations (max. 5)");

        jCheckBox2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCheckBox2.setText("Multiple Mouse Clicks");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Delay between multiple clicks");

        jCheckBox3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCheckBox3.setText("Endless");
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });

        btd_start.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btd_start.setText("Start (F3)");
        btd_start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btd_startActionPerformed(evt);
            }
        });
        btd_start.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btd_startKeyPressed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jButton1.setText("Close (F4)");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_delay, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txt_repetitions, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_delaymultiple, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt_multipleAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jCheckBox2)
                                    .addComponent(jCheckBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_error, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(129, 129, 129)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btd_start)))
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(175, 175, 175))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_repetitions, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_delay, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_multipleAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox2))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_delaymultiple, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_error, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btd_start, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        this.lock_mouse = true;
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        this.multiple_mouse_clicks = true;
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        this.endless = true;
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void btd_startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btd_startActionPerformed
        if(lock_mouse == true && multiple_mouse_clicks == true){
            lbl_error.setText("Error occurred!");
        }
//----------------------------------------------------------------------------//
        else{
            if(lock_mouse = true){
                try {
                    robot = rc.initRobot(robot);
                    this.repetitions = rc.getRepetitions(repetitions);
                    for(int i = 0; i < repetitions; i++){
                        rc.clickCoordinates(robot);
                        this.delay = rc.getDelay(delay);
                        robot.delay(delay); 
                    }
                }
                catch (AWTException ex) {
                    lbl_error.setText("Error occurred!");
                }
            }
//----------------------------------------------------------------------------//
            if(multiple_mouse_clicks = true){
                try {
                    robot = rc.initRobot(robot);
                    this.repetitions = rc.getRepetitions(repetitions);
                    for(int i = 0; i < repetitions; i++){
                        rc.multiple_click(robot, RobotClicker.me);
                        this.delay = rc.getDelay(delay);
                        robot.delay(delay); 
                    }
                }
                catch (AWTException ex) {
                    lbl_error.setText("Error occurred!");
                }
            }
//----------------------------------------------------------------------------//
            if(lock_mouse != true && multiple_mouse_clicks != true && endless != true){
                try {
                    robot = rc.initRobot(robot);
                    this.repetitions = rc.getRepetitions(repetitions);
                    for(int i = 0; i < repetitions; i++){
                        rc.clickRobot(robot);
                        this.delay = rc.getDelay(delay);
                        robot.delay(delay); 
                    }
                }
                catch (AWTException ex) {
                    lbl_error.setText("Error occurred!");
                }
            }
//----------------------------------------------------------------------------//
            if(lock_mouse != true && multiple_mouse_clicks != true && endless == true){
                try {
                    robot = rc.initRobot(robot);
                    while(this.endless == true){
                        rc.clickRobot(robot);
                        this.delay = rc.getDelay(delay);
                        robot.delay(delay);
                    }
                } 
                catch (AWTException ex) {
                    lbl_error.setText("Error occurred!");
                }  
            }
//----------------------------------------------------------------------------//
            if(lock_mouse == true && endless == true){
                try {
                    robot = rc.initRobot(robot);
                    while(this.endless == true){
                        rc.clickCoordinates(robot);
                        this.delay = rc.getDelay(delay);
                        robot.delay(delay); 
                    }
                }
                catch (AWTException ex) {
                    lbl_error.setText("Error occurred!");
                }
            }
                try {
                    robot = rc.initRobot(robot);
                    this.repetitions = rc.getRepetitions(repetitions);
                    for(int i = 0; i < repetitions; i++){
                        rc.clickCoordinates(robot);
                        this.delay = rc.getDelay(delay);
                        robot.delay(delay); 
                    }
                }
                catch (AWTException ex) {
                    lbl_error.setText("Error occurred!");
                }
//----------------------------------------------------------------------------//
            if(multiple_mouse_clicks == true && endless == true){
                try {
                    robot = rc.initRobot(robot);
                    while(endless == true){
                        rc.multiple_click(robot, RobotClicker.me);
                        this.delay = rc.getDelay(delay);
                        robot.delay(delay); 
                    }
                }
                catch (AWTException ex) {
                    lbl_error.setText("Error occurred!");
                }
            }
//----------------------------------------------------------------------------//
        }
    }//GEN-LAST:event_btd_startActionPerformed

    private void btd_startKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btd_startKeyPressed
       //
    }//GEN-LAST:event_btd_startKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt_delayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_delayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_delayActionPerformed

    public void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
        while(GUI_active = true){
            Hotkeys.key_listener.keyTyped(kevt);
            if(start_hotkey = true){
                btd_startActionPerformed(aevt);
            }
            if(close_hotkey = true){
                System.exit(0);
            }
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btd_start;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    public static javax.swing.JLabel lbl_error;
    public static javax.swing.JTextField txt_delay;
    public static javax.swing.JTextField txt_delaymultiple;
    public static javax.swing.JTextField txt_multipleAmount;
    public static javax.swing.JTextField txt_repetitions;
    // End of variables declaration//GEN-END:variables
}
