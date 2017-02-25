package testbeanbinding

import grails.validation.Validateable

class ChildBean implements Validateable {
    String childName
    Parent parent
    ParentBean updatedParent


    protected def formatBean() {
        updatedParent = new ParentBean(parent)
    }
}
