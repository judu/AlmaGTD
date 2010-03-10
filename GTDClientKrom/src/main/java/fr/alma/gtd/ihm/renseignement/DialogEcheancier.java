/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * DialogEcheancier.java
 *
 * Created on 17 janv. 2010, 15:46:50
 */
package fr.alma.gtd.ihm.renseignement;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Le_Clubber
 */
public class DialogEcheancier extends javax.swing.JDialog {

	/** Creates new form DialogEcheancier */
	public DialogEcheancier(java.awt.Frame parent, boolean modal) {
		super(parent, modal);
		setLocationRelativeTo(null);
		initComponents();
		initialisation();

		// apparence selon le systeme
		try {
			javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
			javax.swing.SwingUtilities.updateComponentTreeUI(this);
		} catch (Exception e) {
			System.out.println("LookAndFeel non supporté.");
		}
	}

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        activation = new javax.swing.JCheckBox();
        debutLabel = new javax.swing.JLabel();
        debutText = new javax.swing.JTextField();
        debutBouton = new javax.swing.JButton();
        finLabel = new javax.swing.JLabel();
        finText = new javax.swing.JTextField();
        finBouton = new javax.swing.JButton();
        frequenceLabel = new javax.swing.JLabel();
        frequenceCombo = new javax.swing.JComboBox();
        annuler = new javax.swing.JButton();
        valider = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        activation.setText("Activer l'échéancier");
        activation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                activationActionPerformed(evt);
            }
        });

        debutLabel.setText("Date de début :");
        debutLabel.setEnabled(false);

        debutText.setEditable(false);
        debutText.setEnabled(false);

        debutBouton.setText("Changer la date...");
        debutBouton.setEnabled(false);
        debutBouton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                debutBoutonActionPerformed(evt);
            }
        });

        finLabel.setText("Date de fin :");
        finLabel.setEnabled(false);

        finText.setEditable(false);
        finText.setEnabled(false);

        finBouton.setText("Changer la date...");
        finBouton.setEnabled(false);
        finBouton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finBoutonActionPerformed(evt);
            }
        });

        frequenceLabel.setText("Fréquence :");
        frequenceLabel.setEnabled(false);

        frequenceCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "NONREPETITIVE", "JOURNALIERE", "HEBDOMADAIRE", "MENSUELLE" }));
        frequenceCombo.setEnabled(false);

        annuler.setText("Annuler");
        annuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                annulerActionPerformed(evt);
            }
        });

        valider.setText("Valider");
        valider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(activation)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(debutLabel)
                            .addComponent(finLabel)
                            .addComponent(frequenceLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(frequenceCombo, 0, 173, Short.MAX_VALUE)
                            .addComponent(finText, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                            .addComponent(debutText, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(debutBouton)
                            .addComponent(finBouton)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(valider)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(annuler)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(activation)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(debutLabel)
                    .addComponent(debutText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(debutBouton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(finLabel)
                    .addComponent(finText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(finBouton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(frequenceLabel)
                    .addComponent(frequenceCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(annuler)
                    .addComponent(valider))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

	private void activationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_activationActionPerformed
		activerChamps(activation.isSelected());
	}//GEN-LAST:event_activationActionPerformed

	private void annulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_annulerActionPerformed
		setVisible(false);
	}//GEN-LAST:event_annulerActionPerformed

	private void validerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_validerActionPerformed
		infos = new InfosEcheancier(activation.isSelected(), dateDebut, dateFin, (String) frequenceCombo.getSelectedItem());
		setVisible(false);
	}//GEN-LAST:event_validerActionPerformed

	private void debutBoutonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_debutBoutonActionPerformed
		Date date = new DialogDate(null, true).showDialog();
		if (date != null) {
			dateDebut = date;
			DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
			debutText.setText(dateFormat.format(date));
		}
	}//GEN-LAST:event_debutBoutonActionPerformed

	private void finBoutonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finBoutonActionPerformed
		Date date = new DialogDate(null, true).showDialog();
		if (date != null) {
			dateFin = date;
			DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
			finText.setText(dateFormat.format(date));
		}
	}//GEN-LAST:event_finBoutonActionPerformed

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		InfosEcheancier infos = new DialogEcheancier(new javax.swing.JFrame(), true).showDialog();
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(dateFormat.format(infos.getDateDebut()));
		System.out.println(dateFormat.format(infos.getDateFin()));
		System.out.println(infos.getRepetition());
		System.exit(0);
	}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox activation;
    private javax.swing.JButton annuler;
    private javax.swing.JButton debutBouton;
    private javax.swing.JLabel debutLabel;
    private javax.swing.JTextField debutText;
    private javax.swing.JButton finBouton;
    private javax.swing.JLabel finLabel;
    private javax.swing.JTextField finText;
    private javax.swing.JComboBox frequenceCombo;
    private javax.swing.JLabel frequenceLabel;
    private javax.swing.JButton valider;
    // End of variables declaration//GEN-END:variables

	private void activerChamps(boolean activation) {
		debutLabel.setEnabled(activation);
		debutText.setEnabled(activation);
		debutBouton.setEnabled(activation);
		finLabel.setEnabled(activation);
		finText.setEnabled(activation);
		finBouton.setEnabled(activation);
		frequenceLabel.setEnabled(activation);
		frequenceCombo.setEnabled(activation);
	}
	private InfosEcheancier infos;
	private Date dateDebut;
	private Date dateFin;

	private void initialisation() {
		dateDebut = new Date();
		dateFin = new Date();
		infos = new InfosEcheancier(false, dateDebut, dateFin, (String) frequenceCombo.getSelectedItem());
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		debutText.setText(dateFormat.format(dateDebut));
		finText.setText(dateFormat.format(dateFin));
	}

	public InfosEcheancier showDialog() {
		this.setVisible(true);
		return infos;
	}
}
