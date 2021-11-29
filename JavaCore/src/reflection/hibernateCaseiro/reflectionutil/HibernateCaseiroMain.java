package reflection.hibernateCaseiro.reflectionutil;

import reflection.hibernateCaseiro.model.Person;

import java.util.List;

public class HibernateCaseiroMain {

    public static void main(String[] args) {
        Metamodel metamodel = Metamodel.of(Person.class);

        PrimaryKeyField primaryKeyField = metamodel.getPrimaryKey();
        List<ColumnField> columnFieldList = metamodel.getColumns();
    }

}
