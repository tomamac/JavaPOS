/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POS;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Tomamac
 */
public class reserveCodeDump {
//          TABLECELLLISTENER
//        Action action = new AbstractAction()
//        {
//            public void actionPerformed(ActionEvent e)
//            {
//                TableCellListener tcl = (TableCellListener)e.getSource();
//                System.out.println("Row   : " + tcl.getRow());
//                System.out.println("Column: " + tcl.getColumn());
//                System.out.println("Old   : " + tcl.getOldValue());
//                System.out.println("New   : " + tcl.getNewValue());
//            }
//        };
//        TableCellListener tcl = new TableCellListener(itemsTable, action);

//    private void jtxtBarcodeActionPerformed(java.awt.event.ActionEvent evt) {                                            
//        // TODO add your handling code here:
//    }    //BARCODE                                       
//
//    private void jbtnExitActionPerformed(java.awt.event.ActionEvent evt) {                                         
//        if (JOptionPane.showConfirmDialog(null, "Confirm Exit","POS System",
//                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
//            System.exit(0);
//        }
//    }       //EXIT/GOBACK                                 
//
//    private void jbtnResetActionPerformed(java.awt.event.ActionEvent evt) {                                          
//        Reset();
//    }      //RESET ALL ITEMS                                  
//
//    private void jbtnRemoveActionPerformed(java.awt.event.ActionEvent evt) {                                           
//        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
//        
//        int RemoveItem = jTable1.getSelectedRow();
//        if (RemoveItem >= 0) {
//            model.removeRow(RemoveItem);
//        }
//        
//        if (jTable1.getRowCount() > 0){
//            ItemCost();
//        } else{
//            Reset();
//        }
//    }    //REMOVE INDIVIDUAL ITEM                                     
//
//    private void jbtnPayActionPerformed(java.awt.event.ActionEvent evt) {                                        
//        dispose();
//        new mainPage().setVisible(true);
//        if (jcboPayment.getSelectedItem().equals("Cash")) {
//            Change();
//        }
//        else {
//            jtxtChange.setText("");
//            jtxtDisplay.setText("");
//        }
//    }       //GO TO PAYMENT                                
//
//    private void jbtn0ActionPerformed(java.awt.event.ActionEvent evt) {                                      
//        String Enternumber = jtxtDisplay.getText();
//
//        if (Enternumber == "") {
//            jtxtDisplay.setText(jbtn0.getText());
//        }
//        else {
//            Enternumber = jtxtDisplay.getText() + jbtn0.getText();
//            jtxtDisplay.setText(Enternumber);
//        }
//    }         //NUMPAD0  
//
//    private void jbtn1ActionPerformed(java.awt.event.ActionEvent evt) {                                      
//        String Enternumber = jtxtDisplay.getText();
//
//        if (Enternumber == "") {
//            jtxtDisplay.setText(jbtn1.getText());
//        }
//        else {
//            Enternumber = jtxtDisplay.getText() + jbtn1.getText();
//            jtxtDisplay.setText(Enternumber);
//        }
//    }         //NUMPAD1                
//
//    private void jbtn2ActionPerformed(java.awt.event.ActionEvent evt) {                                      
//        String Enternumber = jtxtDisplay.getText();
//
//        if (Enternumber == "") {
//            jtxtDisplay.setText(jbtn2.getText());
//        }
//        else {
//            Enternumber = jtxtDisplay.getText() + jbtn2.getText();
//            jtxtDisplay.setText(Enternumber);
//        }
//    }         //NUMPAD2                                     
//
//    private void jbtn3ActionPerformed(java.awt.event.ActionEvent evt) {                                      
//        String Enternumber = jtxtDisplay.getText();
//
//        if (Enternumber == "") {
//            jtxtDisplay.setText(jbtn3.getText());
//        }
//        else {
//            Enternumber = jtxtDisplay.getText() + jbtn3.getText();
//            jtxtDisplay.setText(Enternumber);
//        }
//    }         //NUMPAD3  
//    
//    private void jbtn4ActionPerformed(java.awt.event.ActionEvent evt) {                                      
//        String Enternumber = jtxtDisplay.getText();
//
//        if (Enternumber == "") {
//            jtxtDisplay.setText(jbtn4.getText());
//        }
//        else {
//            Enternumber = jtxtDisplay.getText() + jbtn4.getText();
//            jtxtDisplay.setText(Enternumber);
//        }
//    }         //NUMPAD4                                     
//
//    private void jbtn5ActionPerformed(java.awt.event.ActionEvent evt) {                                      
//        String Enternumber = jtxtDisplay.getText();
//
//        if (Enternumber == "") {
//            jtxtDisplay.setText(jbtn5.getText());
//        }
//        else {
//            Enternumber = jtxtDisplay.getText() + jbtn5.getText();
//            jtxtDisplay.setText(Enternumber);
//        }
//    }         //NUMPAD5                                     
//
//    private void jbtn6ActionPerformed(java.awt.event.ActionEvent evt) {                                      
//        String Enternumber = jtxtDisplay.getText();
//
//        if (Enternumber == "") {
//            jtxtDisplay.setText(jbtn6.getText());
//        }
//        else {
//            Enternumber = jtxtDisplay.getText() + jbtn6.getText();
//            jtxtDisplay.setText(Enternumber);
//        }
//    }         //NUMPAD6
//    
//    private void jbtn7ActionPerformed(java.awt.event.ActionEvent evt) {                                      
//        String Enternumber = jtxtDisplay.getText();
//
//        if (Enternumber == "") {
//        jtxtDisplay.setText(jbtn7.getText());
//        }
//        else {
//        Enternumber = jtxtDisplay.getText() + jbtn7.getText();
//        jtxtDisplay.setText(Enternumber);
//        }
// 
//    }         //NUMPAD7                            
//
//    private void jbtn8ActionPerformed(java.awt.event.ActionEvent evt) {                                      
//        String Enternumber = jtxtDisplay.getText();
//
//        if (Enternumber == "") {
//        jtxtDisplay.setText(jbtn8.getText());
//        }
//        else {
//        Enternumber = jtxtDisplay.getText() + jbtn8.getText();
//        jtxtDisplay.setText(Enternumber);
//        }
//    }         //NUMPAD8                                     
//
//    private void jbtn9ActionPerformed(java.awt.event.ActionEvent evt) {                                      
//        String Enternumber = jtxtDisplay.getText();
//
//        if (Enternumber == "") {
//        jtxtDisplay.setText(jbtn9.getText());
//        }
//        else {
//        Enternumber = jtxtDisplay.getText() + jbtn9.getText();
//        jtxtDisplay.setText(Enternumber);
//        }
//    }         //NUMPAD9                                                                                                            
//
//    private void jbtnDotActionPerformed(java.awt.event.ActionEvent evt) {                                        
//        if(! jtxtDisplay.getText().contains(".")) 
//        {
//            jtxtDisplay.setText(jtxtDisplay.getText() + jbtnDot.getText());
//        }
//    }        //NUMPADDOT                                       
//
//    private void jbtnCActionPerformed(java.awt.event.ActionEvent evt) {                                      
//        jtxtDisplay.setText("");
//        jtxtChange.setText("");
//    }          //NUMPADCLEAR                                     
//
//    private void jtxtDisplayKeyReleased(java.awt.event.KeyEvent evt) {                                        
//        try{
//            if (jtxtDisplay.getText().isEmpty() && getNetTotal() == 0 || getNetTotal() > Double.parseDouble(jtxtDisplay.getText())){
//                jbtnPay.setEnabled(false);
//            } else{
//                jbtnPay.setEnabled(true);
//            }
//        }
//        catch(NumberFormatException e){
//            
//        }
//    }          //On Receive TextField Release
//
//    private void SuneeChickenActionPerformed(java.awt.event.ActionEvent evt) {                                             
//        double PriceOfItem = 120;
//                        
//        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
//        model.addRow(new Object[] {"SuneeChicken","1",PriceOfItem });
//        ItemCost();
//    }                                            
//
//    private void WaterActionPerformed(java.awt.event.ActionEvent evt) {                                      
//        double PriceOfItem = 30;
//                        
//        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
//        model.addRow(new Object[] {"Water","1",PriceOfItem });
//        ItemCost();  
//    }                                     
//
//    private void GrilledPorkNeckActionPerformed(java.awt.event.ActionEvent evt) {                                                
//        double PriceOfItem = 90;
//                        
//        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
//        model.addRow(new Object[] {"Grilled Pork Neck","1",PriceOfItem });
//        ItemCost();    
//    }                                               
//
//    private void FriedChickenWingsActionPerformed(java.awt.event.ActionEvent evt) {                                                  
//        double PriceOfItem = 70;
//                        
//        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
//        model.addRow(new Object[] {"Fried Chicken Wings","1",PriceOfItem });
//        ItemCost();         
//    }                                                 
//
//    private void SteamedSnapperActionPerformed(java.awt.event.ActionEvent evt) {                                               
//        double PriceOfItem = 180;
//                        
//        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
//        model.addRow(new Object[] {"Steamed Snapper","1",PriceOfItem });
//        ItemCost();           
//    }                                              
//
//    private void RiceActionPerformed(java.awt.event.ActionEvent evt) {                                     
//        double PriceOfItem = 20;
//                        
//        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
//        model.addRow(new Object[] {"Rice","1",PriceOfItem });
//        ItemCost();   
//    }                                    
//
//    private void StickyRiceActionPerformed(java.awt.event.ActionEvent evt) {                                           
//        double PriceOfItem = 20;
//                        
//        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
//        model.addRow(new Object[] {"Sticky Rice","1",PriceOfItem });
//        ItemCost();   
//    }                                          
//
//    private void LimeTeaActionPerformed(java.awt.event.ActionEvent evt) {                                        
//        double PriceOfItem = 50;
//                        
//        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
//        model.addRow(new Object[] {"Lime Tea","1",PriceOfItem });
//        ItemCost();   
//    }                                       
//
//    private void SparklingActionPerformed(java.awt.event.ActionEvent evt) {                                          
//        double PriceOfItem = 40;
//                        
//        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
//        model.addRow(new Object[] {"Sparkling","1",PriceOfItem });
//        ItemCost();  
//    }                                         
//
//    private void ShavedIceActionPerformed(java.awt.event.ActionEvent evt) {                                          
//        double PriceOfItem = 25;
//                        
//        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
//        model.addRow(new Object[] {"Shaved Ice","1",PriceOfItem });
//        ItemCost();  
//    }                                                  
}
