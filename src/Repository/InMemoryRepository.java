package Repository;

import java.util.List;

public abstract class InMemoryRepository<T> implements ICrudRepository<T>{

    protected List<T> repoList;

    public InMemoryRepository(List<T> repo) {
        this.repoList = repo;
    }

    /**
     * fugt in @repolist den Objekt obj
     * @param obj Objekt von typ T
     * @return wiedergibt den addierte Objekt
     */
    @Override
    public T create(T obj) {
        this.repoList.add(obj);
        return obj;
    }

    /**
     * @return wiedergibt die ganze Liste von Objekte
     */
    @Override
    public List<T> getAll() {
        return this.repoList;
    }

    /**
     * loescht von @repolist den Objekt obj
     * @param obj Objekt von typ T
     */
    @Override
    public void delete(T obj) {
        this.repoList.remove(obj);
    }
}
