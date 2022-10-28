package join;

public class ServiceImpl implements Service{
	
	private Dao dao= new DaoOracleImpl();
	
	
	@Override
	public boolean addMember(Member m) {
		// TODO Auto-generated method stub
		int line = dao.insertMember(m);
		if(line<=0) {return false;} else {return true;} 
	}
 
	@Override
	public boolean editMemberInfo(Member m) {
		// TODO Auto-generated method stub
		int line = dao.updateMember(m);
		if(line<=0) {return false;} else {return true;} 
	}

	@Override
	public boolean removeMember(String id) {
		// TODO Auto-generated method stub
		int line= dao.removeMember(id);
		if(line<=0) {return false;} else {return true;} 
	}

	@Override
	public boolean login(String id, String pwd) {
		// TODO Auto-generated method stub
		return dao.login(id, pwd);
	}

	@Override
	public Member getMember(String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
