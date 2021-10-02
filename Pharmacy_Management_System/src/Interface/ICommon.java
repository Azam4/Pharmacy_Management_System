
package Interface;

import java.util.List;

/**
 *
 * @author A
 */
public interface ICommon<T> {
    public int save(T t);
    public T search(T t);
    public int update(T t);
    public int delete(T t);
    public List<T> getAll(T t); 
    
}
