
package Service;

import Com.modelpackage.AgentsModel;
import DAO.AgentsDAO;
import Interface.ICommon;
import java.util.List;

/**
 *
 * @author A
 */
public class AgentsService implements ICommon<AgentsModel>{

    @Override
    public int save(AgentsModel t) {
        return new AgentsDAO().save(t);
    }

    @Override
    public AgentsModel search(AgentsModel t) {
        return new AgentsDAO().search(t);
    }

    @Override
    public int update(AgentsModel t) {
        return new AgentsDAO().update(t);
    }

    @Override
    public int delete(AgentsModel t) {
       return new AgentsDAO().delete(t);
    }

    @Override
    public List<AgentsModel> getAll(AgentsModel t) {
        return new AgentsDAO().getAll(t);
    }
    
}
