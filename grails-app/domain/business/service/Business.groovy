package business.service

import javax.persistence.Entity

class Business {

    String name;
    Address address;
    Date openDate;

    static constraints = {
    }
}
