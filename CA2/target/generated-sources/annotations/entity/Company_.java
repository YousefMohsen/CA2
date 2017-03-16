package entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-03-16T16:20:18")
@StaticMetamodel(Company.class)
public class Company_ extends InfoEntity_ {

    public static volatile SingularAttribute<Company, Integer> numEmployees;
    public static volatile SingularAttribute<Company, String> name;
    public static volatile SingularAttribute<Company, String> description;
    public static volatile SingularAttribute<Company, Integer> marketValue;
    public static volatile SingularAttribute<Company, String> cvr;

}