package modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Empleados;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-01-16T17:02:01")
@StaticMetamodel(Departamentos.class)
public class Departamentos_ { 

    public static volatile SingularAttribute<Departamentos, Integer> idDep;
    public static volatile CollectionAttribute<Departamentos, Empleados> empleadosCollection;
    public static volatile SingularAttribute<Departamentos, String> nombre;

}