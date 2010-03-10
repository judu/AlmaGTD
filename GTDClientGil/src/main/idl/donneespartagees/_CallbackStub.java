package donneespartagees;


/**
 * donneespartagees/_CallbackStub.java .
 * Generated by the IDL-to-Java compiler (portable), version "3.2"
 * from C:/Users/Florian/workspace2/alma-gtd/idl/donneespartagees.idl
 * mercredi 6 janvier 2010 22 h 46 CET
 */


/**
 * L'interface de CallBack permettant au client de recevoir sa reponse.
 * @author Stephane Begaudeau, Benjamin Gosset, Alex Lagarde, Christophe Renaudineau.
 * @version 1.0.0
 */
public class _CallbackStub extends org.omg.CORBA.portable.ObjectImpl implements donneespartagees.Callback
{


	/**
	 * Methode appelee apres la reussite du traitement sur le serveur. 
	 * @param result Le resultat renvoye par le serveur.
	 */
	public void onSucces (org.omg.CORBA.ObjectHolder result)
	{
		org.omg.CORBA.portable.InputStream $in = null;
		try {
			org.omg.CORBA.portable.OutputStream $out = _request ("onSucces", true);
			$in = _invoke ($out);
			result.value = org.omg.CORBA.ObjectHelper.read ($in);
			return;
		} catch (org.omg.CORBA.portable.ApplicationException $ex) {
			$in = $ex.getInputStream ();
			String _id = $ex.getId ();
			throw new org.omg.CORBA.MARSHAL (_id);
		} catch (org.omg.CORBA.portable.RemarshalException $rm) {
			onSucces (result        );
		} finally {
			_releaseReply ($in);
		}
	} // onSucces


	/**
	 * Methode appelee apres l'echec du traitement sur le serveur.
	 * @throws L'exception renvoyee par le serveur.
	 */
	public void onFailure (org.omg.CORBA.StringHolder message) throws donneespartagees.CallbackPackage.UneErreur
	{
		org.omg.CORBA.portable.InputStream $in = null;
		try {
			org.omg.CORBA.portable.OutputStream $out = _request ("onFailure", true);
			$out.write_string (message.value);
			$in = _invoke ($out);
			message.value = $in.read_string ();
			return;
		} catch (org.omg.CORBA.portable.ApplicationException $ex) {
			$in = $ex.getInputStream ();
			String _id = $ex.getId ();
			if (_id.equals ("IDL:donneespartagees/Callback/UneErreur:1.0"))
				throw donneespartagees.CallbackPackage.UneErreurHelper.read ($in);
			else
				throw new org.omg.CORBA.MARSHAL (_id);
		} catch (org.omg.CORBA.portable.RemarshalException $rm) {
			onFailure (message        );
		} finally {
			_releaseReply ($in);
		}
	} // onFailure

	// Type-specific CORBA::Object operations
	private static String[] __ids = {
	"IDL:donneespartagees/Callback:1.0"};

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
} // class _CallbackStub
