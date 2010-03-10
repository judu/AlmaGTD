package com.alma.server.datamanager;

import java.util.ArrayList;
import java.util.List;

import org.loststone.toodledo.ToodledoApiImpl;
import org.loststone.toodledo.data.Context;
import org.loststone.toodledo.data.Folder;
import org.loststone.toodledo.data.Todo;

import com.alma.server.types.ContexteImpl;
import com.alma.server.types.Project;
import com.alma.server.types.ProjetImpl;
import com.alma.server.types.Session;
import com.alma.server.types.TacheImpl;
import com.alma.server.types.Task;

import fr.alma.gtd.donneespartagees.IContexte;
import fr.alma.gtd.donneespartagees.IIdee;
import fr.alma.gtd.donneespartagees.IProjet;
import fr.alma.gtd.donneespartagees.ITache;
import fr.alma.gtd.donneespartagees.ITag;


public class ServerToodleDoImp implements Server {

	private ToodledoApiImpl toodledoApiImpl;


	public ServerToodleDoImp() {
		toodledoApiImpl = new ToodledoApiImpl();
	}

	@Override
	public String connect(Session session) throws Exception {

		String userId = toodledoApiImpl.getUserId(session.getLoginToodleDo(), session
				.getPasswordToodleDo());
		
		session.setTokenToodleDo(toodledoApiImpl.initialize(userId, session
				.getPasswordToodleDo()));

		
		return session.getIdSession();
	}

	@Override
	public String disConnect(Session session) throws Exception {
		return session.getIdSession();
	}

	@Override
	public List<IProjet> getProjects(Session session) throws Exception {

		List<IProjet> projects = new ArrayList<IProjet>();
		
		//Récupération des dossiers
		for (Folder folder : toodledoApiImpl.getFolders(session.getTokenToodleDo())) {
				IProjet projet = new ProjetImpl(String.valueOf(folder.getId()),folder.getSName(),null,null);
				projects.add(projet);
		}			
		
		//Récupération des taches
		for (Todo task : toodledoApiImpl.getTodosList(session.getTokenToodleDo())) {
			ITache tache = new TacheImpl(String.valueOf(task.getId()),task.getTitle(),task.getId(),0,null,null);
			for (IProjet proj : projects) {
				if (task.getFolder() == Integer.valueOf(((ProjetImpl) proj).getIdentifiant())){
					proj.ajoutTache(tache);
				}
			}						
		}
	
		return projects;
	}

	@Override
	public List<ITache> getTasks(Session session) throws Exception {
		
		List<ITache> tasks = new ArrayList<ITache>();

		
		for (Todo task : toodledoApiImpl.getTodosList(session.getTokenToodleDo())) {
			ITache tache = new TacheImpl(String.valueOf(task.getId()),task.getTitle(),task.getId(),0,null,null);
			
			for (Folder folder : toodledoApiImpl.getFolders(session.getTokenToodleDo())) {
				if (task.getFolder() == folder.getId()){
					IProjet projetParent = new ProjetImpl(String.valueOf(folder.getId()),folder.getSName(),null,null);
					tache.setProjetConteneur(projetParent);
				}
			}		
			
			tasks.add(tache);			
		}

		return tasks;

	}

	@Override
	public IContexte createContext(Session session, IContexte context)
			throws Exception {

		Context contexToodleDo = new Context();
		contexToodleDo.setName(context.getNom());		
		contexToodleDo.setId(Integer.valueOf(toodledoApiImpl.addContext(session.getTokenToodleDo(), contexToodleDo)));

		return context;
	}

	@Override
	public List<IContexte> getContexts(Session session) throws Exception {

		List<IContexte> contexts = new ArrayList<IContexte>();

		for (Context context : toodledoApiImpl.getContexts(session.getTokenToodleDo())) {
			contexts.add(new ContexteImpl(context.getName()));
		}

		return contexts;

	}

	@Override
	public String createAccount(String login, String password, String nickname)
			throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteAccount(String login, String password, Session session)
			throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateAccountPassword(String oldPassword, String newPassword,
			Session session) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateAccountPseudo(String oldNickname, String newNickname,
			Session session) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IIdee createIdea(Session session, IIdee idea) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ITag createNote(Session session, ITag note) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IProjet createProject(Session session, IProjet project)	throws Exception {
		
		Folder folderToodleDo = new Folder();
		folderToodleDo.setSName(project.getNom());		
		((Project) project).setIdentifiant(String.valueOf(toodledoApiImpl.addFolder(session.getTokenToodleDo(), folderToodleDo)));
	
		return project;
	}

	@Override
	public ITache createTask(Session session, ITache task) throws Exception {
		
		Todo taskToodleDo = new Todo();		
		taskToodleDo.setTitle(task.getNom());
		taskToodleDo.setFolder(Integer.valueOf(((Project) task.getProjetConteneur()).getIdentifiant()));

		((Task) task).setIdentifiant(String.valueOf(toodledoApiImpl.addTodo(session.getTokenToodleDo(), taskToodleDo)));
		return task;
	}

	@Override
	public String delContext(Session session, IContexte context)
			throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String delIdea(Session session, IIdee idea) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String delNote(Session session, ITag note) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String delProject(Session session, IProjet project)
			throws Exception {
		System.out.println("del "+Integer.valueOf(((Project) project).getIdentifiant()));
		toodledoApiImpl.deleteFolder(session.getTokenToodleDo(), Integer.valueOf(((Project) project).getIdentifiant()));
		return null;
	}

	@Override
	public String delTask(Session session, ITache task) throws Exception {
		toodledoApiImpl.deleteTodo(session.getTokenToodleDo(), Integer.valueOf(((Task) task).getIdentifiant()));
		return null;
	}

	@Override
	public IContexte updateContext(Session session, IContexte context)
			throws Exception {
		return null;
	}

	@Override
	public IIdee updateIdea(Session session, IIdee idea) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ITag updateNote(Session session, ITag note) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IProjet updateProject(Session session, IProjet project)
			throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ITache updateTask(Session session, ITache task) throws Exception {
		
		Todo taskToodleDo = new Todo();	
		taskToodleDo.setId(Integer.valueOf(((Task)task).getIdentifiant()));
		taskToodleDo.setTitle(task.getNom());
		taskToodleDo.setFolder(Integer.valueOf(((Project) task.getProjetConteneur()).getIdentifiant()));

		toodledoApiImpl.modifyTodo(session.getTokenToodleDo(), taskToodleDo);

		return new TacheImpl();
	}

	@Override
	public List<IIdee> getIdeas(Session session) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ITag> getNotes(Session session) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	

}
