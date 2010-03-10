package fr.alma.gtd.commande;

import fr.alma.gtd.donneespartagees.IContexte;
import fr.alma.gtd.donneesserveur.Utilisateur;
import fr.alma.gtd.interfacedistante.CallBack;
import fr.alma.gtd.isessions.IContexteServiceRemote;
import fr.alma.gtd.isessions.IUtilisateurServiceRemote;

import java.rmi.RemoteException;
import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 * Commande de suppression d'un contexte.
 * @author Stephane Begaudeau, Benjamin Gosset, Alex Lagarde, Christophe Renaudineau.
 * @version 1.0.0
 */
public final class CommandeSupprimerContexte implements Commande {
	
	/**
	 * L'identifiant de l'utilisateur.
	 */
	private final String identification;
	
	/**
	 * Le contexte a supprimer.
	 */
	private final IContexte contexte;
	
	/**
	 * Le callback.
	 */
	private final CallBack<String> callback;
	
	/**
	 * Le service de gestion de contexte.
	 */
	private IContexteServiceRemote contexteServiceRemote;
	
	/**
	 * Le service de gestion d'utilisateurs.
	 */
	private IUtilisateurServiceRemote utilisateurServiceRemote;
	
	/**
	 * Le constructeur.
	 * @param i L'identifiant de l'utilisateur.
	 * @param c Le contexte a supprimer.
	 * @param ca Le callback.
	 */
	public CommandeSupprimerContexte(final String i, final IContexte c, final CallBack<String> ca) {
		super();
		this.identification = i;
		this.contexte = c;
		this.callback = ca;
		
		final Properties env = new Properties();
		env.setProperty("java.naming.factory.initial", "org.jnp.interfaces.NamingContextFactory");
		env.setProperty("java.naming.provider.url", "localhost:1099");
		env.setProperty("java.naming.factory.url.pkgs", "org.jboss.naming"); 
		
		try {
			final Context context = new InitialContext(env);
			this.contexteServiceRemote = (IContexteServiceRemote) context.lookup("ContexteService/local");
			this.utilisateurServiceRemote = (IUtilisateurServiceRemote) context.lookup("UtilisateurService/local");
		} catch (NamingException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void execute() throws RemoteException {
		final IContexte ctx = this.contexteServiceRemote.getContexteById(this.contexte.getIdentifiantServeur()); 
		final Utilisateur uti = this.utilisateurServiceRemote.getUtilisateurById(this.contexte.getCreateur().getIdentifiantServeur());
		
		if ((ctx != null) && (uti != null) && (this.identification.equalsIgnoreCase(uti.getIdentifiantServeur()))) {
			try {
				this.contexteServiceRemote.removeContexteById(ctx.getIdentifiantServeur());
				this.callback.onSucces("Contexte supprime");
			} catch (final Exception e) {
				this.callback.onFailure(new Exception("Contexte utilise par un autre element"));
			}
		} else {
			if (ctx == null) {
				this.callback.onFailure(new Exception("Contexte inexistant"));
			} else {
				this.callback.onFailure(new Exception("Identifiant utilisateur invalide"));
			}
		}
	}
}
