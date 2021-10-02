
package Interface;

import java.util.List;

/**
 *
 * @author A
 */
public interface Ilogin<T> {
    public int login(T t);
    public int save(T t);
     public int update(T t);
    public int delete(T t);
    public List<T> getAll(T t); 
}
