package donneespartagees;


/**
 * donneespartagees/_ITacheStub.java .
 * Generated by the IDL-to-Java compiler (portable), version "3.2"
 * from C:/Users/Florian/workspace2/alma-gtd/idl/donneespartagees.idl
 * mercredi 6 janvier 2010 22 h 46 CET
 */


/**
 * Interface representant les taches.
 * @author Stephane Begaudeau, Benjamin Gosset, Alex Lagarde, Christophe Renaudineau.
 * @version 1.0.0
 */
public class _ITacheStub extends org.omg.CORBA.portable.ObjectImpl implements donneespartagees.ITache
{


	/**
	 * Archive la tache.
	 */
	public void archiver ()
	{
		org.omg.CORBA.portable.InputStream $in = null;
		try {
			org.omg.CORBA.portable.OutputStream $out = _request ("archiver", true);
			$in = _invoke ($out);
			return;
		} catch (org.omg.CORBA.portable.ApplicationException $ex) {
			$in = $ex.getInputStream ();
			String _id = $ex.getId ();
			throw new org.omg.CORBA.MARSHAL (_id);
		} catch (org.omg.CORBA.portable.RemarshalException $rm) {
			archiver (        );
		} finally {
			_releaseReply ($in);
		}
	} // archiver


	/**
	 * Supprime la tache, en la mettant a la poubelle.
	 */
	public void mettreALaPoubelle ()
	{
		org.omg.CORBA.portable.InputStream $in = null;
		try {
			org.omg.CORBA.portable.OutputStream $out = _request ("mettreALaPoubelle", true);
			$in = _invoke ($out);
			return;
		} catch (org.omg.CORBA.portable.ApplicationException $ex) {
			$in = $ex.getInputStream ();
			String _id = $ex.getId ();
			throw new org.omg.CORBA.MARSHAL (_id);
		} catch (org.omg.CORBA.portable.RemarshalException $rm) {
			mettreALaPoubelle (        );
		} finally {
			_releaseReply ($in);
		}
	} // mettreALaPoubelle


	/**
	 * Restaurer la tache depuis la poubelle.
	 */
	public void restaurer ()
	{
		org.omg.CORBA.portable.InputStream $in = null;
		try {
			org.omg.CORBA.portable.OutputStream $out = _request ("restaurer", true);
			$in = _invoke ($out);
			return;
		} catch (org.omg.CORBA.portable.ApplicationException $ex) {
			$in = $ex.getInputStream ();
			String _id = $ex.getId ();
			throw new org.omg.CORBA.MARSHAL (_id);
		} catch (org.omg.CORBA.portable.RemarshalException $rm) {
			restaurer (        );
		} finally {
			_releaseReply ($in);
		}
	} // restaurer

	public String Nom ()
	{
		org.omg.CORBA.portable.InputStream $in = null;
		try {
			org.omg.CORBA.portable.OutputStream $out = _request ("_get_Nom", true);
			$in = _invoke ($out);
			String $result = $in.read_string ();
			return $result;
		} catch (org.omg.CORBA.portable.ApplicationException $ex) {
			$in = $ex.getInputStream ();
			String _id = $ex.getId ();
			throw new org.omg.CORBA.MARSHAL (_id);
		} catch (org.omg.CORBA.portable.RemarshalException $rm) {
			return Nom (        );
		} finally {
			_releaseReply ($in);
		}
	} // Nom

	public void Nom (String newNom)
	{
		org.omg.CORBA.portable.InputStream $in = null;
		try {
			org.omg.CORBA.portable.OutputStream $out = _request ("_set_Nom", true);
			$out.write_string (newNom);
			$in = _invoke ($out);
			return;
		} catch (org.omg.CORBA.portable.ApplicationException $ex) {
			$in = $ex.getInputStream ();
			String _id = $ex.getId ();
			throw new org.omg.CORBA.MARSHAL (_id);
		} catch (org.omg.CORBA.portable.RemarshalException $rm) {
			Nom (newNom        );
		} finally {
			_releaseReply ($in);
		}
	} // Nom

	public int Priorite ()
	{
		org.omg.CORBA.portable.InputStream $in = null;
		try {
			org.omg.CORBA.portable.OutputStream $out = _request ("_get_Priorite", true);
			$in = _invoke ($out);
			int $result = $in.read_ulong ();
			return $result;
		} catch (org.omg.CORBA.portable.ApplicationException $ex) {
			$in = $ex.getInputStream ();
			String _id = $ex.getId ();
			throw new org.omg.CORBA.MARSHAL (_id);
		} catch (org.omg.CORBA.portable.RemarshalException $rm) {
			return Priorite (        );
		} finally {
			_releaseReply ($in);
		}
	} // Priorite

	public void Priorite (int newPriorite)
	{
		org.omg.CORBA.portable.InputStream $in = null;
		try {
			org.omg.CORBA.portable.OutputStream $out = _request ("_set_Priorite", true);
			$out.write_ulong (newPriorite);
			$in = _invoke ($out);
			return;
		} catch (org.omg.CORBA.portable.ApplicationException $ex) {
			$in = $ex.getInputStream ();
			String _id = $ex.getId ();
			throw new org.omg.CORBA.MARSHAL (_id);
		} catch (org.omg.CORBA.portable.RemarshalException $rm) {
			Priorite (newPriorite        );
		} finally {
			_releaseReply ($in);
		}
	} // Priorite

	public int TauxEffort ()
	{
		org.omg.CORBA.portable.InputStream $in = null;
		try {
			org.omg.CORBA.portable.OutputStream $out = _request ("_get_TauxEffort", true);
			$in = _invoke ($out);
			int $result = $in.read_ulong ();
			return $result;
		} catch (org.omg.CORBA.portable.ApplicationException $ex) {
			$in = $ex.getInputStream ();
			String _id = $ex.getId ();
			throw new org.omg.CORBA.MARSHAL (_id);
		} catch (org.omg.CORBA.portable.RemarshalException $rm) {
			return TauxEffort (        );
		} finally {
			_releaseReply ($in);
		}
	} // TauxEffort

	public void TauxEffort (int newTauxEffort)
	{
		org.omg.CORBA.portable.InputStream $in = null;
		try {
			org.omg.CORBA.portable.OutputStream $out = _request ("_set_TauxEffort", true);
			$out.write_ulong (newTauxEffort);
			$in = _invoke ($out);
			return;
		} catch (org.omg.CORBA.portable.ApplicationException $ex) {
			$in = $ex.getInputStream ();
			String _id = $ex.getId ();
			throw new org.omg.CORBA.MARSHAL (_id);
		} catch (org.omg.CORBA.portable.RemarshalException $rm) {
			TauxEffort (newTauxEffort        );
		} finally {
			_releaseReply ($in);
		}
	} // TauxEffort

	public donneespartagees.Avancement avancement ()
	{
		org.omg.CORBA.portable.InputStream $in = null;
		try {
			org.omg.CORBA.portable.OutputStream $out = _request ("_get_avancement", true);
			$in = _invoke ($out);
			donneespartagees.Avancement $result = donneespartagees.AvancementHelper.read ($in);
			return $result;
		} catch (org.omg.CORBA.portable.ApplicationException $ex) {
			$in = $ex.getInputStream ();
			String _id = $ex.getId ();
			throw new org.omg.CORBA.MARSHAL (_id);
		} catch (org.omg.CORBA.portable.RemarshalException $rm) {
			return avancement (        );
		} finally {
			_releaseReply ($in);
		}
	} // avancement

	public void avancement (donneespartagees.Avancement newAvancement)
	{
		org.omg.CORBA.portable.InputStream $in = null;
		try {
			org.omg.CORBA.portable.OutputStream $out = _request ("_set_avancement", true);
			donneespartagees.AvancementHelper.write ($out, newAvancement);
			$in = _invoke ($out);
			return;
		} catch (org.omg.CORBA.portable.ApplicationException $ex) {
			$in = $ex.getInputStream ();
			String _id = $ex.getId ();
			throw new org.omg.CORBA.MARSHAL (_id);
		} catch (org.omg.CORBA.portable.RemarshalException $rm) {
			avancement (newAvancement        );
		} finally {
			_releaseReply ($in);
		}
	} // avancement

	public donneespartagees.Frequence frequence ()
	{
		org.omg.CORBA.portable.InputStream $in = null;
		try {
			org.omg.CORBA.portable.OutputStream $out = _request ("_get_frequence", true);
			$in = _invoke ($out);
			donneespartagees.Frequence $result = donneespartagees.FrequenceHelper.read ($in);
			return $result;
		} catch (org.omg.CORBA.portable.ApplicationException $ex) {
			$in = $ex.getInputStream ();
			String _id = $ex.getId ();
			throw new org.omg.CORBA.MARSHAL (_id);
		} catch (org.omg.CORBA.portable.RemarshalException $rm) {
			return frequence (        );
		} finally {
			_releaseReply ($in);
		}
	} // frequence

	public void frequence (donneespartagees.Frequence newFrequence)
	{
		org.omg.CORBA.portable.InputStream $in = null;
		try {
			org.omg.CORBA.portable.OutputStream $out = _request ("_set_frequence", true);
			donneespartagees.FrequenceHelper.write ($out, newFrequence);
			$in = _invoke ($out);
			return;
		} catch (org.omg.CORBA.portable.ApplicationException $ex) {
			$in = $ex.getInputStream ();
			String _id = $ex.getId ();
			throw new org.omg.CORBA.MARSHAL (_id);
		} catch (org.omg.CORBA.portable.RemarshalException $rm) {
			frequence (newFrequence        );
		} finally {
			_releaseReply ($in);
		}
	} // frequence

	public String DateDebut ()
	{
		org.omg.CORBA.portable.InputStream $in = null;
		try {
			org.omg.CORBA.portable.OutputStream $out = _request ("_get_DateDebut", true);
			$in = _invoke ($out);
			String $result = $in.read_string ();
			return $result;
		} catch (org.omg.CORBA.portable.ApplicationException $ex) {
			$in = $ex.getInputStream ();
			String _id = $ex.getId ();
			throw new org.omg.CORBA.MARSHAL (_id);
		} catch (org.omg.CORBA.portable.RemarshalException $rm) {
			return DateDebut (        );
		} finally {
			_releaseReply ($in);
		}
	} // DateDebut

	public void DateDebut (String newDateDebut)
	{
		org.omg.CORBA.portable.InputStream $in = null;
		try {
			org.omg.CORBA.portable.OutputStream $out = _request ("_set_DateDebut", true);
			$out.write_string (newDateDebut);
			$in = _invoke ($out);
			return;
		} catch (org.omg.CORBA.portable.ApplicationException $ex) {
			$in = $ex.getInputStream ();
			String _id = $ex.getId ();
			throw new org.omg.CORBA.MARSHAL (_id);
		} catch (org.omg.CORBA.portable.RemarshalException $rm) {
			DateDebut (newDateDebut        );
		} finally {
			_releaseReply ($in);
		}
	} // DateDebut

	public String DateFin ()
	{
		org.omg.CORBA.portable.InputStream $in = null;
		try {
			org.omg.CORBA.portable.OutputStream $out = _request ("_get_DateFin", true);
			$in = _invoke ($out);
			String $result = $in.read_string ();
			return $result;
		} catch (org.omg.CORBA.portable.ApplicationException $ex) {
			$in = $ex.getInputStream ();
			String _id = $ex.getId ();
			throw new org.omg.CORBA.MARSHAL (_id);
		} catch (org.omg.CORBA.portable.RemarshalException $rm) {
			return DateFin (        );
		} finally {
			_releaseReply ($in);
		}
	} // DateFin

	public void DateFin (String newDateFin)
	{
		org.omg.CORBA.portable.InputStream $in = null;
		try {
			org.omg.CORBA.portable.OutputStream $out = _request ("_set_DateFin", true);
			$out.write_string (newDateFin);
			$in = _invoke ($out);
			return;
		} catch (org.omg.CORBA.portable.ApplicationException $ex) {
			$in = $ex.getInputStream ();
			String _id = $ex.getId ();
			throw new org.omg.CORBA.MARSHAL (_id);
		} catch (org.omg.CORBA.portable.RemarshalException $rm) {
			DateFin (newDateFin        );
		} finally {
			_releaseReply ($in);
		}
	} // DateFin

	public boolean DansLaPoubelle ()
	{
		org.omg.CORBA.portable.InputStream $in = null;
		try {
			org.omg.CORBA.portable.OutputStream $out = _request ("_get_DansLaPoubelle", true);
			$in = _invoke ($out);
			boolean $result = $in.read_boolean ();
			return $result;
		} catch (org.omg.CORBA.portable.ApplicationException $ex) {
			$in = $ex.getInputStream ();
			String _id = $ex.getId ();
			throw new org.omg.CORBA.MARSHAL (_id);
		} catch (org.omg.CORBA.portable.RemarshalException $rm) {
			return DansLaPoubelle (        );
		} finally {
			_releaseReply ($in);
		}
	} // DansLaPoubelle

	public void DansLaPoubelle (boolean newDansLaPoubelle)
	{
		org.omg.CORBA.portable.InputStream $in = null;
		try {
			org.omg.CORBA.portable.OutputStream $out = _request ("_set_DansLaPoubelle", true);
			$out.write_boolean (newDansLaPoubelle);
			$in = _invoke ($out);
			return;
		} catch (org.omg.CORBA.portable.ApplicationException $ex) {
			$in = $ex.getInputStream ();
			String _id = $ex.getId ();
			throw new org.omg.CORBA.MARSHAL (_id);
		} catch (org.omg.CORBA.portable.RemarshalException $rm) {
			DansLaPoubelle (newDansLaPoubelle        );
		} finally {
			_releaseReply ($in);
		}
	} // DansLaPoubelle

	public boolean DansArchive ()
	{
		org.omg.CORBA.portable.InputStream $in = null;
		try {
			org.omg.CORBA.portable.OutputStream $out = _request ("_get_DansArchive", true);
			$in = _invoke ($out);
			boolean $result = $in.read_boolean ();
			return $result;
		} catch (org.omg.CORBA.portable.ApplicationException $ex) {
			$in = $ex.getInputStream ();
			String _id = $ex.getId ();
			throw new org.omg.CORBA.MARSHAL (_id);
		} catch (org.omg.CORBA.portable.RemarshalException $rm) {
			return DansArchive (        );
		} finally {
			_releaseReply ($in);
		}
	} // DansArchive

	public void DansArchive (boolean newDansArchive)
	{
		org.omg.CORBA.portable.InputStream $in = null;
		try {
			org.omg.CORBA.portable.OutputStream $out = _request ("_set_DansArchive", true);
			$out.write_boolean (newDansArchive);
			$in = _invoke ($out);
			return;
		} catch (org.omg.CORBA.portable.ApplicationException $ex) {
			$in = $ex.getInputStream ();
			String _id = $ex.getId ();
			throw new org.omg.CORBA.MARSHAL (_id);
		} catch (org.omg.CORBA.portable.RemarshalException $rm) {
			DansArchive (newDansArchive        );
		} finally {
			_releaseReply ($in);
		}
	} // DansArchive

	public donneespartagees.IParticipant Createur ()
	{
		org.omg.CORBA.portable.InputStream $in = null;
		try {
			org.omg.CORBA.portable.OutputStream $out = _request ("_get_Createur", true);
			$in = _invoke ($out);
			donneespartagees.IParticipant $result = donneespartagees.IParticipantHelper.read ($in);
			return $result;
		} catch (org.omg.CORBA.portable.ApplicationException $ex) {
			$in = $ex.getInputStream ();
			String _id = $ex.getId ();
			throw new org.omg.CORBA.MARSHAL (_id);
		} catch (org.omg.CORBA.portable.RemarshalException $rm) {
			return Createur (        );
		} finally {
			_releaseReply ($in);
		}
	} // Createur

	public void Createur (donneespartagees.IParticipant newCreateur)
	{
		org.omg.CORBA.portable.InputStream $in = null;
		try {
			org.omg.CORBA.portable.OutputStream $out = _request ("_set_Createur", true);
			donneespartagees.IParticipantHelper.write ($out, newCreateur);
			$in = _invoke ($out);
			return;
		} catch (org.omg.CORBA.portable.ApplicationException $ex) {
			$in = $ex.getInputStream ();
			String _id = $ex.getId ();
			throw new org.omg.CORBA.MARSHAL (_id);
		} catch (org.omg.CORBA.portable.RemarshalException $rm) {
			Createur (newCreateur        );
		} finally {
			_releaseReply ($in);
		}
	} // Createur

	public donneespartagees.IParticipant Participant ()
	{
		org.omg.CORBA.portable.InputStream $in = null;
		try {
			org.omg.CORBA.portable.OutputStream $out = _request ("_get_Participant", true);
			$in = _invoke ($out);
			donneespartagees.IParticipant $result = donneespartagees.IParticipantHelper.read ($in);
			return $result;
		} catch (org.omg.CORBA.portable.ApplicationException $ex) {
			$in = $ex.getInputStream ();
			String _id = $ex.getId ();
			throw new org.omg.CORBA.MARSHAL (_id);
		} catch (org.omg.CORBA.portable.RemarshalException $rm) {
			return Participant (        );
		} finally {
			_releaseReply ($in);
		}
	} // Participant

	public void Participant (donneespartagees.IParticipant newParticipant)
	{
		org.omg.CORBA.portable.InputStream $in = null;
		try {
			org.omg.CORBA.portable.OutputStream $out = _request ("_set_Participant", true);
			donneespartagees.IParticipantHelper.write ($out, newParticipant);
			$in = _invoke ($out);
			return;
		} catch (org.omg.CORBA.portable.ApplicationException $ex) {
			$in = $ex.getInputStream ();
			String _id = $ex.getId ();
			throw new org.omg.CORBA.MARSHAL (_id);
		} catch (org.omg.CORBA.portable.RemarshalException $rm) {
			Participant (newParticipant        );
		} finally {
			_releaseReply ($in);
		}
	} // Participant

	public donneespartagees.IContexte Contexte ()
	{
		org.omg.CORBA.portable.InputStream $in = null;
		try {
			org.omg.CORBA.portable.OutputStream $out = _request ("_get_Contexte", true);
			$in = _invoke ($out);
			donneespartagees.IContexte $result = donneespartagees.IContexteHelper.read ($in);
			return $result;
		} catch (org.omg.CORBA.portable.ApplicationException $ex) {
			$in = $ex.getInputStream ();
			String _id = $ex.getId ();
			throw new org.omg.CORBA.MARSHAL (_id);
		} catch (org.omg.CORBA.portable.RemarshalException $rm) {
			return Contexte (        );
		} finally {
			_releaseReply ($in);
		}
	} // Contexte

	public void Contexte (donneespartagees.IContexte newContexte)
	{
		org.omg.CORBA.portable.InputStream $in = null;
		try {
			org.omg.CORBA.portable.OutputStream $out = _request ("_set_Contexte", true);
			donneespartagees.IContexteHelper.write ($out, newContexte);
			$in = _invoke ($out);
			return;
		} catch (org.omg.CORBA.portable.ApplicationException $ex) {
			$in = $ex.getInputStream ();
			String _id = $ex.getId ();
			throw new org.omg.CORBA.MARSHAL (_id);
		} catch (org.omg.CORBA.portable.RemarshalException $rm) {
			Contexte (newContexte        );
		} finally {
			_releaseReply ($in);
		}
	} // Contexte

	public donneespartagees.ITag[] ListeDesTags ()
	{
		org.omg.CORBA.portable.InputStream $in = null;
		try {
			org.omg.CORBA.portable.OutputStream $out = _request ("_get_ListeDesTags", true);
			$in = _invoke ($out);
			donneespartagees.ITag $result[] = donneespartagees.SequenceTagHelper.read ($in);
			return $result;
		} catch (org.omg.CORBA.portable.ApplicationException $ex) {
			$in = $ex.getInputStream ();
			String _id = $ex.getId ();
			throw new org.omg.CORBA.MARSHAL (_id);
		} catch (org.omg.CORBA.portable.RemarshalException $rm) {
			return ListeDesTags (        );
		} finally {
			_releaseReply ($in);
		}
	} // ListeDesTags

	public void ListeDesTags (donneespartagees.ITag[] newListeDesTags)
	{
		org.omg.CORBA.portable.InputStream $in = null;
		try {
			org.omg.CORBA.portable.OutputStream $out = _request ("_set_ListeDesTags", true);
			donneespartagees.SequenceTagHelper.write ($out, newListeDesTags);
			$in = _invoke ($out);
			return;
		} catch (org.omg.CORBA.portable.ApplicationException $ex) {
			$in = $ex.getInputStream ();
			String _id = $ex.getId ();
			throw new org.omg.CORBA.MARSHAL (_id);
		} catch (org.omg.CORBA.portable.RemarshalException $rm) {
			ListeDesTags (newListeDesTags        );
		} finally {
			_releaseReply ($in);
		}
	} // ListeDesTags

	public String[] ListeDesURLs ()
	{
		org.omg.CORBA.portable.InputStream $in = null;
		try {
			org.omg.CORBA.portable.OutputStream $out = _request ("_get_ListeDesURLs", true);
			$in = _invoke ($out);
			String $result[] = donneespartagees.SequenceStringHelper.read ($in);
			return $result;
		} catch (org.omg.CORBA.portable.ApplicationException $ex) {
			$in = $ex.getInputStream ();
			String _id = $ex.getId ();
			throw new org.omg.CORBA.MARSHAL (_id);
		} catch (org.omg.CORBA.portable.RemarshalException $rm) {
			return ListeDesURLs (        );
		} finally {
			_releaseReply ($in);
		}
	} // ListeDesURLs

	public void ListeDesURLs (String[] newListeDesURLs)
	{
		org.omg.CORBA.portable.InputStream $in = null;
		try {
			org.omg.CORBA.portable.OutputStream $out = _request ("_set_ListeDesURLs", true);
			donneespartagees.SequenceStringHelper.write ($out, newListeDesURLs);
			$in = _invoke ($out);
			return;
		} catch (org.omg.CORBA.portable.ApplicationException $ex) {
			$in = $ex.getInputStream ();
			String _id = $ex.getId ();
			throw new org.omg.CORBA.MARSHAL (_id);
		} catch (org.omg.CORBA.portable.RemarshalException $rm) {
			ListeDesURLs (newListeDesURLs        );
		} finally {
			_releaseReply ($in);
		}
	} // ListeDesURLs

	public donneespartagees.IProjet ProjetConteneur ()
	{
		org.omg.CORBA.portable.InputStream $in = null;
		try {
			org.omg.CORBA.portable.OutputStream $out = _request ("_get_ProjetConteneur", true);
			$in = _invoke ($out);
			donneespartagees.IProjet $result = donneespartagees.IProjetHelper.read ($in);
			return $result;
		} catch (org.omg.CORBA.portable.ApplicationException $ex) {
			$in = $ex.getInputStream ();
			String _id = $ex.getId ();
			throw new org.omg.CORBA.MARSHAL (_id);
		} catch (org.omg.CORBA.portable.RemarshalException $rm) {
			return ProjetConteneur (        );
		} finally {
			_releaseReply ($in);
		}
	} // ProjetConteneur

	public void ProjetConteneur (donneespartagees.IProjet newProjetConteneur)
	{
		org.omg.CORBA.portable.InputStream $in = null;
		try {
			org.omg.CORBA.portable.OutputStream $out = _request ("_set_ProjetConteneur", true);
			donneespartagees.IProjetHelper.write ($out, newProjetConteneur);
			$in = _invoke ($out);
			return;
		} catch (org.omg.CORBA.portable.ApplicationException $ex) {
			$in = $ex.getInputStream ();
			String _id = $ex.getId ();
			throw new org.omg.CORBA.MARSHAL (_id);
		} catch (org.omg.CORBA.portable.RemarshalException $rm) {
			ProjetConteneur (newProjetConteneur        );
		} finally {
			_releaseReply ($in);
		}
	} // ProjetConteneur

	public donneespartagees.ITache[] ListeTachesAnterieures ()
	{
		org.omg.CORBA.portable.InputStream $in = null;
		try {
			org.omg.CORBA.portable.OutputStream $out = _request ("_get_ListeTachesAnterieures", true);
			$in = _invoke ($out);
			donneespartagees.ITache $result[] = donneespartagees.SequenceTacheHelper.read ($in);
			return $result;
		} catch (org.omg.CORBA.portable.ApplicationException $ex) {
			$in = $ex.getInputStream ();
			String _id = $ex.getId ();
			throw new org.omg.CORBA.MARSHAL (_id);
		} catch (org.omg.CORBA.portable.RemarshalException $rm) {
			return ListeTachesAnterieures (        );
		} finally {
			_releaseReply ($in);
		}
	} // ListeTachesAnterieures

	public void ListeTachesAnterieures (donneespartagees.ITache[] newListeTachesAnterieures)
	{
		org.omg.CORBA.portable.InputStream $in = null;
		try {
			org.omg.CORBA.portable.OutputStream $out = _request ("_set_ListeTachesAnterieures", true);
			donneespartagees.SequenceTacheHelper.write ($out, newListeTachesAnterieures);
			$in = _invoke ($out);
			return;
		} catch (org.omg.CORBA.portable.ApplicationException $ex) {
			$in = $ex.getInputStream ();
			String _id = $ex.getId ();
			throw new org.omg.CORBA.MARSHAL (_id);
		} catch (org.omg.CORBA.portable.RemarshalException $rm) {
			ListeTachesAnterieures (newListeTachesAnterieures        );
		} finally {
			_releaseReply ($in);
		}
	} // ListeTachesAnterieures

	public donneespartagees.IContact[] ListeContacts ()
	{
		org.omg.CORBA.portable.InputStream $in = null;
		try {
			org.omg.CORBA.portable.OutputStream $out = _request ("_get_ListeContacts", true);
			$in = _invoke ($out);
			donneespartagees.IContact $result[] = donneespartagees.SequenceContactHelper.read ($in);
			return $result;
		} catch (org.omg.CORBA.portable.ApplicationException $ex) {
			$in = $ex.getInputStream ();
			String _id = $ex.getId ();
			throw new org.omg.CORBA.MARSHAL (_id);
		} catch (org.omg.CORBA.portable.RemarshalException $rm) {
			return ListeContacts (        );
		} finally {
			_releaseReply ($in);
		}
	} // ListeContacts

	public void ListeContacts (donneespartagees.IContact[] newListeContacts)
	{
		org.omg.CORBA.portable.InputStream $in = null;
		try {
			org.omg.CORBA.portable.OutputStream $out = _request ("_set_ListeContacts", true);
			donneespartagees.SequenceContactHelper.write ($out, newListeContacts);
			$in = _invoke ($out);
			return;
		} catch (org.omg.CORBA.portable.ApplicationException $ex) {
			$in = $ex.getInputStream ();
			String _id = $ex.getId ();
			throw new org.omg.CORBA.MARSHAL (_id);
		} catch (org.omg.CORBA.portable.RemarshalException $rm) {
			ListeContacts (newListeContacts        );
		} finally {
			_releaseReply ($in);
		}
	} // ListeContacts

	public String IdentifiantServeur ()
	{
		org.omg.CORBA.portable.InputStream $in = null;
		try {
			org.omg.CORBA.portable.OutputStream $out = _request ("_get_IdentifiantServeur", true);
			$in = _invoke ($out);
			String $result = $in.read_string ();
			return $result;
		} catch (org.omg.CORBA.portable.ApplicationException $ex) {
			$in = $ex.getInputStream ();
			String _id = $ex.getId ();
			throw new org.omg.CORBA.MARSHAL (_id);
		} catch (org.omg.CORBA.portable.RemarshalException $rm) {
			return IdentifiantServeur (        );
		} finally {
			_releaseReply ($in);
		}
	} // IdentifiantServeur

	public void IdentifiantServeur (String newIdentifiantServeur)
	{
		org.omg.CORBA.portable.InputStream $in = null;
		try {
			org.omg.CORBA.portable.OutputStream $out = _request ("_set_IdentifiantServeur", true);
			$out.write_string (newIdentifiantServeur);
			$in = _invoke ($out);
			return;
		} catch (org.omg.CORBA.portable.ApplicationException $ex) {
			$in = $ex.getInputStream ();
			String _id = $ex.getId ();
			throw new org.omg.CORBA.MARSHAL (_id);
		} catch (org.omg.CORBA.portable.RemarshalException $rm) {
			IdentifiantServeur (newIdentifiantServeur        );
		} finally {
			_releaseReply ($in);
		}
	} // IdentifiantServeur

	public String DateDeDerniereModification ()
	{
		org.omg.CORBA.portable.InputStream $in = null;
		try {
			org.omg.CORBA.portable.OutputStream $out = _request ("_get_DateDeDerniereModification", true);
			$in = _invoke ($out);
			String $result = $in.read_string ();
			return $result;
		} catch (org.omg.CORBA.portable.ApplicationException $ex) {
			$in = $ex.getInputStream ();
			String _id = $ex.getId ();
			throw new org.omg.CORBA.MARSHAL (_id);
		} catch (org.omg.CORBA.portable.RemarshalException $rm) {
			return DateDeDerniereModification (        );
		} finally {
			_releaseReply ($in);
		}
	} // DateDeDerniereModification

	public void DateDeDerniereModification (String newDateDeDerniereModification)
	{
		org.omg.CORBA.portable.InputStream $in = null;
		try {
			org.omg.CORBA.portable.OutputStream $out = _request ("_set_DateDeDerniereModification", true);
			$out.write_string (newDateDeDerniereModification);
			$in = _invoke ($out);
			return;
		} catch (org.omg.CORBA.portable.ApplicationException $ex) {
			$in = $ex.getInputStream ();
			String _id = $ex.getId ();
			throw new org.omg.CORBA.MARSHAL (_id);
		} catch (org.omg.CORBA.portable.RemarshalException $rm) {
			DateDeDerniereModification (newDateDeDerniereModification        );
		} finally {
			_releaseReply ($in);
		}
	} // DateDeDerniereModification

	// Type-specific CORBA::Object operations
	private static String[] __ids = {
		"IDL:donneespartagees/ITache:1.0", 
	"IDL:donneespartagees/IObjetServeur:1.0"};

	@Override
	public String[] _ids ()
	{
		return (String[])__ids.clone ();
	}

	private void readObject (java.io.ObjectInputStream s) throws java.io.IOException
	{
		String str = s.readUTF ();
		String[] args = null;
		java.util.Properties props = null;
		org.omg.CORBA.Object obj = org.omg.CORBA.ORB.init (args, props).string_to_object (str);
		org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl) obj)._get_delegate ();
		_set_delegate (delegate);
	}

	private void writeObject (java.io.ObjectOutputStream s) throws java.io.IOException
	{
		String[] args = null;
		java.util.Properties props = null;
		String str = org.omg.CORBA.ORB.init (args, props).object_to_string (this);
		s.writeUTF (str);
	}
} // class _ITacheStub