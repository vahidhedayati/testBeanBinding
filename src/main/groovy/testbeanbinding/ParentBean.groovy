package testbeanbinding

import grails.validation.Validateable

class ParentBean implements Validateable {
    String parentName
    String address

    int hashCode() {
        final int prime = 31
        int result = 1
        result = prime * result + (parentName?.hashCode()?:0)
        result = prime * result + (address?.hashCode()?:0)
        return result
    }

    ParentBean() {
        super()
    }

    ParentBean(Parent parent) {
        parentName=parent.parentName
        address=parent.address
    }

    protected def loadValues() {
        def values=[:]
        values.with {
            parentName=this.parentName
            address=this.address
        }
        return address
    }
}
