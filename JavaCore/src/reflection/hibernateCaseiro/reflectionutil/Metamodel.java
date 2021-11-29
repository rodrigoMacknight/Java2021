package reflection.hibernateCaseiro.reflectionutil;

import java.util.List;

public class Metamodel<T> {

    private Class<T> klass;

    public static <T> Metamodel<T> of( Class<T> klass) {
        return new Metamodel<>(klass);
    }

    public Metamodel(Class<T> klass) {
        this.klass = klass;
    }

    public PrimaryKeyField getPrimaryKey() {
        return null;
    }

    public List<ColumnField> getColumns() {
        return null;
    }

}
