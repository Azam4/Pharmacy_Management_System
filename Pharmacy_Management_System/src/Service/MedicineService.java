
package Service;

import Com.modelpackage.MedicineModel;
import DAO.MedicineDAO;
import Interface.ICommon;
import java.util.List;

/**
 *
 * @author A
 */
public class MedicineService implements ICommon<MedicineModel> {

    @Override
    public int save(MedicineModel t) {
        return new MedicineDAO().save(t);
    }

    @Override
    public MedicineModel search(MedicineModel t) {
       return  new MedicineDAO().search(t);        
    }

    @Override
    public int update(MedicineModel t) {
        return new MedicineDAO().update(t);
    }

    @Override
    public int delete(MedicineModel t) {
       return new  MedicineDAO().delete(t);
    }

    @Override
    public List<MedicineModel> getAll(MedicineModel t) {
        return new  MedicineDAO().getAll(t);
    }
    
}
