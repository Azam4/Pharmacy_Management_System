
package Service;

import Com.modelpackage.CompanyModel;
import DAO.CompanyDAO;
import Interface.ICommon;
import java.util.List;

/**
 *
 * @author A
 */
public class CompanyService implements ICommon<CompanyModel>{

    @Override
    public int save(CompanyModel t) {
        return new CompanyDAO().save(t);
    }

    @Override
    public CompanyModel search(CompanyModel t) {
        return new CompanyDAO().search(t);
    }

    @Override
    public int update(CompanyModel t) {
        return new CompanyDAO().update(t);
    }

    @Override
    public int delete(CompanyModel t) {
        return new CompanyDAO().delete(t);
    }

    @Override
    public List<CompanyModel> getAll(CompanyModel t) {
        return new CompanyDAO().getAll(t);
    }
    
}
