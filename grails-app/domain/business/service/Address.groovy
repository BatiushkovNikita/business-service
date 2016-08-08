package business.service

import grails.rest.Resource

@Resource(uri = '/addresses')
class Address {

    static mapWith = "mongo"

    String country;
    String city;
    String zipCode;
    String street;

    static constraints = {
/*        country blank: false
        city blank: false
        zipCode blank: false
        street blank: false*/
    }
}
