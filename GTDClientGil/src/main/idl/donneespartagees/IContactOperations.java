package donneespartagees;


/**
 * donneespartagees/IContactOperations.java .
 * Generated by the IDL-to-Java compiler (portable), version "3.2"
 * from C:/Users/Florian/workspace2/alma-gtd/idl/donneespartagees.idl
 * mercredi 6 janvier 2010 22 h 46 CET
 */

public interface IContactOperations  extends donneespartagees.IObjetServeurOperations
{
	String Nom ();
	void Nom (String newNom);
	String Email ();
	void Email (String newEmail);
	String Adresse ();
	void Adresse (String newAdresse);
	String Telephone ();
	void Telephone (String newTelephone);
} // interface IContactOperations
