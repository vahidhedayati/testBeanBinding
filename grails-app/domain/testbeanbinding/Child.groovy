package testbeanbinding

class Child {

    String childName
    Parent origParent

    //Your request sounds rather odd if they wish to change it they can
    //but to then keep original
    //means offer and request will have to be identical in design
    //unless you just reuse parent object all over again and store it as a new id
    //if changed
    Parent parent       //new updated parent


    static constraints = {
        parent(nullable:true)
    }


}
