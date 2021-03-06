/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * DialogSelectionProjet.java
 *
 * Created on 16 janv. 2010, 19:41:34
 */

package fr.alma.gtd.ihm.renseignement;

import fr.alma.gtd.ihm.Controleur;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author Le_Clubber
 */
public class DialogSelectionProjet extends javax.swing.JDialog {

	private Controleur controleur;

    /** Creates new form DialogSelectionProjet */
    public DialogSelectionProjet(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
		setLocationRelativeTo(null);
		controleur = Controleur.getInstance();
        initComponents();

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

        jScrollPane1 = new javax.swing.JScrollPane();
        arborescence = new javax.swing.JTree(controleur.constructionArbreProjets());
        annuler = new javax.swing.JButton();
        valider = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        arborescence.setCellRenderer(new fr.alma.gtd.ihm.tree.MyTreeRenderer());
        arborescence.addTreeSelectionListener(new javax.swing.event.TreeSelectionListener() {
            public void valueChanged(javax.swing.event.TreeSelectionEvent evt) {
                arborescenceValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(arborescence);
        DefaultTreeModel treeModel = (DefaultTreeModel) arborescence.getModel();
        treeModel.setAsksAllowsChildren(true);

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
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(66, Short.MAX_VALUE)
                .addComponent(valider)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(annuler)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(annuler)
                    .addComponent(valider))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

	private void arborescenceValueChanged(javax.swing.event.TreeSelectionEvent evt) {//GEN-FIRST:event_arborescenceValueChanged
		//arborescence.setSelectionPath(evt.getNewLeadSelectionPath());
		if (arborescence.getLastSelectedPathComponent() != null) {
			//System.out.println(((DefaultMutableTreeNode) arborescence.getLastSelectedPathComponent()).getUserObject().toString());
			this.selection = ((DefaultMutableTreeNode) arborescence.getLastSelectedPathComponent()).getUserObject();
		}
	}//GEN-LAST:event_arborescenceValueChanged

	private void validerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_validerActionPerformed
		this.setVisible(false);
	}//GEN-LAST:event_validerActionPerformed

	private void annulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_annulerActionPerformed
		this.selection = null;
		this.setVisible(false);
	}//GEN-LAST:event_annulerActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton annuler;
    private javax.swing.JTree arborescence;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton valider;
    // End of variables declaration//GEN-END:variables

	private Object selection;

	public Object showDialog(){
		this.selection = null;
		this.setVisible(true);
		return this.selection;
	}

}
