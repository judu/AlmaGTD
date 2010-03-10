
package fr.alma.gtd.ihm;

import fr.alma.gtd.entities.Contexte;
import fr.alma.gtd.ihm.renseignement.DialogAjoutContexte;
import java.util.List;
import javax.swing.DefaultListModel;

public class DialogGestionContextes extends javax.swing.JDialog {

	private Controleur controleur;
	private DefaultListModel listeContextsModel;

    /** Creates new form DialogGestionContextes */
    public DialogGestionContextes(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
		listeContextsModel = new DefaultListModel();
        initComponents();
		initialisation();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ajouter = new javax.swing.JButton();
        ok = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listeContextes = new javax.swing.JList(listeContextsModel);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        ajouter.setText("Ajouter un contexte");
        ajouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajouterActionPerformed(evt);
            }
        });

        ok.setText("OK");
        ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okActionPerformed(evt);
            }
        });

        jLabel1.setText("Liste des contextes :");

        listeContextes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listeContextesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listeContextes);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ajouter)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                        .addComponent(ok))
                    .addComponent(jLabel1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ajouter)
                    .addComponent(ok))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

	private void ajouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajouterActionPerformed
		String contexte = new DialogAjoutContexte(null, true).showDialog();
		if (contexte != null) {
			Contexte contexteAdd = (Contexte) controleur.ajoutContexte(contexte);
			listeContextsModel.addElement(contexteAdd);
		}
	}//GEN-LAST:event_ajouterActionPerformed

	private void okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okActionPerformed
		setVisible(false);
	}//GEN-LAST:event_okActionPerformed

	private void listeContextesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listeContextesMouseClicked
		if (evt.getButton() == java.awt.event.MouseEvent.BUTTON3) {
			int index = listeContextes.locationToIndex(evt.getPoint());
			if (index != -1) {
				listeContextes.setSelectedIndex(index);
				javax.swing.JPopupMenu jpm = new javax.swing.JPopupMenu();
				javax.swing.JMenuItem eraseMenu = new javax.swing.JMenuItem("Effacer le contexte");
				eraseMenu.addActionListener(new ListEraseMenuListener(listeContextes.getSelectedValue()));
				jpm.add(eraseMenu);
				jpm.show(listeContextes, evt.getX(), evt.getY());
			}
		}
	}//GEN-LAST:event_listeContextesMouseClicked

	class ListEraseMenuListener implements java.awt.event.ActionListener{
		private Object object;
		public ListEraseMenuListener(Object obj){
			this.object = obj;
		}
		@Override
		public void actionPerformed(java.awt.event.ActionEvent e) {
			if (controleur.supprimerContexte(object)) {
				listeContextsModel.removeElement(object);
			}
		}
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ajouter;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList listeContextes;
    private javax.swing.JButton ok;
    // End of variables declaration//GEN-END:variables

	private void initialisation() {
		controleur = Controleur.getInstance();
		List<Contexte> listeContactsDisponible = controleur.getListeContextes();
		for (Contexte c : listeContactsDisponible) {
			if (!c.toString().equalsIgnoreCase("<Aucun contexte>")){
				listeContextsModel.addElement(c);
			}
		}
		setLocationRelativeTo(null);
	}

}
